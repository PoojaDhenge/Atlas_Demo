package com.qaprosoft.carina.demo.cucumber.steps;



import org.json.JSONObject;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qk.carina.demo.api.GetAcc;
import com.qk.carina.demo.api.Postcreateacc;
import com.qk.carina.demo.api.Posttokengen;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PosttokenGenerationStepdef extends CucumberRunner {

	static Posttokengen postuser;
	Response rs = null;

	@Given("^Post api_url$")
	public void startMethod() throws Exception {
		postuser = new Posttokengen();
	}

	@When("^Enter name and password$")
	public void enterdetails() {
		
		JSONObject object = new JSONObject();
		object.put("username", "admin");
		object.put("password", "admin");
		postuser.setBodyContent(object.toString());
	}
	
	@Then("^Post the api_url$")
	public String postAPI() {
	//rs = postuser.callAPI();
	//System.out.println("Response:" + rs);
	String response = postuser.callAPI().asString();
	System.out.println("Response**********************:" + response);
	String id_token = new JsonPath(response).get("id_token");
	System.out.println("ID" + id_token);
	return id_token;
	}


	@When("^enter id_token and set header$")
	public int createUser()
	{
		//String response = postuser.callAPI().asString();
	String id_token=postAPI();
	System.out.println("Id_Token :" +id_token);
	Postcreateacc createuser=new Postcreateacc();
	createuser.setAuth(id_token);
	createuser.setHeaders("Authorization=" + "Bearer" + " " + id_token);
	String response1 = createuser.callAPI().asString();
	System.out.println("Create Account Response ****************** " + response1);
	int id = new JsonPath(response1).getInt("id");
    System.out.println("Id :" + id);
    return id;
	
	
	}
	
	 @Then("^get details of id$")
	 public void getdetails()
	 {
		 String id_token = postAPI();
		  int userId=createUser();
		  System.out.println("..................GetResponse............."+userId);
		  GetAcc getid = new GetAcc(String.valueOf(userId));
		  getid.setAuth(id_token);
		  System.out.println(" User Id" + getid);
		  getid.setHeaders("Authorization=" + "Bearer"+" "+ id_token);
		  getid.setMethodPath(getid.getMethodPath()+"/"+ userId);
		  //getid.callAPI();
		 
			
	 }
	
}
