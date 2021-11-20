package com.mindtree.bddframework.stepdefinition;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.mindtree.bddframework.reusablecomponents.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIn extends BaseClass {

	@Given("The user is on sign in page")
	public void the_user_is_on_sign_in_page() throws Throwable {
		driver = CreateAccount.getdriver();
		homepage.logo().click();
		homepage.sigin().click();
		log.info("Successfully clicked on Sign in button");
	}

	@When("user enters the email and password")
	public void user_enters_the_email_and_password() throws Throwable {

		ArrayList<String> username = ex.getData("username");
		ArrayList<String> password = ex.getData("password for signin");
		for (int i = 1; i < username.size(); i++) {
			signin.customeremailid().sendKeys(username.get(i));
			signin.customerpass().sendKeys(password.get(i));
			Thread.sleep(2000);
			er.startTest("Signing in using user details");
			signin.customeremailid().clear();
			signin.customerpass().clear();
			Thread.sleep(2000);
			log.info("Entering username and password in the Sign in page");
		}

	}

	@Then("system should accept data")
	public void system_should_accept_data() throws Throwable {
		er.endTest();
	}

	public static WebDriver getdriver() {
		return driver;
	}

}
