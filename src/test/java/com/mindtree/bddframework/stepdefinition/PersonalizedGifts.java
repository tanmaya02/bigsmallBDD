package com.mindtree.bddframework.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.mindtree.bddframework.reusablecomponents.BaseClass;

public class PersonalizedGifts extends BaseClass {
	@Given("The user is in home Page")
	public void the_user_is_in_home_page() throws Throwable {
		driver = LeastPricedProduct.getdriver();
		homepage.logo().click();

	}

	@When("The user clicks on Personalized Gifts from top bar")
	public void the_user_clicks_on_personalized_gifts_from_top_bar() throws Throwable {
		personalGifts.getPGBtn().click();
		ArrayList<String> name = ex.getData("personalised");
		if (personalGifts.getValidate().getText().contains(name.get(1))) {
			Assert.assertTrue(true);
			log.info("Validating the text in Personalized Gifts page");
		}
	}

	@Then("success message is printed")
	public void success_message_is_printed() throws Throwable {
		er.endTest();
		classTeardown();

	}

	@And("searches for the product")
	public void searches_for_the_product() throws Throwable {
		ArrayList<String> name = ex.getData("personalised");
		for (int j = 0; j < personalGifts.getProducts().size(); j++) {
			if (personalGifts.getProducts().get(j).getText().contains(name.get(2))) {
				personalGifts.getProducts().get(j).click();
				er.startTest("Successfully searched for the product from Personalized Gifts page");
				Thread.sleep(2000);
				System.out.println("Product found!");
				log.info("Finding a required product");
				break;
			}
		}

	}

}
