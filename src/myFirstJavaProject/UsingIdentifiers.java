package myFirstJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIdentifiers {

	public static void main(String[] args) 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://amzon.in");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("sony");// or we can directly use sendkeys after findelement
		
		WebElement button=driver.findElement(By.id("nav-search-submit-button"));
		button.click();

	}

}
