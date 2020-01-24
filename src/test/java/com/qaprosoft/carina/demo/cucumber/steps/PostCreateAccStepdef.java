package com.qaprosoft.carina.demo.cucumber.steps;



import java.io.File;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;

import com.qk.carina.demo.api.Postcreateacc;
import com.qk.carina.demo.api.Posttokengen;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostCreateAccStepdef extends CucumberRunner {

	Postcreateacc user=null;
	Response rs = null;

	@Given("^Post Api_url$")
	public void startMethod() throws Exception {
	
	}

	@Then("^get id_token$")
	public void enterdetails() {
		JSONObject rqpara = new JSONObject();
		  rqpara.put("id_token","eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTU3OTc4MDg3MX0.QZ8Q5_KGX4pRcUoYM5jZL21MC37pHOjO1-xPBg_8AGuBuL668A_4D_Q84IOs25VUivnsZy-_OZ8bRlLdfsatTA");
	
	}

	@Then("^set Headers$")
	public void id_token()
	{
		user.setAuth("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTU3OTc4MDg3MX0.QZ8Q5_KGX4pRcUoYM5jZL21MC37pHOjO1-xPBg_8AGuBuL668A_4D_Q84IOs25VUivnsZy-_OZ8bRlLdfsatTA");
		//user.setHeaders("Authorization=Bearer"+"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTU3OTc4MDg3MX0.QZ8Q5_KGX4pRcUoYM5jZL21MC37pHOjO1-xPBg_8AGuBuL668A_4D_Q84IOs25VUivnsZy-_OZ8bRlLdfsatTA");
		
	}
	
	@Then("^hit Api_url$")
	public void postAPI() {
		rs = user.callAPI();
	}

	@And("^Get Api_response$")
	public void getResponseTime() {
		long rsTime = rs.timeIn(TimeUnit.MILLISECONDS);
		System.out.println("Response time: " + rsTime);
	} 
}

