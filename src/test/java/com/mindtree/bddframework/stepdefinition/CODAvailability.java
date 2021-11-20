package com.mindtree.bddframework.stepdefinition;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.bddframework.reusablecomponents.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CODAvailability extends BaseClass {

	@Given("The user is home page")
	public void the_user_is_home_page() throws Throwable {
		driver = SignIn.getdriver();
		homepage.logo().click();
	}

	@When("The user clicks on DC merchandise under the Official Merchandise dropdown")
	public void the_user_clicks_on_dc_merchandise_under_the_official_merchandise_dropdown() throws Throwable {
		Actions a = new Actions(driver);
		WebElement move = homepage.officialM();
		a.moveToElement(move).build().perform();
		homepage.DC().click();
		log.info("Clicking the DC merchandise under the Official Merchandise dropdown");
	}

	@Then("system should display whether cod is available or not")
	public void system_should_display_whether_cod_is_available_or_not() throws Throwable {
		System.out.println(officialMerchandise.getValidateText().getText());
		er.endTest();
	}

	@And("The user clicks on the product, enters the pincode and clicks on check")
	public void the_user_clicks_on_the_product_enters_the_pincode_and_clicks_on_check() throws Throwable {
		ArrayList<String> DCproduct = ex.getData("DCProduct");
		ArrayList<String> pin = ex.getData("Pincode");
		for (int i = 0; i < officialMerchandise.getProdname().size(); i++) {
			if (officialMerchandise.getProdname().get(i).getText().contains(DCproduct.get(1))) {
				System.out.println("Product found!");
				officialMerchandise.getProdname().get(i).click();
				break;
			}
		}
		log.info("Clicked on the DC product");
		officialMerchandise.getPinCode().sendKeys(pin.get(1));
		officialMerchandise.getCheckBtn().click();
		er.startTest("Checking for the availability of cod for the selected product");
		log.info("Checking for the availability of cod for the selected product");
		Thread.sleep(2000);
	}

	public static WebDriver getdriver() {
		return driver;
	}
}
