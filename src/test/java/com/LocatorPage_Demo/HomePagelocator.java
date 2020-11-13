package com.LocatorPage_Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import TestUtil.Demo.Testbase;

public class HomePagelocator extends Testbase{
	

	public HomePagelocator() { //constructor
		
		PageFactory.initElements(Driver, this);//constructor is ready (driver is from testbase, this is object model)
	
	}
 
		@FindBy(how=How.XPATH, using="//span[text()='Sign In']") //or //span[@class='mh-si-label']

		public WebElement SignInLink;
		@FindBy(how=How.XPATH, using="//a[text()='Sign In']")
		public WebElement SignInButton;
		@FindBy(how=How.ID, using="EmailAddress")
		public WebElement Username;
		@FindBy(how=How.ID, using="Password")
		public WebElement Password;
		@FindBy(how=How.XPATH, using="//button[text()='Sign In']")
		public WebElement LoginButton;
		@FindBy(how=How.XPATH, using="//span[text()='Farhan Mahfuz']")
		public WebElement VerifyLogin;
		
		
		@FindBy(how=How.XPATH, using="//input[@class='mh-search-input']")
		public WebElement ProductName;
		@FindBy(how=How.XPATH, using="//span[@class='mh-search-button-label']")
		public WebElement ClickSearch;
		@FindBy(how=How.XPATH, using="//a[text()='Get your monitor shipped fast.']")
		public WebElement VerifyResult;
		
		//done
		@FindBy(how=How.ID, using="l5")
		public WebElement Mouseover;
		@FindBy(how=How.XPATH, using="//*[@id=\"l5_2\"]/span")
		public WebElement mouseoverDesktopdeals;
        
		@FindBy(how=How.XPATH, using="//*[@alt='View all Desktop Deals for Home']")
		public WebElement clickForhome;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"dealsLanding\"]/div[2]/div[3]/div[1]/div/div/h1")
		public WebElement DesktopComputerDealsdisplaying;
}
