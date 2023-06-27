package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrLoginPage extends GenericWrappers{

	public FtrPage clickSignup() {
		clickByXpath(prop.getProperty("FtrLoginPage.SignUp.XPath"));
			return new FtrPage();
	}
	}
