package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertPage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	
	@BeforeClass
	
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="To Verify Confirmation Alert Message";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		author="prabha";
		category="smoke";
		sheetName="TC011";
	}
	@Test(dataProvider = "fetchData")
	public void confirmationAlert(String OkAlert, String CancelAlert) {
		
		new AlertPage()
		.switchtoFrame()
		.clickTryButton()
		.alertText()
		.clickOk()
		.verifyOkText(OkAlert)
		.switchDefault()
		.refreshPage()
		.waitTime()
		.switchtoFrame()
		.clickTryButton()
		.waitTime()
		.alertText()
		.clickCancel()
		.waitTime()
		.verifyCancelText(CancelAlert)
		.switchDefault()
		.clickHome()
		.switchLastWindow()
		
		;
	}
}
