package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.pagelibrary.com.parkway.DoctorFeeMemo;
import com.pagelibrary.com.parkway.Generic;
import com.pagelibrary.com.parkway.HomePage;
import com.pagelibrary.com.parkway.OutstandingPaymentDetails;
import com.pagelibrary.com.parkway.Payments;
import com.relevantcodes.extentreports.LogStatus;

import Base.Base;

public class log4j extends Base {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("log4j");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");	
		 WebDriver driver = new ChromeDriver();
			logger.info("Browser opened");
			driver.manage().window().maximize();
		logger.info("Window maximised");
				
	driver.get("https://161.202.31.53/doctor");	
     logger.info("URL launched");
				
   driver.findElement(By.id("username"));
     logger.info("Username Entered");
		driver.findElement(By.id("password"));
		logger.info("Password Entered");
		HomePage.Loginbutton(driver).click();
		logger.info("Clicked on Login Button");

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Generic.doctor_dd(driver, Payments.hospital(driver)).selectByVisibleText(config("Hospitalname"));
		logger.info("Entered Hospital Name: Gleneagles Hospital");
	      Generic.doctor_dd(driver, Payments.payeelist(driver)).selectByVisibleText(config("Payee"));
	      logger.info("Entered Payee Name : H F Lui Digestive And Liver Clinic");
	      Generic.doctor_dd(driver, Payments.Payorlist(driver)).selectByVisibleText(config("Payor"));
	      logger.info("Entered Payor Name : Aia Singapor");
	      jse.executeScript("window.scrollBy(0,250)", "");
	      
	      Payments.submit_button_OS(driver).click();
	      logger.info("Clicked on submit button");
	      JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	  	 jse1.executeScript("window.scrollBy(0,250)", "");
	  	driver.findElement(By.xpath("//button[@class='btn btn-primary col-lg-6']")).click();
	  	logger.info("Clicked on View Details button");
	  	
	  	 OutstandingPaymentDetails.Finalsearch_outstanding(driver).sendKeys(config("CaseNumber_Final_outstanding"));
	  	 logger.info("Case Number entered for Final Search");
	  	 
	  	  Actions actions = new Actions(driver);
		   actions.moveToElement(driver.findElement(By.xpath("//li[@class='ng-star-inserted active']")));  
		   logger.info("Moved to Non-Final link");
		   actions.click();
		   logger.info("Clicked on Non-Final link");
		   actions.sendKeys("1018037521");
		   logger.info("Case Number in Non-Final tab entered");
		   JavascriptExecutor jse11 = (JavascriptExecutor)driver;
			jse11.executeScript("window.scrollBy(0,250)", "");
	       jse11.executeScript("window.scrollBy(0,250)", "");
	       
	       driver.findElement(By.linkText("Money Matters")).click();
	       logger.info("Clicked on Money Matters");
			driver.findElement(By.linkText("Payments")).click();
			logger.info("Clicked on Payments");
			driver.findElement(By.xpath("//li[@class='ng-star-inserted']")).click();
			logger.info("Clicked on Fully Paid");
			Generic.doctor_dd(driver, Payments.patientsdischarge_fullpaid(driver)).selectByVisibleText(config("Fullypaid_Hospitalname"));
			logger.info("Hospital Name in Fully Paid selected");
			Generic.doctor_dd(driver, Payments.patientsdischarge_fullpaid(driver)).selectByVisibleText(config("Fullypaid_Hospitalname"));
			
			JavascriptExecutor jse111 = (JavascriptExecutor)driver;
			jse111.executeScript("window.scrollBy(0,250)","");
			jse111.executeScript("window.scrollBy(0,250)","");
			driver.findElement(By.xpath("//button[@class='btn btn-primary col-lg-6']")).click();
			logger.info("Clicked on submit button of Fully Paid");
			driver.findElement(By.xpath("//input[@class='form-control search-input ng-untouched ng-pristine ng-valid']")).sendKeys("1018028051");
			logger.info("Entered Case number for Fully Paid Payment Details");
			
			 driver.findElement(By.linkText("Money Matters")).click();
			 logger.info("Clicked on Money Matters link");
	   		   driver.findElement(By.linkText("Doctor Fee Memo")).click();
	   		   logger.info("Clicked on Doctor Fee Memo");
	   		Generic.doctor_dd(driver, DoctorFeeMemo.patientsDischarge_doctorfeememo(driver)).selectByVisibleText(config("patientsDischarge_doctorfeememo"));
	   		logger.info("Entered Hospital name Gleneagles Hospital");
	   		driver.findElement(By.xpath("//button[@class='btn btn-primary col-md-12']")).click();
	   		logger.info("Clicked on submit for doctor fee memo");
	   		
	   		
			
		   
			}
	
	}

