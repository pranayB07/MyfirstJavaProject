package myFirstJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingActions_mouseoperation {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		
		WebElement dd=driver.findElement(By.xpath("//a[text()='About Us']"));
		
		Actions s=new Actions(driver);
		s.moveToElement(dd).perform();
		
		Thread.sleep(1500);
		dd.click();
		

	}

}
