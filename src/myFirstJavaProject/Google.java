package myFirstJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium webdriver");
		
		driver.close();
		
		//driver.getTitle(); //no such session exception will come
	}

}
