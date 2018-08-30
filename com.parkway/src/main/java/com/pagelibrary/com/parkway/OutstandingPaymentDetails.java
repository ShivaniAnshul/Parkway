package com.pagelibrary.com.parkway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base;

public class OutstandingPaymentDetails extends Base {

	public static WebElement Finaltab_final(){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='tabset-header']/li[1]/span[2]")));
		return N;
	}
	
	public static WebElement Finalsearch_outstanding(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("Finalsearch_outstanding")));
		return N;
	}
	
	public static WebElement ExportToExcel_text_Final()
    {
    	WebDriverWait wait = new WebDriverWait(driver , 80);
    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("ExportToExcel_text_Final")));
    	return N;  
    
    }
	
	public static WebElement ExportToExcel_Non_Final()
    {
    	WebDriverWait wait = new WebDriverWait(driver , 80);
    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("ExportToExcel_Non_Final")));
    	return N;  
    
    }
	
	public static WebElement NonFinal_final(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("NonFinal_final")));
		return N;
	}
	
	public static WebElement search_nonFinal(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("NonFinal_final")));
		return N;
	}
	
	public static WebElement ViewDetails_NonFinal(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("ViewDetails_NonFinal")));
		return N;
	}
	
	public static WebElement Casenumber_final(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("Casenumber_final")));
		return N;
	}
	
	public static WebElement Search_final(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("Search_final")));
		return N;
}
	
	public static WebElement Paid_final(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("Paid_final")));
		return N;
		
	}
	
	public static WebElement Unpaid_final(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("Unpaid_final")));
		return N;
		
	}		
	
	public static WebElement ViewPaymentDetails_final(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("ViewPaymentDetails_final")));
		return N;
		
	}
	
	public static WebElement Norecords_final(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("Norecords_final")));
		return N;
}
	
	public static WebElement NetAmountPaid_final(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("NetAmountPaid_final")));
		return N;
}
	public static WebElement Paid_nonFinal(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("NetAmountPaid_final")));
		return N;

	}
}

	

		
