package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {

	public FrroRegistrationPage clickOnSignUp() {
	 clickByXpathNoSnap(prop.getProperty("HomePage.Signup.XPath"));
	 return new FrroRegistrationPage();
	}
}
