package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookingPage extends GenericWrappers{
	
	public int gstprice;
	public int checkoutprice;
	
	public BookingPage selectTitle(String Title) {
		selectValueByXpath(prop.getProperty("BookingPage.Title.XPath"), Title);
		return new BookingPage();
	}
	public BookingPage enterFirstName(String FirstName) {
		enterByXpath(prop.getProperty("BookingPage.FirstName.XPath"), FirstName);
		return this;
	}
	public BookingPage enterLastName(String LastName) {
		enterByXpath(prop.getProperty("BookingPage.LastName.XPath"), LastName);
		return this;
	}
	public BookingPage selectState(String State) {
		selectValueByXpath(prop.getProperty("BookingPage.State.XPath"), State);
		return this;
	}
	public BookingPage selectGst(String GST) {
		selectValueByXpath(prop.getProperty("BookingPage.Gst.XPath"), GST);
		return this;
	}
	public BookingPage enterGstNo(String GSTNumber) {
		enterByXpath(prop.getProperty("BookingPage.GstNo.XPath"), GSTNumber);
		return this;
	}
	public BookingPage verifyGstNo(String Alert) {
		verifyTextContainsByXpath(prop.getProperty("BookingPage.GstAlert.XPath"), Alert);
		return this;				
	}
	public BookingPage enterCompanyName(String CompanyName) {
		enterByXpath(prop.getProperty("BookingPage.CompanyName.XPath"), CompanyName);
		return this;
	}
	public BookingPage enterCompanyAddress(String CompanyAdd) {
		enterByXpath(prop.getProperty("BookingPage.CompanyAddress.XPath"), CompanyAdd);
		return this;
	}
	public BookingPage verifyHotelName() {
		verifyTextByXpath(prop.getProperty("BookingPage.VerifyHotelName.XPath"), ConfirmationPage.hotelName);
		return this;
	}
	public BookingPage clickContinue() {
		clickByXpath(prop.getProperty("BookingPage.ContinueButton.XPath"));
		return this;
	}
//	public BookingPage getFareHeading() {
//		getTextByXpath(prop.getProperty("BookingPage.FareHeading.XPath"));
//		return this;
//	}
	public BookingPage clickCheckBox() {
		clickByXpath(prop.getProperty("BookingPage.CheckBox.XPath"));
		return this;
	}
	public BookingPage clickMakePayment() {
		clickByXpath(prop.getProperty("BookingPage.MakePayment.XPath"));
		return this;
	}
	public BookingPage calPrice() {
		gstprice=gstCal(ConfirmationPage.hotelPrice);
		return this;
	}
	public BookingPage convertNum() {
		checkoutprice=convertToNumbyXpath(prop.getProperty("BookingPage.ConvertPrice.XPath"));
		return this;
	}
	public BookingPage compareNums() {
		compareTwoNumbers(gstprice, checkoutprice);
		return this;
	}
	public BookingPage waitTime(long time) {
		waitProperty(time);
		return this;
	}
	public OtpVerifyPage switchOtpWindow() {
		switchToLastWindow();
		return new OtpVerifyPage();
	}

}
