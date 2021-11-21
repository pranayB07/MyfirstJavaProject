package myFirstJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingfindElement {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		
		WebElement txt=driver.findElement(By.id("twotabsearchtextbox"));
		txt.sendKeys("sony");
		
		
		WebElement btn=driver.findElement(By.id("nav-search-submit-button"));
		btn.click();
		
		

	}

}
