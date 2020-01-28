package com.qaprosoft.carina.demo.mobile.gui.pages.common;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class Home_CreateAccBasePage extends AbstractPage{

	public Home_CreateAccBasePage(WebDriver driver) {
		super(driver);
	}

	public abstract void ClickOn_CreateNewbtn();

	public abstract void ClickOn_Account();
}