package com.cg.StepDef;

import org.testng.Assert;

import com.qa.pages.FlipkartHomePage;
import com.qa.pages.FlipkartLoginPage;
import com.qa.testBase.Base;
import cucumber.api.java.en.*;


public class FlipkartHomeSDF extends Base
{

	Base base= new Base();
	FlipkartHomePage home;
	 FlipkartLoginPage flipkart;
	 String Text;
	
	@Given("User is already login with credentials {string} and {string}")
	public void user_is_already_login_with_credentials_and(String string, String string2) throws InterruptedException
	{ 
	    base.init();
	    flipkart=new FlipkartLoginPage();
	    flipkart.enterLoginDetails(string , string2);
	    flipkart.submitLoginForm();
	    
	}

	@When("User click on Oppo mobile")
	public void user_click_on_Oppo_mobile() 
	{
	    
		home=new FlipkartHomePage();
		home.clickOnElectronics();
		//Thread.sleep(10000);
		
		home.clickOnOppo();
	    
	}

	@Then("User is able to Only oppo phones")
	public void user_is_able_to_Only_oppo_phones()
	{
		//home.verifyTitle();
		
		//Assert.assertEquals(home.verifyTitle(),"Oppo Mobiles under ₹10K");
		//System.out.println("MOb Present");
	   driver.close();
	}

	
}
