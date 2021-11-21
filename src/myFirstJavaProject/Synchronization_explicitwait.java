package myFirstJavaProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_explicitwait {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com");
		
		
		driver.findElement(By.xpath("//*[@id=\'ybar-inner-wrap\']/div[3]/div/div[3]/div[1]/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\'login-username\']")).sendKeys("pranaybolla@yahool.com");
		
		driver.findElement(By.xpath("//*[@id=\'login-signin\']")).click();
		
		//Explicitwait..
		
		WebDriverWait explicitWait=new WebDriverWait(driver, 10);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'verification-code-field\']")));
		
		driver.findElement(By.xpath("//*[@id=\'verification-code-field\']")).sendKeys("pra123");
		

	}

}
