package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.Base;

public class OppoMob  extends Base
{
	
	@FindBy(xpath="//div[@class='_3clSXm'][2]/div[2]")
	WebElement Mobnme;
	@FindBy(xpath="//span[contains(text(),'MORE')]")
	 WebElement more;
	@FindBy(xpath="//div[text()='Realme']")
	 WebElement realme;
	@FindBy(xpath="//div[@class='OICbV5 Su_9Op']")
	WebElement filterbtn;
	@FindBy(xpath="//span[text()='Filters']//following::span[1]")
	WebElement Clrfilter;
	@FindBy(xpath="//div[@class='_2xEnNW']//div[text()='Realme']")
	WebElement filters;
	@FindBy(xpath="//span[text()='Filters']//following::span[1]")
	WebElement Clrfilterr;
	@FindBy(xpath="//div[contains(text(),'Asus ROG')]")
	 List<WebElement> wishlist;

	public OppoMob()
	{
		PageFactory.initElements(driver, this);
	}
	
 public String verifyFilter() throws InterruptedException
 {
	 Thread.sleep(2000);
	 String s =Mobnme.getText();
	 System.out.println();
	 return s;
 }
 
 public void applyBrandFilter() throws InterruptedException
 {
	 Thread.sleep(2000);
	
	 more.click();
	 Thread.sleep(2000);
     realme.click();
	 filterbtn.click();
	 Thread.sleep(2000);
	
 }
 
 public String verifyAppliedFilter()
 {
	 
	 String name=filters.getText();
	 System.out.println(name);
	return name;
 }
 
 public void clrfilter()
 {
	 
	 Clrfilterr.click();
 }
 
 public Wishlist gotoWishlist() throws InterruptedException
 {
	 Thread.sleep(2000);
	
	  wishlist.get(0).click();
	  return new Wishlist();
	 
 }
 
 

}
