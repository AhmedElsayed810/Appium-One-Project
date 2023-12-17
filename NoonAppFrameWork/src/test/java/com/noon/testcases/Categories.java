package com.noon.testcases;

import java.time.Duration;

import org.testng.annotations.Test;
import com.noon.base.Base;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
public class Categories  extends Base {


	@Test
	public void testScenario2() throws InterruptedException  {
		AndroidTouchAction touch = new AndroidTouchAction(driver);
		driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Categories, tab, 2 out of 5\"]/android.widget.ImageView").click();
	 	Thread.sleep(1000);
     
	 	//Men
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup").click();
	    driver.findElementByXPath("//*[@text='Top Brands']").click();
	    driver.findElementByXPath("//*[@text='Footwear']").click();
	    driver.findElementByXPath("//*[@text='For Him']").click();
	 	Thread.sleep(1000);
	 	touch.press(PointOption.point(501,1200)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(500,50)).release().perform();
	 	touch.press(PointOption.point(501,1200)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(500,50)).release().perform();
	 	Thread.sleep(1000);
	 	driver.findElementByXPath("//*[@text='Nike']").click();
	 	Thread.sleep(1000);

	 	touch.press(PointOption.point(501,1104)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	touch.press(PointOption.point(501,1104)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	touch.press(PointOption.point(501,1104)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	touch.press(PointOption.point(501,1104)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	
	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout").click();
	 	 	
     //Women
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
	 	Thread.sleep(1000);
        driver.findElementByXPath("//*[@text='Top Brands']").click();
	    driver.findElementByXPath("//*[@text='Footwear']").click();
	 
	    Thread.sleep(1000);
	 	touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
		  
	 //Grocery
	    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup").click();
	 	Thread.sleep(1000);
	    driver.findElementByXPath("//*[@text='Food']").click();
	    driver.findElementByXPath("//*[@text='Pasta and noodles']").click();
	 	Thread.sleep(1000);
	 	touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	 	touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout").click();
	 	 	 	    driver.findElementByXPath("//*[@text='Food']").click();
		 	
		    driver.findElementByXPath("//*[@text='Beverages']").click();
	 	
		    driver.findElementByXPath("//*[@text='Cleaning']").click();
		 	Thread.sleep(1000);

		   	touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
		  	driver.findElementByXPath("//*[@text='Top Brands']").click();
		    driver.findElementByXPath("//*[@text='Pet Supplies']").click();
		 	Thread.sleep(1000);

		    touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(500,50)).release().perform();

	    //Baby&Toys
	    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup").click();
	 	Thread.sleep(1000);
	    driver.findElementByXPath("//*[@text='Diapering']").click();
	    driver.findElementByXPath("//*[@text='Diapers']").click();
	    Thread.sleep(1000);
	    touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout").click();
	 	   
	    driver.findElementByXPath("//*[@text='Bathing & Skincare']").click();
	      	  
	    driver.findElementByXPath("//*[@text='Diapering']").click();
	    driver.findElementByXPath("//*[@text='Bathing & Skincare']").click();
	    driver.findElementByXPath("//*[@text='Baby Needs']").click();
	    driver.findElementByXPath("//*[@text='Baby Feeding']").click();
	    driver.findElementByXPath("//*[@text='Baby Transport']").click();
	    touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	
	 //Mobiles&Tablets
	    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup").click();
	 	Thread.sleep(1000);
	    touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(500,50)).release().perform();
	 	Thread.sleep(1000);
	    driver.findElementByXPath("//*[@text='Mobile Accessories']").click();
	    driver.findElementByXPath("//*[@text='Shop by Price']").click();
	    driver.findElementByXPath("//*[@text='Tablets']").click();
	    Thread.sleep(1000);
	 	touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	 	touch.press(PointOption.point(501,1004)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
	    
	  
	  //Electronics 
	    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup").click();
	 	Thread.sleep(1000);
	    driver.findElementByXPath("//*[@text='Audio']").click();
	    driver.findElementByXPath("//*[@text='Camera']").click();
	    driver.findElementByXPath("//*[@text='Gaming']").click();
	 	touch.press(PointOption.point(501,1804)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();

	   //TVS
	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup").click();
	 	
	  //Laptops
	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup").click();

	 
	 	//Home
	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]/android.view.ViewGroup").click();
	 	Thread.sleep(1000);
	 	driver.findElementByXPath("//*[@text='Top Brands']").click();
	 	driver.findElementByXPath("//*[@text='Home Improvement']").click();
	 	touch.press(PointOption.point(501,1804)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();

	 	//Appliances
	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[11]/android.view.ViewGroup").click();
	 	Thread.sleep(1000);
	 	driver.findElementByXPath("//*[@text='Top Brands']").click();
	 	driver.findElementByXPath("//*[@text='Heating, Cooling & Air Quality']").click();
	 	driver.findElementByXPath("//*[@text='Large Appliances']").click();
	 	driver.findElementByXPath("//*[@text='Home Appliances']").click();
	 	touch.press(PointOption.point(501,1804)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();

	 	//Automotive
	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[12]/android.view.ViewGroup").click();
	 
	 	//Sports
	 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[13]/android.view.ViewGroup").click();
	 	//driver.findElementByXPath("//*[@text='Snacks']").click();
	 	//driver.findElementByXPath("//*[@text='Snacks']").click();



}
}