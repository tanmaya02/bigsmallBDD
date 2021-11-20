package com.mindtree.bddframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.bddframework.uistore.CreateAccountUI;

public class CreateAccount {

	WebDriver driver;

	public CreateAccount(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCreateAcc() {
		return driver.findElement(CreateAccountUI.createAcc);

	}

	public WebElement getfname() {
		return driver.findElement(CreateAccountUI.fname);

	}

	public WebElement getlname() {
		return driver.findElement(CreateAccountUI.lname);

	}

	public WebElement getEmail() {
		return driver.findElement(CreateAccountUI.email);

	}

	public WebElement getPassword() {
		return driver.findElement(CreateAccountUI.password);

	}

	public WebElement getCreateBtn() {
		return driver.findElement(CreateAccountUI.createBtn);

	}

	public WebElement getValidate() {
		return driver.findElement(CreateAccountUI.validate);

	}
}
