package com.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.Base;

public class Wishlist extends Base

{
	WebElement heart;
	
	@FindBy(xpath="//div[@class='DsQ2eg']")
	WebElement heartt;
	@FindBy(xpath="//div[text()='Sonal']")
	WebElement name;
	@FindBy (xpath="//div[@class='Owarxx _3fGWf7']")
	 WebElement  Wishlistcnt;
	@FindBy(xpath="//input[@class='_3X4tVa']")
	WebElement pincode;
	@FindBy(xpath="//span[contains(text(),'Check')]")
	WebElement checkPinCode;
	@FindBy(xpath="//div[contains(text(),'Delivery')]")
	WebElement delivery;
	@FindBy(xpath="//span[contains(text(),'Free')]")
	WebElement free;
	
	public Wishlist()
	{
		//System.out.println(driver);
		PageFactory.initElements(driver, this);
		
	}

	public void addToWishlist() throws InterruptedException
	{
		heartt.click();
		//System.out.println("Wishlisted");
		
	}
	
	public int checkwishlist() throws InterruptedException
	{
		//Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(name).perform();
		//actions.click(name).perform();
		//Thread.sleep(2000);
		int orgcnt=Integer.parseInt(Wishlistcnt.getText()); 
		 System.out.println(orgcnt);
		 
	     return orgcnt;
	}
	
	public void clearWishList()
	{
		heartt.click();
	}	
	
	
	public String checkDelivery(String s) throws InterruptedException
	{
		String result ="";
		Actions actions = new Actions(driver); 
		//Thread.sleep(2000);
	    actions.click(pincode).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(s).perform();
		//Thread.sleep(2000);
		 
		checkPinCode.click();
		//Thread.sleep(2000);
		 result = delivery.getText().substring(0, 8);
		int  noOfAttempts=0;
	 	while(noOfAttempts<10)
	 	{
	 		String text=null;
	 		try
	 		{ 
        
	 			text = free.getText().substring(free.getText().lastIndexOf("F"));
	 			if(text!=null)
	 			{
	 				result=result+text;
	 				break;
	 				
	 			}
	 			
	 		}
	 		catch(Exception e)
	 		{
	 			noOfAttempts++;
	 				System.out.println("Not tried");
	 				 
	 		}
	 	}	
	 	
	 	return result;
		 //System.out.println(result);
		
	}
	
	
	public void  checkFreeDelivery()
	{
		
		 
	}
	
	
	
	public  AddToCart  submit()
	{
		
		return new AddToCart();
		
	}
	
}

