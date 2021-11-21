package testNg_apache;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ebaytestdemo 
{
  @Test
  public void search() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://ebay.com");
	  
	WebElement dd=  driver.findElement(By.xpath("//*[@id=\'gh-cat\']"));
	Select s=new Select(dd);
	s.selectByVisibleText("Cameras & Photo");
	
	driver.findElement(By.xpath("//*[@id=\'gh-ac\']")).sendKeys("sony");
	driver.findElement(By.xpath("//*[@id=\'gh-btn\']")).click();
	driver.close();
	
	//to get userfriendlymsg
	Reporter.log("Ebay test is successful...",true);
	
	
  }
}
