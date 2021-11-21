package myFirstJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDropdown2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		WebElement dd=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		
		
		//s.selectByIndex(6);
		//s.selectByValue("625");
		s.selectByVisibleText("Cameras & Photo");
		
		
		driver.findElement(By.id("gh-ac")).sendKeys("sony");
		driver.findElement(By.id("gh-btn")).click();
		//driver.close();
		
		
		

	}

}
