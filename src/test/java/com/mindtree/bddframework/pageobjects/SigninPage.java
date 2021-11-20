package com.mindtree.bddframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.bddframework.uistore.SigninPageUi;

public class SigninPage {
	WebDriver driver;

	public SigninPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement customeremailid() {
		return driver.findElement(SigninPageUi.customeremailid);
	}

	public WebElement customerpass() {
		return driver.findElement(SigninPageUi.customerpass);
	}

	public WebElement signinbutton() {
		return driver.findElement(SigninPageUi.signinbutton);
	}

	public WebElement createaccount() {
		return driver.findElement(SigninPageUi.createaccount);
	}

}
