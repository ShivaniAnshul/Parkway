package com.pagelibrary.com.parkway;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base;

public class Fullypaid extends Base{

	public static WebElement Fullypaid(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("Fullypaid")));
		return N;
	}

	public static WebElement patientsdischarge(WebDriver driver){
		
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("patients_discharge")));
		return N;
	}
	
	public static WebElement payee_fullypaid(WebDriver driver){
		
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("payee")));
		return N;
	}
	
    public static WebElement payee(WebDriver driver){
		
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("payee")));
		return N;
	}

 public static WebElement oldestdate_fullpaid(WebDriver driver){
		
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("oldestdate_fullypaid")));
		return N;
	}
 
 public static WebElement newdate_fullpaid(WebDriver driver){
		
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("newestdate_fullypaid")));
		return N;
	}
 
 public static WebElement submit_fullpaid(WebDriver driver){
		
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("submitbutton_fullypaid")));
		return N;
	}
 public static WebElement noofcasestext_fullpaid(WebDriver driver){
		
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("nooffullypaidcasestext")));
		return N;
}
 public static WebElement noofcases_fullpaid(WebDriver driver){
		
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("noofcases_fullypaid")));
		return N;
}
 public static WebElement viewdetail_fullypaid(WebDriver driver){
		
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("viewdetails_fullypaid")));
		return N;
}
 public static WebElement searchoption_fullypaid(WebDriver driver){
		
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("search_fullypaid")));
		return N;
}
}
 
