package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class storesPage {
	
	WebDriver driver;
	
	public storesPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public   By viewDetails = By.xpath("//*[@id=\"app-container\"]/div/main/section[2]/div/a[10]/div[2]/button");
	
	public   By location = By.xpath("//*[@id=\"store-details\"]/div[4]/div[1]/address");
	
	public WebDriver viewDetails() {
		driver.findElement(viewDetails).click();
		return driver;
	}
	
	public WebDriver location() {
		driver.findElement(location).getText();
		return driver;
	}
	

}
