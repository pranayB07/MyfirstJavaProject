package testNg_apache;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Usingannotations2 extends BrowserFactory
{
  @Test
  public void openDrive() throws InterruptedException
  {
	  
	  driver.findElement(By.xpath("//*[@class='gb_Ve']")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[11]/a")).click();
	  
	  Reporter.log("opening Google drive test successful...",true);
  }
}
