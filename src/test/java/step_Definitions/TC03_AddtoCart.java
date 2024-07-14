package step_Definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;

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
		CommonFunctions.scroll();
		Thread.sleep(5000);
	    AddtoCart_PageObjects.cartdetails().getSize().click();
	   
	}
	@Then("Verify the Cart")
	public void verify_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test");
	}

}
