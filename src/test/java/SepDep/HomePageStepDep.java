package SepDep;

import com.ActionPage_Demo.HomePageaction;

import TestUtil.Demo.Testbase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepDep extends Testbase{
	
	HomePageaction homepageactionobj= new HomePageaction();

	@Given("^launch \"([^\"]*)\"$")
	public void launch(String url) throws Throwable {
		getUrl(url);
		
		
	   
	}
	@Then("^Click on Signinlink$")
	public void click_on_Signinlink() throws Throwable {
		homepageactionobj.ClickonSigninlink();
	    
	}

	@Then("^Click on Sign in Button$")
	public void click_on_Sign_in_Button() throws Throwable {
		homepageactionobj.ClickonSigninButton();
	    
	}

	@Then("^Enter UserPass and click login$")
	public void enter_UserPass_and_click_login() throws Throwable {
		homepageactionobj.EnterUserPassandclicklogin(Pro.getProperty("username1"),Pro.getProperty("password1"));
	}

	@Then("^Verify user login successcefully\\.$")
	public void verify_user_login_successcefully() throws Throwable {
		homepageactionobj.Verifyuserloginsuccesscefully();
	   	}
	@Then("^Write the product Name$")
	public void write_the_product_Name() throws Throwable {
		homepageactionobj.WritetheproductName();
	}

	@Then("^Click on Search$")
	public void click_on_Search() throws Throwable {
		homepageactionobj.ClickonSearch();
	}

	@Then("^Verify search result$")
	public void verify_search_result() throws Throwable {
		homepageactionobj.Verifysearchresult();
	}
	
	
	////done
	@Then("^mouse over to deals$")
	public void mouse_over_to_deals() throws Throwable {
		homepageactionobj.mouseovertodeals();
	}

	@Then("^mouse over Desktops deals$")
	public void mouse_over_Desktops_deals() throws Throwable {
		
		homepageactionobj.mouseovertodestopdeals();
	}
		

	@Then("^Click For Home$")
	public void click_For_Home() throws Throwable {
		homepageactionobj.clickforhome();
	    
	}

	@Then("^Verify Desktop Computer Deals displaying$")
	public void verify_Desktop_Computer_Deals_displaying() throws Throwable {
		homepageactionobj.verifyDesktopComputerDeals();
	}
	
	
}
