package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testBase.Base;

public class FlipkartHomePage extends Base
{
	@FindBy(xpath="//div[contains(text(),'Sonal')]")
	WebElement Hmetext;
	@FindBy(xpath="//span[text()='Electronics']")
	WebElement mainMenu;
	@FindBy(xpath="//a[@title='Asus']")
	WebElement submenu;
	@FindBy(xpath="//h2[contains(text(),'Oppo Mobiles')]")
	List<WebElement> Title;
	
	WebDriverWait wait;
	
	public FlipkartHomePage()
	{
		System.out.println(driver);
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver,15);
	}
	
	
	
	public String verfiyUsername()
	{
	     String name = Hmetext.getText();
	     		 return name;
	}
	
	
	//Return constructor
	public boolean clickOnElectronics()
	{
		boolean mainMenuFound =false;
				
		By demo = By.xpath("//span[text()='Electronics']");
		if(getMenuOption(mainMenu,demo)==true);
		{
			mainMenuFound=true;
			System.out.println("Main Menu Option found");
		}
		
	return mainMenuFound;
	}
	
	

	public boolean clickOnOppo()
	{
		boolean subMenuFound =false;
		
		By Oopo=By.xpath("//a[contains(text(),'OPPO')]//parent::li//child::a");
		if(getMenuOption(submenu,Oopo)==true);
		{
			subMenuFound=true;
		}
		
	return subMenuFound;
	}
	
	
	/*
	 * public void goToMob() {
	 * 
	 * getMenuOption(mainMenu); //return new OppoSrchRsltPage();
	 * 
	 * }
	 */
	 
	
	public boolean getMenuOption(WebElement menuoptions, By xpath)
	{
		boolean menuFound = false;
	    int  noOfAttempts=0;
	 	while(noOfAttempts<10)
	 	{
	 		
	 		try
	 		{  // By demo = By.xpath("//span[text()='Electronics']");
	 			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Electronics']"))).click();
	 		//	wait.until(ExpectedConditions.presenceOfElementLocated(xpath)).click();
	 			menuoptions.click();
	 			menuFound=true;
	 			break;
	 		}
	 		catch(Exception e)
	 		{
	 			
	 			 System.out.println(noOfAttempts+"Exception e is  :" +e);
	 			 noOfAttempts++;
	 		}
	 		
	 		
	 	}
		return menuFound;
		
	}
	
	
	
	public String verifyTitle()
	{
		String VerifyText;
		
			VerifyText=Title.get(0).getText();
			System.out.println(VerifyText);
			System.out.println("Title displayed");
		
		return VerifyText;
		
	}
	
}
