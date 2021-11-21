package myFirstJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		//absolute xpath is not reliable
		WebElement search=driver.findElement(By.xpath("/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]"));
		search.sendKeys("Sony");
		//relative xpath
		driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
		
		

	}

}
