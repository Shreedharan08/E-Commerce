package step_Definitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.AddtoCart_PageObjects;
import page_Objects.HomePage_PageObjects;

public class TC03_AddtoCart {
	
	private static final Logger log = LogManager.getLogger(TC03_AddtoCart.class);
	
	@When("Enter the required details in the Search Bar")
	public void enter_the_required_details_in_the_search_bar() {
		try {
			HomePage_PageObjects.homedetails().getSearchbar().sendKeys("T-Shrit");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			CommonFunctions.takescreenshot();
		}
	}
	@Then("Click on the Ok button")
	public void click_on_the_ok_button() {
		try {
			HomePage_PageObjects.homedetails().getSearchbar().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			CommonFunctions.takescreenshot();
		}
	}
	@Then("Click the Add to Cart button")
	public void click_the_add_to_cart_button() throws InterruptedException {
		
		WebElement element = AddtoCart_PageObjects.cartdetails().getele();
		CommonFunctions.wait(element);
		CommonFunctions.scroll();
	    element.click(); 
	    AddtoCart_PageObjects.cartdetails().getSize().click();
	    CommonFunctions.scroll();
	    AddtoCart_PageObjects.cartdetails().getcolor().click();
	    AddtoCart_PageObjects.cartdetails().getcart().click();
	}
	
	@Then("Verify the Cart")
	public void verify_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement element = AddtoCart_PageObjects.cartdetails().getcount();
		WebDriverWait wait = new WebDriverWait(CommonFunctions.driver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.visibilityOf(element));
		String count = element.getText();
		log.info(count);
	}

}
