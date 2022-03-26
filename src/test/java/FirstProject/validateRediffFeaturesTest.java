package FirstProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.RediffHomePage;
import resources.base;

public class validateRediffFeaturesTest extends base {

	@Test
	public void validateFeatures() throws IOException
	{
		driver = initializeDriver();
		RediffHomePage rd = new RediffHomePage(driver);
		String featuresTab = rd.RediffFeatures().getText();
		System.out.println("List of features of Rediff available for customers are:- ");
		System.out.println(featuresTab);
		Assert.assertEquals(featuresTab, "RediffmailMoneyBusiness EmailVideosShopping");
	}
}
