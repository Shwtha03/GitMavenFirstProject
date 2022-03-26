package FirstProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.RediffHomePage;
import pageObject.RediffLoginPage;
import resources.base;

public class HomePageTest extends base{
	//WebDriver driver;
	@Test

	public void browserNavigation() throws IOException 
	{
		driver =initializeDriver();
		//driver.get(url);
		RediffHomePage rd = new RediffHomePage(driver);
		rd.Signin().click();
		
		
		
		
		//driver.findElements(By.linkText("Sign in"));
		//driver.findElement(By.id("flight-tab")).click();
		
		//;
	}
	
	@Test(dataProvider="getdata")
	public void calldata(String username, String password)
	{
		
		RediffLoginPage lp = new RediffLoginPage(driver);
		
		
	
		lp.username().sendKeys(username);
		lp.password().sendKeys(password);
		lp.submit().click();
	}
	

	@DataProvider
	private Object[][] getdata()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0]="shweth";
		data[0][1]="rao@1234";
		
		data[1][0]="pradeep";
		data[1][1]="aby199@gmail.com";
		
		return data;
		
	}
	
}
	
