package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class giftCardsPage {
	
	WebDriver driver;
	
	public giftCardsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public By displayText=By.cssSelector("#app-container > div > main > section > p");
	
	
	public WebDriver displayText()
	{
		driver.findElement(displayText).getText();
		return driver;
	}

}
