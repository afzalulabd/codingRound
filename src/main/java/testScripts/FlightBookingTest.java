package testScripts;

import pages.FlightBookingPage;
import wrappers.Annotationmethods;
import org.testng.annotations.Test;


public class FlightBookingTest extends Annotationmethods{

	@Test
	public void oneWayJournerFlightVerification() {
		FlightBookingPage flightPage=new FlightBookingPage(driver);
		waitFor(2000);
		flightPage.click("OneWay", "id");
		flightPage.clear("FromTag", "id");
		flightPage.enterKeys("FromTag", "id", "Bangalore");
		waitFor(4000);
		flightPage.selectDropDown("ui-id-1", "id", "li", "tag", 0);
		flightPage.clear("ToTag", "id");
		flightPage.enterKeys("ToTag", "id", "Delhi"); 
		waitFor(4000);
		flightPage.selectDropDown("ui-id-2", "id", "li", "tag", 0);
		flightPage.click("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a", "xpath");
		flightPage.click("SearchBtn", "id");
		flightPage.Verification("searchSummary", "CLASSNAME");
	}
}
