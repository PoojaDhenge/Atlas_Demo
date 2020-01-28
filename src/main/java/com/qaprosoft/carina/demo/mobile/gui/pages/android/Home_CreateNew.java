package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.Home_CreateAccBasePage;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = Home_CreateAccBasePage.class)
public class Home_CreateNew extends Home_CreateAccBasePage{
	
	@FindBy(xpath="//android.widget.RadioButton[@text='Account']")
	private ExtendedWebElement click_onAccount;
	
	@FindBy(xpath="//android.widget.TextView[@text='Create New']")
	private ExtendedWebElement click_CreateNewbtn;

	
	public Home_CreateNew(WebDriver driver) {
		super(driver);
	}
	

	@Override
	public void ClickOn_CreateNewbtn() {
		pause(2);
		click_CreateNewbtn.click();
		pause(2);
		
	}
	
	@Override
	public void ClickOn_Account() {
		pause(2);
		click_onAccount.click();
		pause(2);
		
	}
}
