package step_Definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonFunctions;
import constants.Contants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import page_Objects.Login_PageObjects;

public class TC01_Verify_Login {
	private static final Logger log = LogManager.getLogger(TC01_Verify_Login.class);

	@Given("Navigate to the URL")
	public void navigate_to_the_url() {
		CommonFunctions.driver.get(Contants.Url);
		log.info("Navigated to URL");
		
	}
	@When("Click on the Sign in link")
	public void click_on_the_sign_in_link() {
		Login_PageObjects.logindetails().getSignIn().click();
		log.info("User is clicked on signin link");

	}
	@When("Enter the Username and Password in the field")
	public void enter_the_username_and_password_in_the_field() {
		Login_PageObjects.logindetails().getemail().sendKeys(Contants.username);
		Login_PageObjects.logindetails().getPassword().sendKeys(Contants.password);
		

	}
	@Then("Click on the Sign in button")
	public void click_on_the_sign_in_button() {
		Login_PageObjects.logindetails().getLoginbutton().click();

	}
	@Then("Validate the login")
	public void validate_the_login() {
		boolean status = Login_PageObjects.logindetails().getloginstatus().isDisplayed();
		if (status) {
			System.out.println("Login is Successfull");
		}else {
			System.out.println("Login Failed");
		}

	}


}
