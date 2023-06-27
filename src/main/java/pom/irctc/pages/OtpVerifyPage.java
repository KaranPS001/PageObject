package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OtpVerifyPage extends GenericWrappers{
	
	public OtpVerifyPage clickVerify() {
		clickByXpath(prop.getProperty("OtpVerifyPage.VerifyButton.XPath"));
		return new OtpVerifyPage();
	}
	
	public OtpVerifyPage getOtpText() {
		getTextByXpath(prop.getProperty("OtpVerifyPage.OtpText.XPath"));
		return this;
		
	}
	public OtpVerifyPage verifyOtp(String Alert) {
		verifyTextContainsByXpath(prop.getProperty("OtpVerifyPage.Alert.XPath"), Alert);
		return this;
	}
	public OtpVerifyPage waitTime(long time) {
		waitProperty(time);
		return this;
	}

}
