package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.testBase.Base;

public class FlipkartLogin extends Base 
{
	public FlipkartLogin()
	{
		//super();
	}
	
	//For Login Page
	WebElement Username;// = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
	WebElement Password; // = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
	
	WebElement Hmetext;
	
	
	/*
	 * 
	 * WebElement Otp =
	 * driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI jUwFiZ']"));
	 * WebElement Errormsg=driver.findElement(By.xpath("//span[@class='ZAtlA-']"));
	 * 
	 * //For Mobile Category Actions actions = new Actions(driver); WebElement
	 * mainmenu=driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
	 * 
	 * WebElement
	 * submenu=driver.findElement(By.xpath("//a[contains(text(),'OPPO')][1]"));
	 * WebElement
	 * viewbtn=driver.findElement(By.xpath("//a[@class='_2AkmmA _1eFTEo']"));
	 * WebElement Checkboc=driver.findElement(By.xpath(
	 * "//div[text()='Realme']//parent::label/input")); WebElement Clrfilter=
	 * driver.findElement(By.xpath("//span[text()='Filters']//following::span[1]"));
	 * 
	 * WebElement wishlist=driver.findElement(By.
	 * xpath("//div[text()='OPPO A5s (Black, 64 GB)']//preceding::div[2]"));
	 * WebElement
	 * Mobtext=driver.findElement(By.xpath("//div[text()='OPPO A5s (Blue, 64 GB)']")
	 * );
	 * 
	 * WebElement addtocart=
	 * driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
	 * WebElement
	 * verifyele=driver.findElement(By.xpath("//div[text()= 'My Cart (1)']"));
	 * 
	 * WebElement remove=driver.findElement(By.xpath("//div[text()= 'Remove']"));
	 * WebElement removepopup=driver.findElement(By.
	 * xpath("//div[@class='gdUKd9 _3Z4XMp _2nQDKB']")); WebElement
	 * pincode=driver.findElement(By.xpath("//input[@class='_3X4tVa']"));
	 * 
	 * WebElement
	 * free=driver.findElement(By.xpath("//span[contains(text(),'Free')]"));
	 */
	
	public void enterLoginDetails(String userName,String passWord ) throws InterruptedException
	{
		System.out.println("Inside login details");
	Username= driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
	Password= driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
	Username.sendKeys(userName);
	Password.sendKeys(passWord);
	
	}
	public void submitLoginForm() throws InterruptedException
	{
	WebElement SubmitButton= driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
	SubmitButton.click();
	//Thread.sleep(200);
	}
	
	public String verfiyUsername()
	{
	 Hmetext=driver.findElement(By.xpath("//div[contains(text(),'Sonal')]"));
     String name = Hmetext.getText();
	 System.out.println(name);
	
	return name;
	}
	
	public void Errormsg() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement Errormsg=driver.findElement(By.xpath("//span[@class='ZAtlA-']"));
		 String error=Errormsg.getText();
		 System.out.println(error);
	}	
}
