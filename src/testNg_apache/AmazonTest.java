package testNg_apache;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonTest 
{
  @Test
  public void search() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://amazon.in");
	  
	  driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("LG");
	  driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	  
	  driver.close();
	  
	  Reporter.log("Amazon search Test is successful...",true);
	  
	 
  }
  
}
