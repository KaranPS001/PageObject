package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage enterUserName(String Username) {
		enterByXpath(prop.getProperty("RegistrationPage.UserName.XPath"), Username);
		return new RegistrationPage();
	}
	public RegistrationPage enterPassword(String Password) {
		enterByXpath(prop.getProperty("RegistrationPage.Password.XPath"), Password);
		return this;
	}
	public RegistrationPage enterConfirmPassword(String ConfirmPwd) {
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.XPath"), ConfirmPwd);
		return this;
	}
	public RegistrationPage clickPreferredLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.PreferredLang.XPath"));
		return this;
	}
	public RegistrationPage clickLanguage(String Language) {
		clickOptionByXpath(prop.getProperty("RegistrationPage.Language.XPath"), Language);
		return this;
	}
	public RegistrationPage clickSecQuestion() {
		clickByXpath(prop.getProperty("RegistrationPage.SecQuestion.XPath"));
		return new RegistrationPage();
	}

//	public RegistrationPage selectQuestion(String SecQues) {
//		clickByXpath(prop.getProperty("RegistrationPage.Question.XPath"), SecQues);
//		return new RegistrationPage();
//	}
	public RegistrationPage clickSecQueOption(String SecQues) {
		clickOptionByXpath(prop.getProperty("RegistrationPage.Question.XPath"), SecQues);
		return this;
	}
	public RegistrationPage enterSecAnswer(String SecAnswer) {
		enterByXpath(prop.getProperty("RegistrationPage.SecAnswer.XPath"), SecAnswer);
		return new RegistrationPage();
	}
	public RegistrationPage clickContinue() {
		clickByXpath(prop.getProperty("RegistrationPage.ContinueButton.XPath"));
		return this;
	}
	public HomePage clickCancel() {
		clickByXpath(prop.getProperty("RegistrationPage.CancelButton.XPath"));
		return new HomePage();
	}
	public RegistrationPage enterFirstName(String Firstname) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstName.XPath"), Firstname);
		return this;
	}
	public RegistrationPage enterMiddleName(String Middlename) {
		enterByXpath(prop.getProperty("RegistrationPage.MiddleName.XPath"), Middlename);
		return this;
	}
	public RegistrationPage enterLastName(String Lastname) {
		enterByXpath(prop.getProperty("RegistrationPage.LastName.XPath"), Lastname);
		return this;
	}
	public RegistrationPage clickOccupation() {
		clickByXpath(prop.getProperty("RegistrationPage.Occupation.XPath"));
		return this;
	}
	public RegistrationPage clickOccOption(String Occupation) {
//		clickByXpath(prop.getProperty("RegistrationPage.SelectOcc.XPath"), Occupation);
		clickOptionByXpath(prop.getProperty("RegistrationPage.SelectOcc.XPath"), Occupation);
		return this;
	}
	public RegistrationPage enterDateOfBirth(String Dob) {
		enterByXpath(prop.getProperty("RegistrationPage.DateOfBirth.XPath"), Dob);
		return this;
	}
	public RegistrationPage clickMaritals(String Maritals) {
		clickOptionByXpath(prop.getProperty("RegistrationPage.MaritalStatus.XPath"), Maritals);
		return this;
	}
	public RegistrationPage selectCountry(String Country) {
		selectValueByXpath(prop.getProperty("RegistrationPage.Country.XPath"), Country);
		return this;
	}		
	public RegistrationPage clickGender(String Gender) {
		clickOptionByXpath(prop.getProperty("RegistrationPage.Gender.XPath"), Gender);
		return this;
	}
	public RegistrationPage enterEmail(String Email) {
		enterByXpath(prop.getProperty("RegistrationPage.Email.XPath"), Email);
		return this;
		}
	public RegistrationPage enterMobile(String Mobile) {
		enterByXpath(prop.getProperty("RegistrationPage.Mobile.XPath"), Mobile);
		return this;
	}
	public RegistrationPage selectNationality(String Nationality) {
		selectValueByXpath(prop.getProperty("RegistrationPage.Nationality.XPath"), Nationality);
		return this;
	}		
	public RegistrationPage enterAddress1(String DoorNo) {
		enterByXpath(prop.getProperty("RegistrationPage.DoorNo.XPath"), DoorNo);
		return this;
	}
	public RegistrationPage enterAddress2(String Street) {
		enterByXpath(prop.getProperty("RegistrationPage.Street.XPath"), Street);
		return this;
	}
	public RegistrationPage enterAddress3(String Area) {
		enterByXpath(prop.getProperty("RegistrationPage.Area.XPath"), Area);
		return this;
	}
	public RegistrationPage enterPincode(String Pincode) {
		enterByXpath(prop.getProperty("RegistrationPage.Pincode.XPath"), Pincode);
		return this;
	}
	public RegistrationPage enterState(String State) {
		enterByXpath(prop.getProperty("RegistrationPage.State.XPath"), State);
		return this;
	}
	public RegistrationPage selectCity(String City) {
		int city = Integer.parseInt(City);
		selectIndexByXpath(prop.getProperty("RegistrationPage.City.XPath"), city);
		return this;		
	}
	public RegistrationPage selectPostoffice(String Postoffice) {
		int postoffice = Integer.parseInt(Postoffice);
//		selectValueByXpath(prop.getProperty("RegistrationPage.Postoffice.XPath"), Postoffice);
		selectIndexByXpath(prop.getProperty("RegistrationPage.Postoffice.XPath"), postoffice);
		return this;
	}
	public RegistrationPage enterPhone(String Phone) {
		enterByXpath(prop.getProperty("RegistrationPage.Phone.XPath"), Phone);
		return this;
	}
	public RegistrationPage clickResRadio(String CopyAddress) {
		clickOptionByXpath(prop.getProperty("RegistrationPage.CopyAddress.XPath"), CopyAddress);
		return this;
	}
	public RegistrationPage enterOffAddress1(String OffDoorNo) {
		enterByXpath(prop.getProperty("RegistrationPage.OffDoorNo.XPath"), OffDoorNo);
		return this;
	}
	public RegistrationPage enterOffAddress2(String OffStreet) {
		enterByXpath(prop.getProperty("RegistrationPage.OffStreet.XPath"), OffStreet);
		return this;
	}
	public RegistrationPage enterOffAddress3(String OffArea) {
		enterByXpath(prop.getProperty("RegistrationPage.OffArea.XPath"), OffArea);
		return this;
	}
	public RegistrationPage clickOffCountry() {
		clickByXpath(prop.getProperty("RegistrationPage.OffCountry.XPath"));
		return this;
	}
	public RegistrationPage clickOffConOption(String OffCountry) {
		clickOptionByXpath(prop.getProperty("RegistrationPage.Off_Country.XPath"), OffCountry);
		return this;
	}
	public RegistrationPage enterOffPincode(String OffPincode) {
		enterByXpath(prop.getProperty("RegistrationPage.OffPincode.XPath"), OffPincode);
		return this;
	}
	public RegistrationPage enterOffState(String OffState) {
		enterByXpath(prop.getProperty("RegistrationPage.OffState.XPath"), OffState);
		return this;
	}
	public RegistrationPage enterOffCity(String OffCity) {
		enterByXpath(prop.getProperty("RegistrationPage.OffCity.XPath"), OffCity);
		return this;		
	}
	public RegistrationPage enterOffPostOffice(String OffPostOffice) {
		enterByXpath(prop.getProperty("RegistrationPage.OffPostOffice.XPath"), OffPostOffice);
		return this;
	}
	public RegistrationPage enterOffPhone(String OffPhone) {
		enterByXpath(prop.getProperty("RegistrationPage.OffPhone.XPath"), OffPhone);
		return this;
	}
	public RegistrationPage clickCheckbox() {
		clickByXpathNoSnap(prop.getProperty("RegistrationPage.Checkbox.XPath"));
		return this;
	}
	public RegistrationPage clickRegisterButton() {
		clickByXpathNoSnap(prop.getProperty("RegistrationPage.RegisterButton.XPath"));
		return new RegistrationPage();
	}
	public RegistrationPage waitTime(long time) {
		waitProperty(time);
		return this;
	}
	public RegistrationPage sendKeysPagedown() {
		sendkeysPageDown();
		return this;
	}
	}
	
	
