package com.pagelibrary.com.parkway;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base;

public class ClinicalMatters extends Base{

	public static WebElement ClinicalMatters_dropdown(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("ClinicalMatters_dropdown")));
		return N;
	}
	
	public static WebElement LinkToPlexus(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("LinkToPlexus")));
		return N;
	}
	
	public static WebElement PlexusText(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("PlexusText")));
		return N;
	}
	
	public static WebElement LoginPlexus(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("LoginPlexus")));
		return N;
	}
}
