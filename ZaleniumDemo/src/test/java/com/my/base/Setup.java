package com.my.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;


@Listeners(ExtentITestListenerAdapter.class)
public class Setup {
	protected RemoteWebDriver driver;
	@BeforeTest
	public void intialize() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.BROWSER_NAME,BrowserType.CHROME);
		cap.setCapability(CapabilityType.PLATFORM_NAME,Platform.LINUX);
		URL url = new URL("http://localhost:4444/wd/hub");
		
		driver = new RemoteWebDriver(url,cap);
		driver.get("https://cai.tools.sap/");
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();	
	}
}
