package testNg_apache;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class DependencyTestDemo extends BrowserFactory
{
	
  @Test(dependsOnMethods ="checktitle")
  public void searchdemo() 
  {
	  driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium webdriver");
	  
	  Actions a=new Actions(driver);
	  a.sendKeys(Keys.ENTER).perform();
	 System.out.println("searchdemo test is passed");
	 
  }
  
  //Using Assertions
  @Test
  public void checktitle()
  {
	  String title=driver.getTitle();
	  Assert.assertEquals(title,"Google");
	  System.out.println("checktitle test is passed..");
	  
  }  
}

