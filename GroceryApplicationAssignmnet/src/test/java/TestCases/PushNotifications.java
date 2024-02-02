package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.HomePage;
import ElementRepository.LoginPage;
import ElementRepository.Push_Notifications;
import constant.Constant;

public class PushNotifications extends Base_Class {
	@Test(groups = {"smoketest"})
	public void verifySendOfPushNotification() {

		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("admin");
		lp.clickLoginButton();
		HomePage hp = new HomePage(driver);
		hp.clickPushNotification();
		Push_Notifications pn = new Push_Notifications(driver);
		pn.sendKeysToTitleTextbox("title send");
		pn.sendKeysToDescriptionTextbox("send description");
		pn.clickSendButton();
		boolean actual = pn.verifyPresenceOfSuccessToast();
		boolean expected = true;
		Assert.assertEquals(actual, true, Constant.errorMessageForPushNotificationSendFailed);
	}

	@Test(groups = {"smoketest"})
	public void verifyCssValuesOfSendButtonInPushNotificationPage() {

		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("admin");
		lp.clickLoginButton();
		HomePage hp = new HomePage(driver);
		hp.clickPushNotification();
		Push_Notifications pn = new Push_Notifications(driver);
		String actual = pn.getCssValueOfSendButton("background-color");
		String expected = "rgba(23, 162, 184, 1)";
		Assert.assertEquals(actual, expected, Constant.errorMessageForColorOfSendButtonFailed);
		String actual1 = pn.getCssValueOfSendButton("text-align");
		String expected1 = "center";
		Assert.assertEquals(actual1, expected1, Constant.errorMessageForTextAlignOfSendButtonFailed);
	}

	@Test(groups = {"smoketest"})
	public void verifyBorderColorOfSendButtonInPushNotificationPage() {

		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("admin");
		lp.clickLoginButton();
		HomePage hp = new HomePage(driver);
		hp.clickPushNotification();
		Push_Notifications pn = new Push_Notifications(driver);
		String actual = pn.getCssValueOfSendButton("border-color");
		String expected = "rgb(23, 162, 184)";
		Assert.assertEquals(actual, expected, Constant.errorMessageForBorderColorOfSendButtonFailed);
	}

	@Test(groups = {"smoketest"},retryAnalyzer =listener.Retry.class)
	public void verifyAttributeValueOfClassOfSendButtonInPushNotificationPage() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("admin");
		lp.clickLoginButton();
		HomePage hp = new HomePage(driver);
		hp.clickPushNotification();
		Push_Notifications pn = new Push_Notifications(driver);
		String actual = pn.getAttributeValueOfSendButton("class");
		String expected = "btn btn-block-sm btn-info";
		Assert.assertEquals(actual, expected, Constant.errorMessageForAttributeValueOfSendButtonFailed);
	}

}
