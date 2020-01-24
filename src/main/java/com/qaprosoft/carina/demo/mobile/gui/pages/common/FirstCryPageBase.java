package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class FirstCryPageBase extends AbstractPage{

	public FirstCryPageBase(WebDriver driver) {
		super(driver);
	}

	public abstract void click_button();
	
	public abstract void click_on_Boy() ;

	public abstract void select_years();

	public abstract void click_on_date_of_birth();
	
	public abstract void click_on_OK_btn();
	
	public abstract void click_Child_name();

	public abstract void enter_Child_name(String name);

	public abstract void click_on_Sumbit_btn();

	
}
