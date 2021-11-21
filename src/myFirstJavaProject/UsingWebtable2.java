package myFirstJavaProject;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebtable2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the company name to search...");
		String comp=sc.nextLine();
		boolean isAvail=false;
		String country=null;
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		
		for(int i=2;i<=rows.size();i++)
		{
		String webcomp=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[1]")).getText();
		 
		if(webcomp.equalsIgnoreCase(comp))
		{
			isAvail=true;
			country=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[3]")).getText();
			break;
		}
			
		}
		if(isAvail==true)
		{
			System.out.println(" '" + comp + "'" + " company is located in country " + country);
		}
		else
			System.out.println(" The specified company is not available..");
		
		driver.close();

	}

}
