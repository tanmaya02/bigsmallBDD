package com.mindtree.bddframework.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.bddframework.uistore.PersonalisedGiftsUI;

public class PersonalisedGifts {

	WebDriver driver;

	public PersonalisedGifts(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getValidate() {
		return driver.findElement(PersonalisedGiftsUI.validate);

	}

	public WebElement getPGBtn() {
		return driver.findElement(PersonalisedGiftsUI.personalisedBtn);

	}

	public List<WebElement> getProducts() {
		return driver.findElements(PersonalisedGiftsUI.prodName);

	}
}
