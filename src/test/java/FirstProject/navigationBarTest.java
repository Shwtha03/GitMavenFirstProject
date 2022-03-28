package FirstProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.RediffHomePage;
import resources.base;



public class navigationBarTest extends base {
	
	@BeforeTest
	public void initialSteps() throws IOException {
		driver = initializeDriver();
	}
	
	@Test
	public void validateNavBar() throws IOException {
	

	
	RediffHomePage rd = new RediffHomePage(driver);
	Assert.assertTrue(rd.NavText().isDisplayed());
	Assert.assertEquals(rd.NavText().getText()," HOME NEWS BUSINESS MOVIES CRICKET SPORTS GET AHEAD REALTIME NEWS COVID-19");
	if(rd.NavText().isDisplayed())
	{
		System.out.println("navigation bar is displayed without any break of code and the contents are:-");
		System.out.println((rd.NavText().getText()));
	}
	}
	
	@AfterTest
	public void close()
	{
	
		driver.close();
	}

}
