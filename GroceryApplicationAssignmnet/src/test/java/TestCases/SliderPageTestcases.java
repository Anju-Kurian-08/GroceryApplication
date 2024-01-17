package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.HomePage;
import ElementRepository.LoginPage;
import ElementRepository.SliderPage;
import constant.Constant;

public class SliderPageTestcases extends Base_Class{
  @Test
  public void verifyUpdateOfSliderPage() {
	  LoginPage lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLoginButton();
	  HomePage hp=new HomePage(driver);
	  hp.clickManageSliders();
	  SliderPage sp=new SliderPage(driver);
	  sp.clickEditFromListSlidersPage();
	  sp.clickUpdateButtonFromEditSliderPage();
	  boolean actual=sp.verifyElementPresenceOfSuccessMessage();
	  boolean expected=true;
	  Assert.assertEquals(actual, true);
	  }
   @Test(groups = {"smoketest"})
  public void verifyNewAddOfSliderPage() {
	  LoginPage lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLoginButton();
	  HomePage hp=new HomePage(driver);
	  hp.clickManageSliders();
	  SliderPage sp=new SliderPage(driver);
	  sp.clickNewIconFromListSlidersPage();
	  sp.sendValuesToLinkTextboxInAddSliderPage("sample text");
	  sp.clickSaveButtonInAddSliderPage();
	  boolean actual=sp.verifyElementPresenceOfNewSuccessMessage();
	  boolean expected=true;
	  Assert.assertEquals(actual, true);
	  
  }
   @Test
   public void verifyDeleteOfSlidesFromSliderPage() { 
	   LoginPage lp=new LoginPage(driver);
	   lp.enterUserName("admin");
	   lp.enterPassword("admin");
	   lp.clickLoginButton();
	   HomePage hp=new HomePage(driver);
	   hp.clickManageSliders();
	   SliderPage sp=new SliderPage(driver);
	   sp.clickDeleteButtonFromEditSliderPage();
	   sp.verifyClickOkOnAlertButton();
	   boolean actual=sp.verifyElementPresenceOfSuccessMessage();
	   boolean expected=true;
	   Assert.assertEquals(actual, true,Constant.errorMessageForDeleteFailed);
   
}
}
