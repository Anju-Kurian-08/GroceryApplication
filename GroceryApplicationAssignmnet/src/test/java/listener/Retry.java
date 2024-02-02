package listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Retry implements IRetryAnalyzer{
	int counter = 0;
	int retryLimit = 2;


	public boolean retry(ITestResult result) {

		if(counter < retryLimit)
		{
			counter++;
			return true; //if condition passes,retry
		}
		return false;//stops retry for return value false
	}
}
