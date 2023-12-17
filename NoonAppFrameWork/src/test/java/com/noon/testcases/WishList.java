package com.noon.testcases;

import java.time.Duration;

import org.testng.annotations.Test;
import com.noon.base.Base;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
public class WishList extends Base {

	

	@Test
	public void testScenario2() throws InterruptedException  {
		AndroidTouchAction touch = new AndroidTouchAction(driver);

		touch.press(PointOption.point(501,1104)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
 	 	Thread.sleep(1000);

		//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView").click();	 	
          driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView").click();
		driver.findElementByXPath("//*[@text='Please enter your email address']").sendKeys("aamndfhkklllad@gmail.com");
	 	driver.findElementByXPath("//*[@text='Please enter your password']").sendKeys("1333bx00528a#");
	 	Thread.sleep(1000);
	 	driver.findElementByXPath("//*[@text='Sign In']").click();
 	 	Thread.sleep(1000);
		touch.press(PointOption.point(501,1104)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();

	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView").click();
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.ImageView").click();
    driver.findElementByXPath("//*[@text='Delete']").click();
    driver.findElementByXPath("//*[@text='CONTINUE SHOPPING']").click();
	 	Thread.sleep(1000);

    touch.press(PointOption.point(501,1104)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,50)).release().perform();
         driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView").click();	 	
 	 	Thread.sleep(1000);

         driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView").click();
    driver.findElementByXPath("//*[@text='Create New Wishlist']").click();
    driver.findElementByXPath("//*[@text='Enter wishlist name...']").sendKeys("Ahmed");
	
	}
}