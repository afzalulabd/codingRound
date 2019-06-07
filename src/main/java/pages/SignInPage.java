package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignInPage extends GetElement {
	WebDriver driver;
	public SignInPage(WebDriver driver) {
		this.driver=driver;
	}

	public SignInPage click(String objectName,String objectType) {
		try {
			driver.findElement(getObject(objectName,objectType)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public SignInPage frameSignInPopup() {
		driver.switchTo().frame("modal_window");
		return this;
	}

	public SignInPage signInPageError(String objectName,String objectType,String errorMessage) {
		try {
			String errors1 = driver.findElement(getObject(objectName,objectType)).getText();
			Assert.assertTrue(errors1.contains(errorMessage));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
