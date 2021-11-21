package testNg_apache;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class UsingAnnotations1 extends BrowserFactory

	//we are inheriting browserfactory here to use annotations @beforetest & @afterTest
{
  @Test
  public void Searchingoogle() 
  {
	  driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium webdriver");
	  
	  Actions a=new Actions(driver);
	  a.sendKeys(Keys.ENTER).perform();
	  Reporter.log("The Test is Successful",true);
	  
  }
}
