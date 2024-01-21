package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
	
	

	    WebDriver driver;
	    WebDriverWait wait;

	    public Explicit_Wait(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofMillis(1000000));
	    }
	
	public WebElement waitForElementToBePresent(By locator)
	{
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	  public WebElement waitForElementToBeClickable(By locator) {
		  
	        return wait.until(ExpectedConditions.elementToBeClickable(locator));
	    }
}
