package ElementRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;
import utilities.GeneralUtilities;

public class SliderPage {
	GeneralUtilities gn = new GeneralUtilities();

	public SliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/slider/edit?edit=1007&page_ad=1']")
	WebElement sliderEdit;

	@FindBy(xpath = "//button[@name='update']")
	WebElement updateClick;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successtoast;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/slider/delete?del=1002&page_ad=1']")
	WebElement deleteClick;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Slider/add']")
	WebElement newClick;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement linkTextbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveClick;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement newSuccess;
	
	/*@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tbody//tr[1]//td[2]")
	WebElement table;*/
	
	
	public void clickEditFromListSlidersPage() {
		gn.clickOnElement(sliderEdit);
	}

	public void clickUpdateButtonFromEditSliderPage() {
		gn.clickOnElement(updateClick);
	}

	public String getTextOfSuccessMessage() {

		return gn.getElementText(successtoast);
	}

	public boolean verifyElementPresenceOfSuccessMessage() {
		return gn.elementVisible(successtoast);
	}
	
	public void clickDeleteButtonFromEditSliderPage()
	{
		gn.clickOnElement(deleteClick);
	}
	
	public void clickNewIconFromListSlidersPage()
	{
		gn.clickOnElement(newClick);
	}
	
	public void sendValuesToLinkTextboxInAddSliderPage(String value)
	{
		gn.enterValueInTextBox(linkTextbox,value);
	}
	public void clickSaveButtonInAddSliderPage()
	{
		gn.clickOnElement(saveClick);
	}
	public boolean verifyElementPresenceOfNewSuccessMessage()
	{
		return gn.elementVisible(newSuccess);
	}
	
	public void verifyClickOkOnAlertButton()
	{
		gn.clickOkonAlertButton(driver);
	}
}
