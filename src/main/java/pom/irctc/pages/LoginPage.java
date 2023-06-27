package pom.irctc.pages;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers{
	
	public GuestUserLoginPage clickLogin() {
		clickByXpath(prop.getProperty("LoginPage.Login.XPath"));
		return new GuestUserLoginPage();
	}
	
}
