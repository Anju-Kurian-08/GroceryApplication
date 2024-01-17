package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class Push_Notifications {
	GeneralUtilities gn=new GeneralUtilities();
	
	public Push_Notifications(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
WebDriver driver;

@FindBy(id="title")
WebElement title;

@FindBy(id="description")
WebElement description;

@FindBy(xpath="//button[@type='submit']")
WebElement sendButton;

@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
WebElement successToast;

public void sendKeysToTitleTextbox(String value)
{
gn.enterValueInTextBox(title,value);	
}

public void sendKeysToDescriptionTextbox(String value)
{
	gn.enterValueInTextBox(description, value);
}

public void clickSendButton()
{
	gn.clickOnElement(sendButton);
}

public boolean verifyPresenceOfSuccessToast()

{
	return gn.elementVisible(successToast);
}

public String getCssValueOfSendButton(String value)
{
	return gn.getCssValueOfElement(sendButton,value);
}

public String getAttributeValueOfSendButton(String value)
{
	return gn.getAttributeValueOfElement(sendButton, value);
}
}
