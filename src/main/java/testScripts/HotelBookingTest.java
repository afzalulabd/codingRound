package testScripts;

import pages.HotelBookingPage;
import wrappers.Annotationmethods;
import org.testng.annotations.Test;

public class HotelBookingTest extends Annotationmethods {

	@Test
	public void hotelSearchVerification() throws InterruptedException {

		HotelBookingPage hotelPage=new HotelBookingPage(driver);
		hotelPage.menuClick();
		hotelPage.enterKeys("Indiranagar, Bangalore");
		hotelPage.selectDropDown("1 room, 2 adults");
		hotelPage.searchClick();

	}
}
