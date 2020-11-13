package com.ActionPage_Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.LocatorPage_Demo.HomePagelocator;

import TestUtil.Demo.Testbase;
import junit.framework.Assert;

public class HomePageaction extends Testbase{
	HomePagelocator homepagelocatorobj= new HomePagelocator();
	public void ClickonSigninlink(){
		homepagelocatorobj.SignInLink.click();
		
	}
	public void ClickonSigninButton() {
		homepagelocatorobj.SignInButton.click();
	}
	public void EnterUserPassandclicklogin(String u, String p) {
		homepagelocatorobj.Username.sendKeys(u);
		homepagelocatorobj.Password.sendKeys(p);
		homepagelocatorobj.LoginButton.click();
		
	}
	public void Verifyuserloginsuccesscefully() {
		boolean verifyresult = homepagelocatorobj.VerifyLogin.isDisplayed();
		Assert.assertTrue(verifyresult);
		
		
	}
	public void WritetheproductName() {
		homepagelocatorobj.ProductName.sendKeys("Monitor");
	}
	public void ClickonSearch() {
		homepagelocatorobj.ClickSearch.click();
	}
	public void Verifysearchresult() {
		boolean Result= homepagelocatorobj.VerifyResult.isDisplayed();
		Assert.assertTrue(Result);
	}
	//DONEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
	
	
	
	
public void mouseovertodeals() {
	Actions ac = new Actions(Driver);
	ac.moveToElement(homepagelocatorobj.Mouseover).build().perform();
}
public void mouseovertodestopdeals() {
	Actions ac = new Actions(Driver);
	ac.moveToElement(homepagelocatorobj.mouseoverDesktopdeals).build().perform();
}
	
	public void clickforhome(){
		homepagelocatorobj.clickForhome.click();
		
	}
	public void verifyDesktopComputerDeals() {
		boolean result= homepagelocatorobj.DesktopComputerDealsdisplaying.isDisplayed();
		Assert.assertTrue(result);
		
	}
	
	
}
	

