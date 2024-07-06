package page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_PageObjects {

	private static HomePage_PageObjects gethomedetails;

	private HomePage_PageObjects() {

	}

	public static HomePage_PageObjects homedetails() {
		if (gethomedetails == null) {
			gethomedetails = new HomePage_PageObjects();
		}
		return gethomedetails;

	}

	@FindBy(xpath = "//*[@name='q']")
	private WebElement searchbar;

	public WebElement getSearchbar() {
		return searchbar;
	}

}
