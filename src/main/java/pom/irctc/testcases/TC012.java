package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertPage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers{
	
@BeforeClass
	
	public void beforeClass() {
		testCaseName="TC012";
		testCaseDescription="To Verify Prompt Alert Messages";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		author="prabha";
		category="smoke";
		sheetName="TC012";
	}
	@Test(dataProvider = "fetchData")
	
	public void promptAlert(String InputMsg) {
		
		new AlertPage()
		.waitTime()
		.switchtoFrame()
		.clickTryButton()
		.enterInputText(InputMsg)
		.alertText()
		.clickOk()
		.verifyInputText(InputMsg)
		.refreshPage()
		.waitTime()
		.switchtoFrame()
		.clickTryButton()
		.waitTime()
		.enterInputText(InputMsg)
		.alertText()
		.clickCancel()
		.waitTime()
		.verifyInputText(InputMsg)
		.switchDefault()
		.clickHome()
		.switchLastWindow()
		;
		
	}

}
