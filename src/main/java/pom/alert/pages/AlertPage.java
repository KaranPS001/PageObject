package pom.alert.pages;

import wrappers.GenericWrappers;
	
	public class AlertPage extends GenericWrappers{
		
		public AlertPage switchtoFrame() {
			switchToFrame(prop.getProperty("AlertPage.SwitchToFrame.XPath"));
			return new AlertPage();
		}
		public AlertPage clickTryButton() {
			clickByXpathNoSnap(prop.getProperty("AlertPage.TryItButton.XPath"));
			return this;			
		}
		public AlertPage alertText() {
			getAlertText();
			return this;
		}
		public AlertPage enterInputText(String InputMsg) {
			alertSendKeys(InputMsg);
			return this;
		}
		public AlertPage verifyInputText(String InputMsg) {
			verifyTextContainsByXpath(prop.getProperty("AlertPage.InputText.XPath"), InputMsg);
			return this;
		}
		public AlertPage verifyOkText(String OkAlert) {
			verifyTextByXpath(prop.getProperty("AlertPage.OkAlert.XPath"), OkAlert);
			return this;
		}
		public AlertPage verifyCancelText(String CancelAlert) {
			verifyTextByXpath(prop.getProperty("AlertPage.CancelAlert.XPath"), CancelAlert);
			return this;
		}
		public AlertPage switchDefault() {
			switchToDefault();
			return this;
		}
		public AlertPage refreshPage() {
			refresh();
			return this;
		}
		public HomePage clickHome() {
				clickByXpath(prop.getProperty("HomePage.Homepage.XPath"));
				return new HomePage();
		}
		public AlertPage clickOk() {
			acceptAlert();
			return this;
		}
		public AlertPage clickCancel() {
			dismissAlert();
			return this;
		}
		public AlertPage waitTime() {
			waitProperty(3000);
			return this;
		}
	}

		