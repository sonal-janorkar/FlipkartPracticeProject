package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.Base;

public class AddToCart  extends Base



{

	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement addtocart;
	@FindBy(xpath="//div[@class='_1lBhq8']")
	WebElement checkcart;
	@FindBy(xpath="//div[contains(text(),'Remove')]")
	WebElement remove;
	@FindBy(xpath="//div[contains(text(),'Remove Item')]//following::div[5]")
	WebElement removepopup;
	@FindBy(xpath="//div[contains(text(),'Your cart is empty!')]")
	WebElement emptycart;
	
	public AddToCart()
	{
		//System.out.println(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void addTOCartClick() throws InterruptedException
	{
		
		
		
		addtocart.click();
		Thread.sleep(2000);
		
	}
	
	
	public String checkCart()
	{
		
		String original=checkcart.getText();
		System.out.println(original);
		return original;
	}
	
	public void removebtn()
	{
		
		remove.click();
		
		removepopup.click();		
		
	}
	
	public String verifyCartisEmpty() throws InterruptedException
	{
		Thread.sleep(2000);
		
		String Original= emptycart.getText();
		return Original;
	}
	
	
	
}
