package com.ty.ecommercee.genericlibs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {

	public WebDriver driver;
	public ProperfileData p=new ProperfileData();
	public photo photo=new photo();
	public Utilities util=new Utilities();
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(p.getData("url"));
	}
	
	@AfterMethod
	public void closeApp(ITestResult result)
	{
		int status=result.getStatus();
		
		if (status==2) {
			photo.getPhoto(driver, result.getName());
		}else {
			driver.quit();
		}
	}
}
