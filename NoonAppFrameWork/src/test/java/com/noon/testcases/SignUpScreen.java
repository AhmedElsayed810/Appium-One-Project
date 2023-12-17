package com.noon.testcases;

import java.time.Duration;

import org.testng.annotations.Test;
import com.noon.base.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SignUpScreen extends Base {

	@Test
	public void testScenario2() throws InterruptedException  {
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		
		driver.findElement(MobileBy.AccessibilityId("My Account, tab, 4 out of 5")).click();
	 	driver.findElementByXPath("//*[@text='Sign Up']").click();
	 	
	 	//Register with valid credentials , Check the Show Password feature and save password
	 	driver.findElementByXPath("//*[@text='Please enter your first name']").sendKeys("Ahmed");
	 	driver.findElementByXPath("//*[@text='Please enter your last name']").sendKeys("Elsayed");
	 	driver.findElementByXPath("//*[@text='Please enter your email address']").sendKeys("EmmaannGeebrrll@gmail.com");
	 	driver.findElementByXPath("//*[@text='Please enter your password']").sendKeys("1392021AE#");
	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.ImageView").click();
	 	Thread.sleep(1000);
	 	driver.findElementByXPath("//*[@text='Sign Up']").click();
	 	Thread.sleep(5000);
	 	
	 	//Sign out
	 	 	touch.press(PointOption.point(500,1600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(500,200)).release().perform();
	 	 	Thread.sleep(1000);
	 	 	driver.findElementByXPath("//*[@text='Sign Out']").click();
	 	 	Thread.sleep(5000);

	 	

	 	
	 	//Register with invalid first name by adding special characters  
	 	 	
	 	 	driver.findElement(MobileBy.AccessibilityId("My Account, tab, 4 out of 5")).click();
		 	driver.findElementByXPath("//*[@text='Sign Up']").click();
		 
	 	 	driver.findElementByXPath("//*[@text='Please enter your first name']").sendKeys("hdkkcj%");
	 	 	driver.findElementByXPath("//*[@text='Please enter your last name']").sendKeys("sdsdawaa");
	 	 	driver.findElementByXPath("//*[@text='Please enter your email address']").sendKeys("EmanGebril@gmail.com");
	 	 	driver.findElementByXPath("//*[@text='Please enter your password']").sendKeys("1392021AE#");
	 	 	driver.findElementByXPath("//*[@text='Last Name']").click();
	 	 	Thread.sleep(1000);
	 	 	driver.findElementByXPath("//*[@text='Sign Up']").click();
	 	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView").click();
	 	 	Thread.sleep(1000);
	 	 	driver.findElementByXPath("//*[@text='Sign Up']").click();
	 	 
	 	 	
	 	
	 
	 	
	 	 	//use invalid 'password' input by make it	less than 8 char
	 	 	 	driver.findElementByXPath("//*[@text='Please enter your first name']").sendKeys("wfesf");
	 	 	 	driver.findElementByXPath("//*[@text='Please enter your last name']").sendKeys("fdgggf");
	 	 	 	driver.findElementByXPath("//*[@text='Please enter your email address']").sendKeys("EmanGebrifel@gmail.com");
	 	 	 	driver.findElementByXPath("//*[@text='Please enter your password']").sendKeys("1333457");
	 	 	 	driver.findElementByXPath("//*[@text='Last Name']").click();
	 	 	 	Thread.sleep(1000);
	 	 	 	driver.findElementByXPath("//*[@text='Sign Up']").click();
	 	 	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView").click();
	 	 	 	Thread.sleep(1000);
	 	 	 	driver.findElementByXPath("//*[@text='Sign Up']").click();
	 	
	 	
	 	// can not register with email already in use 
	 	 	 	driver.findElementByXPath("//*[@text='Please enter your first name']").sendKeys("wfesf");
	 	 	 	driver.findElementByXPath("//*[@text='Please enter your last name']").sendKeys("fdgggf");
	 	 	 	driver.findElementByXPath("//*[@text='Please enter your email address']").sendKeys("ahmedelsayed1392021@gmail.com");
	 	 	 	driver.findElementByXPath("//*[@text='Please enter your password']").sendKeys("1333gsdg457");
	 	 	 	driver.findElementByXPath("//*[@text='Last Name']").click();
	 	 	 	Thread.sleep(1000);
	 	 	 	driver.findElementByXPath("//*[@text='Sign Up']").click();
	 	 	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView").click();
	 	 	 	Thread.sleep(1000);
	 	 	 	driver.findElementByXPath("//*[@text='Sign Up']").click();
	 	

	 	 	 	
	}
}