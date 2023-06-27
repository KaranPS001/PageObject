package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
		
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To Verify Irctc Registration for the new user";
		author="Prabha";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC001";
	}
	
	@Test(dataProvider = "fetchData")
	public void irctcRegistration(String Username, String Password, String ConfirmPwd, String Language, String SecQues, String SecAnswer, String Firstname, String Middlename, String Lastname, String Occupation, String Dob,String Maritals, String Country, String Gender, String Email, String Mobile, String Nationality, String DoorNo, String Street, String Area, String Pincode, String State, String city, String postoffice, String Phone, String CopyAddress, String OffDoorNo, String OffStreet, String OffArea, String OffCountry, String OffPincode, String OffState, String OffCity, String OffPostOffice, String OffPhone) {
		
		new HomePage()
		.clickOnRegister()
		.enterUserName(Username)
		.enterPassword(Password)
		.enterConfirmPassword(ConfirmPwd)
		.clickPreferredLanguage()
		.clickLanguage(Language)
		.clickSecQuestion()
		.clickSecQueOption(SecQues)
		.enterSecAnswer(SecAnswer)
		.clickContinue()
		.enterFirstName(Firstname)
		.enterMiddleName(Middlename)
		.enterLastName(Lastname)
		.clickOccupation()
		.clickOccOption(Occupation)
		.enterDateOfBirth(Dob)
		.clickMaritals(Maritals)
		.selectCountry(Country)
		.clickGender(Gender)
		.enterEmail(Email)
		.enterMobile(Mobile)
		.selectNationality(Nationality)
		.clickContinue()
		.enterAddress1(DoorNo)
		.enterAddress2(Street)
		.enterAddress3(Area)
		.enterPincode(Pincode)
		.enterState(State)
		.selectCity(city)
		.waitTime(1000)
		.selectPostoffice(postoffice)
		.enterPhone(Phone)
		.clickResRadio(CopyAddress)
		.enterOffAddress1(OffDoorNo)
		.enterOffAddress2(OffStreet)
		.enterOffAddress3(OffArea)
		.clickOffCountry()
		.waitTime(1000)
		.clickOffConOption(OffCountry)
		.enterOffPincode(OffPincode)
		.enterOffState(OffState)
		.waitTime(1000)
		.enterOffCity(OffCity)
		.enterOffPostOffice(OffPostOffice)
		.enterOffPhone(OffPhone)
		.sendKeysPagedown()
		.clickRegisterButton()
		;		
	}

}
