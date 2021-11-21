package myFirstJavaProject;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Synchronization_fluentwait {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultvb.aspx?skin=Telerik");
		
		String beforeSel=driver.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceholder1_Label1\']")).getText();
		
		System.out.println("Before Date Selection : " + beforeSel);
		
		driver.findElement(By.linkText("12")).click();
		
		FluentWait w=new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
		
		String afterSel=driver.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceholder1_Label1\']")).getText();
		
		System.out.println("After Date Selecton : " + afterSel);
		

	}

}
