package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravelsregister.pages.PhpRegisterPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To Register new account in Php Travels for the new user";
		author="Prabha";
		category="Fundamental";		
		browserName="chrome";
		url="https://www.phptravels.org/register.php";
		sheetName="TC008";
		
	}
	@Test(dataProvider="fetchData")
	public void phpTravelsRegister(String firstName, String lastName, String email, String phone, String companyName, String address1, String address2, String city, String state, String postcode, String country, String mobile, String password, String confirmPassword) {
		
		new PhpRegisterPage()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmailAdd(email)
		.enterPhoneNo(phone)
		.enterCompanyName(companyName)
		.enterAddress1(address1)
		.enterAddress2(address2)
		.enterCity(city)
		.enterState(state)
		.enterPostcode(postcode)
		.selectCountry(country)
		.enterMobile(mobile)
		.enterPassword(password)
		.enterConfirmPwd(confirmPassword)
		.clickRegister()
		;
	}

}
