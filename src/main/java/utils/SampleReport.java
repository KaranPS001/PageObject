package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	
	
	@Test
	public void reportGeneration() {
		
		// start report
		ExtentReports report = new ExtentReports("./Results/report.html", false);
		
		// start Test
		ExtentTest test = report.startTest("TC001", "To verify IRCTC Registration for the new user sign up");
		test.assignAuthor("Prabha");
		test.assignCategory("Functional");
		
	
		// log test steps
		test.log(LogStatus.PASS	, "The application got launched with the url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the url successfully");
		
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
	}

}
