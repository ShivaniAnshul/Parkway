package com.pagelibrary.com.parkway;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base;

public class Settings extends Base{

	public static WebElement ForSettings_dropdown(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("ForSettings_dropdown")));
		return N;
	}
	
	
	public static WebElement SettingsText(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("SettingsText")));
		return N;
	}
}
