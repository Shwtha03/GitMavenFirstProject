package FirstProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import pageObject.RediffHomePage;
import pageObject.RediffLoginPage;
import resources.base;

public class HomePageTest extends base {
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	// WebDriver driver;
	@BeforeTest
	public void initialSteps() throws IOException {
		driver = initializeDriver();
		log.info("driver is initialised");
	}

	@Test

	public void browserNavigation() throws IOException {

		// driver.get(url);

		RediffHomePage rd = new RediffHomePage(driver);
		rd.Signin().click();
		log.info("Navigated to Sign-in page");

	}

	@Test(dataProvider = "getdata")
	public void calldata(String username, String password, String text) {

		RediffLoginPage lp = new RediffLoginPage(driver);

		lp.username().sendKeys(username);
		lp.password().sendKeys(password);
		System.out.println(text);
		lp.submit().click();
	}

	@DataProvider
	private Object[][] getdata() {
		Object[][] data = new Object[2][3];

		data[0][0] = "shweth";
		data[0][1] = "rao@1234";
		data[0][2] = "test data-1";

		data[1][0] = "pradeep";
		data[1][1] = "aby199@gmail.com";
		data[1][2] = "test data-2";

		return data;

	}

	@AfterTest
	public void close() {
		driver.close();
	}
}
