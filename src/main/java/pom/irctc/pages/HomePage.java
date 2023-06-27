package pom.irctc.pages;


import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public RegistrationPage clickOnRegister() {		
		clickByXpathNoSnap(prop.getProperty("HomePage.Register.XPath"));		
		return new RegistrationPage();
	}
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXpath(prop.getProperty("HomePage.Holidays.XPath"));
		return this;
	}	
	public HomePage mouseHoverOnStays() {
		mouseHoverByXpath(prop.getProperty("HomePage.Stays.XPath"));
		return this;
	}
	public HomePage clickLounge() {
		clickByXpath(prop.getProperty("HomePage.Lounge.XPath"));
		return this;
	}
	public AccomodationPage switchLastWindow() {
		switchToLastWindow();
		return new AccomodationPage();
	}
	
	}
	
