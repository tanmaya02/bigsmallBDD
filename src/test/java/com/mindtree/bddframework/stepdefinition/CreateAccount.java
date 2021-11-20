package com.mindtree.bddframework.stepdefinition;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.mindtree.bddframework.reusablecomponents.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount extends BaseClass {

	@Given("The user is on the sign in page")
	public void the_user_is_on_the_sign_in_page() {
		driver = OpenBrowser.getdriver();
		homepage.sigin().click();
	}

	@When("user clicks on create account button")
	public void user_clicks_on_create_account_button() {
		createAcc.getCreateAcc().click();
	}

	@And("user inputs the data asked in the page")
	public void user_inputs_the_data_asked_in_the_page() throws IOException, InterruptedException {
		ArrayList<String> fname = ex.getData("firstname");
		ArrayList<String> lname = ex.getData("lastname");
		ArrayList<String> email = ex.getData("email");
		ArrayList<String> password = ex.getData("password");
		for (int i = 1; i < fname.size(); i++) {
			createAcc.getfname().sendKeys(fname.get(i));
			createAcc.getlname().sendKeys(lname.get(i));
			createAcc.getEmail().sendKeys(email.get(i));
			createAcc.getPassword().sendKeys(password.get(i));
			er.startTest("Successfully entered User details");
			log.info("Entering user details in create account page");
			Thread.sleep(2000);
			createAcc.getfname().clear();
			createAcc.getlname().clear();
			createAcc.getEmail().clear();
			createAcc.getPassword().clear();
		}
	}

	@Then("system should accept the data")
	public void system_should_accept_the_data() {
		er.endTest();
	}

	public static WebDriver getdriver() {
		return driver;
	}

}
