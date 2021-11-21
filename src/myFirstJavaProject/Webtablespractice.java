package myFirstJavaProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablespractice 
{

	public static void main(String[] args) 
	{
		WebDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.navigate().to("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> rows=chrome.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		
		for(int i = 2;i<=rows.size();i++)
		{
			List<WebElement> col=chrome.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + i + "]/td"));
			
			for(int j=1;j<=col.size();j++)
			{
				WebElement cell=chrome.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + i + "]/td[" + j + "]"));
				
				System.out.println(cell.getText() + " ||");
			}
			System.out.println( );
		}
		
		chrome.close();
	}
	

}
