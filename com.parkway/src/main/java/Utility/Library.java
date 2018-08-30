package Utility;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Tasks.ExcelOperations;

public class Library extends ExcelOperations {

	
	public static String captureScreenShot1(WebDriver driver, String Snapshotname) 
	{
       try {
		Robot r=new Robot();
		  BufferedImage bi= r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		  
		  ImageIO.write(bi, "png", new File("./Snapshots/"+Snapshotname+".png"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return Snapshotname; 
	}
	
	
}
	

	




	
   

