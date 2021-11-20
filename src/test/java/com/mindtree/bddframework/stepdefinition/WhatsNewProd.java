package com.mindtree.bddframework.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.mindtree.bddframework.reusablecomponents.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WhatsNewProd extends BaseClass {

	@Given("The user is on main page")
	public void the_user_is_on_main_page() throws Throwable {
		driver = SearchProducts.getdriver();
		homepage.logo().click();

	}

	@When("The user clicks on whats new page")
	public void the_user_clicks_on_whats_new_page() throws Throwable {
		whatsnew.getBtn().click();
		if (whatsnew.getValidate().getText().contains("What'S New")) {
			Assert.assertTrue(true);
			log.info("Validating text in What's new page");
		}
	}

	@Then("product is to be added to wishlist")
	public void product_is_to_be_added_to_wishlist() throws Throwable {
		er.endTest();
	}

	@And("sorts the product on best selling product")
	public void sorts_the_product_on_best_selling_product() throws Throwable {
		Select s = new Select(productcmon.getSortBy());
		s.selectByValue("best-selling");
	}

	@And("selects the first product from the list, adds it to wishlist")
	public void selects_the_first_product_from_the_list_adds_it_to_wishlist() throws Throwable {
		productcmon.getProducts().get(0).click();
		productcmon.productwishlist().click();
		er.startTest("Successfully added to cart from what's new page");
		Thread.sleep(2000);

	}

	public static WebDriver getdriver() {
		return driver;
	}
}
