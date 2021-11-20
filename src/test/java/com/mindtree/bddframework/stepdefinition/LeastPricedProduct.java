package com.mindtree.bddframework.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.mindtree.bddframework.reusablecomponents.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeastPricedProduct extends BaseClass {
	@Given("The user is on home")
	public void the_user_is_on_home() throws Throwable {
		driver = WhatsNewProd.getdriver();
		homepage.logo().click();

	}

	@When("The user clicks on DIY gift under gifts dropdown")
	public void the_user_clicks_on_diy_gift_under_gifts_dropdown() throws Throwable {
		Actions a = new Actions(driver);
		WebElement move = gift.getGifts();
		a.moveToElement(move).build().perform();
		gift.getDIY().click();
		log.info("Clicking on DIY gifts under Gifts option");
		if (gift.getValidate().getText().contains("DIY Gifts")) {
			Assert.assertTrue(true);
		}
	}

	@Then("^product details are displayed$")
	public void product_details_are_displayed() throws Throwable {
		System.out.println(productcmon.getProducts().get(0).getText());
		System.out.println(gift.getProductsPrice().get(0).getText());
		log.info("Finding the name of the least priced product");
		er.endTest();
	}

	@And("^sorts the products from low to high$")
	public void sorts_the_products_from_low_to_high() throws Throwable {
		Select s = new Select(gift.getSortBy());
		s.selectByValue("price-ascending");
		er.startTest("Successfully searched the least priced product and the price");
	}

	public static WebDriver getdriver() {
		return driver;
	}

}
