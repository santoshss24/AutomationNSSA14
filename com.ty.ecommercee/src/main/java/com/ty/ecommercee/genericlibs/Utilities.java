package com.ty.ecommercee.genericlibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilities 
{
	
	public void mouseHover(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element);
		action.perform();
	}
	
	public void dropdown(WebElement element,String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}

}
