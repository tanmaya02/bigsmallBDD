package com.mindtree.bddframework.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.mindtree.bddframework.reusablecomponents.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageProductToCart extends BaseClass {
	@Given("The user clicks on the logo")
	public void the_user_clicks_on_the_logo() throws Throwable {
		driver = GiftCard.getdriver();
		homepage.logo().click();

	}

	@When("The user clicks on the desired product")
	public void the_user_clicks_on_the_desired_product() throws Throwable {
		String producttext = homepage.product().getText();
		System.out.println(producttext);
		homepage.product().click();
	}

	@Then("The item is added to the cart")
	public void the_item_is_added_to_the_cart() throws Throwable {
		er.endTest();
	}

	@And("adds to wishlist")
	public void adds_to_wishlist() throws Throwable {
		productcmon.productwishlist().click();
	}

	@And("increases the quantity and adds to cart")
	public void increases_the_quantity_adds_to_cart() throws Throwable {
		for (int i = 0; i < 1; i++) {
			productcmon.add().click();
		}
		Thread.sleep(5000);
		productcmon.addtocart().click();
		er.startTest("Adding a product from the home page to cart");
		productcmon.closingsohppinglist().click();
		Thread.sleep(2000);

	}

	public static WebDriver getdriver() {
		return driver;
	}
}
