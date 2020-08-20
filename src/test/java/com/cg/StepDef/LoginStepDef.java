package com.cg.StepDef;


import org.junit.Assert;

import com.qa.pages.FlipkartLogin;
import com.qa.testBase.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends Base

{
    String verfyName;
    FlipkartLogin login ;
    @Given("User is on Login Page")
    public void user_is_on_Login_Page()
	{
	   Base base= new Base();
	   base.init();
	    
	}

	   

   // @When("User enters correct {string} and {string} and User click on submit")
    public void user_enters_correct_and_and_User_click_on_submit(String string, String string2) throws InterruptedException
	
	{
		login = new FlipkartLogin();
		//System.out.println("Inside step def");
		login.enterLoginDetails(string,string2);
		login.submitLoginForm();
		verfyName=login.verfiyUsername();
		
	}

	
	//@Then("Username is visible on Home page")
	public void username_is_visible_on_Home_page() 
	{
	    Assert.assertEquals(verfyName,"Sonal");
	    driver.close();
	    
	}
	
	
	//2nd scenario
	
	
	
	@When("User enters incorrect {string} and correct {string} and User click on submit")
	public void user_enters_incorrect_and_correct_and_User_click_on_submit(String string3, String string4) throws InterruptedException {
	    
		login= new FlipkartLogin();
		login.enterLoginDetails(string3,string4);
		login.submitLoginForm();
		login.Errormsg();
		
	}

	@Then("User gets error message")
	public void user_gets_error_message() {
	   driver.close();
	}

	
}
