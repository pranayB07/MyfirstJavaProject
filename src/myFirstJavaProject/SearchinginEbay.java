package myFirstJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchinginEbay {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		driver.manage().window().maximize();
		
		WebElement srchBox=driver.findElement(By.id("gh-ac"));
		srchBox.sendKeys("sony");
		
		WebElement btn=driver.findElement(By.id("gh-btn"));
		btn.click();
		
		driver.close();
		

	}

}
