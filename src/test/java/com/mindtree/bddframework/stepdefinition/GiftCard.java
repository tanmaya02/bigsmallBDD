package com.mindtree.bddframework.stepdefinition;

import com.mindtree.bddframework.reusablecomponents.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiftCard extends BaseClass {
	@Given("The user is on landing page")
	public void the_user_is_on_landing_page() throws Throwable {
		driver = ShopByCategory.getdriver();
		homepage.logo().click();

	}

	@When("The user clicks on gift card icon")
	public void the_user_clicks_on_gift_card_icon() throws Throwable {
		homepage.giftcard().click();
		String text = giftcard.validate().getText();
		Assert.assertEquals(text, "Gift Card");
	}

	@Then("The item has to be added to the cart")
	public void the_item_has_to_be_added_to_the_cart() throws Throwable {
		if (driver.getPageSource().contains("Shopping Cart")) {
			System.out.println("succesfully added to cart");
		}
		er.endTest();
	}

	@And("increases the quantity, adds to cart")
	public void increases_the_quantity_adds_to_wishlist() throws Throwable {
		for (int i = 0; i < 6; i++) {
			giftcard.add().click();
		}
		Thread.sleep(2000);
		giftcard.addgifttocart().click();
		er.startTest("Successfully added gift cards to the cart");
	}

	@And("closes the pop up, clicks on my cart")
	public void from_the_wishlist_adds_the_cards_to_the_cart() throws Throwable {
		giftcard.gotocheckout().click();
		Thread.sleep(5000);
		giftcard.closingwhatsappframe().click();
		Thread.sleep(7000);
		giftcard.goingbacktocart().click();
	}

	public static WebDriver getdriver() {
		return driver;
	}
}
