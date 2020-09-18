package com.cg.StepDef;



import org.junit.Assert;
import com.qa.pages.FlipkartHomePage;
import com.qa.pages.FlipkartLoginPage;
import com.qa.pages.OppoMob;
import com.qa.pages.OppoSrchRsltPage;
import com.qa.testBase.Base;

import cucumber.api.java.en.*;


public class OppoSrchRsltSDF extends Base
{
	String text;
	String Filtername;
	Base base;
	FlipkartLoginPage login;
	FlipkartHomePage home;
	OppoSrchRsltPage result;
	OppoMob mobile;
	
	
	@Given("User search for  Oppop mobiles")
	public void user_search_for_Oppop_mobiles() throws InterruptedException {
	
		
		base= new Base();
		base.init();
		System.out.println(proper.getProperty("username"));
		System.out.println(proper.getProperty("password"));
	   
	     login= new FlipkartLoginPage();
	     login.enterLoginDetails(proper.getProperty("username"),proper.getProperty("password"));
	     login.submitLoginForm();
	    
	
	}
	
	@When("User click on View all")
	public void user_click_on_View_all() throws InterruptedException
	{
		home=new FlipkartHomePage();
		home.clickOnElectronics();
		home.clickOnOppo();
		
				
		mobile=new OppoMob();
        text=mobile.verifyFilter();
	}

	
	
	@Then("User is able view all OPPO mobiles")
	public void user_is_able_view_all_OPPO_mobiles()
	{
		Assert.assertEquals(text,"OPPO");
		driver.close();
	   
	}
	
	
	
	//2nd scenario
	
	@Given("User  {string} and {string} Filter by Brand")
	
	public void user_and_Filter_by_Brand(String string, String string2) {
	    
	}
	
	@When("User clicks on Brand checkbox")
	public void user_clicks_on_Brand_checkbox() throws InterruptedException 
	{
		home=new FlipkartHomePage();
		home.clickOnElectronics();
		home.clickOnOppo();	
		
		mobile=new OppoMob();
		mobile.applyBrandFilter();
	    
	}

	@Then("Selected checkbox appear inside filter")
	public void selected_checkbox_appear_inside_filter() 
	{
		
		Filtername=	mobile.verifyAppliedFilter();
		Assert.assertEquals(Filtername,"Realme");
		mobile.clrfilter();
		driver.close();
	}

}
