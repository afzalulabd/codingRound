package testScripts;

import pages.SignInPage;
import wrappers.Annotationmethods;
import org.testng.annotations.Test;

public class SignInTest extends Annotationmethods {

	@Test
	public void signInErrorMessageVerification() {
		SignInPage signIn=new SignInPage(driver);
		signIn.click("Your trips","Link");
		signIn.click("SignIn","id");
		signIn.frameSignInPopup();
		waitFor(2000);
		signIn.click("signInButton","id");
		signIn.signInPageError("errors1","id","There were errors in your submission");
	}
}
