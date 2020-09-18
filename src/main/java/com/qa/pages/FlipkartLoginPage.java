package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.Base;

public class FlipkartLoginPage extends Base 
{
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	WebElement Username;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement Password; 
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement SubmitButton;
	@FindBy(xpath="//span[@class='ZAtlA-']")
	WebElement Errormsg;
	
	
	
	public FlipkartLoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//For Login Page
	public void enterLoginDetails(String userName,String passWord ) 
	{
		
		Username.sendKeys(userName);
		Password.sendKeys(passWord);
	
	}
	
	public FlipkartHomePage submitLoginForm() 
	{
	   SubmitButton.click();
	   return new FlipkartHomePage();
	}
	
	
	public String Errormsg() 
	{
		
		SubmitButton.click();
		String error=Errormsg.getText();
		// System.out.println(error);
		return error;
	}	
	
	
	
}
