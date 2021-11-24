package testNg_apache;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizeTestingPractice {
	
	 WebDriver driver;
  @Test
  @Parameters({"searchtxt", "ddvalue"})
  public void ebaySearch(String searchtxt , String ddvalue) 
  {
	  driver=new ChromeDriver();
	  driver.get("http://ebay.com");
	  
	  WebElement dd=driver.findElement(By.xpath("//*[@id=\'gh-cat\']"));
	  Select s=new Select(dd);
	  s.selectByVisibleText(ddvalue);
	  
	  driver.findElement(By.xpath("//*[@id=\'gh-ac\']")).sendKeys(searchtxt);
	  
	  driver.findElement(By.xpath("//*[@id=\'gh-btn\']")).click();
	  
	  
  }
  
  @AfterTest
  
  public void closingBrowser()
  {
	 driver.close();
  }
}
