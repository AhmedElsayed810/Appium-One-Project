package com.noon.base;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	protected static AndroidDriver <MobileElement> driver;
	protected FileInputStream inputStream;
    protected Properties prop;
    
    public Base() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
    @Parameters({"deviceName","platformName","platformVersion"})
	@BeforeClass
	public void beforeClass(String deviceName , String platformName , String platformVersion) throws Exception  {
		 
		File propFile = new File("src\\main\\resources\\config\\config.properties");
	    inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		
		File androidApp = new File(prop.getProperty("androidAppPath"));
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, prop.getProperty("androidAutomationName"));
		caps.setCapability(MobileCapabilityType.APP,androidApp.getAbsolutePath() );
			 driver = new AndroidDriver <MobileElement> (new URL(prop.getProperty("appiumServerLink")),caps);
			   
				
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			    driver.findElementByXPath("//*[@text='Egypt']").click();
			 	driver.findElementByXPath("//*[@text='Don’t allow']").click();
			 	Thread.sleep(1000);
			 	driver.findElementByXPath("//*[@text='Don’t allow']").click();
			 	Thread.sleep(1000);
			 	driver.findElementByXPath("//*[@text='CONFIRM LOCATION']").click();
			 	Thread.sleep(3000);
 	
	}
	}
	

