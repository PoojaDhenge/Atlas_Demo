package com.qaprosoft.carina.demo.cucumber.steps;
import java.util.concurrent.TimeUnit;

import com.jayway.restassured.response.Response;
import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qaprosoft.carina.demo.api.PostUserCreationMethod;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.FirstcryPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.FirstCryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TataCliqPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WelcomePageBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TatacliqStepdef extends CucumberRunner{
	TataCliqPageBase user;
	
	 @Given("^start application$")
	 public void startMethod() throws Exception  {
		 user = initPage(getDriver(), TataCliqPageBase.class);
			//return user.isPageOpened();
			
			
		}
	 @Then("^touch on search button$")
	 public void click_on_search_button()
	 {
		 user.click_on_search_button();
	 }
	 
	 @And("^enter Dress$")
	 public void enter_name()
	 {
		 user.enter_name();
	 }
	 
	 @And("^touch on first_option$")
	 public void click_on_option()
	 {
		 user.click_on_option();
	 }
	 
	 @Then("^touch on first Dress$")
		public void select_item() {
		 user.select_item();
			
		}
	
	 @And("^buy now$")
	 public void click_on_buy_now()
	 {
		 user.click_on_buy_now();
	 }
	 
	 @And("^enter the name$")
	 public void enter_details(String name)
	 {
		 user.enter_details("Pooja");
	 }
	 
	 @And("^enter password$")
	 public void enter_password(String pass)
	 {
		 user.enter_password("Pooja");
	 }
	 
	 @Then("^touch on login$")
	 public void click_on_login_btn()
	 {
		 user.click_on_login_btn();
	 }
	 
}
