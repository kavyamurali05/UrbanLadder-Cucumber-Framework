package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchPage {
	WebDriver driver;
	public searchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public By display=By.cssSelector("#search-results > div.headersection.row.text-center > h2");
	
	public By product=By.cssSelector("#search-results > div:nth-child(3) > ul > li:nth-child(1) > div > a.product-title-block > div.product-title.product-title-sofa-mattresses > span.name");
	public By addToCart=By.id("add-to-cart-button");
	//public By addToCart=By.cssSelector("#add-to-cart-button");
	
	public WebDriver displayResult() {
		driver.findElement(display).click();
		return driver;
	}
	
	public WebDriver product()
	{
		driver.findElement(product).click();
		return driver;
	}
	
	public WebDriver AddToCart()
	{
		driver.findElement(addToCart).click();
		return driver;
	}

}
