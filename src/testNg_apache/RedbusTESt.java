package testNg_apache;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RedbusTESt
{
  @Test
  public void dateselection() 
  {
	  
	  @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the date to be select..");
	  String date=sc.nextLine();
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://redbus.in");
	  
	  
	  driver.findElement(By.xpath("//*[@id=\'onward_cal\']")).click();
	  
	 List<WebElement> rows= driver.findElements(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr"));
	 
	 for(int i=3;i<=rows.size();i++)
	 {
	List<WebElement> col=driver.findElements(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[" + i + "]/td"));
	
	for(int j=1;j<=col.size();j++)
	{
		WebElement cell=driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[" + i + "]/td[" + j + "]"));
		
		if(cell.getText().equalsIgnoreCase(date))
		{
			cell.click();
			break;
		}
	}
	
	 }
	  Reporter.log("Redbus test is successful..",true);
  }
}
