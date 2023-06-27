package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To verify Charter Enquiry Form";
		author="Prabha";
		category="smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC003";
		
	}
	@Test(dataProvider = "fetchData")
	public void saloonMandatoryCheck(String Name, String Organization, String Address, String Mobile, String Email, String RequestFor, String Origin, String Dest, String DeptYear, String DeptDate, String ArrYear, String ArrDate, String DurPeriod, String TypeOfCoach, String NoOfPassengers, String Purpose, String AddServicesReq, String Alert) {
		
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickLounge()
		.switchLastWindow()
		.mouseHoverSideBar()
		.clickCharter()
		.switchCharterWindow()
		.clickEnquiryForm()
		.enterName(Name)
		.enterOrganisation(Organization)
		.enterAddress(Address)
		.waitTime(1000)
		.enterMobile(Mobile)
		.enterEmail(Email)
		.selectRequestFor(RequestFor)
		.enterOriginStation(Origin)
		.enterDestnStation(Dest)
		.clickDept()
		.waitTime(1000)
		.selectDeptYear(DeptYear)
		.clickDeptMonth()
		.clickDeptDate(DeptDate)
		.sendKeysTab()
		.waitTime(1000)
		.clickArr()
		.waitTime(1000)
		.selectArrYear(ArrYear)
		.clickArrMonth()
		.clickArrDate(ArrDate)
		.enterDurationPeriod(DurPeriod)
		.enterTypeofCoach(TypeOfCoach)
		.enterNoOfPassengers(NoOfPassengers)
		.enterPurpose(Purpose)
		.enterAddServices(AddServicesReq)
		.clickSubmit()
		.verifyMobileNo(Alert)
		;
	}

}
