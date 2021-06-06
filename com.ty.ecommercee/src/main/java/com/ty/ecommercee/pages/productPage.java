package com.ty.ecommercee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productPage 
{
	@FindBy(xpath = "//i[@class=\"icon-plus\"]")
	private WebElement plusbtn;
	
	@FindBy(id = "group_1")
	private WebElement sizedd;
	
	@FindBy(id = "color_24")
	private WebElement pinkColor;
	
	@FindBy(name = "Submit")
	private WebElement AddtoCartbtn;
	
	public productPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void increaseQty()
	{
		plusbtn.click();
	}

	public WebElement getSizedd() {
		return sizedd;
	}
	
	public void selectPinkColor()
	{
		pinkColor.click();
	}
	
	public void AddToCart()
	{
		AddtoCartbtn.click();
	}
	
	
	

}
