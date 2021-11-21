package testNg_apache;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BrowserFactory 
{
	public WebDriver driver;
	
	//we created driver variable(webdriver type) at class level, so we can use this at any functionality in class
	
  @BeforeTest
  public void OpeningBrowser() 
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://google.com");
  }

  @AfterTest
  public void TerminatingBrowser() 
  {
	  driver.close();
  }

}
