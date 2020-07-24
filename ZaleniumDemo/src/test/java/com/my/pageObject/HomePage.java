package com.my.pageObject;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.my.base.Setup;

public class HomePage extends Setup {
	
	@FindBy(xpath = "//div[contains(text(),'Sign up')]")
	public WebElement btn_signUP;
	
	@FindBy(xpath = "//div[contains(text(),'OK')]")
	public WebElement btn_acceptCookies;
	
	
	public void clickOnSignUp() {
		btn_signUP.click(); 
	}
	
	public void acceptCookies() {
		btn_acceptCookies.click(); 
	}
}
