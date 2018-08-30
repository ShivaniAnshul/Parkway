package com.pagelibrary.com.parkway;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExecution extends Repository {
	
	
	
	@Test(priority=0)
	public void valid_launch() throws InterruptedException{
		
		
		launch();
		
	}
	@Test(priority=1)
	public void verify_login() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException
	{
		login();
	}
	
	@Test(priority=2)
	
	public void verify_outstanding() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException
	{
		outstanding();
	}
		

	@Test(priority=3)
	public void verify_final() throws InterruptedException, atu.testrecorder.exceptions.ATUTestRecorderException{
		
		FinalSearch();
	
	}
	
	@Test(priority=4)
	public void verify_NonFinal()throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException{
		
		NonFinalSearch();
	}

		
	@Test(priority=4)
	public void verify_fullypaid() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException{
		
		fullypaid();
	}
	
	@Test(priority=5)
	public void verify_DoctorFeememo() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException{
	
	DoctorFeememo();
	}
	

	@Test(priority=6)
	public void verify_AdminFeeRebate() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException{
		
		AdminFeeRebate();
	}
	
	@Test(priority=7)
	public void verify_ClinicalMatters() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException{
	
	ClinicalMatters();
	}

	@Test(priority=8)
	public void verify_RequestAssistance_CBO() throws InterruptedException, IOException, atu.testrecorder.exceptions.ATUTestRecorderException{
		
		RequestAssistance_CBO();
	}
	
/*	@Test(priority=9)
	public void verify_Settings() throws InterruptedException, IOException{
		
		Settings();
		
	}*/
	
}

	
	
	
	
	