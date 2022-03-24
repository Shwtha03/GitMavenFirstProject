package FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	 public WebDriver driver;
	

 
 public RediffHomePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	 this.driver = driver;
}

By loginLink= By.linkText("Sign in");
 
 public WebElement Signin()
 {
	 return driver.findElement(loginLink);
 }
 

 
 

}
