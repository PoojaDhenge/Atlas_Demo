package com.qaprosoft.carina.demo.mobile.gui.pages.common;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class TataLoginBasePage extends AbstractPage{

	public TataLoginBasePage(WebDriver driver) {
		super(driver);
	}

	public abstract void enter_userid(String id);

	public abstract void enter_pass(String pass);

	public abstract void click_login();
	
}
