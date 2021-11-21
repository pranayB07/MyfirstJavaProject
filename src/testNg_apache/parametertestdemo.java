package testNg_apache;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//run this program from xml file 
public class parametertestdemo 
{
  @Test
  @Parameters({"ddvalue","txtvalue"})
  public void Search(String ddvalue,String txtvalue) 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://ebay.com");
	  
	  
		WebElement dd=  driver.findElement(By.xpath("//*[@id=\'gh-cat\']"));
		Select s=new Select(dd);
		s.selectByVisibleText(ddvalue);
		
		driver.findElement(By.xpath("//*[@id=\'gh-ac\']")).sendKeys(txtvalue);
		driver.findElement(By.xpath("//*[@id=\'gh-btn\']")).click();
		driver.close();
		
		
		Reporter.log(" ''" + txtvalue + "'" + "product search in ' " + ddvalue + " ' category is successful...",true );
	  
  }
}
