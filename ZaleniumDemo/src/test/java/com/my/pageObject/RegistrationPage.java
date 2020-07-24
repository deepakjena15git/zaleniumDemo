package com.my.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.my.utility.ExcelReader;

public class RegistrationPage {
	
	
	@FindBy(xpath="//input[@id='firstName']")
	public WebElement textbox_firstNAme;
	
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement textbox_lastName;
	
	@FindBy(xpath="//input[@id='mail']")
	public WebElement textbox_mail;
	
	@FindBy(xpath="//input[@id='newPasswordInput']")
	public WebElement textbox_newPassword;
	
	@FindBy(xpath="//input[@id='retypeNewPasswordInput']")
	public WebElement textbox_retypeNewPassword;
	
	@FindBy(xpath="//input[@id='pdAccept']")
	public WebElement checkbox_privacyAgreement;
	
	@FindBy(xpath="//input[@id='touAccept']")
	public WebElement checkbox_termsAndCondition;
	
	@FindBy(xpath="//button[@id='sapStoreRegisterFormSubmit']")
	public WebElement btn_register;
	
	
	public void enterFirstName(String firstName) {
		textbox_firstNAme.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		textbox_lastName.sendKeys(lastName);
	}
	
	public void enterEmail(String mail) {
		textbox_mail.sendKeys(mail);
	}
	
	public void enterPassword(String password) {
		textbox_newPassword.sendKeys(password);
	}
	
	public void retypePassword(String reTypePassword) {
		textbox_retypeNewPassword.sendKeys(reTypePassword);
	}
	
	public void checkPrivacyAgreement() {
		checkbox_privacyAgreement.click();
	}
	
	public void checkTermsAndCondition() {
		checkbox_termsAndCondition.click();
	}
	
	public void clickRegister() {
		btn_register.click();
	}
	
	
	
	

}
