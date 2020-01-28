package com.qaprosoft.carina.demo.mobile.gui.pages.android;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.Home_CreateAccBasePage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TataLoginBasePage;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = TataLoginBasePage.class)
public class TataLogin extends TataLoginBasePage{
	
	@FindBy(xpath="//android.widget.EditText[@text='User ID']")
	private ExtendedWebElement enter_userid;
	
	@FindBy(xpath="//android.widget.EditText[@text='Password']")
	private ExtendedWebElement enter_pass;

	@FindBy(xpath="//android.widget.Button[@text='LOGIN']")
	private ExtendedWebElement click_login;
	
	public TataLogin(WebDriver driver) {
		super(driver);
	}
	

	@Override
	public void enter_userid(String id) {
		pause(2);
		enter_userid.click();
		pause(2);
		enter_userid.type(id);
		
	}
	
	@Override
	public void enter_pass(String pass) {
		pause(2);
		enter_pass.click();
		pause(2);
		enter_pass.type(pass);
		
	}
	
	@Override
	public void click_login(){
		pause(2);
		click_login.click();
		pause(2);
		
	}
}

