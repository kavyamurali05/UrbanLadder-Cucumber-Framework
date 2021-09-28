package reusableComponents;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.PropertyFileReader;

public class ReusableComponents {

	public static WebDriver driver;
	//public Properties prop;

	public static WebDriver initializeDriver() throws IOException {
		String browser = ReusableMethods.getBrowser(driver);
		if (browser.equals("chrome")) {

			// Google Chrome
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equals("edge")) {

			// Microsoft Edge
			System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {

			// Mozilla Firefox
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		// Set an Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}
}
