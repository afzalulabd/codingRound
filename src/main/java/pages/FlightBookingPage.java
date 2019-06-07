package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FlightBookingPage extends GetElement {
	WebDriver driver;
	public FlightBookingPage(WebDriver driver) {
		this.driver=driver;
	}

	public FlightBookingPage click(String objectName,String objectType) {
		try {
			driver.findElement(getObject(objectName,objectType)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public FlightBookingPage clear(String objectName,String objectType) {
		try {
			driver.findElement(getObject(objectName,objectType)).clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public FlightBookingPage enterKeys(String objectName,String objectType,String value) {
		try {
			driver.findElement(getObject(objectName,objectType)).sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public FlightBookingPage selectDropDown(String parentObjectName,String parentObjectType,String childObjectName,String childobjectType,int index) {
		try {
			List<WebElement> destinationOptions = driver.findElement(getObject(parentObjectName,parentObjectType)).findElements(getObject(childObjectName,childobjectType));
			destinationOptions.get(index).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public FlightBookingPage Verification(String objectName,String objectType) {
		try {
			Assert.assertTrue(isElementPresent(getObject(objectName,objectType)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}

