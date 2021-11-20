package com.mindtree.bddframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.bddframework.uistore.WhatsNewUI;

public class WhatsNew {
	WebDriver driver;

	public WhatsNew(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getValidate() {
		return driver.findElement(WhatsNewUI.validate);

	}

	public WebElement getBtn() {
		return driver.findElement(WhatsNewUI.WhatsnewBtn);

	}
}
