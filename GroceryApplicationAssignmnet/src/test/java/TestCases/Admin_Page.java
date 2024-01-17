package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.Admin_Users;
import ElementRepository.HomePage;
import ElementRepository.LoginPage;
import constant.Constant;

public class Admin_Page extends Base_Class {
	@Test
	public void verifyColorOfResetButtonOfAdminUsersPage() {

		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("admin");
		lp.clickLoginButton();
		HomePage hp = new HomePage(driver);
		hp.clickAdminUsers();
		Admin_Users au = new Admin_Users(driver);
		String actual = au.getCSSValueOfResetButton("background-color");
		String expected = "rgba(255, 193, 7, 1)";
		Assert.assertEquals(actual, expected, Constant.errorMessageForColorOfResetButtonFailed);
	}

	@Test
	public void verifyTagNameOfResetButtonOfAdminUsersPage() {

		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("admin");
		lp.clickLoginButton();
		HomePage hp = new HomePage(driver);
		hp.clickAdminUsers();
		Admin_Users au = new Admin_Users(driver);
		String actual = au.getTagNameOfResetButton();
		String expected = "a";
		Assert.assertEquals(actual, expected, Constant.errorMessageForTagNameFailed);
	}

}
