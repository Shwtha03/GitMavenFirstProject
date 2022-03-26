package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	public WebDriver driver;

	public RediffHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By loginLink = By.linkText("Sign in");

	By navigationText = By.xpath("//ul[@class='navbarul']");
	
	By features = By.cssSelector("div.cell.topicons");

	public WebElement NavText() {
		return driver.findElement(navigationText);
	}

	public WebElement Signin() {
		return driver.findElement(loginLink);
	}
	
	public WebElement RediffFeatures()
	{
		return driver.findElement(features);
	}

}
