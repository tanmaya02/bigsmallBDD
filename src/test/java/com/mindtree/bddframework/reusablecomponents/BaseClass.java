package com.mindtree.bddframework.reusablecomponents;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.mindtree.bddframework.pageobjects.CreateAccount;
import com.mindtree.bddframework.pageobjects.GiftCardPage;
import com.mindtree.bddframework.pageobjects.Gifts;
import com.mindtree.bddframework.pageobjects.HomePage;
import com.mindtree.bddframework.pageobjects.OfficialMerchandise;
import com.mindtree.bddframework.pageobjects.PersonalisedGifts;
import com.mindtree.bddframework.pageobjects.ProductPage;
import com.mindtree.bddframework.pageobjects.ShopByCatPage;
import com.mindtree.bddframework.pageobjects.SigninPage;
import com.mindtree.bddframework.pageobjects.WhatsNew;
import com.mindtree.bddframework.utilities.ConfigsProvider;
import com.mindtree.bddframework.utilities.Excel;
import com.mindtree.bddframework.utilities.Extentreports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {

	public static WebDriver driver;
	public static Logger log;
	public static ConfigsProvider config;
	public static ExtentTest test;
	public static Extentreports er;

	public static HomePage homepage;
	public static SigninPage signin;
	public static GiftCardPage giftcard;
	public static ProductPage productcmon;
	public static OfficialMerchandise officialMerchandise;
	public static ShopByCatPage shopbycat;
	public static CreateAccount createAcc;
	public static WhatsNew whatsnew;
	public static Gifts gift;
	public static PersonalisedGifts personalGifts;
	public Excel ex = new Excel();

	public void startup() throws IOException {

		log = Logger.getLogger(getClass());
		config = new ConfigsProvider();
	}

	public void beforeClass() {
		driver = WebDriverHelper.driverInitializer(driver, config.getBrowser(), config.implicitWait());
		log.info("Driver Initialised");
		er = new Extentreports(driver);

		homepage = new HomePage(driver);
		signin = new SigninPage(driver);
		giftcard = new GiftCardPage(driver);
		productcmon = new ProductPage(driver);
		officialMerchandise = new OfficialMerchandise(driver);
		shopbycat = new ShopByCatPage(driver);
		createAcc = new CreateAccount(driver);
		whatsnew = new WhatsNew(driver);
		gift = new Gifts(driver);
		personalGifts = new PersonalisedGifts(driver);

	}

	public void classTeardown() {
		WebDriverHelper.quitDriver(driver);
		log.info("Driver Closed");
	}

}
