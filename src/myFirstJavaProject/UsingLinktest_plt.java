package myFirstJavaProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsingLinktest_plt {

	public static void main(String[] args) 
	{
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://amazon.in");
	
	List<WebElement> link=driver.findElements(By.tagName("span"));
	System.out.println("no of links in the page  " + link.size());
	
	System.out.println("The links Are ...  :");
	
	for(WebElement links : link)
	{
		System.out.println(links.getText());
	}
	
	
	//driver.findElement(By.linkText("Fashion")).click();
	//driver.findElement(By.partialLinkText("Fashion")).click();
	
	}

}
