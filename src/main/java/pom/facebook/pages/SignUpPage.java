package pom.facebook.pages;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers{
	
	public SignUpPage enterFirstname(String FirstName) {
		enterByXpath(prop.getProperty("SignupPage.FirstName.XPath"), FirstName);
		return new SignUpPage();
	}
	public SignUpPage enterSurname(String LastName) {
		enterByXpath(prop.getProperty("SignupPage.LastName.XPath"), LastName);
		return this;
	}
	public SignUpPage enterEmail(String EmailId) {
		enterByXpath(prop.getProperty("SignupPage.EmailId.XPath"), EmailId);
		return this;
	}
	public SignUpPage enterConfirmEmail(String ConfirmEmailId) {
		enterByXpath(prop.getProperty("SignupPage.ConfirmEmailId.XPath"), ConfirmEmailId);
		return this;
	}
	public SignUpPage enterPassword(String Password) {
		enterByXpath(prop.getProperty("SignupPage.Password.XPath"), Password);
		return this;
	}
	public SignUpPage selectDate(String Date) {
		int date_dob = Integer.parseInt(Date);
		selectIndexByXpath(prop.getProperty("SignupPage.Date.XPath"), date_dob);
//		selectValueByXpath("//select[@id='day']", Date);
		return this;
	}
	public SignUpPage selectMonth(String Month) {
		int month_dob = Integer.parseInt(Month);
		selectIndexByXpath(prop.getProperty("SignupPage.Month.XPath"), month_dob);
		return this;
	}
	public SignUpPage selectYear(String Year) {
		selectValueByXpath(prop.getProperty("SignupPage.Year.XPath"), Year);
		return this;
	}
	public SignUpPage clickGender(String Gender) {
//		clickByXpath(prop.getProperty("SignupPage.Gender.XPath"), Gender);
//		clickByXpath(prop.getProperty("SignupPage.Gender.XPath"), Gender);
		clickOptionByXpath(prop.getProperty("SignupPage.Gender.XPath"), Gender);
		return this;
	}
	public SignUpPage clickSignUp() {
		clickByXpath(prop.getProperty("SignupPage.Signup.XPath"));
		return this;
	}

}
