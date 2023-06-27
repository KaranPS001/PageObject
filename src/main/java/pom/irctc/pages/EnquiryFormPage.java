package pom.irctc.pages;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers{
	
	public EnquiryFormPage enterName(String Name) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Name.XPath"), Name);
		return this;
	}
	public EnquiryFormPage enterOrganisation(String Organization) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Organisation.XPath"), Organization);
		return this;
	}
	public EnquiryFormPage enterAddress(String Address) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Address.XPath"), Address);
		return this;
	}
	public EnquiryFormPage enterMobile(String Mobile) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Mobile.XPath"), Mobile);
		return this;
	}
	public EnquiryFormPage enterEmail(String Email) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Email.XPath"), Email);
		return this;
	}
	public EnquiryFormPage selectRequestFor(String RequestFor) {
		int request_for = Integer.parseInt(RequestFor);
		selectIndexByXpath(prop.getProperty("EnquiryFormPage.RequestFor.XPath"), request_for);
		return this;
	}
	public EnquiryFormPage sendKeysPagedown() {
		sendkeysPageDown();
		return this;
	}
	public EnquiryFormPage sendKeysTab() {
		sendkeysTab();
		return this;
	}
	public EnquiryFormPage enterOriginStation(String Origin) {
		enterByXpath(prop.getProperty("EnquiryFormPage.OriginSta.XPath"), Origin);
		return this;
	}
	public EnquiryFormPage enterDestnStation(String Dest) {
		enterByXpath(prop.getProperty("EnquiryFormPage.DestnSta.XPath"), Dest);
		return this;
	}
	public EnquiryFormPage clickDept() {
		clickByXpath(prop.getProperty("EnquiryFormPage.CheckInDate.XPath"));
		return this;
	}
	public EnquiryFormPage clickDeptMthYr(String DeptMthYr) {
		clickOptionByXpath(prop.getProperty("EnquiryFormPage.DeptMthYr.XPath"), DeptMthYr);
		return this;
	}
	public EnquiryFormPage clickDeptDate(String DeptDate) {
		clickOptionByXpath(prop.getProperty("EnquiryFormPage.DeptDate.XPath"), DeptDate);
		return this;
	}
	public EnquiryFormPage clickDeptMonth() {
		clickByXpath(prop.getProperty("EnquriyFormPage.DeptMonth.XPath"));
		return this;
	}
	public EnquiryFormPage selectDeptYear(String DeptYear) {
		selectValueByXpath(prop.getProperty("EnquiryFormPage.DeptYear.XPath"), DeptYear);
		return this;
	}
	public EnquiryFormPage clickDeptDate() {
		clickByXpath(prop.getProperty("EnquiryFormPage.DeptDate.XPath"));
		return this;
	}
	public EnquiryFormPage clickArr() {
		clickByXpath(prop.getProperty("EnquiryFormPage.CheckOutDate.XPath"));
		return this;
	}
	public EnquiryFormPage clickArrMthYr(String ArrMthYr) {
		clickOptionByXpath(prop.getProperty("EnquiryFormPage.DeptMthYr.XPath"), ArrMthYr);
		return this;
	}
	public EnquiryFormPage clickArrDate(String ArrDate) {
		clickOptionByXpath(prop.getProperty("EnquiryFormPage.ArrDate.XPath"), ArrDate);
		return this;
	}
	public EnquiryFormPage clickArrMonth() {
		clickByXpath(prop.getProperty("EnquiryFormPage.ArrMonth.XPath"));
		return this;
	}
	public EnquiryFormPage selectArrYear(String ArrYear) {
		selectValueByXpath(prop.getProperty("EnquiryFormPage.ArrYear.XPath"), ArrYear);
		return this;
	}
	public EnquiryFormPage clickArrDate() {
		clickByXpath(prop.getProperty("EnquiryFormPage.ArrDate.XPath"));
		return this;
	}
	public EnquiryFormPage enterDurationPeriod(String DurPeriod) {
		enterByXpath(prop.getProperty("EnquiryFormPage.DurPeriod.XPath"), DurPeriod);
		return this;
	}
	public EnquiryFormPage enterTypeofCoach(String TypeOfCoach) {
		enterByXpath(prop.getProperty("EnquiryFormPage.TypeOfCoach.XPath"), TypeOfCoach);
		return this;
	}	
	public EnquiryFormPage enterNoOfPassengers(String NoOfPassengers) {
		enterByXpath(prop.getProperty("EnquiryFormPage.NoOfPassengers.XPath"), NoOfPassengers);
		return this;
	}
	public EnquiryFormPage enterPurpose(String Purpose) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Purpose.XPath"), Purpose);
		return this;
	}
	public EnquiryFormPage enterAddServices(String AddServicesReq) {
		enterByXpath(prop.getProperty("EnquiryFormPage.AddServices.XPath"), AddServicesReq);
		return this;
	}
	public EnquiryFormPage clickSubmit() {
		clickByXpath(prop.getProperty("EnquiryFormPage.SubmitButton.XPath"));
			return this;
	}
	public EnquiryFormPage verifyMobileNo(String Alert) {
		verifyTextByXpath(prop.getProperty("EnquiryFormPage.Alert.XPath"), Alert);
		return this;
	}
	public EnquiryFormPage waitTime(long time) {
		waitProperty(time);
		return this;
	}

}

