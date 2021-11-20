package com.mindtree.bddframework.stepdefinition;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.mindtree.bddframework.reusablecomponents.BaseClass;
import io.cucumber.java.en.Given;

public class OpenBrowser extends BaseClass {

	@Given("Navigate to the website by opening the browser")
	public void navigate_to_the_website_by_opening_the_browser() throws IOException {

		startup();
		beforeClass();
		driver.get(config.getURL());
	}

	public static WebDriver getdriver() {
		return driver;
	}

}
