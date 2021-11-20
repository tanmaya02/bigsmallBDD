package com.mindtree.bddframework.uistore;

import org.openqa.selenium.By;

public class HomePageUI {

	public static By whatsnew = By.xpath("//div[@class='main-banner'] //button[@class='btn btn-default']");
	public static By searchbox = By.xpath("//form[@class='search-bar'] //input[@type='search']");
	public static By sigin = By.xpath("//div[@class='site-nav__icons'] //i[contains(@class,'fa fa-user')]");
	public static By wishlist = By.xpath("//div[@class='site-nav__icons'] //i[contains(@class,'fa fa-heart')]");
	public static By giftcard = By.xpath("//div[@class='site-nav__icons'] //i[contains(@class,'fa fa-gift')]");
	public static By cart = By.xpath("//div[@class='site-nav__icons'] //img[contains(@class,'carticonimage')]");
	public static By product = By.xpath("//div[contains(text(),'Space Man Decorative Tray')]");
	public static By logo = By.xpath("//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[1]/div/a[1]/img[1]");
	public static By producttextafterclicking = By
			.xpath("//*[@id=\"ProductSection-7044608557254\"]/div/div/div[1]/div[2]/div/div[1]/h1");
	public static By officialMerchandise = By.xpath("(//a[contains(@data-dropdown-rel,'official-merchandise')])");
	public static By DCgift = By.xpath("(//a[contains(@href,'/collections/dc-merchandise')])[2]");
	public static By searchText = By
			.xpath("(//header[contains(@class,'section-header')]) //h1[contains(@class,'section-header__title')]");
	public static By cartText = By.xpath("(//a[contains(@class,'cart__product-name')])[1]");
	public static By corporate = By.xpath(
			"//li[contains(@class,'site-nav__item site-nav__expanded-item')] //a[contains(@href,'/collections/corporate-gifts')]");
	public static By about = By.xpath("(//a[contains(@href,'/pages/about-us')])");
	public static By newYear = By.xpath(
			"//div[contains(@class,'grid-item grid__item medium-up--one-sixth')] //a[contains(@href,'/collections/new-year-gifts')]");
	public static By newText = By
			.xpath("(//header[contains(@class,'section-header')]) //h1[contains(@class,'section-header--title h1')]");

}
