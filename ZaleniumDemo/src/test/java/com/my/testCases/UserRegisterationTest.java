package com.my.testCases;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.my.base.Setup;
import com.my.pageObject.HomePage;
import com.my.pageObject.RegistrationPage;
import com.my.utility.ExcelReader;

public class UserRegisterationTest extends Setup{
	
	
	
	@Test
	public void RegisterTest() throws InterruptedException {
		HomePage hm=PageFactory.initElements(super.driver, HomePage.class); 
		RegistrationPage rp = PageFactory.initElements(super.driver, RegistrationPage.class);
		ExcelReader er = new ExcelReader("./src/test/resources/TestData.xlsx");
		hm.acceptCookies();
		hm.clickOnSignUp(); 
		Thread.sleep(3000);
		driver.switchTo().frame("IDS_UI_Window");
		rp.enterFirstName(er.getCellData("Sheet1", 0, 2));
		rp.enterLastName(er.getCellData("Sheet1", 1, 2));
		rp.enterEmail(er.getCellData("Sheet1", 2, 2));
		rp.enterPassword(er.getCellData("Sheet1", 3, 2));
		rp.retypePassword(er.getCellData("Sheet1", 4, 2));
		rp.checkPrivacyAgreement();
		rp.checkTermsAndCondition();
		rp.clickRegister();
	}
}
