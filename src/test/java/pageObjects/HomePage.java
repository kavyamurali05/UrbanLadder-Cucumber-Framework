package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public By searchBox =By.cssSelector("#search");
	
	public By searchIcon=By.cssSelector("#search_button > span");
	
	public By help =By.cssSelector("#header > section > div > ul.featuredLinksBar__contact-links > li:nth-child(1) > a");
	
	public By giftCard=By.cssSelector("#header > section > div > ul.featuredLinksBar__linkContainer > li:nth-child(3) > a");
	
	public By decor=By.cssSelector("#content > div.personalized-component > div > div:nth-child(3) > a:nth-child(6) > svg");
	
	public By viewCustomerStories=By.cssSelector("#home > div.container > div.footer_wrapper.row.clearfix > div.center.testimonial-module > div.text-center.view-all > a");
	
	public By store=By.cssSelector("#header > section > div > ul.featuredLinksBar__linkContainer > li:nth-child(1) > a");
	
	public WebDriver searchBox(String product) {
		driver.findElement(searchBox).sendKeys(product);
		return driver;
	}
	
	public WebDriver searchIcon() {
		driver.findElement(searchIcon).click();
		return driver;
	}
	
	public WebDriver help()
	{
		driver.findElement(help).click();
		return driver;
	}
	
	public WebDriver giftCard()
	{
		driver.findElement(giftCard).click();
		return driver;
	}
	
	public WebDriver decor()
	{
		driver.findElement(decor).click();
		return driver;
	}
	
	public WebDriver viewCustomerStories()
	{
		driver.findElement(viewCustomerStories).click();
		return driver;
	}
	
	public WebDriver store()
	{
		driver.findElement(store).click();
		return driver;
	}
	

}
