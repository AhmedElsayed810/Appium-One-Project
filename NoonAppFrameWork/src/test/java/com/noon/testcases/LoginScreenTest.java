package com.noon.testcases;

import java.time.Duration;

import org.testng.annotations.Test;
import com.noon.base.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class LoginScreenTest extends Base  {

	@Test
	public void testScenario1() throws InterruptedException  {
		AndroidTouchAction touch = new AndroidTouchAction(driver);

		driver.findElement(MobileBy.AccessibilityId("My Account, tab, 4 out of 5")).click();
	 	driver.findElementByXPath("//*[@text='Sign In']").click();
	 	
//		Log in with valid credentials and Check the Show Password feature.
	 	driver.findElementByXPath("//*[@text='Please enter your email address']").sendKeys("EmmaannGeebrrll@gmail.com");
	 	driver.findElementByXPath("//*[@text='Please enter your password']").sendKeys("1392021AE#");
	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView[2]").click();
	 	driver.findElementByXPath("//*[@text='Ahlan! Welcome back!']").click();
	 	Thread.sleep(1000);
	 	driver.findElementByXPath("//*[@text='Sign In']").click();
	 	Thread.sleep(3000);
	 	
	 	
	 	//Sign out
	 	touch.press(PointOption.point(501,1804)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(500,50)).release().perform();
	 	Thread.sleep(1000);
	 	driver.findElementByXPath("//*[@text='Sign Out']").click();
	 	 	
	 	//Restore the password with a registered email.
	 	driver.findElement(MobileBy.AccessibilityId("My Account, tab, 4 out of 5")).click();
	 	driver.findElementByXPath("//*[@text='Sign In']").click();
	 	driver.findElementByXPath("//*[@text='Forgot your password?']").click();
	 	Thread.sleep(1000);
	 	driver.findElementByXPath("//*[@text='Please enter your email address']").sendKeys("EmanGeebrrll@gmail.com");
	 	Thread.sleep(1000);
	 	driver.findElementByXPath("//*[@text='Reset Password']").click();
	 	Thread.sleep(1000);
	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView").click();
	 	Thread.sleep(1000);
	 	driver.findElementByXPath("//*[@text='Sign In']").click();

	 	//Login with an unregistered email.
	 	driver.findElementByXPath("//*[@text='Please enter your email address']").sendKeys("habaza@gmail.com");
	 	driver.findElementByXPath("//*[@text='Please enter your password']").sendKeys("13920210190101410Aa@");
	 	driver.findElementByXPath("//*[@text='Ahlan! Welcome back!']").click();
	 	Thread.sleep(1000);
	 	driver.findElementByXPath("//*[@text='Sign In']").click();
	
	 	

	 	
	 	
	 	
	 	
	 	
	 	
	 	
	}
}
