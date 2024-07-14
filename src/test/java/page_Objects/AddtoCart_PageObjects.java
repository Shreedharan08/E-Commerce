package page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtoCart_PageObjects {
	
	private static AddtoCart_PageObjects getcartdeatils;
	
	private AddtoCart_PageObjects() {
		
	}
	
	public WebElement getSize() {
		return Size;
	}

	public static AddtoCart_PageObjects cartdetails() {
		if(getcartdeatils==null) {
			getcartdeatils = new AddtoCart_PageObjects();
		}
		return getcartdeatils;
		
	}
	
	
	@FindBy(xpath = "//*[@option-id='168' and @option-label='M']")
	private WebElement Size;
	

}
