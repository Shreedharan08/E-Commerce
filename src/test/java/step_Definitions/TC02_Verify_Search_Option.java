package step_Definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;

import base.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.HomePage_PageObjects;

public class TC02_Verify_Search_Option {
	
	private static final Logger log = LogManager.getLogger(TC02_Verify_Search_Option.class);

	@When("Enter the value {string} in the search bar")
	public void enter_the_value_in_the_search_bar(String value) {
		try {
			HomePage_PageObjects.homedetails().getSearchbar().sendKeys(value);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			CommonFunctions.takescreenshot();
		}
	    
	}
	@When("Perform Enter opeartion in search bar")
	public void perform_enter_opeartion_in_search_bar() {
		try {
			HomePage_PageObjects.homedetails().getSearchbar().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
		}
		
	}
	@Then("verify the products")
	public void verify_the_products() throws Exception {
		
	  
	}

	
}
