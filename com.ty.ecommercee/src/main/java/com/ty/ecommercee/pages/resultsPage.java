package com.ty.ecommercee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class resultsPage 
{
	@FindBy(xpath = "//img[@src=\"http://automationpractice.com/img/p/1/0/10-home_default.jpg\"]")
	private WebElement PrintedDress;
	
	public resultsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public productPage selectDress(WebDriver driver)
	{
		PrintedDress.click();
		return new productPage(driver);
	}

}
