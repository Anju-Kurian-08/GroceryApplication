package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.HomePage;
import ElementRepository.LoginPage;
import ElementRepository.Manage_Orders;
import constant.Constant;

public class ManageOders extends Base_Class {
	@Test
	public void verifySearchedOrdersFromManageOrdersPage() {

		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("admin");
		lp.clickLoginButton();
		HomePage hp = new HomePage(driver);
		hp.clickManageOders();
		Manage_Orders mo = new Manage_Orders(driver);
		mo.clickOnSearch();
		mo.sendValuesToOrderId("708");
		mo.clickSearchToListSearchedOrders();
		String actual = mo.getTextOfListedOrder();
		String Expected = "708";
		Assert.assertEquals(actual, Expected, Constant.errorMessageForSearchOfOrderIdFailed);
	}

	@Test
	public void verifyColorOfDeleteButtonFromListOrdersPage() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("admin");
		lp.clickLoginButton();
		HomePage hp = new HomePage(driver);
		hp.clickManageOders();
		Manage_Orders mp = new Manage_Orders(driver);
		String actual = mp.getStylesOfDeleteButton("background-color");
		String expected = "rgba(220, 53, 69, 1)";
		Assert.assertEquals(actual, expected, Constant.errorMessageForColorOfDeleteButtonFailed);
	}

	@Test
	public void verifyBorderRadiusOfDeleteButtonFromListOrdersPage() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("admin");
		lp.clickLoginButton();
		HomePage hp = new HomePage(driver);
		hp.clickManageOders();
		Manage_Orders mp = new Manage_Orders(driver);
		String actual = mp.getStylesOfDeleteButton("border-radius");
		String expected = "3.2px";
		Assert.assertEquals(actual, expected, Constant.errorMessageForBorderRadiusOfDeleteButtonFailed);
	}

	@Test(groups = {"smoketest"})
	public void verifyHeadingsOfColumnsOfOrders() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("admin");
		lp.clickLoginButton();
		HomePage hp = new HomePage(driver);
		hp.clickManageOders();
		Manage_Orders mp = new Manage_Orders(driver);
		String actual = mp.getHeaderValuesOfTable();
		String expected = "Order IdUserOrder DateAmountPayment ModeStatusAction";
		Assert.assertEquals(actual, expected, Constant.errorMessageForHeaderNamesFailed);
	}

}
