package pom.sscregistration.pages;

import wrappers.GenericWrappers;

public class SscRegistrationPage extends GenericWrappers{
	
	public SscRegistrationPage clickAadhar() {
		clickByXpath(prop.getProperty("SscRegistrationPage.ClickAadhar.XPath"));
		return this;
	}
	public SscRegistrationPage enterAadharNo(String AadharNo) {
		enterByXpath(prop.getProperty("SscRegistrationPage.AadharNo.XPath"), AadharNo);
		return this;
	}
	public SscRegistrationPage enterV_AadharNo(String V_AadharNo) {
		enterByXpath(prop.getProperty("SscRegistrationPage.V_AadharNo.XPath"), V_AadharNo);
		return this;
	}
	public SscRegistrationPage enterName(String Name) {
		enterByXpath(prop.getProperty("SscRegistrationPage.Name.XPath"), Name);
		return this;
	}
	public SscRegistrationPage enterV_Name(String V_Name) {
		enterByXpath(prop.getProperty("SscRegistrationPage.V_Name.XPath"), V_Name);
		return this;
	}
	public SscRegistrationPage clickNameChange() {
		clickByXpath(prop.getProperty("SscRegistrationPage.NameChange.XPath"));
		return this;
	}
	public SscRegistrationPage enterNewName(String ChangedName) {
		enterByXpath(prop.getProperty("SscRegistrationPage.NewName.XPath"), ChangedName);
		return this;
	}
	public SscRegistrationPage enterFatherName(String FatherName) {
		enterByXpath(prop.getProperty("SscRegistrationPage.FatherName.XPath"), FatherName);
		return this;
	}
	public SscRegistrationPage enterV_FatherName(String V_FatherName) {
		enterByXpath(prop.getProperty("SscRegistrationPage.V_FatherName.XPath"), V_FatherName);
		return this;
	}
	public SscRegistrationPage enterMotherName(String MotherName) {
		enterByXpath(prop.getProperty("SscRegistrationPage.MotherName.XPath"), MotherName);
		return this;
	}
	public SscRegistrationPage enterV_MotherName(String V_MotherName) {
		enterByXpath(prop.getProperty("SscRegistrationPage.V_MotherName.XPath"), V_MotherName);
		return this;
	}
	public SscRegistrationPage enterDob(String DOB) {
		enterByXpath(prop.getProperty("SscRegistrationPage.Dob.XPath"), DOB);
		return this;
	}
	public SscRegistrationPage enterV_Dob(String V_DOB) {
		enterByXpath(prop.getProperty("SscRegistrationPage.V_Dob.XPath"), V_DOB);
		return this;
	}
	public SscRegistrationPage selectEduBoard(String EduBoard) {
		selectValueByXpath(prop.getProperty("SscRegistrationPage.EduBoard.XPath"), EduBoard);
		return this;
	}
	public SscRegistrationPage selectV_EduBoard(String V_EduBoard) {
		selectValueByXpath(prop.getProperty("SscRegistrationPage.V_EduBoard.XPath"), V_EduBoard);
		return this;
	}
	public SscRegistrationPage enterRollNo(String RollNo) {
		enterByXpath(prop.getProperty("SscRegistrationPage.RollNo.XPath"), RollNo);
		return this;
	}
	public SscRegistrationPage enterV_RollNo(String V_RollNo) {
		enterByXpath(prop.getProperty("SscRegistrationPage.V_RollNo.XPath"), V_RollNo);
		return this;
	}
	public SscRegistrationPage selectYrOfPassing(String YrOfPassing) {
		selectValueByXpath(prop.getProperty("SscRegistrationPage.YrOfPassing.XPath"), YrOfPassing);
		return this;
	}
	public SscRegistrationPage selectV_YrOfPassing(String V_YrOfPassing) {
		selectValueByXpath(prop.getProperty("SscRegistrationPage.V_YrOfPassing.XPath"), V_YrOfPassing);
		return this;
	}
	public SscRegistrationPage clickGender(String Gender) {
		clickByXpath(prop.getProperty("SscRegistrationPage.Gender.XPath"), Gender);
		return this;
	}
	public SscRegistrationPage clickV_Gender(String V_Gender) {
		clickByXpath(prop.getProperty("SscRegistrationPage.V_Gender.XPath"), V_Gender);
		return this;
	}
	public SscRegistrationPage selectEduQual(String EduQual) {
		selectValueByXpath(prop.getProperty("SscRegistrationPage.EduQual.XPath"), EduQual);
		return this;
	}
	public SscRegistrationPage enterMobileNo(String MobileNo) {
		enterByXpath(prop.getProperty("SscRegistrationPage.MobileNo.XPath"), MobileNo);
		return this;
	}
	public SscRegistrationPage enterV_MobileNo(String V_MobileNo) {
		enterByXpath(prop.getProperty("SscRegistrationPage.V_MobileNo.XPath"), V_MobileNo);
		return this;
	}
	public SscRegistrationPage enterEmailId(String EmailId) {
		enterByXpath(prop.getProperty("SscRegistrationPage.EmailId.XPath"), EmailId);
		return this;
	}
	public SscRegistrationPage enterV_EmailId(String V_EmailId) {
		enterByXpath(prop.getProperty("SscRegistrationPage.V_EmailId.XPath"), V_EmailId);
		return this;
	}
	public SscRegistrationPage selectState(String State) {
		selectValueByXpath(prop.getProperty("SscRegistrationPage.State.XPath"), State);
		return this;
	}
	public SscRegistrationPage clickSaveButton() {
		clickByXpathNoSnap(prop.getProperty("SscRegistrationPage.SaveButton.XPath"));
		return this;
	}
}
