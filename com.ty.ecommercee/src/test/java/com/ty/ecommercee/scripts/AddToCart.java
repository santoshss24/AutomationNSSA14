package com.ty.ecommercee.scripts;

import org.testng.annotations.Test;

import com.ty.ecommercee.genericlibs.Baseclass;
import com.ty.ecommercee.pages.Homepage;
import com.ty.ecommercee.pages.productPage;
import com.ty.ecommercee.pages.resultsPage;

public class AddToCart extends Baseclass
{
	@Test
	public void addToCart()
	{
		Homepage h=new Homepage(driver);
		resultsPage resultpage = h.search(driver, p.getData("product"));
		productPage productpage = resultpage.selectDress(driver);
		productpage.increaseQty();
		util.dropdown(productpage.getSizedd(), p.getData("Size"));
		productpage.selectPinkColor();
		productpage.AddToCart();
		
	}

}
