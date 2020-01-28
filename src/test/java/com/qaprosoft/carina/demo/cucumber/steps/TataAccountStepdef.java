package com.qaprosoft.carina.demo.cucumber.steps;



import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;

import com.qaprosoft.carina.demo.mobile.gui.pages.common.Home_CreateAccBasePage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TataCreateAccBasePage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TataLoginBasePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TataAccountStepdef extends CucumberRunner{
	TataLoginBasePage login=null;
	Home_CreateAccBasePage home=null;
	TataCreateAccBasePage create=null;
	
	
	@Given("^LAunCh$")
	public void LAunChmethod() throws Exception {
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
	 login = initPage(getDriver(), TataLoginBasePage.class);
		//user=new FirstcryPage(getDriver());
		//user.open();
		System.out.println("byeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		
		
	}
	
	@Then("^Enter_userid$")
	public void Enter_userid() {
		login.enter_userid("PV10_SPMA");
	}
	
	@Then("^Enter_pass$")
	public void Enter_pass() {
		login.enter_pass("Tata@2019");
	}
	
	@Then("^Click_on_login_btn$")
	public void Click_on_login_btn() {
		login.click_login();
		
	}
	
	
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("^Start the application$")
	public void startMethod() throws Exception {
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		 home = initPage(getDriver(), Home_CreateAccBasePage.class);
		//user=new FirstcryPage(getDriver());
		//user.open();
		System.out.println("byeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		
		
	}
	
	@Then("^Click_on create new account$")
	public void ClickOn_Create_Newbtn() {
		
		home.ClickOn_Account();
		home.ClickOn_CreateNewbtn();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////*******
	
	@Given("^start_application$")
	public void launchMethod() throws Exception {
		create = initPage(getDriver(), TataCreateAccBasePage.class);
		//user=new FirstcryPage(getDriver());
		//user.open();
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		
		
	}

	@Then("^Enter_account name$")
	public void enter_acc_name(String nam) {
		create.Enter_acc_name("Pranita");
		
	}

	@Then("^Enter_site_name$")
	public void Enter_site(String site) {
		create.Enter_site("TD");
	}
	
	@Then("^enter_phone number1$")
	public void Enter_mob_num(String number) {
		create.Enter_mob_num("7888888880");
	}
	
	@And("^enter_pan no.$")
	public void Enter_pan_no(String pan) {
		create.Enter_pan_no("CRADP1234N");
	}

	@Then("^type contact search$")
	public void Enter_contact_search(String numb) {
		create.Enter_contact_search("8888888888");
		create.clickon_search();
	}
	
	

	
}

