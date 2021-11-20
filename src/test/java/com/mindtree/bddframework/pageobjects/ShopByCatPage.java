package com.mindtree.bddframework.pageobjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.bddframework.uistore.ShopByCatPageUI;

public class ShopByCatPage {

	WebDriver driver;

	public ShopByCatPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement getShopbycat() {
		return driver.findElement(ShopByCatPageUI.shopbycat);
	}

	public WebElement getJewellery() {
		return driver.findElement(ShopByCatPageUI.jewellery);
	}

	public WebElement getNext() {
		return driver.findElement(ShopByCatPageUI.next);
	}

	public WebElement getJewelText() {
		return driver.findElement(ShopByCatPageUI.jewetext);
	}

	public List<WebElement> getJewpro() {
		return driver.findElements(ShopByCatPageUI.jewpro);
	}

	public WebElement getWishlistText() {
		return driver.findElement(ShopByCatPageUI.shopBycatText);
	}

}