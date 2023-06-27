package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	@BeforeClass
	
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To verify GST in Hotel Booking";
		author="Prabha";
		category="smoke";
		browserName="chrome";
		url="https://www.irctc.co.in";
		sheetName="TC005";
	}
@Test(dataProvider = "fetchData")

public void bookHotelsGST(String Email, String MobileNo, String City, String CheckInYr, String CheckInMth, String CheckInDate, String CheckOutYr, String CheckOutMth, String CheckOutDate, String Rooms, String Adults, String Title, String FirstName, String LastName, String State, String GST, String GSTNumber, String CompanyName, String CompanyAdd, String Alert) {
		
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickLounge()
		.switchLastWindow()
		.clickHotels()
		.switchLoginWindow()
		.clickLogin()
		.clickGuestLogin()
		.enterEmail(Email)
		.enterMobileNo(MobileNo)
		.clickLoginButton()
		.switchFindHotelWindow()
		.waitTime(1000)
		.enterCity(City)
		.waitTime(1000)
		.clickCity()
		.clickCheckIn()
		.waitTime(1000)
		.clickCheckInMthYr()
		.waitTime(1000)
		.clickCheckInYr(CheckInYr)
		.clickCheckInMth(CheckInMth)
		.clickCheckInDt(CheckInDate)
		.clickCheckOut()
		.waitTime(1000)
		.clickCheckOutMthYr()
		.waitTime(1000)
		.clickCheckOutYr(CheckOutYr)
		.clickCheckOutMth(CheckOutMth)
		.clickCheckOutDt(CheckOutDate)
		.waitTime(1000)
		.clickUserData()
		.selectRooms(Rooms)
		.selectAdults(Adults)
		.clickDone()
		.clickFindHotel()
		.waitTime(2000)
		.clickFirstHotel()
		.switchConfirmationWindow()
		.waitTime(2000)
		.getHotelName()
		.getHotelPrice()
		.clickContinuetoBook()
		.switchBookingWindow()
		.selectTitle(Title)
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.waitTime(1000)
		.selectState(State)
		.selectGst(GST)
		.enterGstNo(GSTNumber)
		.enterCompanyName(CompanyName)
		.enterCompanyAddress(CompanyAdd)
		.waitTime(1000)
		.clickContinue()
		.verifyGstNo(Alert)		
		;
}
}
