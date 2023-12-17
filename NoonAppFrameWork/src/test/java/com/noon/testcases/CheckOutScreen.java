package com.noon.testcases;


import org.testng.annotations.Test;
import com.noon.base.Base;

public class CheckOutScreen extends Base {

	@Test
	public void testScenario2() throws InterruptedException  {
		
		//Add Item To Cart
	 	Thread.sleep(1000);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]").click();
        driver.findElementByXPath("//*[@text='ADD TO CART']").click();
	 	 	driver.findElementByXPath("//*[@text='VIEW CART']").click();
	 	Thread.sleep(2000);
	 
	 	//Checkout
	 	driver.findElementByXPath("//*[@text='CHECKOUT']").click();
	 	driver.findElementByXPath("//*[@text='Please enter your email address']").sendKeys("EmmaannGeebrrll@gmail.com");
	 	driver.findElementByXPath("//*[@text='Please enter your password']").sendKeys("1392021AE#");
	 	Thread.sleep(1000);
	 	driver.findElementByXPath("//*[@text='Sign In']").click();
	 	driver.findElementByXPath("//*[@text='CHECKOUT']").click();
	 	driver.findElementByXPath("//*[@text='CONFIRM LOCATION']").click();
	 	Thread.sleep(1000);
	 	driver.findElementByXPath("//*[@text='Where do you want us to drop the package?']").sendKeys("OrabyStreate");
	 	driver.findElementByXPath("//*[@text='10']").click();
	 	driver.findElementByXPath("//*[@text='12']").click();
	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.EditText").sendKeys("75021425");
	 	driver.findElementByXPath("//*[@text='PERSONAL INFORMATION']").click();
	 	driver.findElementByXPath("//*[@text='SAVE ADDRESS']").click();
	 
	 
}}
