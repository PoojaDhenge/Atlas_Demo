package com.qaprosoft.carina.demo.mobile.gui.pages.common;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class TataCreateAccBasePage extends AbstractPage{

	public TataCreateAccBasePage(WebDriver driver) {
		super(driver);
	}
	public abstract void Enter_acc_name(String nam);

	public abstract void Enter_site(String site);

	public abstract void Enter_mob_num(String number);

	public abstract void Enter_pan_no(String pan);

	public abstract void Enter_contact_search(String numb);
	public abstract void clickon_search();

	

	
	

	
	
	
	
	
}
