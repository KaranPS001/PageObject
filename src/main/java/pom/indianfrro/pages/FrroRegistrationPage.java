package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class FrroRegistrationPage extends GenericWrappers {
	
	public FrroRegistrationPage enterUserId(String Userid) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.UserId.XPath"), Userid);		
		return new FrroRegistrationPage();
	}
	public FrroRegistrationPage enterPassword(String Password) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Password.XPath"), Password);
		return this;
	}
	public FrroRegistrationPage enterCnfPassword(String ConfirmPwd) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.ConfirmPwd.XPath"), ConfirmPwd);
		return this;
	}
	public FrroRegistrationPage selectSecQue(String SecQue) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.SecQue.XPath"), SecQue);
		return this;
	}
	public FrroRegistrationPage enterSecAns(String SecAns) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.SecAns.XPath"), SecAns);
		return this;
	}
	public FrroRegistrationPage enterUserName(String Name) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Name.XPath"), Name);
		return this;
	}
	public FrroRegistrationPage selectGender(String Gender) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.Gender.XPath"), Gender);
		return this;
	}
	public FrroRegistrationPage enterDob(String Dob) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Dob.XPath"), Dob);
		return this;
	}
	public FrroRegistrationPage enterDesignation(String Designation) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Designation.XPath"), Designation);
		return this;
	}
	public FrroRegistrationPage enterEmailId(String Emailid) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Emailid.XPath"), Emailid);
		return this;
	}
	public FrroRegistrationPage enterMobile(String Mobile) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Mobile.XPath"), Mobile);
		return this;
	}
	public FrroRegistrationPage enterPhone(String PhoneNo) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.PhoneNo.XPath"), PhoneNo);
		return this;
	}
	public FrroRegistrationPage selectNationality(String Nationality) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.Nationality.XPath"), Nationality);
		return this;
	}
	public FrroRegistrationPage enterH_Name(String H_Name) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.H_Name.XPath"), H_Name);
		return this;
	}
	public FrroRegistrationPage enterH_Capacity(String H_Capacity) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.H_Capacity.XPath"), H_Capacity);
		return this;
	}
	public FrroRegistrationPage enterH_Address(String H_Address) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.H_Address.XPath"), H_Address);
		return this;
	}
	public FrroRegistrationPage selectH_State(String H_State) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.H_State.XPath"), H_State);
		return this;
	}
	public FrroRegistrationPage selectH_City(String H_City) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.H_City.XPath"), H_City);
		return this;
	}
	public FrroRegistrationPage selectH_AccType(String H_AccType) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.H_AccType.XPath"), H_AccType);
		return this;
	}
	public FrroRegistrationPage selectH_FrroDes(String H_FrroDes) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.H_FrroDes.XPath"), H_FrroDes);
		return this;
	}
	public FrroRegistrationPage selectH_AccGrade(String H_AccGrade) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.H_AccGrade.XPath"), H_AccGrade);
		return this;
	}
	public FrroRegistrationPage enterH_EmailId(String H_EmailId) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.H_EmailId.XPath"), H_EmailId);
		return this;
	}
	public FrroRegistrationPage enterH_Mobile(String H_Mobile) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.H_Mobile.XPath"), H_Mobile);
		return this;
	}
	public FrroRegistrationPage enterH_PhoneNo(String H_PhoneNo) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.H_PhoneNo.XPath"), H_PhoneNo);
		return this;
	}
	public FrroRegistrationPage enterO1_Name(String O1_Name) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O1_Name.XPath"), O1_Name);
		return this;
	}
	public FrroRegistrationPage enterO1_Address(String O1_Address) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O1_Address.XPath"), O1_Address);
		return this;
	}
	public FrroRegistrationPage selectO1_State(String O1_State) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.O1_State.XPath"), O1_State);
		return this;
	}
	public FrroRegistrationPage selectO1_City(String O1_City) {
		selectValueByXpath(prop.getProperty("FrroRegsitrationPage.O1_City.XPath"), O1_City);
		return this;
	}
	public FrroRegistrationPage enterO1_EmailId(String O1_EmailId) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O1_EmailId.XPath"), O1_EmailId);
		return this;
	}
	public FrroRegistrationPage enterO1_Phone(String O1_Phone) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O1_Phone.XPath"), O1_Phone);
		return this;
	}
	public FrroRegistrationPage enterO1_Mobile(String O1_Mobile) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O1_Mobile.XPath"), O1_Mobile);
		return this;
	}
	public FrroRegistrationPage enterO2_Name(String O2_Name) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O2_Name.XPath"), O2_Name);
		return this;
	}
	public FrroRegistrationPage enterO2_Address(String O2_Address) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O2_Address.XPath"), O2_Address);
		return this;
	}
	public FrroRegistrationPage selectO2_State(String O2_State) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.O2_State.XPath"), O2_State);
		return this;
	}
	public FrroRegistrationPage selectO2_City(String O2_City) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.O2_City.XPath"), O2_City);
		return this;
	}
	public FrroRegistrationPage enterO2_EmailId(String O2_EmailId) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O2_EmailId.XPath"), O2_EmailId);
		return this;
	}
	public FrroRegistrationPage enterO2_Phone(String O2_Phone) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O2_Phone.XPath"), O2_Phone);
		return this;
	}
	public FrroRegistrationPage enterO2_Mobile(String O2_Mobile) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O2_Mobile.XPath"), O2_Mobile);
		return this;
	}
	public FrroRegistrationPage enterO3_Name(String O3_Name) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O3_Name.XPath"), O3_Name);
		return this;
	}
	public FrroRegistrationPage enterO3_Address(String O3_Address) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O3_Address.XPath"), O3_Address);
		return this;
	}
	public FrroRegistrationPage selectO3_State(String O3_State) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.O3_State.XPath"), O3_State);
		return this;
	}
	public FrroRegistrationPage selectO3_City(String O3_City) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.O3_City.XPath"), O3_City);
		return this;
	}
	public FrroRegistrationPage enterO3_EmailId(String O3_EmailId) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O3_EmailId.XPath"), O3_EmailId);
		return this;
	}
	public FrroRegistrationPage enterO3_Phone(String O3_Phone) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O3_Phone.XPath"), O3_Phone);
		return this;
	}
	public FrroRegistrationPage enterO3_Mobile(String O3_Mobile) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.O3_Mobile.XPath"), O3_Mobile);
		return this;
	}
	public FrroRegistrationPage clickAdd() {
		clickByXpath(prop.getProperty("FrroRegistrationPage.Add.XPath"));
		return this;
	}
	public FrroRegistrationPage clickDelete() {
		clickByXpath(prop.getProperty("FrroRegistrationPage.Delete.XPath"));
		return this;
	}
	public FrroRegistrationPage clickSubmit() {
		clickByXpathNoSnap(prop.getProperty("FrroRegistrationPage.Submit.XPath"));
		return new FrroRegistrationPage();
	}
	public FrroRegistrationPage waitTime() {
		waitProperty(3000);
		return this;
	}
	public FrroRegistrationPage PageDown() {
		sendkeysPageDown();
		return this;
	}
	}

