package com.qaprosoft.carina.demo.cucumber.steps;

import java.util.concurrent.TimeUnit;

import com.jayway.restassured.response.Response;
import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qaprosoft.carina.demo.api.PostUserCreationMethod;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.FirstcryPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.FirstCryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WelcomePageBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstcryStepdef extends CucumberRunner{
	FirstCryPageBase user;
	

	@Given("^launch the application$")
	public boolean startMethod() throws Exception {
		FirstCryPageBase user = initPage(getDriver(), FirstCryPageBase.class);
		//user=new FirstcryPage(getDriver());
		//user.open();
		return user.isPageOpened();
		
	}

	@When("^click on all button$")
	public void click_button() {
		user.click_button();
		
	}

	@Then("^click on boy button$")
	public void click_on_Boy() {
		user.click_on_Boy();
	}
	
	@Then("^click on select years$")
	public void select_years() {
		user.select_years();
	}
	
	@And("^click on date of birth$")
	public void click_on_date_of_birth() {
		user.click_on_date_of_birth();
	}

	@Then("^click on button$")
	public void click_on_OK_btn() {
		user.click_on_OK_btn();
	}
	
	@Then("^click on child name$")
	public void click_Child_name() {
		user.click_Child_name();
	}
	
	@And("^enter child name$")
	public void enter_Child_name() {
		user.enter_Child_name("Pooja");
	}


	@And("^click on submit button$")
	public void click_on_Sumbit_btn() {
		user.click_on_Sumbit_btn();
	}


}
