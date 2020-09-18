package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testBase.Base;

public class OppoSrchRsltPage extends Base

{
	
	
	@FindBy(xpath="//a[@class='_2AkmmA _1eFTEo']")
	List<WebElement> viewbtn;
	WebDriverWait wait= new WebDriverWait (driver,30);
	
	public OppoSrchRsltPage()
	{
		PageFactory.initElements(driver, this);
	}
		
	public OppoMob goToOppoMob() 
	{
		System.out.println("Before Viewbtnclick");
	 	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='_2AkmmA _1eFTEo']"))).click();
			/*
			 * int noOfAttempts=0; while(noOfAttempts<20)
			 * 
			 * try {
			 * 
			 * 
			 * 
			 * //viewbtn.get(0).click(); }
			 * 
			 * catch(Exception e) {
			 * 
			 * System.out.println(noOfAttempts); noOfAttempts++; }
			 */
		
		
		System.out.println("After viewbtn click");
		return new OppoMob();
	}
	

	
}
