package testNg_apache;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencytestpractice extends BrowserFactory{
	
  @Test(dependsOnMethods = "checktitle")
  public void search() {
	  
	  driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium Webdriver");
	 
	  Actions a=new Actions(driver);
	  a.sendKeys(Keys.ENTER).perform();
	  System.out.println("Search test demo is passed");
  }
  
  @Test
  public void checktitle() {
	  
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Google");
  }
}
