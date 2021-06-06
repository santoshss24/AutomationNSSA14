package com.ty.ecommercee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	@FindBy(id = "search_query_top")
	private WebElement searchtb;
	
	@FindBy(name = "submit_search")
	private WebElement searchbtn;
	
	public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public resultsPage search(WebDriver driver,String keys)
	{
		searchtb.sendKeys(keys);
		searchbtn.click();
		return new resultsPage(driver);
	}
}
