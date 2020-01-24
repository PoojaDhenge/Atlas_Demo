package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class TataCliqPageBase extends AbstractPage {

	public TataCliqPageBase(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public abstract void click_on_search_button();
	
	public abstract void enter_name(String abc);
	
	public  abstract void click_on_option();

	public abstract void select_item();

	public abstract void click_on_buy_now();

	public abstract void enter_details(String name);
	
	public abstract void enter_password(String pass);

	public abstract void click_on_login_btn();

}
