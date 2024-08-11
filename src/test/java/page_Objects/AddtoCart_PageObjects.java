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
	
	@FindBy(xpath = "//*[contains(text(),'Erikssen CoolTech™ Fitness Tank')]")
	private WebElement hoverele;
	
	@FindBy(xpath = "//*[@title='Add to Cart']")
	private WebElement addtocart;
	
	@FindBy(xpath = "//*[@option-id='56']")
	private WebElement color;
	
	@FindBy(xpath = "//*[@class='counter-number']")
	private WebElement count;
	
	public WebElement getele() {
		return hoverele;
	}
	
	public WebElement getcart() {
		return addtocart;
	}
	
	public WebElement getcolor() {
		return color;
	}
	
	public WebElement getcount() {
		return count;
	}
	

}
