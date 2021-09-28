package reusableComponents;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.PropertyFileReader;

public class ReusableMethods {
	public static Properties prop;
	public static void getUrl(WebDriver driver) throws IOException
	{
		//prop=PropertyFileReader.generateProp();
		driver.get(PropertyFileReader.generateProp().getProperty("url"));
		//driver.get("https://www.urbanladder.com/");
	}
	public static String getBrowser(WebDriver driver) {
		try {
			return PropertyFileReader.generateProp().getProperty("browser");
		}
		catch(Exception e){
			System.out.println("Browser not Found in config.properties");
			return null;
		}
	}
	public static void timeLaps(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static boolean getElements(By locator,WebDriver driver)
	{
		try {
			driver.findElement(locator);
			return true;
		}
		catch(Exception e){
			System.out.println("element not found at "+ locator);
			
		}
		return false;
		
	}
	
	public static boolean sendKey(By locator, String keys,WebDriver driver) throws Exception
	{
		try {
			driver.findElement(locator).sendKeys(keys);
			return true;
		}
		catch(Exception e){
			System.out.println("Error in sending "+keys+" to the following element "+locator);
			
			
		}
		return false;
		
	}
	
	public static boolean click(By locator,WebDriver driver) throws Exception
	{
		WebElement element=driver.findElement(locator);
		try {
			element.click();
			return true;
		}
		catch(Exception e)
		{
			System.out.println("The following element is not clickable "+locator);
			
		}
		return false;
	}

}
