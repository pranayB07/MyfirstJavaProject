package myFirstJavaProject;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Usingdropdown3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Category name");
		String cat=sc.nextLine();
		
		System.out.println(" Enter product name...");
		String prod=sc.nextLine();
		boolean isExist=false;
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		WebElement dd=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		List<WebElement> items=s.getOptions();
		
		for(WebElement item : items)
		{
			String Webitem=item.getText();
			if(Webitem.equalsIgnoreCase(cat))
			{
				isExist=true;
				s.selectByVisibleText(Webitem);
				
				driver.findElement(By.id("gh-ac")).sendKeys(prod);
				driver.findElement(By.id("gh-btn")).click();
				break;		
			}
		}
		if(isExist==true)
		{
			System.out.println("The " + prod + " product search in "+ cat + "  category is successful...");
			
		}
		else
			System.out.println(" The specified category is not available");
	     

	}

}
