package com.mindtree.bddframework.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.bddframework.uistore.ProductPageUI;

public class ProductPage {
	WebDriver driver;

	public ProductPage(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement productwishlist() {
		return driver.findElement(ProductPageUI.productwishlist);
	}

	public WebElement addtocart() {
		return driver.findElement(ProductPageUI.addtocart);
	}

	public WebElement quantity() {
		return driver.findElement(ProductPageUI.quantity);
	}

	public WebElement add() {
		return driver.findElement(ProductPageUI.add);
	}

	public WebElement closingsohppinglist() {
		return driver.findElement(ProductPageUI.closingsohppinglist);
	}

	public WebElement getSortBy() {
		return driver.findElement(ProductPageUI.sortBy);
	}

	public List<WebElement> getProducts() {
		return driver.findElements(ProductPageUI.prodName);
	}

}
