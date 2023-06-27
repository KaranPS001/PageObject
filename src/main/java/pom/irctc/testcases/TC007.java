package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC007";
		testCaseDescription="To verify Facebook Sign up for the new user";
		author="Prabha";
		category="Smoke";
		browserName="chrome";
		url="https://www.facebook.com";
		sheetName="TC007";
	}
	
	@Test(dataProvider = "fetchData")
	public void facebookSignUp(String FirstName, String LastName, String EmailId, String ConfirmEmailId
			,String Password, String Date, String Month, String Year, String Gender) {
		
		new HomePage()
		.clickonNewAccount()
		.enterFirstname(FirstName)
		.enterSurname(LastName)
		.enterEmail(EmailId)
		.enterConfirmEmail(ConfirmEmailId)
		.enterPassword(Password)
		.selectDate(Date)
		.selectMonth(Month)
		.selectYear(Year)
		.clickGender(Gender)
		.clickSignUp()
		;
	}

}
