package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPage {

	WebDriver driver;

	public HotelBookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(partialLinkText  = "Hotels")
	private WebElement hotelLink;

	@FindBy(id = "Tags")
	private WebElement localityTextBox;

	@FindBy(id = "SearchHotelsButton")
	private WebElement searchButton;

	@FindBy(id = "travellersOnhome")
	private WebElement travellerSelection;

	public HotelBookingPage menuClick() {
		try {
			hotelLink.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public HotelBookingPage enterKeys(String value) {
		try {
			localityTextBox.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public HotelBookingPage selectDropDown(String value) {
		try {
			new Select(travellerSelection).selectByVisibleText(value); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public HotelBookingPage searchClick() {
		try {
			searchButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}

