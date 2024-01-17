package TestCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.HomePage;
import ElementRepository.LocationPage;
import ElementRepository.LoginPage;

public class LocationTestcases extends Base_Class {
	@Test
	public void verifyTextOfLocationEditStateDropdown() {

		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("admin");
		lp.clickLoginButton();
		HomePage hp = new HomePage(driver);
		hp.clickManageLocations();
		LocationPage lop = new LocationPage(driver);
		lop.clickEditButtonFromListLocationsPage();
		String actual = lop.getValueFromLocationPageStateDropdown();
		String expected = "Aberdeen";
		Assert.assertEquals(actual, expected);

	}
}
