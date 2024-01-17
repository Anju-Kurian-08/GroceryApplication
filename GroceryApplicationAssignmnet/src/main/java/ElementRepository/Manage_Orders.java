package ElementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class Manage_Orders {
	GeneralUtilities gn=new GeneralUtilities();
	
	public Manage_Orders(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
WebDriver driver;

@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
WebElement search;

@FindBy(id="od")
WebElement orderId;

@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")
WebElement searchListOrders;

@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tbody//tr[1]/td[1]")
WebElement orderListTable;

@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//thead//tr[1]//th")
List <WebElement> tableHeader;

@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Order/delete?del=708&page_ad=1']")
WebElement deleteOrders;

public void clickOnSearch()
{
	gn.clickOnElement(search);
}

public void sendValuesToOrderId(String value)
{
	gn.enterValueInTextBox(orderId, value);
}

public void clickSearchToListSearchedOrders()
{
	gn.clickOnElement(searchListOrders);
}

public String getTextOfListedOrder()
{
	return gn.getElementText(orderListTable);
}

public String getStylesOfDeleteButton(String value)
{
	return gn.getCssValueOfElement(deleteOrders, value);
}
public String getHeaderValuesOfTable()
{
	return gn.getElementsTextFromTable(tableHeader);
}
}
