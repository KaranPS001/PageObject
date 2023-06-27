package pom.facebook.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public SignUpPage clickonNewAccount() {
		clickByXpath(prop.getProperty("HomePage.CreateNewAccount.XPath"));
		return new SignUpPage();
	
	}
}
