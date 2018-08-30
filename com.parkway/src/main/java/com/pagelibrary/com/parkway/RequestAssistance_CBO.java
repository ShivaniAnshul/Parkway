package com.pagelibrary.com.parkway;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base;

public class RequestAssistance_CBO extends Base{

	public static WebElement RequestAccess_CBO(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("RequestAccess_CBO")));
		return N;
	}
	
	public static WebElement CBO_Requestinfo(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("CBO_Requestinfo")));
		return N;
	}
	
	public static WebElement CBO_Reportinfo(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("CBO_Reportinfo")));
		return N;
	}
	
	public static WebElement SendEmailText_CBO(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("SendEmailText_CBO")));
		return N;
	}
	public static WebElement CBO_enquiryOnReport(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("CBO_enquiryOnReport")));
		return N;
	}
}
