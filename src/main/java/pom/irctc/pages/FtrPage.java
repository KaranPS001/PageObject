 package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrPage extends GenericWrappers{

		public FtrPage enterUserid(String UserId) {
			enterByXpath(prop.getProperty("FtrPage.UserId.XPath"), UserId);
			return this;
		}
		public FtrPage enterPassword(String Password) {
			enterByXpath(prop.getProperty("FtrPage.Password.XPath"), Password);
			return this;
		}
		public FtrPage enterCnfPassword(String ConfirmPwd) {
			enterByXpath(prop.getProperty("FtrPage.CnfPassword.XPath"), ConfirmPwd);
			return this;
		}
		public FtrPage selectSecQue(String SecQue)	{
			int secque = Integer.parseInt(SecQue);
			selectIndexByXpath(prop.getProperty("FtrPage.SecQuestion.XPath"), secque);
			return this;
		}
		public FtrPage enterSecAns(String SecAns)	{
			enterByXpath(prop.getProperty("FtrPage.SecAnswer.XPath"), SecAns);
			return this;
		}
		public FtrPage clickDob() {
			clickByXpathNoSnap(prop.getProperty("FtrPage.Dob.XPath"));
			return this;
		}
		public FtrPage selectMonth(String Month) {
			int month = Integer.parseInt(Month);
			selectIndexByXpath(prop.getProperty("FtrPage.Month.XPath"), month);
			return this;
		}
		public FtrPage selectYear(String Year) {
			selectValueByXpath(prop.getProperty("FtrPage.Year.XPath"), Year);
			return this;
		}
		public FtrPage clickDate(String Date) {
//			clickByXpath(prop.getProperty("FtrPage.Date.XPath"));
			clickOptionByXpath(prop.getProperty("FtrPage.Date.XPath"), Date);
			return this;
		}
		public FtrPage clickGender(String Gender) {
//			clickByXpath(prop.getProperty("FtrPage.Gender.XPath"), Gender);
			clickOptionByXpath(prop.getProperty("FtrPage.Gender.XPath"), Gender);
			return this;
		}
		public FtrPage clickMarital(String Marital) {
//			clickByXpath(prop.getProperty("FtrPage.Marital.XPath"));
			clickOptionByXpath(prop.getProperty("FtrPage.Marital.XPath"), Marital);
			return this;
		}
		public FtrPage enterEmail(String EmailId) {
			enterByXpath(prop.getProperty("FtrPage.EmailId.XPath"), EmailId);
			return this;
		}
		public FtrPage selectOccupation(String Occupation)	{
			int occupation = Integer.parseInt(Occupation);
			selectIndexByXpath(prop.getProperty("FtrPage.Occupation.XPath"), occupation);
			return this;
		}
		public FtrPage enterFirstName(String FirstName) {
			enterByXpath(prop.getProperty("FtrPage.FirstName.XPath"), FirstName);
			return this;
		}
		public FtrPage enterMiddleName(String MiddleName) {
			enterByXpath(prop.getProperty("FtrPage.MiddleName.XPath"), MiddleName);
			return this;
		}
		public FtrPage enterLastName(String LastName) {
			enterByXpath(prop.getProperty("FtrPage.LastName.XPath"), LastName);
			return this;
		}
		public FtrPage selectNationality(String Nationality) {
			selectValueByXpath(prop.getProperty("FtrPage.Nationality.XPath"), Nationality);
			return this;
		}
		public FtrPage enterDoorNo(String DoorNo) {
			enterByXpath(prop.getProperty("FtrPage.DoorNo.XPath"), DoorNo);
			return this;
		}
		public FtrPage enterStreet(String Street) {
			enterByXpath(prop.getProperty("FtrPage.Street.XPath"), Street);
			return this;
		}
		public FtrPage enterArea(String Area) {
			enterByXpath(prop.getProperty("FtrPage.Area.XPath"), Area);
			return this;
		}
		public FtrPage selectCountry(String Country) {
			selectValueByXpath(prop.getProperty("FtrPage.Country.XPath"), Country);
			return this;
		}
		public FtrPage enterMobileNo(String MobileNo) {
			enterByXpath(prop.getProperty("FtrPage.MobileNo.XPath"), MobileNo);
			return this;
		}
		public FtrPage enterPincode(String Pincode) {
			enterByXpath(prop.getProperty("FtrPage.Pincode.XPath"), Pincode);
			return this;
		}
		public FtrPage sendKeysTab() {
			sendkeysTab();
			return this;
		}
		public FtrPage sendKeysPagedown() {
			sendkeysPageDown();
			return this;
		}
		public FtrPage selectCity(String City) {
			selectValueByXpath(prop.getProperty("FtrPage.City.XPath"), City);
			return this;
		}
		public FtrPage selectState(String State) {
			selectValueByXpath(prop.getProperty("FtrPage.State.XPath"), State);
			return this;
		}
		public FtrPage selectPostOffice(String PostOffice) {
			int postoffice = Integer.parseInt(PostOffice);
			selectIndexByXpath(prop.getProperty("FtrPage.PostOffice.XPath"), postoffice);
//			selectValueByXpath(prop.getProperty("FtrPage.PostOffice.XPath"), PostOffice);
			return this;
		}
		public FtrPage clickAddressButton(String SameAddress) {
//			clickByXpath(prop.getProperty("FtrPage.AddressButton.XPath"));
			clickOptionByXpath(prop.getProperty("FtrPage.AddressButton.XPath"), SameAddress);
			return this;
		}
		public FtrPage enterC_Door(String C_Door) {
			enterByXpath(prop.getProperty("FtrPage.C_Door.XPath"), C_Door);
			return this;
		}
		public FtrPage enterC_Street(String C_Street) {
			enterByXpath(prop.getProperty("FtrPage.C_Street.XPath"), C_Street);
			return this;
		}
		public FtrPage enterC_Area(String C_Area) {
			enterByXpath(prop.getProperty("FtrPage.C_Area.XPath"), C_Area);
			return this;
		}
		public FtrPage selectC_Country(String C_Country) {
			selectValueByXpath(prop.getProperty("FtrPage.C_Country.XPath"), C_Country);
			return this;
		}
		public FtrPage enterC_Mobile(String C_Mobile) {
			enterByXpath(prop.getProperty("FtrPage.C_Mobile.XPath"), C_Mobile);
			return this;
		}
		public FtrPage enterC_Pincode(String C_Pincode) {
			enterByXpath(prop.getProperty("FtrPage.C_Pincode.XPath"), C_Pincode);
			return this;
		}
		public FtrPage selectC_City(String C_City) {
			selectValueByXpath(prop.getProperty("FtrPage.C_City.XPath"), C_City);
			return this;
			}
		public FtrPage selectC_State(String C_State) {
			selectValueByXpath(prop.getProperty("FtrPage.C_State.XPath"), C_State);
			return this;
			}
		public FtrPage selectC_PostOffice(String C_PostOffice) {
			int c_postoffice = Integer.parseInt(C_PostOffice);
			selectIndexByXpath(prop.getProperty("FtrPage.C_PostOffice.XPath"), c_postoffice);
			return this;
		}
		public FtrPage clickProfileButton() {
			clickByXpathNoSnap(prop.getProperty("FtrPage.ProfileButton.XPath"));
			return this;
		}
		public FtrPage waitTime(long time) {
			waitProperty(time);
			return this;
		
		}

}
