package com.pagelibrary.com.parkway;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import Base.Base;
import Utility.Library;
import atu.testrecorder.ATUTestRecorder;


public class Repository extends Base {
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static SoftAssert asert = new SoftAssert();
	public static  ExtentHtmlReporter htmlreporter;
	
	public static String driverPath = "F:/lib/chromedriver/";
	  WebDriver driver;
	  
	  public static void ATUTestRecorderException() throws atu.testrecorder.exceptions.ATUTestRecorderException {
		  
		  ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\IBM_ADMIN\\Desktop\\seleniumrecording","myrecording",false);
		  
	  }
		  
	
	public void launch() throws InterruptedException{
		
			
		switch(config("browser"))
		{
		
	case "chrome":
		
		System.setProperty(config("chromedrivername"), config("chromedriverpath"));
			
	
			driver= new ChromeDriver();
			break;
		}
		
		driver.get(config("DoctorUATURL"));
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser launched successfully");
		
		
	}
		

	
	public void login() throws atu.testrecorder.exceptions.ATUTestRecorderException{
		ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\IBM_ADMIN\\Desktop\\seleniumrecording","login",false);
		recorder.start();
		HomePage.username(driver).sendKeys(config("User"));
		HomePage.Password(driver).sendKeys(config("Pwd"));
		HomePage.Loginbutton(driver).click();
		String acttitle=driver.getTitle();
		
		String exptitle="Parkway Plexus";
		
		if(acttitle.contains(exptitle))
		{
			test.log(LogStatus.PASS,"actual tittle is matched with"  +acttitle+  "expected title of webpage is "+exptitle);
			
			test.log(LogStatus.INFO, "login is success");
		}
		else
		{
			
			test.log(LogStatus.FAIL,"actual tittle is matched with"  +acttitle+  "expected tittle of webpage is "+exptitle+" "+Library.captureScreenShot1(driver, "login_failed"));
			
		}

		recorder.stop();
	}
	
	public void outstanding() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException {
		ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\IBM_ADMIN\\Desktop\\seleniumrecording","outstanding",false);
		recorder.start();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(4000);
      Generic.doctor_dd(driver, Payments.hospital(driver)).selectByVisibleText(config("Hospitalname"));
      Thread.sleep(4000);
      Generic.doctor_dd(driver, Payments.payeelist(driver)).selectByVisibleText(config("Payee"));
      Thread.sleep(4000);
      Generic.doctor_dd(driver, Payments.Payorlist(driver)).selectByVisibleText(config("Payor"));
      jse.executeScript("window.scrollBy(0,250)", "");
      Thread.sleep(4000);
      /*Payments.datevaliation(driver).click();
      Thread.sleep(4000);
     
      Generic.discharged(driver, Payments.dischargedtablefrom(driver), config("oldDate"));
      Payments.datevalidation(driver).click();
      Generic.discharged(driver, Payments.dischargedtableto(driver), config("newDate"));
     
      */
       Payments.submit_button_OS(driver).click();
       Thread.sleep(4000);
       JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	
       jse1.executeScript("window.scrollBy(0,250)", "");
       Thread.sleep(4000);
       driver.findElement(By.xpath("//button[@class='btn btn-primary col-lg-6']")).click();
       Thread.sleep(4000);
       
       String acttitle=driver.getTitle();
       
       String exptitle="Parkway Plexus";
       if (acttitle.contains(exptitle)) {
		
    	   test.log(LogStatus.PASS, "actual tittle is matched with"  +acttitle+  "expected tittle of webpage is "+exptitle);
    	   test.log(LogStatus.INFO, "Outstanding submit is success");
    	   
	} else {
      test.log(LogStatus.FAIL, "actual tittle is matched with"  +acttitle+  "expected tittle of webpage is "+exptitle+" "+Library.captureScreenShot1(driver, "outstanding submit is failed"));
	}
       recorder.stop();
		
	 /* 
      if (Payments.outstandingUsersText().isDisplayed()) {
    	  
    	  Library.captureScreenShot1(driver, "outstanding");
    	  Assert.assertEquals(Payments.outstandingUsersText().getText(), "Number of Outstanding Cases");
    	  test.log(LogStatus.PASS, "number of outstanding casses");
      }
    	 */
    	  }
      
      
		
    
      public void FinalSearch() throws InterruptedException, atu.testrecorder.exceptions.ATUTestRecorderException  {
    	 ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\IBM_ADMIN\\Desktop\\seleniumrecording","outstanding_final",false);
  		recorder.start();
    	 
			 
				Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1018029496");
				Thread.sleep(4000);
				 JavascriptExecutor jse1 = (JavascriptExecutor)driver;
					
			       jse1.executeScript("window.scrollBy(0,250)", "");

				if(OutstandingPaymentDetails.Finalsearch_outstanding(driver).isDisplayed())
				{
					Thread.sleep(4000);
					if(OutstandingPaymentDetails.Unpaid_final(driver).getText().contains("S$696.59"))
					{
						test.log(LogStatus.INFO, "paid amount is matched");
						test.log(LogStatus.PASS, "actual amount is :-"+OutstandingPaymentDetails.Unpaid_final(driver).getText()+ "exp amount is:S$696.59 "+Library.captureScreenShot1(driver, "finalpaid"));
					}
					else
					{
						test.log(LogStatus.INFO, "paid amount is notmatched");
						test.log(LogStatus.FAIL, "actual amount is :-"+OutstandingPaymentDetails.Unpaid_final(driver).getText()+ "exp amount is:S$696.59 ",Library.captureScreenShot1(driver, "finalpaid"));
						
					}
					recorder.stop();
				}
			Thread.sleep(4000);
			//jse1.executeScript("window.scrollBy(250,0)", "");
			}  

      public void NonFinalSearch() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException {
    	  ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\IBM_ADMIN\\Desktop\\seleniumrecording","outstanding_nonFinal",false);
  		recorder.start();
    	 /*JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			jse1.executeScript("window.scrollBy(250,0)", "");
			Thread.sleep(4000);*/
			driver.findElement(By.linkText("(Non-Final)[1]")).click();
    	  //driver.findElement(By.xpath("//li[@class='ng-star-inserted active']")).click();
	 /* Actions actions = new Actions(driver);
	   actions.moveToElement(driver.findElement(By.xpath("//li[@role='presentation'][2]")));
	   Thread.sleep(4000);
	   actions.click().perform();
	  // actions.build().perform();
	   Thread.sleep(4000);
	   driver.findElement(By.xpath("//li[@class='ng-star-inserted active']"));*/
	   if (OutstandingPaymentDetails.NonFinal_final(driver).isDisplayed()) {
		   Thread.sleep(2000);
		   OutstandingPaymentDetails.search_nonFinal(driver).sendKeys("1018037066");
		   Thread.sleep(4000);
		   if (OutstandingPaymentDetails.Paid_nonFinal(driver).getText().contains("S$0.00")) {
			test.log(LogStatus.INFO, "paid amount is matched");
			test.log(LogStatus.PASS, "actual amount is :-"+OutstandingPaymentDetails.Paid_nonFinal(driver).getText()+ "exp amount is:S$0.00 "+Library.captureScreenShot1(driver, "non-final Paid"));
		}
		   else{
			   test.log(LogStatus.INFO, "paid amount is notmatched");
			   test.log(LogStatus.FAIL, "actual amount is :-"+OutstandingPaymentDetails.Paid_nonFinal(driver).getText()+ "exp amount is:S$0.00 ",Library.captureScreenShot1(driver, "Non-final paid"));
			   
		   }}  
	   recorder.stop();
	}
	
	    
       
       public void fullypaid() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException{
    	   ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\IBM_ADMIN\\Desktop\\seleniumrecording","Fullypaid",false);
   		recorder.start();
		
    	   Thread.sleep(4000);
		driver.findElement(By.linkText("Money Matters")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Payments")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@class='ng-star-inserted']")).click();
		Thread.sleep(4000);
		Generic.doctor_dd(driver, Payments.patientsdischarge_fullpaid(driver)).selectByVisibleText(config("Fullypaid_Hospitalname"));
		Thread.sleep(4000);
		Generic.doctor_dd(driver, Payments.payee_fullpaid(driver)).selectByVisibleText(config("Fullypaid_Payee"));
		driver.findElement(By.xpath("//button[@class='btn btn-primary col-md-12']")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)","");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary col-lg-6']")).click();
		Thread.sleep(4000);
		
		
			//Thread.sleep(2000);
			Payments.search_fullpaid(driver).sendKeys("1018028051");
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,250)","");
			if (Payments.Paid_fullpaid(driver).isDisplayed()) {
				Thread.sleep(2000);
				//Payments.search_fullpaid(driver).sendKeys("1018028051");
				Thread.sleep(2000);
				if (Payments.Paid_fullpaid(driver).getText().contains("S$1,284.00")) {
					test.log(LogStatus.INFO, "paid amount is matched");
					test.log(LogStatus.PASS, "actual amount is :- "+Payments.Paid_fullpaid(driver).getText()+"exp amount is:S$1,284.00"+Library.captureScreenShot1(driver, "Fullypaid Payment"));
					}
				else{
					test.log(LogStatus.INFO, "Paid amount is not matched");
					test.log(LogStatus.FAIL, "actual amount is:-"+Payments.Paid_fullpaid(driver).getText()+"exp amount is:S$1,284.00"+Library.captureScreenShot1(driver, "Fullypaid Payment"));
				}
			}
			//driver.findElement(By.xpath("//button[@class='col-lg-5 btn btn-primary mar-bot']")).click();
			 recorder.stop();
		}
			
		
       
       public void DoctorFeememo() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException{
    	   ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\IBM_ADMIN\\Desktop\\seleniumrecording","Doctorfeememo",false);
   		recorder.start();
			
    	   driver.findElement(By.linkText("Money Matters")).click();
   		   driver.findElement(By.linkText("Doctor Fee Memo")).click();
   		   Thread.sleep(4000);
   		   Generic.doctor_dd(driver, DoctorFeeMemo.patientsDischarge_doctorfeememo(driver)).selectByVisibleText("Gleneagles Hospital");
   		   driver.findElement(By.xpath("//button[@class='btn btn-primary col-md-12']")).click();
   		Thread.sleep(4000);
   		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)","");
		
   		
		if (DoctorFeeMemo.dishargedateText_doctorfeememo(driver).isDisplayed()) {
			Thread.sleep(2000);
			jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		if (DoctorFeeMemo.TotalPaid_Doctorfeememo(driver).getText().contains("S$194,777.45")) {
			test.log(LogStatus.INFO, "total amount is matched");
			test.log(LogStatus.PASS, "actual amount is :- "+DoctorFeeMemo.TotalPaid_Doctorfeememo(driver).getText()+"exp amount is S$194,777.45"+Library.captureScreenShot1(driver, "doctor fee memo total payment"));
			
		}
		else{
			test.log(LogStatus.INFO, "Total paid amount is not matched");
			test.log(LogStatus.FAIL, "actual amount is:- "+DoctorFeeMemo.TotalPaid_Doctorfeememo(driver).getText()+"exp amount is S$194,777.45"+Library.captureScreenShot1(driver, "doctor fee memo total payment"));
		}
		}
		recorder.stop();
		}
   		
			
		public void AdminFeeRebate() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException{
			ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\IBM_ADMIN\\Desktop\\seleniumrecording","AdminFeeRebate",false);
			recorder.start();
			driver.findElement(By.linkText("Money Matters")).click();
			driver.findElement(By.linkText("Admin Fee Rebate")).click();
			Thread.sleep(4000);
			
			Generic.doctor_dd(driver, AdminFeeRebate.hospital_adminfeerebate(driver)).selectByVisibleText(config("HospitalName_adminfeerebate"));
			Thread.sleep(2000);
			Generic.doctor_dd(driver, AdminFeeRebate.payee_adminFeeRebate(driver)).selectByVisibleText("H F Lui Digestive And Liver Clinic");
			AdminFeeRebate.submit_adminfeeRebate(driver).click();
			Thread.sleep(4000);
			
			if (AdminFeeRebate.DatetagText_adminfee(driver).isDisplayed()) {
				Thread.sleep(2000);
				if (AdminFeeRebate.DatetagText_adminfee(driver).getText().contains("Jul 2017 to Dec 2017")) {
					test.log(LogStatus.INFO, "Date is matched");
					test.log(LogStatus.PASS, "actual date is :- "+AdminFeeRebate.DatetagText_adminfee(driver).getText()+"exp date is:Jul 2017 to Dec 2017"+Library.captureScreenShot1(driver, "Admin Fee rebate date tag"));
					}
				else{
				test.log(LogStatus.INFO, "Date is not matched");
				test.log(LogStatus.FAIL, "actual date is :- "+AdminFeeRebate.DatetagText_adminfee(driver).getText()+"exp date is:Jul 2017 to Dec 2017"+Library.captureScreenShot1(driver, "Admin Fee rebate date tag"));
				
			}}
			recorder.stop();
		}
			
			/*if (AdminFeeRebate.AdminFeeRebateText(driver).isDisplayed()) {
				Thread.sleep(2000);
				if (AdminFeeRebate.AdminFeeRebateText(driver).getText().contains("Admin Fee Rebate")) {
				test.log(LogStatus.INFO, "Admin text is matched");
				test.log(LogStatus.PASS, "actual text is :- "+AdminFeeRebate.AdminFeeRebateText(driver).getText()+"exp text is:Admin Fee Rebate"+Library.captureScreenShot1(driver, "Admin Fee Rebate page displayed"));
					
				}
				else{
					test.log(LogStatus.INFO, "Text is not matched");
					test.log(LogStatus.FAIL, "actual text is :- "+AdminFeeRebate.AdminFeeRebateText(driver).getText()+"exp text is:Admin Fee Rebate"+Library.captureScreenShot1(driver, "Admin Fee Rebate page not displayed"));
					
			}}
			}*/
				
			
			
		 		
	       public void ClinicalMatters() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException{
	    	   ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\IBM_ADMIN\\Desktop\\seleniumrecording","ClinicalMatters",false);
	   		recorder.start();
			driver.findElement(By.linkText("Clinical Matters")).click();
			String parent = driver.getWindowHandle();
			
	
			driver.findElement(By.linkText("Link to Plexus")).click();
			Set<String> allwindows = driver.getWindowHandles();
			int count = allwindows.size();
			
			for (String child:allwindows) {
				if (!parent.equalsIgnoreCase(child)) {
					driver.switchTo().window(child);
					Thread.sleep(4000);
					if (ClinicalMatters.LoginPlexus(driver).isDisplayed()) {
						Thread.sleep(2000);
					}
				if (ClinicalMatters.LoginPlexus(driver).getText().contains("Login")) {
					test.log(LogStatus.INFO, "Plexus text matched");
					test.log(LogStatus.PASS, "act text is:-"+ClinicalMatters.LoginPlexus(driver).getText()+"exp text is Login"+Library.captureScreenShot1(driver, "Login text is displayed"));
					
				}
				else{
					test.log(LogStatus.INFO, "text not matched");
					test.log(LogStatus.FAIL, "act text is:-"+ClinicalMatters.LoginPlexus(driver).getText()+"exp text is Login"+Library.captureScreenShot1(driver, "Login text not displayed"));
				}
				
				}
				driver.switchTo().window(parent);
			}
			recorder.stop();
			}
			
				
				
			
			
		
		
		public void RequestAssistance_CBO() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException{
			ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\IBM_ADMIN\\Desktop\\seleniumrecording","CBO",false);
			recorder.start();
			driver.findElement(By.linkText("Money Matters")).click();
			driver.findElement(By.linkText("Help")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//li)[4]")).click();
			Thread.sleep(4000);
          if (RequestAssistance_CBO.SendEmailText_CBO(driver).isDisplayed()) {
				
			}
			if (RequestAssistance_CBO.SendEmailText_CBO(driver).getText().contains("Send Email")) {
				test.log(LogStatus.INFO, "Send Email text is matched");
				test.log(LogStatus.PASS, "act text is:- "+RequestAssistance_CBO.SendEmailText_CBO(driver).getText()+"exp text is Send Email"+Library.captureScreenShot1(driver, "Send Email text is displayed"));
			}
			else{
				test.log(LogStatus.INFO, "Text is not matched");
				test.log(LogStatus.FAIL, "act text is:- "+RequestAssistance_CBO.SendEmailText_CBO(driver).getText()+"exp text is Send Email"+Library.captureScreenShot1(driver, "Send Email text is displayed"));
			 		}
			recorder.stop();
}

			
	public void Settings() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException	{
		ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\IBM_ADMIN\\Desktop\\seleniumrecording","Settings",false);
		recorder.start();
		driver.findElement(By.xpath("//span[@class='doctorName ng-star-inserted']"));
		driver.findElement(By.linkText("Settings")).click();
		Thread.sleep(2000);
		
		if (Settings.SettingsText(driver).isDisplayed()) {
			
		}
		if (Settings.SettingsText(driver).getText().contains("Settings")) {
		test.log(LogStatus.INFO, "Settings text is matched");
		test.log(LogStatus.PASS, "act text is:- "+Settings.SettingsText(driver).getText()+"exp text is Settings"+Library.captureScreenShot1(driver, "Settings text is displayed"));
	}
		else{
			test.log(LogStatus.INFO, "Text is not matched");
			test.log(LogStatus.FAIL, "act text is:- "+Settings.SettingsText(driver).getText()+"exp text is Settings"+Library.captureScreenShot1(driver, "Settings text is displayed"));
			
		}
		
		recorder.stop();
	}
       
   		
		
       @BeforeTest
		public void setextent()
		{
		//htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\ExtentReports\\extentreport.html");
		extent=new ExtentReports(System.getProperty("user.dir") +"/ExtentReports/extentreport.html", true);
		//extent.attachReporter(htmlreporter);
		
		}
	  
	
		



@BeforeMethod
public void beforemethod(Method method){
	//htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
	test = extent.startTest((this.getClass().getSimpleName()+ " :: " + method.getName()));
	test.assignAuthor("Author is: Shivani");
	test.assignCategory("Category is : Smoke");
	//System.setProperty("webdriver.chrome.bin", "C:\\Users\\IBM_ADMIN\\workspace\\parkwaydigital\\com.parkway\\drivers");
	

	
	
}


	

	/*@AfterMethod
	public void aftermethod() throws IOException{
	
	driver.quit();
	test.log(LogStatus.INFO, "Browser closed scuccessfully ");
	extent.endTest(test);
	
	}*/
	@AfterSuite
	public void endReport(){
		extent.flush();
		//extent.close();
   }

	
	
	
	
	
		
	

/*@AfterMethod
public void result(ITestResult result) 
{
try {
	if(result.getStatus()==ITestResult.FAILURE)
	{
	test.log(Status.FAIL,  MarkupHelper.createLabel(result.getName()+"Test case FAILED due to ...",ExtentColor.RED));
	test.fail(result.getThrowable());
	String Screenshotpath = Library.captureScreenShot1(driver, result.getName());
	test.log(Status.FAIL, "Screenshot Below:" + test.addScreenCaptureFromPath(Library.captureScreenShot1(driver, "failed screen")));
	
	
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
	test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"Test case passed ...",ExtentColor.GREEN));
	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
	test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"Test case SKIPPED due to ...",ExtentColor.YELLOW));
	test.skip(result.getThrowable());
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.close();
  extent.flush();
  
}*/













//@AfterClass 
public void afterTest() {

	driver.close();

	
	


}




 }


	














	



