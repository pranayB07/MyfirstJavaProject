package myFirstJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://amazon.in");
	String mainTitle=driver.getTitle();
	String winId=driver.getWindowHandle();
	String pageUrl=driver.getCurrentUrl();
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lenovo");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.className("a-truncate-cut")).click();
	
	System.out.println("The Title of the page is  :" + mainTitle);
	System.out.println("The Id of the page is " + winId);
	System.out.println("The page url is " + pageUrl);
	
	driver.close();
	
		 
	}

}
