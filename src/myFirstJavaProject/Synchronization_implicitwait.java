package myFirstJavaProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization_implicitwait {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com");
		
		//implicitwait syntax
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("pranaybolla@yahool.com");
		
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\'recaptcha-anchor\']/div[1]")).click();
		driver.close();
		
	}

}
