package page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_PageObjects {
	
	private static Login_PageObjects getdetailslogin;
	
	private Login_PageObjects() {
		
	}
	
	public static Login_PageObjects logindetails() {
		if (getdetailslogin==null) {
			getdetailslogin = new Login_PageObjects();
		}
		return getdetailslogin;
		
	}
	
	public WebElement getSignIn() {
		return SignIn;
	}

	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	private WebElement SignIn;
	
	
	@FindBy(id = "email")
	private WebElement Email;
	
	@FindBy(xpath = "//*[@id='pass']")
	private WebElement password;
	
	@FindBy(id = "send2")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//*[contains(text(),'Welcome')]")
	private WebElement loginstatus;
	
	public WebElement getemail() {
		return Email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public WebElement getloginstatus() {
		return loginstatus;
	}
}
