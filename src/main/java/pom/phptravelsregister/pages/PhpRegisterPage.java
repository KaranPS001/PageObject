package pom.phptravelsregister.pages;

import wrappers.GenericWrappers;

public class PhpRegisterPage extends GenericWrappers{
	
	public PhpRegisterPage enterFirstName(String firstName) {
		enterByXpath(prop.getProperty("PhpRegisterPage.FirstName.XPath"), firstName);
		return new PhpRegisterPage();
	}
	public PhpRegisterPage enterLastName(String lastName) {
		enterByXpath(prop.getProperty("PhpRegisterPage.LastName.XPath"), lastName);
		return this;
	}
	public PhpRegisterPage enterEmailAdd(String email) {
		enterByXpath(prop.getProperty("PhpRegisterPage.Email.XPath"), email);
		return this;
	}
	public PhpRegisterPage enterPhoneNo(String Phone) {
		enterByXpath(prop.getProperty("PhpRegisterPage.PhoneNo.XPath"), Phone);
		return this;
	}
	public PhpRegisterPage enterCompanyName(String companyName) {
		enterByXpath(prop.getProperty("PhpRegisterPage.CompanyName.XPath"), companyName);
		return this;
	}
	public PhpRegisterPage enterAddress1(String address1) {
		enterByXpath(prop.getProperty("PhpRegisterPage.Address1.XPath"), address1);
		return this;
	}
	public PhpRegisterPage enterAddress2(String address2) {
		enterByXpath(prop.getProperty("PhpRegisterPage.Address2.XPath"), address2);
		return this;
	}
	public PhpRegisterPage enterCity(String city) {
		enterByXpath(prop.getProperty("PhpRegisterPage.City.XPath"), city);
		return this;
	}
	public PhpRegisterPage enterState(String state) {
		enterByXpath(prop.getProperty("PhpRegisterPage.State.XPath"), state);
		return this;
	}
	public PhpRegisterPage enterPostcode(String postcode) {
		enterByXpath(prop.getProperty("PhpRegisterPage.Postcode.XPath"), postcode);
		return this;
	}
	public PhpRegisterPage selectCountry(String country) {
		selectValueByXpath(prop.getProperty("PhpRegisterPage.Country.XPath"), country);
		return this;
	}
	public PhpRegisterPage enterMobile(String mobile) {
		enterByXpath(prop.getProperty("PhpRegisterPage.Mobile.XPath"), mobile);
		return this;
	}
	public PhpRegisterPage enterPassword(String password) {
		enterByXpath(prop.getProperty("PhpRegisterPage.Password.XPath"), password);
		return this;
	}
	public PhpRegisterPage enterConfirmPwd(String confirmPassword) {
		enterByXpath(prop.getProperty("PhpRegisterPage.ConfirmPassword.XPath"), confirmPassword);
		return this;
	}
	public PhpRegisterPage clickRegister() {
		clickByXpathNoSnap(prop.getProperty("PhpRegisterPage.RegisterButtor.XPath"));
		return this;
	}
}
