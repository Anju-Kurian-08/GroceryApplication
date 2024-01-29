package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class GeneralUtilities {

	public String getElementText(WebElement element) {
		String text = element.getText();
		return text;
	}

	

	public String getValueFromDropdown(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);
		WebElement selectedvalue = select.getFirstSelectedOption();
		String text = selectedvalue.getText();
		return text;

	}

	public void clickMenusFromNavigationBar(WebElement element) {
		element.click();
	}

	public void clickOnElement(WebElement element) {
		element.click();
	}

	public boolean elementVisible(WebElement element) {
		return element.isDisplayed();
	}

	public void enterValueInTextBox(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void clickOkonAlertButton(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/*
	 * public void enterIntegerValuesToTextBox(WebElement element,CharSequence
	 * value) { element.sendKeys(value); }
	 */

	public String getCssValueOfElement(WebElement element, String value) {
		return element.getCssValue(value);
	}

	public String getAttributeValueOfElement(WebElement element, String value) {
		return element.getAttribute(value);
	}

	public String getTagNameOfElement(WebElement element) {
		return element.getTagName();

	}

	public String getElementsTextFromTable(List<WebElement> elements) {

		StringBuilder stringBuilder = new StringBuilder();

		for (WebElement element : elements) {
			stringBuilder.append(element.getText());
		}

		return stringBuilder.toString();
	}
	
	public void scrollToBottom(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1000000)","");
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	}

	/*public String getTableCellValue(WebDriver driver, String tableId, int columnIndex, int targetColumnIndex,
			String text) {

		List<WebElement> uniquecolumn = driver
				.findElements(By.xpath("//table[@class='" + tableId + "']//tbody//td[" + columnIndex + "]"));
		String locator = null;

		for (int i = 0; i < uniquecolumn.size(); i++)
		{

			if (uniquecolumn.get(i).getText().equals(text)) 
			{
				locator = "//table[@class='" + tableId + "']//tbody//tr[" + (i + 1) + "]//td[" + targetColumnIndex + "]";
				break;
			}
		}

		if (locator != null) 
		{
			WebElement reqValue = driver.findElement(By.xpath(locator));
			return reqValue.getText();
		} 
		else 
		{

			return "Text not found";
		}
	}*/
	public String getTableCellValue(WebDriver driver, By locator, int targetColumnIndex,
			String text) {

		List<WebElement> uniquecolumn = driver
				.findElements(locator);
		String cellLocator = null;

		for (int i = 0; i < uniquecolumn.size(); i++)
		{

			if (uniquecolumn.get(i).getText().equals(text)) 
			{
				cellLocator = "//tr[" + (i + 1) + "]//td[" + targetColumnIndex + "]";
				break;
			}
		}

		if (cellLocator != null) 
		{
			WebElement reqValue = driver.findElement(By.xpath(cellLocator));
			return reqValue.getText();
		} 
		else 
		{

			return "Text not found";
		}
	}
}
