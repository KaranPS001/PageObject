package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers	{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To Verify Ftr Signup for the new user";
		author="Prabha";
		category="smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC002";
	}
	@Test(dataProvider = "fetchData")
	
	public void bookYourCoach(String UserId, String Password, String ConfirmPwd, String secque, String SecAns, String month, String Year, String Date, String Gender, String Marital, String EmailId, String occupation, String FirstName, String MiddleName, String LastName, String Nationality, String DoorNo, String Street, String Area, String Country, String MobileNo, String Pincode, String City, String State, String postoffice, String SameAddress, String C_Door, String C_Street, String C_Area, String C_Country, String C_MobileNo, String C_Pincode, String C_City, String C_State, String c_postoffice){
		
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickLounge()
		.switchLastWindow()
		.mouseHoverSideBar()
		.clickBookYourCoach()
		.switchFtrLoginWindow()
		.clickSignup()
		.enterUserid(UserId)
		.enterPassword(Password)
		.enterCnfPassword(ConfirmPwd)
		.selectSecQue(secque)
		.enterSecAns(SecAns)
		.clickDob()
		.selectMonth(month)
		.selectYear(Year)
		.clickDate(Date)
		.clickGender(Gender)
		.clickMarital(Marital)
		.enterEmail(EmailId)
		.waitTime(2000)
		.selectOccupation(occupation)
		.enterFirstName(FirstName)
		.enterMiddleName(MiddleName)
		.enterLastName(LastName)
		.selectNationality(Nationality)
		.sendKeysPagedown()
		.enterDoorNo(DoorNo)
		.enterStreet(Street)
		.enterArea(Area)
		.selectCountry(Country)
		.enterMobileNo(MobileNo)
		.enterPincode(Pincode)
		.sendKeysTab()
		.selectPostOffice(postoffice)
		.clickAddressButton(SameAddress)
		.sendKeysPagedown()
		.enterC_Door(C_Door)
		.enterC_Street(C_Street)
		.enterC_Area(C_Area)
		.selectC_Country(C_Country)
		.enterC_Mobile(C_MobileNo)
		.enterC_Pincode(C_Pincode)
		.sendKeysTab()
		.selectC_PostOffice(c_postoffice)
		.sendKeysPagedown()
		.clickProfileButton()
		;
	}

}
