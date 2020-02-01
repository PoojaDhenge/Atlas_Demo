package com.qaprosoft.carina.demo.mobile.gui.pages.android;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

import com.qaprosoft.carina.demo.mobile.gui.pages.common.TataCliqPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TataLoginBasePage;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = TataCliqPageBase.class)
public class TataCliqPage extends TataCliqPageBase{
	
	@FindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Categories\"]")
	private ExtendedWebElement search_btn;
	
	@FindBy(id="text_view_level_one_category_text")
	private ExtendedWebElement item;

	@FindBy(xpath="//android.widget.TextView[@text='Dress in Ethnic Wear']")
	private ExtendedWebElement dress;
	
	@FindBy(xpath="//android.widget.TextView[@text='Inddus Peach Cotton Woven Pattern Unstitched Dress Material']")
	private ExtendedWebElement first_item;
	
	@FindBy(xpath="//android.widget.TextView[@text='BUY NOW']")
	private ExtendedWebElement buy_now;
	
	@FindBy(xpath="//android.widget.TextView[@text='Child Name']")
	private ExtendedWebElement user_name;
	
	@FindBy(xpath="//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
	private ExtendedWebElement password;
	
	@FindBy(xpath="//android.widget.TextView[@text='SUBMIT']")
	private ExtendedWebElement login;
	
	
	public TataCliqPage(WebDriver driver) {
		super(driver);
	}
	

	@Override
	public void click_on_search_button() {
		pause(1);
		search_btn.click();
		
	}

	@Override
	public void enter_name(String name) {
		pause(1);
		item.click();
		pause(2);
		item.type(name);
		
	}
	
	@Override
	public void click_on_option() {
		pause(1);
		dress.click();
		
	}
	
	@Override
	public void select_item() {
		pause(1);
		first_item.click();
		
	}
	
	@Override
	public void click_on_buy_now() {
		pause(1);
		buy_now.click();
		
	}
	
	@Override
	public void enter_details(String name) {
		pause(1);
		user_name.click();
		user_name.type(name);
	}
	
	@Override
	public void enter_password(String pass)
	{
		pause(1);
		password.click();
		password.type(pass);
		
		
	}
	
	@Override
	public void click_on_login_btn() {
		pause(1);
		login.click();
		
	}
	


}
