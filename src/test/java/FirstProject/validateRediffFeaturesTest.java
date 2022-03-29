package FirstProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;

import pageObject.RediffHomePage;
import resources.base;

public class validateRediffFeaturesTest extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialSteps() throws IOException {
		driver = initializeDriver();
		log.info("driver is initialised");
	}

	@Test
	public void validateFeatures() throws IOException {

		RediffHomePage rd = new RediffHomePage(driver);
		String featuresTab = rd.RediffFeatures().getText();
		log.info("List of features of Rediff available for customers are:- ");
		log.info(featuresTab);
		Assert.assertEquals(featuresTab, "RediffmailMoneyBusiness EmailVideosShopping");
	}

	@AfterTest
	public void close() {

		driver.close();
		log.info("closing the window");
	}

}
