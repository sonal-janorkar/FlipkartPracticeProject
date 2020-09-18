package com.qa.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public Properties proper;
	
	File file;
	FileInputStream fis;
	
	
	public Base()
	{
		ReadProperty();
		//init();
	}
	
	
	public void ReadProperty()
	{
		//System.out.println("insode reader");
		file =new File(System.getProperty("user.dir")+"/src/main/java/com/qa/config/config.properties");
		try 
		{
			fis = new FileInputStream(file);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		proper= new Properties();
		
		try 
		{
			proper.load(fis);
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public void init()
	{
	
	  // System.out.println("insode init");
		if("chrome".equalsIgnoreCase(proper.getProperty("browser")))
		{
		    System.out.println(proper.getProperty("driverPath"));
			System.setProperty("webdriver.chrome.driver",proper.getProperty("driverPath") );
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(proper.getProperty("url"));
			
		}	

		
			}
	
			/*
			 * public void TearDown() { driver.close(); }
			 */
	
	
	public static void main(String args[])
	{
		Base b = new Base();
		b.init();
	}
}
