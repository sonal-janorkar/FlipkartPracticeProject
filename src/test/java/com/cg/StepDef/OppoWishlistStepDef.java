package com.cg.StepDef;

import java.util.Set;

import org.junit.Assert;

import com.qa.pages.FlipkartHomePage;
import com.qa.pages.FlipkartLoginPage;
import com.qa.pages.OppoMob;
import com.qa.pages.OppoSrchRsltPage;
import com.qa.pages.Wishlist;
import com.qa.testBase.Base;

import cucumber.api.java.en.*;


public class OppoWishlistStepDef extends Base

{
	Base base= new Base();
	 FlipkartLoginPage login;
		FlipkartHomePage home;
		OppoSrchRsltPage result;
		OppoMob mobile;
		Wishlist wish;
    int  orgcnt,modCount;
    String text;
    
    
	@Given("Product is available")
	public void product_is_available() throws InterruptedException 
	{
	   
	   base.init();
	   
	     login= new FlipkartLoginPage();
		 home=new FlipkartHomePage();
		 result= new OppoSrchRsltPage();
		 mobile= new OppoMob();
		wish= new Wishlist();
	   login.enterLoginDetails(proper.getProperty("username"),proper.getProperty("password"));
	   login.submitLoginForm();
	   home=new FlipkartHomePage();
		home.clickOnElectronics();
		home.clickOnOppo();
	  // result.goToOppoMob();
	   String handle =driver.getWindowHandle();
	   
	   mobile.gotoWishlist();
	   
	   Set<String> allWindows = driver.getWindowHandles();
	   for(String s:allWindows)
	   {
		   if(!s.equals(handle))
		   {
			   driver.switchTo().window(s);
		   }
	   }
	   
	   
	   
	}

	@When("User clicks on heart icon")
	public void user_clicks_on_heart_icon() throws InterruptedException 
	{
		
		orgcnt=wish.checkwishlist();
		wish.addToWishlist();
		modCount = wish.checkwishlist();
		System.out.println("Original count is"+orgcnt);
		//wish.clearWishList();
	   
	}

	@Then("Product is added to wishlist")
	public void product_is_added_to_wishlist() throws InterruptedException
	{
	   	    
		wish.clearWishList();
		System.out.println("Modified count is"+modCount);
		Assert.assertEquals(orgcnt+1,modCount);
		
		driver.close();
		
	}
	
	
	
	//Scanario Add to cart
	
	
	@When("User enters {string}")
	public void user_enters(String string) throws InterruptedException 
	{
	    
	   text=wish.checkDelivery(string);
	   
	   
	}
	
	@Then("verify pincode is servicable and delivery is free")
	public void verify_pincode_is_servicable_and_delivery_is_free()
	{
		
	    Assert.assertEquals("DeliveryFree",text);
		
	    
	}

	
}
