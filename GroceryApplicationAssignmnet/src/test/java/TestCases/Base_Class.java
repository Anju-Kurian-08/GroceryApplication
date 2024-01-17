package TestCases;

import org.testng.annotations.Test;

import utilities.Capture_Screenshot_Failure;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Base_Class {

	WebDriver driver;

	public static Properties properties;

	// Create reference variable and we can get thevalues from config.properties

	public static void readFromProperties() throws IOException {
		properties = new Properties();
		//fileinputsream used to read data/write from external files in byte format used in java
		FileInputStream ip = new FileInputStream(
		System.getProperty("user.dir") + "//src//main//resources//config.properties");
		properties.load(ip);
	}

	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void beforeMethod(String browsr) throws IOException {
		readFromProperties();
		if(browsr.equals("chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if(browsr.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.get(properties.getProperty("baseUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult itestresult) throws IOException {

		if (itestresult.getStatus() == ITestResult.FAILURE) {
			Capture_Screenshot_Failure cs = new Capture_Screenshot_Failure();
			cs.captureFailureScreenShot(driver, itestresult.getName());
		}

		driver.close();
	}

}
