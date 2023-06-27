package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertPage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers{
	
	@BeforeClass
	
	public void beforeClass() {
		testCaseName="TC010";
		testCaseDescription="To verify Simple Alert message";
		author="Prabha";
		category="Fundamental";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}
	@Test
	public void simpleAlert() {
		
		new AlertPage()
		.switchtoFrame()
		.clickTryButton()
		.alertText()
		.clickOk()
		.switchDefault()
		.clickHome()
		.switchLastWindow()
		;
}
}
