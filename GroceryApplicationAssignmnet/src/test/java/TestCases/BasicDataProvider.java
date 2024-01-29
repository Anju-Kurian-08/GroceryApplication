package TestCases;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicDataProvider {
	
	@DataProvider(name = "general-data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { "admin11", "admin11" }, { "admin2", "admin2" }, { "admin3", "admin3" } };
	}
  @Test
  public void f() {
  }
}
