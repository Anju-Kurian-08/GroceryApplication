package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class HomePage {

	GeneralUtilities gu = new GeneralUtilities();

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement logineduser;

	@FindBy(xpath = "//i[@class='nav-icon fas fa-map-marker']")
	WebElement locationclick;

	@FindBy(xpath = "//i[@class='nav-icon fas fa-window-restore']")
	WebElement sliderClick;
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-shopping-basket']")
	WebElement manageOrders;
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-fas fa-bell']")
	WebElement clickPushNotifications;
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-users']")
	WebElement clickAdminUsers;
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-tasks']")
	WebElement manageProducts;

	public String getTextLogineduser() {

		return gu.getElementText(logineduser);
	}

	public void clickManageLocations() {
		gu.clickOnElement(locationclick);
	}

	public void clickManageSliders() {
		gu.clickOnElement(sliderClick);
	}
	
	public void clickManageOders()
	{
		gu.clickOnElement(manageOrders);
	}
	
	public void clickPushNotification()
	{
		gu.clickOnElement(clickPushNotifications);
	}
	
	public void clickAdminUsers()
	{
		gu.clickOnElement(clickAdminUsers);
	}
	
	public void clickManageProducts()
	{
		gu.clickOnElement(manageProducts);
	}
}
