package com.qk.m1cloud;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import com.jayway.restassured.specification.RequestSpecification;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qk.m1cloud.api.POSTUploadAPKMethod;


public class UploadAPK {
	
	Logger LOGGER = Logger.getLogger(UploadAPK.class);
	public String token;
	Properties prop = new Properties();
	
	public void getToken() throws Exception{
		RestAssured.baseURI = "https://qkm1.qualitykiosk.com/api";
		RequestSpecification httpRequest = RestAssured.given();
		String userName = R.CONFIG.getProperties().getProperty("userName");
		String password = R.CONFIG.getProperties().getProperty("password");
		httpRequest.authentication().basic(userName, password);
	    httpRequest.header("Authorization", "Basic bmlraXRhLnNoaW5kZUBxdWFsaXR5a2lvc2suY29tOmpmeDVwcG1ieW5nN3g4bXYyejlodnpxeg==");
	    
	    Response response = httpRequest.get("/access");
	    ResponseBody body = response.getBody();
	    String bodyStringValue = body.asString();
	    JSONObject jobj = new JSONObject(response.asString());
	    JSONObject robj = jobj.getJSONObject("result");
	    token = robj.getString("token");
	}
	
	public void checkDeviceAvailability(String PlatformName, String DeviceName) throws Exception{
		String devices;
		RestAssured.baseURI = "https://qkm1.qualitykiosk.com/api";
		RequestSpecification httpRequest = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("token", token); 
		requestParams.put("duration", 10);
		requestParams.put("platform", PlatformName);
		requestParams.put("available_now", "true");
		
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toString());
		
	    Response response = httpRequest.post("/devices");
	    JsonPath jsonPathEvaluator = response.jsonPath();
	    devices = jsonPathEvaluator.get("models");
	    
	    if(!devices.contains("DeviceName"))
	    	{
	    		LOGGER.info("Device not available");
	    	}
	    else{
	    	
	    }
	   	}
	
	
	
	//@Test(testName="UploadAPK")
	//@Parameters(value={"apk_path"})
	public void Upload_apk() throws Exception {
		getToken();
		
		POSTUploadAPKMethod uploadAPK = new POSTUploadAPKMethod();
		
		uploadAPK.setHeaders("Content-Type=multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW");
		uploadAPK.addParameter("token", token);
		uploadAPK.addParameter("filter", "all");
		uploadAPK.addParameter("source_type", "raw");
		
		Response ResUploadAPK = uploadAPK.callAPI();
		LOGGER.info(ResUploadAPK.getStatusCode());
		LOGGER.info(ResUploadAPK.asString());
		
	
	}

}