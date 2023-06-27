package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FindHotelPage extends GenericWrappers{
	
	public FindHotelPage enterCity(String City) {
		enterByXpath(prop.getProperty("FindHotelPage.City.XPath"), City);
		return new FindHotelPage();
	}
	public FindHotelPage clickCity() {
		clickByXpath(prop.getProperty("FindHotelPage.OkCity.XPath"));
		return this;
	}
	public FindHotelPage clickCheckIn() {
		clickByXpathNoSnap(prop.getProperty("FindHotelPage.CheckIn.XPath"));
		return this;
	}
	public FindHotelPage clickCheckInMthYr() {
		clickByXpathNoSnap(prop.getProperty("FindHotelPage.CheckInMthYr.XPath"));
		return this;
	}
	public FindHotelPage clickCheckInYr(String CheckInYr) {
		clickOptionByXpath(prop.getProperty("FindHotelPage.CheckInYear.XPath"), CheckInYr);
		return this;
	}
	public FindHotelPage clickCheckInMth(String CheckInMth) {
		clickOptionByXpath(prop.getProperty("FindHotelPage.CheckInYear.XPath"), CheckInMth);
		return this;
	}
	public FindHotelPage clickCheckInDt(String CheckInDate) {
		clickOptionByXpath(prop.getProperty("FindHotelPage.CheckInDt.XPath"), CheckInDate);
		return this;
	}
//	public FindHotelPage clickCheckInDt() {
//		clickByXpath(prop.getProperty("FindHotelPage.CheckInDt.XPath"));
//		return this;
//	}
	public FindHotelPage clickCheckOut() {
		clickByXpathNoSnap(prop.getProperty("FindHotelPage.CheckOut.XPath"));
		return this;
	}
	public FindHotelPage clickCheckOutMthYr() {
		clickByXpathNoSnap(prop.getProperty("FindHotelPage.CheckInMthYr.XPath"));
		return this;
	}
	public FindHotelPage clickCheckOutYr(String CheckOutYr) {
		clickOptionByXpath(prop.getProperty("FindHotelPage.CheckInYear.XPath"), CheckOutYr);
		return this;
	}
	public FindHotelPage clickCheckOutMth(String CheckOutMth) {
		clickOptionByXpath(prop.getProperty("FindHotelPage.CheckInYear.XPath"), CheckOutMth);
		return this;
	}
	public FindHotelPage clickCheckOutDt(String CheckOutDate) {
		clickOptionByXpath(prop.getProperty("FindHotelPage.CheckInDt.XPath"), CheckOutDate);
		return this;
	}
//	public FindHotelPage clickCheckOutDt() {
//		clickByXpath(prop.getProperty("FindHotelPage.CheckOut.XPath"));
//		return this;
//	}
	public FindHotelPage clickUserData() {
		clickByXpath(prop.getProperty("FindHotelPage.UserData.XPath"));
		return this;
	}
	public FindHotelPage selectRooms(String Rooms) {
		selectValueByXpath(prop.getProperty("FindHotelPage.Rooms.XPath"), Rooms);
		return this;
	}
	public FindHotelPage selectAdults(String Adults) {
		selectValueByXpath(prop.getProperty("FindHotelPage.Adults.XPath"), Adults);
		return this;
	}
	public FindHotelPage clickDone() {
		clickByXpath(prop.getProperty("FindHotelPage.DoneButton.XPath"));
		return this;
	}
	public HotelsListPage clickFindHotel() {
		clickByXpath(prop.getProperty("FindHotelPage.FindHotel.XPath"));
		return new HotelsListPage();
	}
	public FindHotelPage waitTime(long time) {
		waitProperty(time);
		return this;
	}

	

}
