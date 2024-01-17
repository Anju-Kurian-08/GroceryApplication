package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.HomePage;
import ElementRepository.LoginPage;
import ElementRepository.Manage_Products;
import constant.Constant;

public class ManageProductspage extends Base_Class{
  @Test
  public void verifyCurrentStatusOfProducts() {
	  LoginPage lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLoginButton();
	  HomePage hp=new HomePage(driver);
	  hp.clickManageProducts();
	  Manage_Products mp=new Manage_Products(driver);
	  mp.clickActiveButton();
	  String actual=mp.getTextOfCurrentStatus();
	  String expected="Inactive";
	  Assert.assertEquals(actual,expected,Constant.errorMessageForCurrentStatusFailed);
	  
  }
}
