package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {

	public static ExtentReports report;
	
	public static ExtentTest test;
	
	public String testCaseName, testCaseDescription;
	
	public String author, category;
	
	public void startReport() {
		
		 report = new ExtentReports("./Results/report.html", false);
	
	}
	
	public void startTest(String testName, String description) {
		
		 test=  report.startTest(testName, description);
		 test.assignAuthor(author);
		 test.assignCategory(category);
	}
		
	/**
	 * This method will take snapshot of the browser
	 * @author Basha - LibertyTestingCenter
	 */
	public abstract long takeSnap();
	
	public void reportStep(String description, String status) {
		
		long snapNumber = takeSnap();
		
		if(status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, description +test.addScreenCapture(".././Results/screenshots/"+snapNumber+".jpeg"));
		} else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, description +test.addScreenCapture(".././Results/screenshots/"+snapNumber+".jpeg"));
		} else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, description +test.addScreenCapture(".././Results/screenshots/"+snapNumber+".jpeg"));
		} else if(status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, description +test.addScreenCapture(".././Results/screenshots/"+snapNumber+".jpeg"));
		}
		}
		
	public void reportStep(String description, String status, boolean snap) {
		
		if(!snap) {
		
		if(status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, description );
		} else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, description );
		} else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, description);
		} else if(status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, description );
		}
		}
		}
	public void endTest() {
		report.endTest(test);
	}
	
	public void endReport() {
		report.flush();
	}
}
