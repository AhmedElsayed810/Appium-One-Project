
package com.noon.screens;



import com.noon.base.Base;

import io.appium.java_client.MobileBy;



public class LoginScreen extends Base {
	
	public void MyAcount() {
		
		driver.findElement(MobileBy.AccessibilityId("My Account, tab, 4 out of 5")).click();
}	
	public void SignInSelect() {
		
	 	driver.findElementByXPath("//*[@text='Sign In']").click();
}
    public void FillEmailAndPasswrd() {
		
	driver.findElementByXPath("//*[@text='Please enter your email address']").sendKeys("ahmedelsayed1392021@gmail.com");
 	driver.findElementByXPath("//*[@text='Please enter your password']").sendKeys("1392021019010141010Aa@");
}

    public void ShowPassword() throws InterruptedException {
	
 	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView[2]").click();
 	Thread.sleep(1000);
}

    public void SignInBuuton() throws InterruptedException {
	
 	driver.findElementByXPath("//*[@text='Sign In']").click();
 	Thread.sleep(3000);
}


	
	
	
	
 



















}

