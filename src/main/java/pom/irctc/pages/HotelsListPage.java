package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsListPage extends GenericWrappers{
	
	public HotelsListPage clickFirstHotel() {
		clickByXpath(prop.getProperty("HotelsListPage.FirstHotel.XPath"));
		return new HotelsListPage();
	}
	public ConfirmationPage switchConfirmationWindow() {
		switchToLastWindow();
		return new ConfirmationPage();
	}
	public HotelsListPage waitTime(long time) {
		waitProperty(time);
		return this;
	}
}
