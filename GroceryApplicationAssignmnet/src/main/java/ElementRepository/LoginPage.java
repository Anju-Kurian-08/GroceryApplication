package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement buttonclick;
	
	
	public void enterUserName(String uname)
	{
		username.sendKeys(uname);
	}
	public void enterPassword(String pword)
	{
		password.sendKeys(pword);
	}
	public void clickLoginButton()
	{
		buttonclick.click();
	}

}
