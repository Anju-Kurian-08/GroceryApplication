package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class Manage_Products {

	GeneralUtilities gn = new GeneralUtilities();

	public Manage_Products(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/status?id=1175&st=inactive&page_ad=1']")
	WebElement statusActive;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/status?id=1175&st=active&page_ad=1']")
	WebElement statusInactive;

	public void clickActiveButton() {
		gn.clickOnElement(statusActive);
	}

	public String getTextOfCurrentStatus() {
		return gn.getElementText(statusInactive);
	}
}
