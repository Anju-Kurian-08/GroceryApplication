package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.HomePage;
import ElementRepository.LoginPage;
import constant.Constant;
import utilities.Read_Data_FromExcel;



public class LoginTestcases extends Base_Class{
  @Test
 public void verifyLoginWithValidUser() throws IOException {
	  
	  LoginPage lp=new LoginPage(driver);
	  lp.enterUserName(Read_Data_FromExcel.getStringdata(0, 1));
	  lp.enterPassword(Read_Data_FromExcel.getStringdata(1, 1));
	  lp.clickLoginButton();
	  HomePage hp=new HomePage(driver);
	  String actual=hp.getTextLogineduser();
	  String expected="Admin";
	  Assert.assertEquals(actual, expected,Constant.errorMessageForInvalidLogin);
}
}
