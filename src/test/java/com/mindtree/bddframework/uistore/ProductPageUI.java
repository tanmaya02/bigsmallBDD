package com.mindtree.bddframework.uistore;

import org.openqa.selenium.By;

public class ProductPageUI {

	public static By productwishlist = By.xpath("//span[@class='swym-wishlist-cta']");
	public static By prodName = By.xpath("(//div[contains(@class,'grid-product__title')])");
	public static By sortBy = By.id("sortBy");
	public static By addtocart = By.xpath("//button[@name='add']");
	public static By quantity = By.xpath("//input[@class='js--num']");
	public static By add = By.xpath("//span[contains(@class,'js--qty-adjuster js--add')]");
	public static By closingsohppinglist = By
			.xpath("//button[contains(@class,'drawer__close-button js-drawer-close')]");

}
