package wrappers;

import org.openqa.selenium.Keys;

public interface Wrappers {
	/**
	 * This method will launch the given browser and maximise the browser and set the
	 * wait for 30 seconds and load the url
	 * @author Basha - LibertyTestingCenter
	 * @param browser - The browser of the application to be launched
	 * @param url - The url with http or https
	 * @throws Exception 
	 * 
	 */
	public void invokeApp(String browser, String url);

	/**
	 * This method will enter the value to the text field using id attribute to locate
	 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Basha - LibertyTestingCenter
	 * @return 
	 * @throws Exception 
	 */
	public void enterById(String idValue, String data);
	
	/**
	 * This method will enter the value to the text field using name attribute to locate
	 * 
	 * @param nameValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Basha - LibertyTestingCenter
	 */
	public void enterByName(String nameValue, String data) ;	
	
	/**
	 * This method will enter the value to the text field using xpath attribute to locate
	 * 
	 * @param xpathValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Basha - LibertyTestingCenter
	 */
	public void enterByXpath(String xpathValue, String data);

	/**
	 * This method will enter the value to the text field using xpath attribute to locate
	 * 
	 * @param xpathValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Basha - LibertyTestingCenter
	 */
	public void enterByXpath(String xpathValue, Keys data);

	/**
	 * This method will verify the title of the browser 
	 * @param title - The expected title of the browser
	 * @author Basha - LibertyTestingCenter
	 */
	
	public void enterByClass(String classValue, String data);


	/**
	 * This method will verify the title of the browser 
	 * @param title - The expected title of the browser
	 * @author Basha - LibertyTestingCenter
	 */
	public void verifyTitle(String title);
	
	/**
	 * This method will verify the given text
	 * @param id - The locator of the object in id
	 * @param text  - The text to be verified
	 * @author Basha - LibertyTestingCenter
	 */
	public void verifyTextById(String id, String text);
	
	/**
	 * This method will verify the given text with exact match
	 * @param xpath - The locator of the object in id
	 * @param text  - The text to be verified
	 * @author Basha - LibertyTestingCenter
	 */
	public void verifyTextByXpath(String xpath, String text);
	
	/**
	 * This method will verify the given text with partial match
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 * @author Basha - LibertyTestingCenter
	 */
	public void verifyTextContainsByXpath(String xpath, String text);


	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 */
	public void clickById(String id) ;

	/**
	 * This method will click the element using ClassName as locator
	 * @param class  The class (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 * @throws Exception 
	 */
	public void clickByClassName(String classVal);
	
	/**
	 * This method will click the element using name as locator
	 * @param name  The name (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 */
	public void clickByName(String name) ;
	

	/**
	 * This method will click the element using link name as locator and do take snap
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 */
	public void clickByLink(String name);
	
	/**
	 * This method will click the element using link name as locator and do not take snap
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 */
	public void clickByLinkNoSnap(String name);

	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 */
	public void clickByXpath(String xpathVal);
	
	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 */
	
	public void clickByXpath(String xpathVal, String Name);
	
	/**
	 * This method will select the drop down using value as class locator
	 * @param classname The class (locator) of the drop down element
	 * @param value The value to be selected (classname) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	
	public void clickOptionByXpath(String xpathVal, String Name);
	
	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 */
	public void clickByXpathNoSnap(String xpathVal);
	
	/**
	 * This method will get the text of the element using id as locator
	 * @param xpathVal  The id (locator) of the element 
	 * @author Basha - LibertyTestingCenter
	 */
	public String getTextById(String idVal);

	/**
	 * This method will get the text of the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element 
	 * @author Basha - LibertyTestingCenter
	 */
	public String getTextByXpath(String xpathVal);
	
	
	/**
	 * This method will get the text of the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element 
	 * @author Basha - LibertyTestingCenter
	 */
	public String getTextByXpath(String xpathVal, String value);
	
	/**
	 * This method will get the text of the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element 
	 * @author Basha - LibertyTestingCenter
	 */
	public String getTextByXpath(String xpathVal, int value);

	/**
	 * This method will select the drop down visible text using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	public void selectVisibileTextById(String id, String value);
	

	/**
	 * This method will select the drop down using index as id locator
	 * @param xpathVal The xpath (locator) of the drop down element
	 * @param value The value to be selected (index) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	public void selectIndexByXpath(String xpath, int value);
	/**
	 * This method will select the drop down using index as id locator
	 * @param xpathVal The xpath (locator) of the drop down element
	 * @param value The value to be selected (index) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	public void selectIndexByXpath(String xpath, String value);
	
	/**
	 * This method will select the drop down using index as id locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (index) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	public void selectIndexById(String id, int value);
	
	/**
	 * This method will select the drop down using value as Xpath locator
	 * @param xpathVal The Xpath (locator) of the drop down element
	 * @param value The value to be selected (xpath) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	
	public void selectValueByXpath(String xpathVal, String value);
	
	/**
	 * This method will select the drop down using value as id locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (id) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	
	public void selectValueById(String id, String value);
	
	/**
	 * This method will select the drop down using value as class locator
	 * @param classname The class (locator) of the drop down element
	 * @param value The value to be selected (classname) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	
	public void selectValueByClass(String classname, String value);
	
	/**
	 * This method will select the drop down using value as Xpath locator
	 * @param xpathVal The Xpath (locator) of the drop down element
	 * @param value The value to be selected (xpath) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	
	public void selectVisibleTextByXpath(String xpathVal, String value);
	
	/**
	 * This method will select the drop down using value as Name locator
	 * @param nameval The name (locator) of the drop down element
	 * @param value The value to be selected (Name) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	
	public void selectValueByName(String nameval, String value);
		
	/**
	 * This method will switch to the parent Window
	 * @author Basha - LibertyTestingCenter
	 */
	
	public void switchToParentWindow();
	
	/**
	 * This method will move the control to the last window
	 * @author Basha - LibertyTestingCenter
	 */
	public void switchToLastWindow();
	
	/**
	 * This method will accept the alert opened
	 * @author Basha - LibertyTestingCenter
	 */
	public void acceptAlert();
	
	/**
	 * This method will dismiss the alert opened
	 * @author Basha - LibertyTestingCenter
	 */
	public void dismissAlert();
	
	/**
	 * This method will return the text of the alert
	 * @author Basha - LibertyTestingCenter
	 */
	public String getAlertText();
	
	
		
	/**
	 * This method will close the active browser
	 * @author Basha - LibertyTestingCenter
	 */
	public void closeBrowser();
	
	/**
	 * This method will close all the browsers
	 * @author Basha - LibertyTestingCenter
	 */
	public void closeAllBrowsers();
	
	/**
	 * This method will wait for windows to launch
	 * @author Basha - LibertyTestingCenter
	 */
 
	public void waitProperty(long time);
	
//	public void implicitlywait();
	
	/**
	 * This method will execute keyboard keys.
	 * 	 * @author Basha - LibertyTestingCenter
	 */

	public void sendkeysTab();
		
	/**
	 * This method will execute keyboard keys.
	 * 	 * @author Basha - LibertyTestingCenter
	 */

	public void sendkeysPageDown();
	/**
	 * This method will move the control into the frame using xpath
	 * @author Basha - LibertyTestingCenter
	 */

	void switchToFrame(String xpath);
	
	/**
	 * This method will move the control into the frame using value
	 * @author Basha - LibertyTestingCenter
	 */
	
	void switchtoFrame(String frameval);
	
	
	/**
	 * This method will navigate to first window
	 * @author Basha - LibertyTestingCenter
	 */
	
	public void switchToDefault();
	
	public int gstCal(String price);
	
	public void gstCals(String xpath1, String text1, String xpath3, String text2, String text3, String text4);
	
	public int convertToNumbyXpath(String xpath);
	/**
	 * This method will compare two numbers
	 * @author Basha - LibertyTestingCenter
	 */
	
	public void compareTwoNumbers(int number1, int number2);
	
	public void forward();
	
	public void backward();
	
	public void refresh();
	
	/**
	 * This method will enter the text in alert message box
	 * @author Basha - LibertyTestingCenter
	 */

	public void alertSendKeys(String value);
	
	public void mouseHoverByXpath(String xpath);
	
	
}
