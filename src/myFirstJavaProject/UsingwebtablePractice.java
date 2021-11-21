package myFirstJavaProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingwebtablePractice {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\'customers\']/tbody/tr"));
		
		for(int i=2 ; i<=rows.size(); i++)
		{
			List<WebElement> col=driver.findElements(By.xpath("//*[@id=\'customers\']/tbody/tr[" + i  + "]/td"));
			
			for (WebElement webElement : col) {
				
				System.out.print(webElement.getText() + "||");
				
			}
			System.out.println();
		}
		
	
	}

}
