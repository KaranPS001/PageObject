package pom.irctc.pages;

import wrappers.GenericWrappers;

public class ConfirmationPage extends GenericWrappers{
	
	public static String hotelName;
	public static String hotelPrice;
	
	public ConfirmationPage getHotelName() {
		hotelName=getTextByXpath(prop.getProperty("ConfirmationPage.HotelName.XPath"));
		return new ConfirmationPage();
	}
	public ConfirmationPage getHotelPrice() {
		hotelPrice=getTextByXpath(prop.getProperty("ConfirmationPage.HotelPrice.XPath"));
		return this;
	}
	public ConfirmationPage clickContinuetoBook() {
		clickByXpath(prop.getProperty("ConfirmationPage.ContinueToBook.XPath"));
		return this;
	}
	public BookingPage switchBookingWindow() {
		switchToLastWindow();
		return new BookingPage();
	}
	public ConfirmationPage waitTime(long time) {
		waitProperty(time);
		return this;
	}
}

