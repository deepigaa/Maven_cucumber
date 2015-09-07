package com.cucumber.app.salesforce.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebConnector {
	Properties OR=null;
	Properties CONFIG = null;
	WebDriver driver = null;
	public WebConnector(){
		//loading and reading the property file
		if(OR==null){
			try{
				//read the OR.properties file
				OR = new Properties();
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\cucumber\\app\\salesforce\\config\\OR.properties");
				OR.load(fis);
				
				//read the CONFIG.properties file
				CONFIG = new Properties();
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\cucumber\\app\\salesforce\\config\\prod_config.properties");
				CONFIG.load(fis);
				
				System.out.println(OR.getProperty("loginusername"));
				System.out.println(CONFIG.getProperty("loginURL"));
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
	
	public void openBrowser(String browserType){
		if(browserType.equalsIgnoreCase("Mozilla")){
			//File pathToBinary = new File(System.getProperty("user.dir")+"\\firefox.exe");
			//FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
			//FirefoxProfile firefoxProfile = new FirefoxProfile();       
			//driver = new FirefoxDriver(ffBinary,firefoxProfile);
			
			// ProfilesIni prof = new ProfilesIni();
			 //FirefoxProfile p = prof.getProfile("Selenium_user");
			//driver=new FirefoxDriver(p);
			
			driver=new FirefoxDriver();
			
		}else if(browserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
				
	}
	
	public void navigate(String URL){
		driver.get(CONFIG.getProperty(URL));
				
	}
	
	public void type(String objectName,String text){
		driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
	}
	
	public void click(String objectName){
		driver.findElement(By.xpath(OR.getProperty(objectName))).click();
	}
	
	public boolean isElementPresent(String objectName) {
		try{
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		int count = driver.findElements(By.xpath(OR.getProperty(objectName))).size();
		if(count==0){
			return false;
		}else{
			return true;
		}
	}

}
