package FirstProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomePageTest extends base{
	//WebDriver driver;
	@Test

	public void browserNavigation() throws IOException 
	{
		driver =initializeDriver();
		//driver.get(url);
		
		RediffHomePage rd = new RediffHomePage(driver);
		RediffLoginPage lp = new RediffLoginPage(driver);
		
		
		rd.Signin().click();
		lp.username().sendKeys("swetha");
		lp.password().sendKeys("rao@gmail.com");
		lp.signin().click();
		
		
		//driver.findElements(By.linkText("Sign in"));
		//driver.findElement(By.id("flight-tab")).click();
		
		//;
	}

}
	
