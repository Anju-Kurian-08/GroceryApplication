package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class LocationPage {

	GeneralUtilities gn = new GeneralUtilities();

	public LocationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Location/edit?edit=1910&page_ad=1']")
	WebElement editClick;

	@FindBy(xpath = "//select[@name='state_id']")
	WebElement stateDropdown;

	public void clickEditButtonFromListLocationsPage() {
		gn.clickOnElement(editClick);
	}

	public String getValueFromLocationPageStateDropdown() {
		return gn.getValueFromDropdown(stateDropdown, 1);
	}

}
