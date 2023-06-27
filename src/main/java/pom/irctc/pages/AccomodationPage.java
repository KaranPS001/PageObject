package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccomodationPage extends GenericWrappers{
	
	public AccomodationPage mouseHoverSideBar() {
		clickByXpathNoSnap(prop.getProperty("AccomodationPage.SideBar.XPath"));
		return new AccomodationPage();
	}
	public AccomodationPage clickCharter() {
		clickByXpath(prop.getProperty("AccomodationPage.Charter.XPath"));
		return this;
	}
	public AccomodationPage clickBookYourCoach() {
		clickByXpath(prop.getProperty("AccomodationPage.BookYourCoach.XPath"));
		return this;
	}
	public AccomodationPage clickHotels() {
		clickByXpath(prop.getProperty("AccomodationPage.HotelIcon.XPath"));
		return this;
	}
	public FtrLoginPage switchFtrLoginWindow() {
		switchToLastWindow();
		return new FtrLoginPage();
	}
	public CharterPage switchCharterWindow() {
		switchToLastWindow();
		return new CharterPage();
	}
	public LoginPage switchLoginWindow() {
		switchToLastWindow();
		return new LoginPage();
	}
	public AccomodationPage waitTime(long time) {
		waitProperty(time);
		return this;
	}
	
}
