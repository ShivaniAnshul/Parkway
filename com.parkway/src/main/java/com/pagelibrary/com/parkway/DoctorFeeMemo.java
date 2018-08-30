package com.pagelibrary.com.parkway;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base;

public class DoctorFeeMemo extends Base{
	
	public static WebElement doctorFeeMemoOption(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("doctorFeeMemoOption")));
		return N;
	}

	
	public static WebElement patientsDischarge_doctorfeememo(WebDriver  driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("patientsDischarge_doctorfeememo")));
		return N;
	}
	
	public static WebElement totalPaid_doctorfee(WebDriver  driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("totalPaid_doctorfee")));
		return N;
	}
	
	public static WebElement olddate_doctorfeememo(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("olddate_doctorfeememo")));
		return N;
	}
	
	public static WebElement newdate_doctorfeememo(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("newdate_doctorfeememo")));
		return N;

}
	public static WebElement TotalPaid_Doctorfeememo(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("TotalPaid_Doctorfeememo")));
		return N;
	}
	
	public static WebElement submit_doctorFeeMemo(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("submit_doctorFeeMemo")));
		return N;
}
	
	public static WebElement dishargedateText_doctorfeememo(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("dishargedateText_doctorfeememo")));
		return N;
	}
}
