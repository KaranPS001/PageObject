package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.indianfrro.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	@BeforeClass
		public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To verify Frro registration for the new user";
		browserName="chrome";
		author="Prabha";
		category="smoke";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		sheetName="TC006";
		
	}
	@Test(dataProvider="fetchData")
	public void indiaFrro(String Userid, String Password, String ConfirmPwd, String SecQue, String SecAns, String Name, String Gender, String Dob, String Designation, String Emailid, String Mobile, String PhoneNo, String Nationality, String H_Name, String H_Capacity, String H_Address, String H_State, String H_City, String H_FrroDes, String H_AccType, String H_AccGrade, String H_EmailId, String H_Mobile, String H_PhoneNo, String O1_Name, String O1_Address, String O1_State, String O1_City, String O1_EmailId, String O1_Phone, String O1_Mobile, String O2_Name, String O2_Address, String O2_State, String O2_City, String O2_EmailId, String O2_Phone, String O2_Mobile, String O3_Name, String O3_Address, String O3_State, String O3_City, String O3_EmailId, String O3_Phone, String O3_Mobile) {
		
		new HomePage()
		.clickOnSignUp()
		.enterUserId(Userid)
		.enterPassword(Password)
		.enterCnfPassword(ConfirmPwd)
		.selectSecQue(SecQue)
		.enterSecAns(SecAns)
		.enterUserName(Name)
		.selectGender(Gender)
		.enterDob(Dob)
		.enterDesignation(Designation)
		.enterEmailId(Emailid)
		.enterMobile(Mobile)
		.enterPhone(PhoneNo)
		.selectNationality(Nationality)
		.enterH_Name(H_Name)
		.enterH_Capacity(H_Capacity)
		.enterH_Address(H_Address)
		.selectH_State(H_State)
		.waitTime()
		.selectH_City(H_City)
		.selectH_FrroDes(H_FrroDes)
		.selectH_AccType(H_AccType)
		.selectH_AccGrade(H_AccGrade)
		.enterH_EmailId(H_EmailId)
		.enterH_Mobile(H_Mobile)
		.enterH_PhoneNo(H_PhoneNo)
		.enterO1_Name(O1_Name)
		.enterO1_Address(O1_Address)
		.selectO1_State(O1_State)
		.waitTime()
		.selectO1_City(O1_City)
		.enterO1_EmailId(O1_EmailId)
		.enterO1_Phone(O1_Phone)
		.enterO1_Mobile(O1_Mobile)
		.clickAdd()
		.waitTime()
		.enterO2_Name(O2_Name)
		.enterO2_Address(O2_Address)
		.selectO2_State(O2_State)
		.waitTime()
		.selectO2_City(O2_City)
		.enterO2_EmailId(O2_EmailId)
		.enterO2_Phone(O2_Phone)
		.enterO2_Mobile(O2_Mobile)
		.clickAdd()
		.waitTime()
		.enterO3_Name(O3_Name)
		.enterO3_Address(O3_Address)
		.selectO3_State(O3_State)
		.waitTime()
		.selectO3_City(O3_City)
		.enterO3_EmailId(O3_EmailId)
		.enterO3_Phone(O3_Phone)
		.enterO3_Mobile(O3_Mobile)
		.clickSubmit()		
		;
	}

}
