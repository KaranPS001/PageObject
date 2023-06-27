package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GuestUserLoginPage extends GenericWrappers{
	
	public GuestUserLoginPage clickGuestLogin() {
		clickByXpath(prop.getProperty("GuestUserLoginPage.GuestLogin.XPath"));
		return new GuestUserLoginPage();
	}
	public GuestUserLoginPage enterEmail(String Email) {
		enterByXpath(prop.getProperty("GuestUserLoginPage.Email.XPath"), Email);
		return this;
	}
	public GuestUserLoginPage enterMobileNo(String MobileNo) {
		enterByXpath(prop.getProperty("GuestUserLoginPage.Mobileno.XPath"), MobileNo);
		return this;
	}
	public GuestUserLoginPage clickLoginButton() {
		clickByXpath(prop.getProperty("GuestUserLoginPage.LoginButton.XPath"));
		return this;
	}
	public FindHotelPage switchFindHotelWindow() {
		switchToDefault();
		return new FindHotelPage();
	}
	public GuestUserLoginPage waitTime(long time) {
		waitProperty(time);
		return this;
	}
	
}
