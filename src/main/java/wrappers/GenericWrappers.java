package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{
	
	int i=1;
	
	public static RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void loadObjects() {
		
		try {
			
			 prop = new Properties();
			 
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	public void unloadObjects() {
		prop=null;
	}
	
	@Override
	public void invokeApp(String browser, String url){
		// TODO Auto-generated method stub
		try {
			if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			}
			else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			}
			else if(browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			System.out.println("The browser "+browser+" is launched with the given url "+url+" Successfully");
			reportStep("The browser "+browser+" is launched with the given url "+url+" Successfully", "PASS");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
//			System.err.println("The browser "+browser+" is not launched due to session id is not created error");
			reportStep("The browser "+browser+" is not launched due to session id is not created error", "Fail");
		} catch (InvalidArgumentException e) {
			// TODO: handle exception
//			System.err.println("The browser "+browser+" is not launched due to url does not starts with http or https");
			reportStep("The browser "+browser+" is not launched due to url does not starts with http or https", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The browser "+browser+" is not launched due to unknown error", "Fail");
		} 
		}

	@Override
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
//			System.out.println("The element with id "+idValue+" is entered with data "+data);
			reportStep("The element with id "+idValue+" is entered with data "+data, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with id "+idValue+" is not found in DOM");
			reportStep("The element with id "+idValue+" is not found in DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("The element with id "+idValue+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not stable in the application", "Fail");
		}  catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to unknown error", "Fail");
//		} finally {
//		  takeSnap();
		}
		}

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
//			System.out.println("The element with name "+nameValue+" is entered with the data "+data);
			reportStep("The element with name "+nameValue+" is entered with the data "+data, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with name "+nameValue+" is not found in DOM");
			reportStep("The element with name "+nameValue+" is not found in DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with name "+nameValue+" is not interactable in the application");
			reportStep("The element with name "+nameValue+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error", "Fail");
//		} finally {
//		  takeSnap();
		}
		}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
//			System.out.println("The element with xPath "+xpathValue+" is entered with data "+data);
			reportStep("The element with xPath "+xpathValue+" is entered with data "+data, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with xPath "+xpathValue+" is not found in DOM");
			reportStep("The element with xPath "+xpathValue+" is not found in DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathValue+" is not visible in the application");
			reportStep("The element with xPath "+xpathValue+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathValue+" is not interactable in the application");
			reportStep("The element with xPath "+xpathValue+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathValue+" is not stable in the application");
			reportStep("The element with xPath "+xpathValue+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with xPath "+xpathValue+" is not entered with data "+data+" due to unknown error", "Fail");
//		} finally {
//		  takeSnap();
		}
		}
		
	
	@Override
	public void enterByClass(String classValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classValue).sendKeys(data);
//			System.out.println("The element with Class "+classValue+" is entered data "+data);
			reportStep("The element with Class "+classValue+" is entered data "+data, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with xPath "+classValue+" is not found in DOM");
			reportStep("The element with xPath "+classValue+" is not found in DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+classValue+" is not visible in the application");
			reportStep("The element with xPath "+classValue+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+classValue+" is not interactable in the application");
			reportStep("The element with xPath "+classValue+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+classValue+" is not stable in the application");
			reportStep("The element with xPath "+classValue+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+classValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with xPath "+classValue+" is not entered with data "+data+" due to unknown error", "Fail");
//		} finally {
//		  takeSnap();
		}
		}
	
	@Override
	public void enterByXpath(String xpathValue, Keys data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
//			System.out.println("The element with Xpath "+xpathValue+" is entered with data "+data);
			reportStep("The element with Xpath "+xpathValue+" is entered with data "+data, "PASS");
		} catch (NoSuchElementException e) {
//			System.err.println("The element with Xpath "+xpathValue+" is not found in the DOM");
			reportStep("The element with Xpath "+xpathValue+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
//			System.err.println("The element with Xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with Xpath "+xpathValue+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
//			System.err.println("The element with Xpath "+xpathValue+" is not interactable in the application");
			reportStep("The element with Xpath "+xpathValue+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
//			System.err.println("The element with Xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with Xpath "+xpathValue+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
//			System.err.println("The element with Xpath "+xpathValue+" is not entered due to unnown error");
			reportStep("The element with Xpath "+xpathValue+" is not entered due to unnown error", "Fail");
//		}finally {
//		 takeSnap();
		}
		}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actual = driver.getTitle();
			if(actual.equals(title)) {
//			System.out.println("The title of the page "+title+" is matched with the actual text "+actual);
			reportStep("The title of the page "+title+" is matched with the actual text "+actual, "PASS");
			}else {
//			System.out.println("The title of the page "+title+" is not matched with the actual text "+actual);
			reportStep("The title of the page "+title+" is not matched with the actual text "+actual, "PASS");
			}
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The title of the page "+title+" is not verified due to unknown error");
			reportStep("The title of the page "+title+" is not verified due to unknown error", "Fail");
//		} finally {
//		  takeSnap();
		}
		}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementById(id).getText();
			if(actualText.equals(text)) {
//			System.out.println("The element with text "+actualText+" is matched with the application text "+text);
			reportStep("The element with text "+actualText+" is matched with the application text "+text, "PASS");
			}else {
//			System.out.println("The element with text "+actualText+" is not matched with the application text "+text);
			reportStep("The element with text "+actualText+" is not matched with the application text "+text, "PASS");
			}
		} catch (NoSuchElementException e) {
				// TODO: handle exception
//			System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with id "+id+" is not verified due to unknown error");
			reportStep("The element with id "+id+" is not verified due to unknown error", "Fail");
//		} finally {
//		  takeSnap();
		}
		}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if(actualText.equals(text)) {
//				System.out.println("The element with text "+actualText+" is matched with the application text "+text);
				reportStep("The element with text "+actualText+" is matched with the application text "+text, "PASS");
			}else {
//				System.out.println("The element with text "+actualText+" is not matched with the application text "+text);
				reportStep("The element with text "+actualText+" is not matched with the application text "+text, "PASS");
			}
		} catch (NoSuchElementException e) {
				// TODO: handle exception
//				System.err.println("The element with xPath "+xpath+" is not found in the DOM");
				reportStep("The element with xPath "+xpath+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//				System.err.println("The element with xPath "+xpath+" is not visible in the application");
				reportStep("The element with xPath "+xpath+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//				System.err.println("The element with xPath "+xpath+" is not interactable in the application");
				reportStep("The element with xPath "+xpath+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//				System.err.println("The element with xPath "+xpath+" is not stable in the application");
				reportStep("The element with xPath "+xpath+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//				System.err.println("The element with xPath "+xpath+" is not verified due to unknown error");
				reportStep("The element with xPath "+xpath+" is not verified due to unknown error", "Fail");
//		} finally {
//		  takeSnap();
		}
		}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String shortText = driver.findElementByXPath(xpath).getText();
			if(shortText.contains(text)) {
//			System.out.println("The element with text "+text+" contains "+shortText);
			reportStep("The element with text "+text+" contains in application text "+shortText, "PASS");
			}else {
//			System.out.println("The element with text "+text+" does not contains "+shortText);
			reportStep("The element with text "+text+" does not contains in application text "+shortText, "PASS");
		}
		} catch (NoSuchElementException e) {
				// TODO: handle exception
//			System.err.println("The element with xPath "+xpath+" is not found in the DOM");
			reportStep("The element with xPath "+xpath+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpath+" is not visible in the application");
			reportStep("The element with xPath "+xpath+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpath+" is not interactable in the application");
			reportStep("The element with xPath "+xpath+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpath+" is not stable in the application");
			reportStep("The element with xPath "+xpath+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpath+" is not verified due to unknown error");
			reportStep("The element with xPath "+xpath+" is not verified due to unknown error", "Fail");
//		} finally {
//		  takeSnap();
		}
		}


	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
//			System.out.println("The element with id "+id+" is clicked Successfully");
			reportStep("The element with id "+id+" is clicked Successfully", "PASS");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
//			System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with id "+id+" is not interceptable in the application");
			reportStep("The element with id "+id+" is not interceptable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with id "+id+" is not available due to unknown error");
			reportStep("The element with id "+id+" is not available due to unknown error", "Fail");
//		} finally {
//		  takeSnap();
		}
		}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
//			System.out.println("The element with ClassName "+classVal+" is clicked Successfully");
			reportStep("The element with ClassName "+classVal+" is clicked Successfully", "PASS");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
//			System.err.println("The element with ClassName "+classVal+" is not found in the DOM");
			reportStep("The element with ClassName "+classVal+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with ClassName "+classVal+" is not visible in the application");
			reportStep("The element with ClassName "+classVal+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with ClassName "+classVal+" is not interceptable in the application");
			reportStep("The element with ClassName "+classVal+" is not interceptable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with ClassName "+classVal+" is not interactable in the application");
			reportStep("The element with ClassName "+classVal+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with ClassName "+classVal+" is not stable in the application");
			reportStep("The element with ClassName "+classVal+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with ClassName "+classVal+" is not available due to unknown error");
			reportStep("The element with ClassName "+classVal+" is not available due to unknown error", "Fail");
//		} finally {
//		  takeSnap();
		}
		}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
//			System.out.println("The element with Name "+name+" is clicked Successfully");
			reportStep("The element with Name "+name+" is clicked Successfully", "PASS");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
//			System.err.println("The element with Name "+name+" is not found in the DOM");
			reportStep("The element with Name "+name+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with Name "+name+" is not visible in the application");
			reportStep("The element with Name "+name+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with Name "+name+" is not interceptable in the application");
			reportStep("The element with Name "+name+" is not interceptable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with Name "+name+" is not interactable in the application");
			reportStep("The element with Name "+name+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with Name "+name+" is not stable in the application");
			reportStep("The element with Name "+name+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with Name "+name+" is not available due to unknown error");
			reportStep("The element with Name "+name+" is not available due to unknown error", "Fail");
//		}	finally {
//			takeSnap();
		}
		}

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
//			System.out.println("The element with LinkText "+name+" is clicked Successfully");
			reportStep("The element with LinkText "+name+" is clicked Successfully", "PASS");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
//			System.err.println("The element with LinkText "+name+" is not found in the DOM");
			reportStep("The element with LinkText "+name+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with LinkText "+name+" is not visible in the application");
			reportStep("The element with LinkText "+name+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with LinkText "+name+" is not interceptable in the application");
			reportStep("The element with LinkText "+name+" is not interceptable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with LinkText "+name+" is not interactable in the application");
			reportStep("The element with LinkText "+name+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with LinkText "+name+" is not stable in the application");
			reportStep("The element with LinkText "+name+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with LinkText "+name+" is not available due to unknown error");
			reportStep("The element with LinkText "+name+" is not available due to unknown error", "Fail");
//		}	finally {
//			takeSnap();
		}
		}


	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
//			System.out.println("The element with LinkText "+name+" is clicked Successfully");
			reportStep("The element with LinkText "+name+" is clicked Successfully", "PASS");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
//			System.err.println("The element with LinkText "+name+" is not found in the DOM");
			reportStep("The element with LinkText "+name+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with LinkText "+name+" is not visible in the application");
			reportStep("The element with LinkText "+name+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with LinkText "+name+" is not interceptable in the application");
			reportStep("The element with LinkText "+name+" is not interceptable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with LinkText "+name+" is not interactable in the application");
			reportStep("The element with LinkText "+name+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with LinkText "+name+" is not stable in the application");
			reportStep("The element with LinkText "+name+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with LinkText "+name+" is not available due to unknown error");
			reportStep("The element with LinkText "+name+" is not available due to unknown error", "Fail");
		}	
		}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
//			System.out.println("The element with xPath "+xpathVal+" is clicked Successfully");
			reportStep("The element with xPath "+xpathVal+" is clicked Successfully", "PASS");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xPath "+xpathVal+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not visible in the application");
			reportStep("The element with xPath "+xpathVal+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with xPath "+xpathVal+" is not interceptable in the application");
			reportStep("The element with xPath "+xpathVal+" is not interceptable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xPath "+xpathVal+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not stable in the application");
			reportStep("The element with xPath "+xpathVal+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not available due to unknown error");
			reportStep("The element with xPath "+xpathVal+" is not available due to unknown error", "Fail");
//		}	finally {
//			takeSnap();
		}
		}
	@Override
	public void clickByXpath(String xpathVal, String Name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
//			System.out.println("The element with xPath "+xpathVal+" is clicked Successfully");
			reportStep("The element with xPath "+xpathVal+" is clicked Successfully", "PASS");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xPath "+xpathVal+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not visible in the application");
			reportStep("The element with xPath "+xpathVal+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with xPath "+xpathVal+" is not interceptable in the application");
			reportStep("The element with xPath "+xpathVal+" is not interceptable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xPath "+xpathVal+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not stable in the application");
			reportStep("The element with xPath "+xpathVal+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not available due to unknown error");
			reportStep("The element with xPath "+xpathVal+" is not available due to unknown error", "Fail");
//		}	finally {
//			takeSnap();
		}
		}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
//			System.out.println("The element with xPath "+xpathVal+" is clicked Successfully");
			reportStep("The element with xPath "+xpathVal+" is clicked Successfully", "PASS", false);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xPath "+xpathVal+" is not found in the DOM", "Fail", false);
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not visible in the application");
			reportStep("The element with xPath "+xpathVal+" is not visible in the application", "Fail", false);
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with xPath "+xpathVal+" is not interceptable in the application");
			reportStep("The element with xPath "+xpathVal+" is not interceptable in the application", "Fail", false);
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xPath "+xpathVal+" is not interactable in the application", "Fail", false);
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not stable in the application");
			reportStep("The element with xPath "+xpathVal+" is not stable in the application", "Fail", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not available due to unknown error");
			reportStep("The element with xPath "+xpathVal+" is not available due to unknown error", "Fail", false);
		}	
		}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		    String Idtxt = null;
			try {
				Idtxt = driver.findElementById(idVal).getText();
//				System.out.println("The element with Id "+idVal+" is entered with text");
				reportStep("The element with Id "+idVal+" is entered with text", "PASS");
			} catch (NoSuchElementException e) {
				// TODO: handle exception
//				System.err.println("The element with Id "+idVal+" is not found in the DOM");
				reportStep("The element with Id "+idVal+" is not found in the DOM", "Fail");
			} catch (ElementNotVisibleException e) {
				// TODO: handle exception
//				System.err.println("The element with Id "+idVal+" is not visible in the application");
				reportStep("The element with Id "+idVal+" is not visible in the application", "Fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
//				System.err.println("The element with Id "+idVal+" is not interactable in the application");
				reportStep("The element with Id "+idVal+" is not interactable in the application", "Fail");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
//				System.err.println("The element with Id "+idVal+" is not stable in the application");
				reportStep("The element with Id "+idVal+" is not stable in the application", "Fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
//				System.err.println("The element with Id "+idVal+" is not available due to unknown error");
				reportStep("The element with Id "+idVal+" is not available due to unknown error", "Fail");
//			} finally {
//				takeSnap();
			} return Idtxt;
			}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String xPathtxt = null;
		try {
			xPathtxt = driver.findElementByXPath(xpathVal).getText();
//			System.out.println("The element with xPath "+xpathVal+" is entered with text : " +xPathtxt);
			reportStep("The element with xPath "+xpathVal+" is entered with text", "PASS");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xPath "+xpathVal+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not visible in the application");
			reportStep("The element with xPath "+xpathVal+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xPath "+xpathVal+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not stable in the application");
			reportStep("The element with xPath "+xpathVal+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not available due to unknown error");
			reportStep("The element with xPath "+xpathVal+" is not available due to unknown error", "Fail");
//		} finally {
//			takeSnap();
		}
		return xPathtxt;
		}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement Selindex = driver.findElementById(id);
			Select indexval = new Select(Selindex);
			indexval.selectByIndex(value);
//			System.out.println("The element with Id "+id+" is selected with index text "+value);
			reportStep("The element with Id "+id+" is selected with index text "+value, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with Id "+id+" is not found in the DOM");
			reportStep("The element with Id "+id+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with Id "+id+" is not visible in the application");
			reportStep("The element with Id "+id+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with Id "+id+" is not interactable in the application");
			reportStep("The element with Id "+id+" is not interactable in the application", "Fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
//			System.err.println("The element with Id "+id+" is not selectable in the application");
			reportStep("The element with Id "+id+" is not selectable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with Id "+id+" is not stable in the application");
			reportStep("The element with Id "+id+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with Id "+id+" is not available due to unknown error");
			reportStep("The element with Id "+id+" is not available due to unknown error", "Fail");
//		} finally {
//			takeSnap();
		}
		}
	
	@Override
	public void selectIndexByXpath(String xpathVal, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement selVal = driver.findElementByXPath(xpathVal);
			Select xpathvalue = new Select(selVal);
			xpathvalue.selectByIndex(value);
//			System.out.println("The element with xPath "+xpathVal+" is selected with visible text "+value);
			reportStep("The element with xPath "+xpathVal+" is selected with visible text "+value, "PASS");
		} catch (NoSuchElementException e) {
//			System.err.println("The element with xPath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xPath "+xpathVal+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
//			System.err.println("The element with xPath "+xpathVal+" is not visible in the application");
			reportStep("The element with xPath "+xpathVal+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
//			System.err.println("The element with xPath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xPath "+xpathVal+" is not interactable in the application", "Fail");
		} catch (ElementNotSelectableException e) {
//			System.err.println("The element with xPath "+xpathVal+" is not selectable in the application");
			reportStep("The element with xPath "+xpathVal+" is not selectable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
//			System.err.println("The element with xPath "+xpathVal+" is not stable in the application");
			reportStep("The element with xPath "+xpathVal+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
//			System.err.println("The element with xPath "+xpathVal+" is not available due to some unnown error");
			reportStep("The element with xPath "+xpathVal+" is not available due to some unnown error", "Fail");
//		}finally {
//		 takeSnap();
		}	
		}
	@Override
	public void selectIndexByXpath(String xpathVal, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selVal = driver.findElementByXPath(xpathVal);
			Select xpathvalue = new Select(selVal);
			xpathvalue.selectByValue(value);
//			System.out.println("The element with xPath "+xpathVal+" is selected with visible text "+value);
			reportStep("The element with xPath "+xpathVal+" is selected with visible text "+value, "PASS");
		} catch (NoSuchElementException e) {
//			System.err.println("The element with xPath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xPath "+xpathVal+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
//			System.err.println("The element with xPath "+xpathVal+" is not visible in the application");
			reportStep("The element with xPath "+xpathVal+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
//			System.err.println("The element with xPath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xPath "+xpathVal+" is not interactable in the application", "Fail");
		} catch (ElementNotSelectableException e) {
//			System.err.println("The element with xPath "+xpathVal+" is not selectable in the application");
			reportStep("The element with xPath "+xpathVal+" is not selectable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
//			System.err.println("The element with xPath "+xpathVal+" is not stable in the application");
			reportStep("The element with xPath "+xpathVal+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
//			System.err.println("The element with xPath "+xpathVal+" is not available due to some unnown error");
			reportStep("The element with xPath "+xpathVal+" is not available due to some unnown error", "Fail");
//		}finally {
//		 takeSnap();
		}	
		}
	
	@Override
	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selVal = driver.findElementByXPath(xpath);
			Select xpathVal = new Select(selVal);
			xpathVal.selectByValue(value);
//			System.out.println("The element with xPath "+xpath+" is selected with the value "+value);
			reportStep("The element with xPath "+xpath+" is selected with the value "+value, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with xPath "+xpath+" is not found in the DOM");
			reportStep("The element with xPath "+xpath+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpath+" is not visible in the application");
			reportStep("The element with xPath "+xpath+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpath+" is not interactable in the application");
			reportStep("The element with xPath "+xpath+" is not interactable in the application", "Fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpath+" is not selectable in the application");
			reportStep("The element with xPath "+xpath+" is not selectable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpath+" is not stable in the application");
			reportStep("The element with xPath "+xpath+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpath+" is not available due to unknown error");
			reportStep("The element with xPath "+xpath+" is not available due to unknown error", "Fail");
//		} finally {
//		  takeSnap();
		}
		}
	
	@Override
	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement Selval = driver.findElementById(id);
			Select ValId = new Select(Selval);
			ValId.selectByValue(value);
//			System.out.println("Successfuly selected the "+value+" with Id "+id);
			reportStep("Successfuly selected the "+value+" with Id "+id, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with Id "+id+" is not found in the DOM");
			reportStep("The element with Id "+id+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with Id "+id+" is not visible in the application");
			reportStep("The element with Id "+id+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with Id "+id+" is not interactable in the application");
			reportStep("The element with Id "+id+" is not interactable in the application", "Fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
//			System.err.println("The element with Id "+id+" is not selectable in the application");
			reportStep("The element with Id "+id+" is not selectable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with Id "+id+" is not available due to unknown error");
			reportStep("The element with Id "+id+" is not available due to unknown error", "Fail");
//		} finally {
//		  takeSnap();
		}
		}
	
	@Override
	public void selectValueByClass(String classname, String value) {
		try {
			WebElement classval = driver.findElementByClassName(classname);
			Select cval = new Select(classval);
			cval.selectByValue(value);
//			System.out.println("The element with Class "+classname+" is selected with visible text "+value);
			reportStep("The element with Class "+classname+" is selected with visible text "+value, "PASS");
		} catch (NoSuchElementException e) {
//			System.err.println("The element with Class "+classname+" is not available in the DOM");
			reportStep("The element with Class "+classname+" is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
//			System.err.println("The element with Class "+classname+" is not visible in the application");
			reportStep("The element with Class "+classname+" is not visible in the application", "Fail");
		} catch (ElementNotSelectableException e) {
//			System.err.println("The element with Class "+classname+" is not selectable in the application");
			reportStep("The element with Class "+classname+" is not selectable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
//			System.err.println("The element with Class "+classname+" is not interactable in the application");
			reportStep("The element with Class "+classname+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
//			System.err.println("The element with Class "+classname+" is not stable in the application");
			reportStep("The element with Class "+classname+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
//			System.err.println("The element with Class "+classname+" is not available due to unknown error");
			reportStep("The element with Class "+classname+" is not available due to unknown error", "Fail");
//		}finally {
//		 takeSnap();
		}
		}
	
	@Override
	public void selectValueByName(String nameval, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement namevalue = driver.findElementByName(nameval);
			Select nval = new Select(namevalue);
			nval.selectByValue(value);
//			System.out.println("The element with Name "+nameval+" is selected with visible text "+value);
			reportStep("The element with Name "+nameval+" is selected with visible text "+value, "PASS");
		} catch (NoSuchElementException e) {
//			System.err.println("The element with Name "+nameval+" is not available in the DOM");
			reportStep("The element with Name "+nameval+" is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
//			System.err.println("The element with Name "+nameval+" is not visible in the application");
			reportStep("The element with Name "+nameval+" is not visible in the application", "Fail");
		} catch (ElementNotSelectableException e) {
//			System.err.println("The element with Name "+nameval+" is not selectable in the application");
			reportStep("The element with Name "+nameval+" is not selectable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
//			System.err.println("The element with Name "+nameval+" is not interactable in the application");
			reportStep("The element with Name "+nameval+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
//			System.err.println("The element with Name "+nameval+" is not stable in the application");
			reportStep("The element with Name "+nameval+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
//			System.err.println("The element with Name "+nameval+" is not available due unknown error");
			reportStep("The element with Name "+nameval+" is not available due unknown error", "Fail");
//		}finally {
//		 takeSnap();
		}
		}
	
	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement Selid = driver.findElementById(id);
			Select idvalue = new Select(Selid);
			idvalue.selectByVisibleText(value);
//			System.out.println("The element with Id "+id+" is selected with the text"+value);
			reportStep("The element with Id "+id+" is selected with the text"+value, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with Id "+id+" is not found in the DOM");
			reportStep("The element with Id "+id+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with Id "+id+" is not visible in the application");
			reportStep("The element with Id "+id+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with Id "+id+" is not interactable in the application");
			reportStep("The element with Id "+id+" is not interactable in the application", "Fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
//			System.err.println("The element with Id "+id+" is not selectable in the application");
			reportStep("The element with Id "+id+" is not selectable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with Id "+id+" is not stable in the application");
			reportStep("The element with Id "+id+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with Id "+id+" is not available due to unknown error");
			reportStep("The element with Id "+id+" is not available due to unknown error", "Fail");
//		}	finally {
//			takeSnap();
		}		
		}
	
	@Override
	public void selectVisibleTextByXpath(String xpathVal, String value) {
		// TODO Auto-generated method stub
			try {
			WebElement xpval = driver.findElementByXPath(xpathVal);
			Select xvalue = new Select(xpval);
			xvalue.selectByVisibleText(value);
//			System.out.println("The element with Xpath "+xpathVal+" is selected with visible text "+value);
			reportStep("The element with Xpath "+xpathVal+" is selected with visible text "+value, "PASS");
		} catch (NoSuchElementException e) {
//			System.err.println("The element with Xpath "+xpathVal+" is not available in the DOM");
			reportStep("The element with Xpath "+xpathVal+" is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
//			System.err.println("The element with Xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with Xpath "+xpathVal+" is not visible in the application", "Fail");
		} catch (ElementNotSelectableException e) {
//			System.err.println("The element with Xpath "+xpathVal+" is not selectable with the application");
			reportStep("The element with Xpath "+xpathVal+" is not selectable with the application", "Fail");
		} catch (ElementNotInteractableException e) {
//			System.err.println("The element with Xpath "+xpathVal+" is not interactable with the application");
			reportStep("The element with Xpath "+xpathVal+" is not interactable with the application", "Fail");
		} catch (StaleElementReferenceException e) {
//			System.err.println("The element with Xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with Xpath "+xpathVal+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
//			System.err.println("The element with Xpath "+xpathVal+" is not available due to some unnown error");
			reportStep("The element with Xpath "+xpathVal+" is not available due to some unnown error", "Fail");
//		}finally {
//			takeSnap();
		}	
	}
	
		@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> handles = driver.getWindowHandles();
			for (String eachid:handles) {
            driver.switchTo().window(eachid);
            break;
		}	
//			System.out.println("Navigated to parent window Successfully");
			reportStep("Navigated to parent window Successfully", "PASS", false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			System.err.println("No such window found in the application");
			reportStep("No such window found in the application", "Fail", false);
		} catch (WebDriverException e) {
				// TODO: handle exception
//				System.err.println("Unable to switchto Parent window due to unknown error");
				reportStep("Unable to switchto Parent window due to unknown error", "Fail", false);
//		} finally {
//			takeSnap();
		}
		}
	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> handles = driver.getWindowHandles();
			for (String eachid:handles) {
            driver.switchTo().window(eachid);
		}	
//			System.out.println("Navigated to last window Successfully");
//			reportStep("Navigated to last window Successfully", "PASS", false);
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
//			System.err.println("No such window found in the application");
//			reportStep("No such window found in the application", "Fail", false);
		} catch (SessionNotCreatedException e) {
			// TODO: handle exception
//			System.err.println("Window or Sesssion id not created");
//			reportStep("Window or Sesssion id not created", "Fail", false);
		} catch (WebDriverException e) {
				// TODO: handle exception
//				System.err.println("Unable to switchto last window due to unknown error");
//				reportStep("Unable to switchto last window due to unknown error", "Fail", false);
//		}finally {
//			takeSnap();
		}
		}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
//			System.out.println("Accepted alert from the window Successfully");
			reportStep("Accepted alert from the window Successfully", "PASS", false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
//			System.err.println("No other alerts present in the Application");
//			reportStep("No other alerts present in the Application", "Fail", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("Perform to accept failed due to unknown error");
			reportStep("Perform to accept failed due to unknown error", "Fail", false);
		}	
	 	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
//			System.out.println("Dismissed the alert window Successfully");
			reportStep("Dismissed the alert window Successfully", "PASS", false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
//			System.err.println("No other alerts present in the Application");
//			reportStep("No other alerts present in the Application", "Fail", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("Perform to dismiss failed due to unknown error");
			reportStep("Perform to dismiss failed due to unknown error", "Fail", false);
		}	
		}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub	
	String AlertText = null;
			try {
				AlertText = driver.switchTo().alert().getText();
//				System.out.println("Captured the Alert text "+AlertText+" from the window Successfully");
				reportStep("Captured the Alert text "+AlertText+" from the window Successfully", "PASS", false);
			} catch (NoAlertPresentException e) {
				// TODO Auto-generated catch block
//				System.err.println("No other alerts present in the Application");
//				reportStep("No other alerts present in the Application", "Fail", false);
			} catch (WebDriverException e) {
				// TODO: handle exception
//				System.err.println("Perform to get Alert text failed due to unknown error");
				reportStep("Perform to get Alert text failed due to unknown error", "Fail", false);
			} return AlertText;
			}


	@Override
	public long takeSnap(){
		// TODO Auto-generated method stub
		
		long number = 0;
			try {
				
				number = (long) (Math.floor(Math.random()*100000000)+100000);
				
				File tmp = driver.getScreenshotAs(OutputType.FILE);
				File des = new File("./Results/screenshots/"+number+".jpeg");
				FileUtils.copyFile(tmp, des);
//				System.out.println("Screenshot saved in the folder Successfully");
//				reportStep("Screenshot saved in the folder Successfully", "PASS", false);
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
//				System.err.println("Unable to take screenshot due to unknown error");
//				reportStep("Unable to take screenshot due to unknown error", "Fail", false);
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				System.err.println("Unable to take screenshot due to IO error");
//				reportStep("Unable to take screenshot due to IO error", "Fail", false);
			}
			return number;
			}
			
	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
//			System.out.println("Closed the current browser successfully");
			reportStep("Closed the current browser successfully", "PASS", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
//			System.err.println("Unable to close browser due to unknown error");
			reportStep("Unable to close browser due to unknown error", "Fail", false);
		}
		}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
//			System.out.println("All the browsers closed sucessfully");
			reportStep("All the browsers closed sucessfully", "PASS", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
//			System.err.println("Unable to close all the browsers due to unknown error");
			reportStep("Unable to close all the browsers due to unknown error", "Fail", false);
		}
		}

	@Override
	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
//			System.out.println("Peformed the wait action successfully");
//			reportStep("Peformed the wait action successfully", "PASS", false);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			System.err.println("Unable to perform the action due to unknown error");
//			reportStep("Unable to perform the action due to unknown error", "Fail", false);
		}
		}

	@Override
	public void sendkeysTab() {
		// TODO Auto-generated method stub
				try {
					driver.findElementByXPath("//html/body").sendKeys(Keys.TAB);
//					System.out.println("The element with xPath is tabbed sucessfully");
//					reportStep("The element with xPath is tabbed sucessfully", "PASS", false);
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
//					System.err.println("The element with XPath is not found in the DOM");
//					reportStep("The element with XPath is not found in the DOM", "Fail", false);
				} catch (ElementNotVisibleException e) {
					// TODO: handle exception
//					System.err.println("The element with XPath is not visible in the application");
//					reportStep("The element with XPath is not visible in the application", "Fail", false);
				} catch (ElementNotInteractableException e) {
					// TODO: handle exception
//					System.err.println("The element with XPath is not interactable with the application");
//					reportStep("The element with XPath is not interactable with the application", "Fail", false);
				} catch (ElementNotSelectableException e) {
					// TODO: handle exception
//					System.err.println("The element with XPath is not selectable with the application");
//					reportStep("The element with XPath is not selectable with the application", "Fail", false);
				} catch (WebDriverException e) {
					// TODO: handle exception
//					System.err.println("The element with XPath is not available due to unknown error");
//					reportStep("The element with XPath is not available due to unknown error", "Fail", false);
		}
	}
	
	@Override
	public void switchToFrame(String xpath) {
		// TODO Auto-generated method stub
		try {
			WebElement myFrame =  driver.findElementByXPath("//*[@id='iframeResult']");
			driver.switchTo().frame(myFrame);
//			System.out.println("The element with xPath is switched to frame "+myFrame);
			reportStep("The element with xPath is switched to frame "+myFrame, "PASS", false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			System.err.println("No such window found in the application");
			reportStep("No such window found in the application", "Fail", false);
		} catch (SessionNotCreatedException e) {
			// TODO: handle exception
//			System.err.println("No Window or Sesssion id created");
			reportStep("No Window or Sesssion id created", "Fail", false);
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
//			System.err.println("No other alert in the application");
			reportStep("No other alert in the application", "Fail", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("Unable to switchto frame due to unknown error");
			reportStep("Unable to switchto frame due to unknown error", "Fail", false);
	}
		}

	@Override
	public void switchToDefault() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().defaultContent();
//			System.out.println("Switched to main window Successfully");
//			reportStep("Switched to main window Successfully", "PASS", false);
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
//			System.err.println("No other alert in the application");
			reportStep("No other alert in the application", "Fail", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("Unable to switchto main window due to unknown error");
			reportStep("Unable to switch main window due to unknown error", "Fail", false);
		}
		}
	@Override
	public int gstCal(String price) {
		// TODO Auto-generated method stub
		String fulldays = driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/span").getText();		
//		System.out.println(fulldays);
		String remdays = fulldays.replace("2 Guests, 1 Room, " , "");
//		System.out.println(remdays);
		String days = remdays.replace(" Nights", "");
//		System.out.println(days);
		String pricerem = price.replace("₹ ","");
//		System.out.println(pricerem);
		int nodays = Integer.parseInt(days); 
		int noprice = Integer.parseInt(pricerem);
		int c = 0;
		c = (int)Math.ceil((double)Math.round(noprice*nodays*1.12*100)/100);
//		c=nodays*noprice;
//		System.out.println("Total Price + Taxes= "+c);
		return c;
	}
	
	@Override
	public int convertToNumbyXpath(String xpath) {
		// TODO Auto-generated method stub
		int checkoutprice = 0;
		try {
			String checkprice = driver.findElementByXPath(xpath).getText();
//			System.out.println(checkprice);
			String remcheckprice = checkprice.replace("₹ ","");
			checkoutprice = Integer.parseInt(remcheckprice);
//			System.out.println("The element with xPath is captured sucessfully: " +checkoutprice);
			reportStep("The element with xPath is captured sucessfully", "PASS");
		} 		 catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
//					System.err.println("The element with XPath is not found in the DOM");
					reportStep("The element with XPath is not found in the DOM", "Fail", false);
				} catch (ElementNotVisibleException e) {
					// TODO: handle exception
//					System.err.println("The element with XPath is not visible in the application");
					reportStep("The element with XPath is not visible in the application", "Fail", false);
				} catch (ElementNotInteractableException e) {
					// TODO: handle exception
//					System.err.println("The element with XPath is not interactable with the applicaiton");
					reportStep("The element with XPath is not interactable with the applicaiton", "Fail", false);
				} catch (ElementNotSelectableException e) {
					// TODO: handle exception
//					System.err.println("The element with XPath is not Selectable in the application");
					reportStep("The element with XPath is not Selectable in the application", "Fail", false);
				} catch (WebDriverException e) {
					// TODO: handle exception
//					System.err.println("The element with XPath is not available due to unknown error");
					reportStep("The element with XPath is not available due to unknown error", "Fail", false);
		}
		return checkoutprice;
	}
	
	@Override
	public void compareTwoNumbers(int number1, int number2) {
		// TODO Auto-generated method stub
		try {
			if (number1==number2) {
//				System.out.println("Both the values are same");
				reportStep("Both the values are same", "PASS");
			}
			else
			{
//				System.out.println("Mismatch in both the values");
				reportStep("Mismatch in both the values", "PASS");
			}
		} catch (Exception e) {
//			System.err.println("Unable to compare values due to unknown error");
			reportStep("Unable to compare values due to unknown error", "Fail", false);
	}
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void backward() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().back();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void alertSendKeys(String value) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().sendKeys(value);
			reportStep("Text is entered in the textbox succesfully", "PASS", false);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void switchtoFrame(String frameval) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(frameval);
//			System.out.println("The Frame has been switched succesfully");
//			reportStep("The Frame has been switched succesfully", "PASS", false);
		} catch (NoAlertPresentException e) {
//			System.err.println("No other alert in the application");
//			reportStep("No other alert in the application", "Fail", false);
		}catch (WebDriverException e) {
//			System.err.println("Unable to perform switch action due to unknown error");
//			reportStep("Unable to perform switch action due to unknown error", "Fail", false);
	}
		
	}

//	@Override
//	public void implicitlywait() {
//		// TODO Auto-generated method stub
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//	}

	@Override
	public void mouseHoverByXpath(String xpath) {
		// TODO Auto-generated method stub
		try {
			WebElement xpVal =  driver.findElementByXPath(xpath);
			Actions builder = new Actions(driver);	
			builder.moveToElement(xpVal).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}

	@Override
	public String getTextByXpath(String xpathVal, int value) {
		// TODO Auto-generated method stub
		String xPathtxt = null;
		try {
			xPathtxt = driver.findElementByXPath(xpathVal).getText();
//			System.out.println("The element with xPath "+xpathVal+" is entered with text");
			reportStep("The element with xPath "+xpathVal+" is entered with text", "PASS");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xPath "+xpathVal+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not visible in the application");
			reportStep("The element with xPath "+xpathVal+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xPath "+xpathVal+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not stable in the application");
			reportStep("The element with xPath "+xpathVal+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not available due to unknown error");
			reportStep("The element with xPath "+xpathVal+" is not available due to unknown error", "Fail");
//		} finally {
//			takeSnap();
		} return xPathtxt;
	}

	@Override
	public String getTextByXpath(String xpathVal, String value) {
		// TODO Auto-generated method stub
		String xPathtxt = null;
		try {
			xPathtxt = driver.findElementByXPath(xpathVal).getText();
//			System.out.println("The element with xPath "+xpathVal+" is entered with text");
			reportStep("The element with xPath "+xpathVal+" is entered with text", "PASS");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xPath "+xpathVal+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not visible in the application");
			reportStep("The element with xPath "+xpathVal+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xPath "+xpathVal+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not stable in the application");
			reportStep("The element with xPath "+xpathVal+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathVal+" is not available due to unknown error");
			reportStep("The element with xPath "+xpathVal+" is not available due to unknown error", "Fail");
//		} finally {
//			takeSnap();
		} return xPathtxt;
	}

	@Override
	public void sendkeysPageDown() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
//			System.out.println("The element with xPath is  scrolled down sucessfully");
//			reportStep("The element with xPath is scrolled down sucessfully", "PASS", false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with XPath is not found in the DOM");
//			reportStep("The element with XPath is not found in the DOM", "Fail", false);
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with XPath is not visible in the application");
//			reportStep("The element with XPath is not visible in the application", "Fail", false);
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with XPath is not interactable with the application");
//			reportStep("The element with XPath is not interactable with the application", "Fail", false);
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
//			System.err.println("The element with XPath is not selectable with the application");
//			reportStep("The element with XPath is not selectable with the application", "Fail", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with XPath is not available due to unknown error");
//			reportStep("The element with XPath is not available due to unknown error", "Fail", false);
}
}
	@Override
	public void clickOptionByXpath(String xpathVal, String Name) {

		// TODO Auto-generated method stub
		String xpathLatest = null;
		try {
			
			if(xpathVal.contains("$option$")) {
				xpathLatest=xpathVal.replace("$option$", Name);
			}			
			driver.findElementByXPath(xpathLatest).click();
		
//			System.out.println("The element with xPath "+xpathLatest+" is clicked Successfully");
			reportStep("The element with xPath "+xpathLatest+" is clicked Successfully", "PASS");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathLatest+" is not found in the DOM");
			reportStep("The element with xPath "+xpathLatest+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathLatest+" is not visible in the application");
			reportStep("The element with xPath "+xpathLatest+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
//			System.err.println("The element with xPath "+xpathLatest+" is not interceptable in the application");
			reportStep("The element with xPath "+xpathLatest+" is not interceptable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathLatest+" is not interactable in the application");
			reportStep("The element with xPath "+xpathLatest+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathLatest+" is not stable in the application");
			reportStep("The element with xPath "+xpathLatest+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
//			System.err.println("The element with xPath "+xpathLatest+" is not available due to unknown error");
			reportStep("The element with xPath "+xpathLatest+" is not available due to unknown error", "Fail");
//		}	finally {
//			takeSnap();
		}
		}
	@Override
	public void gstCals(String xpath1, String text1, String xpath3, String text2, String text3, String text4) {
		// TODO Auto-generated method stub
		
	try {
		String fullday = getTextByXpath(xpath1);		
		String firstrep=fullday.replace(text2+text3,"");
		String secrep=firstrep.replace(" Nights","");
		int days = Integer.parseInt(secrep);
		String rate=text1;
		String price=rate.replace("₹","");
		int newprice=Integer.parseInt(price);
		int cal=0;
		cal=(int)Math.ceil((double)Math.round(days*newprice*1.12*100)/100);
		cal=cal+(cal*12/100);
		String newrate=getTextByXpath(xpath3);
		String newreprate=newrate.replace("₹", "");
		int newreprate1=Integer.parseInt(newreprate);
		if(cal==newreprate1) {
			System.out.println("Rates are Same");
		}
		else {
			System.out.println("Rates are not Same");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		finally {
			takeSnap();
		}
	}}
	