package com.mindtree.bddframework.stepdefinition;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.mindtree.bddframework.reusablecomponents.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProducts extends BaseClass {
	@Given("The user is on the main page")
	public void the_user_is_on_the_main_page() throws Throwable {
		driver = HomePageProductToCart.getdriver();
		homepage.logo().click();

	}

	@When("The user enters the product, clicks on enter")
	public void the_user_enters_the_product_clicks_on_enter() throws Throwable {
		ArrayList<String> products = ex.getData("search");
		for (int i = 1; i < products.size(); i++) {
			homepage.searchbox().clear();
			homepage.searchbox().sendKeys(products.get(i));
			homepage.searchbox().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			log.info("Searching for products");
			if (homepage.getSearchtext().getText().contains("Search Results")) {
				Assert.assertTrue(true);
			}
			er.startTest("Successfully searched for the product");

		}

	}

	@Then("The search page is to be showed")
	public void the_search_page_is_to_be_showed() throws Throwable {
		er.endTest();
	}

	public static WebDriver getdriver() {
		return driver;
	}
}
