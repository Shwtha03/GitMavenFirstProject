package FirstProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomePage extends base{
	//WebDriver driver;
	@Test

	public void browserNavigation() throws IOException 
	{
		driver =initializeDriver();
		
		driver.findElement(By.id("flight-tab")).click();
		
		//;
	}

}
	
