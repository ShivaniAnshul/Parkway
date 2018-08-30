package com.pagelibrary.com.parkway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base;

public class Payments extends Base {
	
	

	
	
	public static WebElement outstanding(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver , 80);
		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("outstanding")));
		return N;
	}
	

	public static WebElement hospital(WebDriver driver)
	  	{
	  		WebDriverWait wait=new WebDriverWait(driver, 80);
	  		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("Hospitallist")));
	  		return N;
	  	}
	   
	   public static WebElement payeelist(WebDriver driver)
		
	 	{
	 		WebDriverWait wait=new WebDriverWait(driver, 80);
	 		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("Payeelist")));
	 		return N;
	 	}
	   
	   public static WebElement Payorlist(WebDriver driver)
		
	 	{
	 		WebDriverWait wait=new WebDriverWait(driver, 80);
	 		WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("Payorlist")));
	 		return N;
	 	}
	   
	   public static WebElement datevaliation (WebDriver driver)
	   {
		   WebDriverWait wait=new WebDriverWait(driver, 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("oldestdate")));
			return N;
		   
	   }
	   public static WebElement dischargedtablefrom (WebDriver driver)
	   {
		   WebDriverWait wait=new WebDriverWait(driver, 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("dischargedFrom")));
			return N;
		   
	   }
	   
	   public static WebElement dischargedtableto (WebDriver driver)
	   {
		   WebDriverWait wait=new WebDriverWait(driver, 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("dischargedTo")));
			return N;
		   
	   }

	  	public static WebElement datevalidation (WebDriver driver)
	  	{
	  		WebDriverWait wait=new WebDriverWait(driver, 80);
	  		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("newestdate")));
	  		return N;
	  	}
	  	
	    public static WebElement submitbutton(WebDriver driver)
		
	 	{
	 		WebDriverWait wait=new WebDriverWait(driver, 80);
	 		WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("submitbutton")));
	 		return N;
	 	}
	    
	    public static WebElement outstandingUsersText()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
	    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("noofoutstandingcasestext")));
	    	return N;
	    }
	    
	    public static WebElement Paid_fullpaid(WebDriver driver)
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
	    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("Paid_fullpaid")));
	    	return N;
	    }
	    
	    public static WebElement FullypaidpaymentDetailsText()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
	    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Fully Paid Payment Details']")));
	    	return N;
	    }
	    
	    public static WebElement noofcases()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
	    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("noofcases")));
	    	return N;  
	    
	    }
	   
	    public static WebElement viewdetails_outstanding()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
	    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("viewdetails_outstanding")));
	    	return N;  
	    
	    }
	    
	   
	    
	    public static WebElement cases()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
	    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("case")));
	    	return N;
	    
	    }
	    
	    public static WebElement viewpayment()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
	    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("viewpayment")));
	    	return N;  
	    
	    }
	    
	    public static WebElement hname()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
	    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("hname")));
	    	return N;  
	    
	 }
	    public static WebElement label()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
	    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("label")));
	    	return N;  
	    
	    }
	    public static WebElement adminfeerebate()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
	    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("adminfeerebate")));
	    	return N;  
	    
	    }
	    
	    public static WebElement doctorfeememo()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
	    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("doctorfeememo")));
	    	return N;  
	    
	    }
	    
	    public static WebElement moneymatters()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
	    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("moneymatters")));
	    	return N;  
	    
	    }
	    public static WebElement paymentslink()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
	    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("paymentslink")));
	    	return N;  
	    
	    }
	    
	    public static WebElement datevalidation_fullpaid()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
	    	WebElement N = wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("datevalidation")));
	    	return N;  
	    
	    }
	    public static WebElement Fullypaid(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver , 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("Fullypaid")));
			return N;
		}
	    public static WebElement patientsdischarge_fullpaid(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver , 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("patients_discharge_fullypaid")));
			return N;
		}
	    public static WebElement payee_fullpaid(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver , 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("payee_fullypaid")));
			return N;
	    
}
	    public static WebElement olddate_fullpaid(WebDriver driver)
	    {
			WebDriverWait wait = new WebDriverWait(driver , 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("oldestdate_fullypaid")));
			return N;
	    
}
	    public static WebElement newdate_fullpaid(WebDriver driver)
	    {
			WebDriverWait wait = new WebDriverWait(driver , 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("newestdate_fullypaid")));
			return N;
	    
}
	    public static WebElement submit_fullpaid(WebDriver driver)
	    {
			WebDriverWait wait = new WebDriverWait(driver , 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("submitbutton_fullypaid")));
			return N;
	    
}
	    public static WebElement noofcasestext_fullpaid(WebDriver driver)
	    {
			WebDriverWait wait = new WebDriverWait(driver , 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("noofcasestext_fullypaid")));
			return N;
	    
}
	    public static WebElement noofcases_fullpaid(WebDriver driver)
	    {
			WebDriverWait wait = new WebDriverWait(driver , 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("noofcases_fullypaid")));
			return N;
	    
}
	    public static WebElement viewdetails_fullpaid(WebDriver driver)
	    {
			WebDriverWait wait = new WebDriverWait(driver , 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("viewdetails_fullypaid")));
			return N;
	    
}
	    public static WebElement search_fullpaid(WebDriver driver)
	    {
			WebDriverWait wait = new WebDriverWait(driver , 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("search_fullypaid")));
			return N;
	    
}
	    
	    public static WebElement DateTag_Fullypaid(WebDriver driver)
	    {
			WebDriverWait wait = new WebDriverWait(driver , 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("DateTag_Fullypaid")));
			return N;
	    
}
	    public static WebElement submit_button_OS(WebDriver driver)
	    {
	    	WebDriverWait wait = new WebDriverWait(driver , 80);
			WebElement N =  wait.until(ExpectedConditions.visibilityOfElementLocated(getlocators("submitbutton")));
			return N;
	    }

		}
	   


