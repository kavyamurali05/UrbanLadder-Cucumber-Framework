package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class customerStoriesPage {
	
	WebDriver driver;
	
	public customerStoriesPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public By customerStories=By.cssSelector("#testicontainer > div:nth-child(4) > div.testitext");
	
	public WebDriver customerStories()
	{
		driver.findElement(customerStories).getText();
		return driver;
	}
	

}
