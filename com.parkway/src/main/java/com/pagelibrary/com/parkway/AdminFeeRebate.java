package com.pagelibrary.com.parkway;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base;

public class AdminFeeRebate extends Base {

	public static WebElement hospital_adminfeerebate(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("hospital_adminfeerebate")));
		return N;
	}
	
	public static WebElement payee_adminFeeRebate(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("payee_adminFeeRebate")));
		return N;
}
	public static WebElement submit_adminfeeRebate(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("submit_adminfeeRebate")));
		return N;
	}
	
	public static WebElement AdminFeeRebateText(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("payee_adminFeeRebate")));
		return N;
}
	public static WebElement norecords_adminfeeRebate(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("norecords_adminfeeRebate")));
		return N;
	
}
	
	public static WebElement rebatebanner_adminfeeRebate(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("rebatebanner_adminfeeRebate")));
		return N;
		
	}
	public static WebElement DatetagText_adminfee(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("DatetagText_adminfee")));
		return N;
}
}
	
