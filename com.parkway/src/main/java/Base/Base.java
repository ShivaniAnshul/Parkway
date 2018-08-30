package Base;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	
	public static WebDriver driver;
	
	static Properties p;
	public static void loadproperty(){
		
		
		try{
			//to access the property file
			File f= new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\OR.properties");
		//to read the file property file
			FileReader fr= new FileReader(f);
			p= new Properties();
			p.load(fr);
		}
		catch(Exception e){
			//to do auto generated catch block
			e.printStackTrace();
	}
	}
	
	public static By getlocators(String key){
		loadproperty();
	
		By loc = null;
		String elevalue=p.getProperty(key);
		String loctype=elevalue.split(":")[0];
		String locvalue=elevalue.split(":")[1];
		
		switch(loctype)
		{
		case"id":
			
			loc=By.id(locvalue);
			break;
		case "name":
			
		loc= By.name(locvalue);
		break;
		case "tagName":
			loc= By.tagName(locvalue);
			break;
		case "className":
			
			loc=By.className(locvalue);
			break;
		case "linkText":
			
		loc= By.linkText(locvalue);
		break;
		case "partiallinkText":
			
			loc= By.partialLinkText(locvalue);
			break;
		case "xpath":
			
			loc= By.xpath(locvalue);
			break;
		case "cssSelector":
			
			loc=By.cssSelector(locvalue);
			break;
		}
		return loc;	
			
		}
public static void loadproperty1(){
		
		try{
			//to access the property file
			File f= new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\config.properties");
		//to read the file property file
			FileReader fr= new FileReader(f);
			p= new Properties();
			p.load(fr);
		}
		catch(Exception e){
			//to do auto generated catch block
			e.printStackTrace();
	}
	}
public static String config(String key){
	loadproperty1();
	String ele_value = p.getProperty(key);
	return ele_value;
}
	}


