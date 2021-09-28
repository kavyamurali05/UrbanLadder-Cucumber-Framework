package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.mindtree.runner.TestRunner;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.customerStoriesPage;
import pageObjects.giftCardsPage;
import pageObjects.searchPage;
import pageObjects.storesPage;

public class Steps {
	WebDriver driver;
	HomePage hp;
	searchPage s;
	giftCardsPage g;
	customerStoriesPage c;
	storesPage stores;
	
	public static Logger log = LogManager.getLogger(Steps.class.getName());
	
	@Given("user is opening the browser and landed on correct {string}")
	public void user_is_opening_the_browser_and_landed_on_correct(String url) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavya\\eclipse-workspace\\cucumberUrban\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	   
	}
	
	@When("user clicks stores in home page")
	public void user_clicks_stores_in_home_page() {
	    HomePage hp=new HomePage(driver);
	    hp.store();
	}
	
	@Then("user should navigate to stores page")
	public void user_should_navigate_to_stores_page() {
	    
		log.info(driver.getTitle());
	    log.info("Successfully navigated to stores page");
	}
	
	@And("display location")
	public void display_location() {
		storesPage stores=new storesPage(driver);
		stores.viewDetails();
	    log.info(stores.location());
	    System.out.println(stores.location());
	}
	
	@When("user clicks view all customer stories")
	public void user_clicks_view_all_customer_stories() {
	    HomePage hp=new HomePage(driver);
	    hp.viewCustomerStories();
	}
	
	@Then("user should navigate to customer stories page")
	public void user_should_navigate_to_customer_stories_page() {
	    
		log.info(driver.getTitle());
	    Assert.assertEquals(driver.getTitle(), "Reviews & Testimonials | urbanladder.com");
	    log.info("Successfully navigated to customer stories page");
	}
	
	
	
	@When("user clicks Decor button")
	public void user_clicks_Decor_button() {
	    HomePage hp=new HomePage(driver);
	    hp.decor();
	}
	
	@Then("user should navigate to home decor page")
	public void user_should_navigate_to_home_decor_page() {
	    
		log.info(driver.getTitle());
	    Assert.assertEquals(driver.getTitle(), "Home Decor: Buy Home Decor Items Online [ Home Decor Furniture ] - Urban Ladder");
	    log.info("Successfully navigated to home decor page");
	}
	
	
	
	@When("user clicks gift card button")
	public void user_clicks_gift_card_button() {
	    HomePage hp=new HomePage(driver);
	    hp.giftCard();
	}
	
	@Then("user should navigate to gift card page")
	public void user_should_navigate_to_gift_card_page() {
	    
		giftCardsPage g=new giftCardsPage(driver);
		log.info(driver.getTitle());
	    Assert.assertEquals(driver.getTitle(), "Gift Card - Buy Gift Cards & Vouchers Online for Wedding, Birthday | Urban Ladder");
	    log.info("Successfully validated gift cards feature");
	}
	
	@When("user clicks help button")
	public void user_clicks_help_button() {
	    HomePage hp=new HomePage(driver);
	    hp.help();
	}
	
	@Then("user should navigate to help page")
	public void user_should_navigate_to_help_page() {
	    
		log.info(driver.getTitle());
	    Assert.assertEquals(driver.getTitle(), "Help | urbanladder.com");
	    log.info("Successfully validated help feature");
	}
	
	@When("user searches {string} in search box")
	public void user_searches_in_search_box(String product) {
	    HomePage hp=new HomePage(driver);
	    hp.searchBox(product);
	    hp.searchIcon();
	   
	}
	
	
	
	@Then("clicks the product")
	public void clicks_the_product() {
	    searchPage s=new searchPage(driver);
	    s.product();
	       
	}
	
	@When("user clicks addTocart button")
	public void user_clicks_addTocart_button() {
	    
	    searchPage s=new searchPage(driver);
		s.AddToCart();
		
	}
	
	@Then("product added to cart")
	public void product_added_to_cart() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Assert.assertEquals(driver.getTitle(), "Shopping Cart - Urban Ladder");
	    log.info("Product successfully added to cart");
	    
	}


	@When("user enters {string} in search box")
	public void user_enters_in_search_box(String product) {
	    HomePage hp=new HomePage(driver);
	    hp.searchBox(product);
	    hp.searchIcon();
	    driver.navigate().back();
	    
	}
	
	@Then("user should navigate to another page")
	public void user_should_navigate_to_another_page() {
	    log.info("Successfully searched the products");
	    
	}
	
	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}
	
	


}
