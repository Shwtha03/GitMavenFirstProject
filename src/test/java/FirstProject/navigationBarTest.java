package FirstProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.RediffHomePage;
import resources.base;



public class navigationBarTest extends base {
	
	@Test
	public void validateNavBar() throws IOException {
	
	driver =initializeDriver();
	
	RediffHomePage rd = new RediffHomePage(driver);
	Assert.assertTrue(rd.NavText().isDisplayed());
	Assert.assertEquals(rd.NavText().getText()," HOME NEWS BUSINESS MOVIES CRICKET SPORTS GET AHEAD REALTIME NEWS COVID-19");
	if(rd.NavText().isDisplayed())
	{
		System.out.println("navigation bar is displayed without any break of code and the contents are:-");
		System.out.println((rd.NavText().getText()));
	}
	
	}

}
