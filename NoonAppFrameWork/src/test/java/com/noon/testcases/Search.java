package com.noon.testcases;

import java.time.Duration;

import org.testng.annotations.Test;
import com.noon.base.Base;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
public class Search extends Base {

	@Test
	public void testScenario2() throws InterruptedException  {
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		
	    driver.findElementByXPath("//*[@text='What are you looking for?']").click();
	    driver.findElementByXPath("//*[@text='What are you looking for?']").sendKeys("shirts");
	 	Thread.sleep(1000);
	    driver.findElementByXPath("//*[@text='shirts for men']").click();
	  

	    touch.press(PointOption.point(501,1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	touch.press(PointOption.point(501,1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView").click();
	 
        driver.findElementByXPath("//*[@text='What are you looking for?']").sendKeys("shoes");
	 	Thread.sleep(1000); 
	    driver.findElementByXPath("//*[@text='shoes for kids']").click();
	    touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView").click();
	   
        driver.findElementByXPath("//*[@text='What are you looking for?']").sendKeys("sports");
	 	Thread.sleep(1000); 
	    driver.findElementByXPath("//*[@text='sports bag']").click();
	    touch.press(PointOption.point(501,1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	touch.press(PointOption.point(501,1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	Thread.sleep(1000);

	  

        
	}}
