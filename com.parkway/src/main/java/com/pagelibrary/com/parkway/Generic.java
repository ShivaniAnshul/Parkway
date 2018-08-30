package com.pagelibrary.com.parkway;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic {
	
	public static   Select     doctor_dd(WebDriver driver,WebElement e)
	{
		Select s=new Select(e);
		return s;
	}
	static boolean flag=false;
	
	public static void discharged(WebDriver driver,WebElement ele,String expdate)
	{
		
		WebElement table=ele;
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		for(WebElement r:rows)
		{
			List<WebElement> columns=r.findElements(By.tagName("td"));
			
			for(WebElement c:columns)
			{
				  if(c.getText().contains(expdate))
				  {
					  c.click();
					  flag=true;
					  break;
				  }
			}
			if(flag==true)
			{
				break;
			}
		}
		
	}

}
