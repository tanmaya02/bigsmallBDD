package com.mindtree.bddframework.stepdefinition;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.mindtree.bddframework.reusablecomponents.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopByCategory extends BaseClass {
	@Given("The user clicks on jewels under Shop by category")
	public void the_user_clicks_on_jewels_under_shop_by_category() throws Throwable {
		driver = CODAvailability.getdriver();
		homepage.logo().click();
		Actions a = new Actions(driver);
		WebElement move = shopbycat.getShopbycat();
		a.moveToElement(move).build().perform();
		shopbycat.getJewellery().click();

	}

	@When("The user navigates to the secong page")
	public void the_user_navigates_to_the_secong_page() throws Throwable {
		shopbycat.getNext().click();
	}

	@Then("The item has to be added to wishlist")
	public void the_item_has_to_be_added_to_wishlist() throws Throwable {
	
		er.endTest();
	}

	@And("The user selects a product from that page, adds it to wishlist")
	public void the_user_selects_a_product_from_that_page_adds_it_to_wishlist() throws Throwable {
		ArrayList<String> shop = ex.getData("shopbycategory");
		for (int i = 0; i < shopbycat.getJewpro().size(); i++) {
			if (shopbycat.getJewpro().get(i).getText().contains(shop.get(1))) {
				System.out.println("Product found!");
				shopbycat.getJewpro().get(i).click();
				break;
			}
		}
		productcmon.productwishlist().click();
		Thread.sleep(2000);
		er.startTest("Adding the product in the second page to the wishlist");

	}

	public static WebDriver getdriver() {
		return driver;
	}
}
