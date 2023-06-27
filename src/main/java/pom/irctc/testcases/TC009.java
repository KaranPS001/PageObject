package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pom.sscregistration.pages.SscRegistrationPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers	{
	

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To fill the Basic Details in Staff Selection Commission Registration";
		author="Prabha";
		category="smoke";
		browserName="chrome";
		url="https://ssc.nic.in/registration/home";	
		sheetName="TC009";
	}
	
	@Test(dataProvider = "fetchData")
	public void sscRegistration(String AadharNo, String V_AadharNo, String Name, String V_Name, String ChangedName, String FatherName, String V_FatherName, String MotherName, String V_MotherName, String DOB, String V_DOB, String EduBoard, String V_EduBoard, String RollNo, String V_RollNo, String YrOfPassing, String V_YrOfPassing, String Gender, String V_Gender, String EduQual, String MobileNo, String V_MobileNo, String EmailId, String V_EmailId, String State) {
		
		new SscRegistrationPage()
		.clickAadhar()	
		.enterAadharNo(AadharNo)
		.enterV_AadharNo(V_AadharNo)
		.enterName(Name)
		.enterV_Name(V_Name)
		.clickNameChange()
		.enterNewName(ChangedName)
		.enterFatherName(FatherName)
		.enterV_FatherName(V_FatherName)
		.enterMotherName(MotherName)
		.enterV_MotherName(V_MotherName)
		.enterDob(DOB)
		.enterV_Dob(V_DOB)		
		.selectEduBoard(EduBoard)
		.selectV_EduBoard(V_EduBoard)
		.enterRollNo(RollNo)
		.enterV_RollNo(V_RollNo)
		.selectYrOfPassing(YrOfPassing)
		.selectV_YrOfPassing(V_YrOfPassing)
		.clickGender(Gender)
		.clickV_Gender(V_Gender)		
		.selectEduQual(EduQual)
		.enterMobileNo(MobileNo)
		.enterV_MobileNo(MobileNo)
		.enterEmailId(EmailId)
		.enterV_EmailId(V_EmailId)
		.selectState(State)
		.clickSaveButton()
		;
	}

	
}
