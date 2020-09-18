package com.cg.StepDef;

import java.util.Set;

import org.junit.Assert;

import com.qa.pages.AddToCart;
import com.qa.pages.FlipkartHomePage;
import com.qa.pages.FlipkartLoginPage;
import com.qa.pages.OppoMob;
import com.qa.pages.Wishlist;
import com.qa.testBase.Base;

import cucumber.api.java.en.*;
//import junit.framework.Assert;

public class AddtoCartStepDef extends Base
{
	
	Base base= new Base();
	FlipkartLoginPage login= new FlipkartLoginPage();
	FlipkartHomePage home;
	OppoMob mobile;
	AddToCart add;
	Wishlist wishlist;
	String actual,acutalText;
	
	@Given("Product is available for {string}")
	public void product_is_available_for(String string) throws InterruptedException 
	{
		   base.init();
		    login= new FlipkartLoginPage();
			 home=new FlipkartHomePage();
			 mobile= new OppoMob();
			 add= new AddToCart();
			Wishlist wishlist= new Wishlist();
		   login.enterLoginDetails(proper.getProperty("username"),proper.getProperty("password"));
		   login.submitLoginForm();
		   home=new FlipkartHomePage();
			home.clickOnElectronics();
			home.clickOnOppo();
		   
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
		   
	    wishlist.checkDelivery(string);
	   
	   
	}

	@When("User clicks on Add to cart button")
	public void user_clicks_on_Add_to_cart_button() throws InterruptedException
	
	{
		add.addTOCartClick();
	   
	}

	@Then("Product successfully added into cart")
	public void product_successfully_added_into_cart() throws InterruptedException
	{
		actual=add.checkCart();
		Assert.assertEquals("My Cart (1)", actual);
		driver.close();
		   
	}
	
	
	
	//Remove scanario
	
	@Given("Product is added into cart")
	public void product_is_added_into_cart() throws InterruptedException 
	{
	    
		add.addTOCartClick();
	}

	@When("User clicks on remove button")
	public void user_clicks_on_remove_button()
	{
	    
	    add.removebtn();	}

	@Then("Product successfully remove from cart")
	public void product_successfully_remove_from_cart() throws InterruptedException 
	{
		acutalText=add.verifyCartisEmpty();
		Assert.assertEquals("Your cart is empty!",acutalText);
	    driver.close();
	}

}
