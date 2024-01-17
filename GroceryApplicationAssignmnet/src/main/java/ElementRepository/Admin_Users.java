package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class Admin_Users {

	GeneralUtilities gn = new GeneralUtilities();

	public Admin_Users(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	WebElement resetbutton;

	public String getCSSValueOfResetButton(String value) {
		return gn.getCssValueOfElement(resetbutton, value);
	}

	public String getTagNameOfResetButton() {
		return gn.getTagNameOfElement(resetbutton);
	}
}
