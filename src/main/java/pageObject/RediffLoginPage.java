package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RediffLoginPage {
	
	public WebDriver driver;
	public RediffLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

By username= By.xpath("//input[@id='login1']");
By password = By.cssSelector("#password");
By enter = By.cssSelector("input[class ='signinbtn']");

public WebElement username()
{
	return driver.findElement(username);
}
	
public WebElement password()
{
	return driver.findElement(password);
}
public WebElement submit()
{
	return driver.findElement(enter);
}

}
