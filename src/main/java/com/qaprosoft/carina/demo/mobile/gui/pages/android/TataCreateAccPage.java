package com.qaprosoft.carina.demo.mobile.gui.pages.android;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.Home_CreateAccBasePage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TataCreateAccBasePage;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = Home_CreateAccBasePage.class)
public class TataCreateAccPage extends TataCreateAccBasePage{
	
	@FindBy(xpath="//android.widget.EditText[@text='Enter Account Name']")
	private ExtendedWebElement enter_acc_name;
	
	@FindBy(xpath="//android.widget.EditText[@text='Enter Site']")
	private ExtendedWebElement enter_site;
	
	@FindBy(xpath="//android.widget.EditText[@text='Enter Main Phone Number']")
	private ExtendedWebElement enter_mob_num;
	
	@FindBy(xpath="//android.widget.EditText[@text='Enter Pan No.']")
	private ExtendedWebElement enter_pan_no;
	
	@FindBy(xpath="//android.widget.EditText[@text='Contact Search']")
	private ExtendedWebElement enter_contact_search;
	
	@FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageButton")
	private ExtendedWebElement clickon_search;
	
	

	
	public TataCreateAccPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public void clickon_search() {
		pause(2);
		clickon_search.click();
		pause(2);
		
	}

	@Override
	public void Enter_acc_name(String nam) {
		pause(2);
		enter_acc_name.click();
		pause(2);
		enter_acc_name.type(nam);
		
	}
	
	@Override
	public void Enter_site(String site) {
		pause(2);
		enter_site.click();
		pause(2);
		enter_site.type(site);
		
		
	}
	
	@Override
	public void Enter_mob_num(String number) {
		pause(2);
		enter_mob_num.click();
		pause(2);
		enter_mob_num.type(number);
		
	}
	
	@Override
	public void Enter_pan_no(String pan) {
		pause(2);
		enter_pan_no.click();
		pause(2);
		enter_pan_no.type(pan);
		
	}
	
	@Override
	public void Enter_contact_search(String numb) {
		pause(2);
		enter_contact_search.click();
		pause(2);
		enter_contact_search.type(numb);
		
	}
}

