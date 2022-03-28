package FirstProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.RediffHomePage;
import resources.base;

public class validateRediffFeaturesTest extends base {
	@BeforeTest
	public void initialSteps() throws IOException {
		driver = initializeDriver();
	}

	@Test
	public void validateFeatures() throws IOException {

		RediffHomePage rd = new RediffHomePage(driver);
		String featuresTab = rd.RediffFeatures().getText();
		System.out.println("List of features of Rediff available for customers are:- ");
		System.out.println(featuresTab);
		Assert.assertEquals(featuresTab, "RediffmailMoneyBusiness EmailVideosShopping");
	}

	@AfterTest
	public void close() {

		driver.close();
	}

}
