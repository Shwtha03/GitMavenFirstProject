package resources;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\admin\\eclipse-workspace\\FirstProject\\src\\main\\java\\resources\\browser.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\Downloads\\chrome_march22\\chromedriver.exe");
			driver = new ChromeDriver();

			System.out.println(browserName);
		}

		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\admin\\Downloads\\firefox_latest\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println(browserName);
			// driver.get(url);
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);

		JavascriptExecutor jse;
		jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,100)");
		return driver;

	}

}
