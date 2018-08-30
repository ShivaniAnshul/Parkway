package com.pagelibrary.com.parkway;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base;


public class HomePage extends Base {
	

	
	 public static WebElement username(WebDriver driver)
		
		{
			WebDriverWait wait=new WebDriverWait(driver, 80);
			WebElement user = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("User_id")));
			return user;
		}
		
	   public static WebElement Password(WebDriver driver)
		
		{
			WebDriverWait wait=new WebDriverWait(driver, 80);
			WebElement user = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("Password")));
			return user;
		}
	   
	   public static WebElement Loginbutton(WebDriver driver)
		
		{
			WebDriverWait wait=new WebDriverWait(driver, 80);
			WebElement user = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("login")));
			return user;
		}
}
		 

