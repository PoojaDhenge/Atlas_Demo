package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.FirstCryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.QtracHomePageBase;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = QtracHomePageBase.class)
public class FirstcryPage extends FirstCryPageBase{
	
	@FindBy(xpath="//android.widget.TextView[@text='All']")
	private ExtendedWebElement click_btn;
	
	@FindBy(xpath="//android.widget.TextView[@text='Boy']")
	private ExtendedWebElement click_boy;

	@FindBy(xpath="//android.widget.TextView[@text='0 - 2 Years']")
	private ExtendedWebElement select_age;
	
	@FindBy(xpath="//android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private ExtendedWebElement date_of_birth;
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	private ExtendedWebElement OK_btn;
	
	@FindBy(xpath="//android.widget.TextView[@text='Child Name']")
	private ExtendedWebElement click_Child_name;
	
	@FindBy(xpath="//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
	private ExtendedWebElement enter_child_name;
	
	@FindBy(xpath="//android.widget.TextView[@text='SUBMIT']")
	private ExtendedWebElement Sumbit_btn;
	
	
	public FirstcryPage(WebDriver driver) {
		super(driver);
	}
	

	@Override
	public void click_button() {
		click_btn.click();
		
	}

	@Override
	public void click_on_Boy() {
		click_boy.click();
		
	}
	
	@Override
	public void select_years() {
		select_age.click();
		
	}
	
	@Override
	public void click_on_date_of_birth() {
		date_of_birth.click();
		
	}
	
	@Override
	public void click_on_OK_btn() {
		OK_btn.click();
		
	}
	
	@Override
	public void click_Child_name() {
		click_Child_name.click();
		
	}
	
	@Override
	public void enter_Child_name(String name) {
		
		enter_child_name.type(name);
		
	}
	
	@Override
	public void click_on_Sumbit_btn() {
		Sumbit_btn.click();
		
	}
	
	

}

