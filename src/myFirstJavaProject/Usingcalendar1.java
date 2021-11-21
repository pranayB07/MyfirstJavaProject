package myFirstJavaProject;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingcalendar1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date to select");
		String date=sc.nextLine();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://redbus.in");
	
		
		//from
		driver.findElement(By.xpath("//*[@id='src']")).sendKeys("hyderabad");
		//to
		driver.findElement(By.xpath("//*[@id='dest']")).sendKeys("karimnagar");
		
		//dayselection
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/span")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
		
		System.out.println(rows.size());
		
		for(int i=0;i<=rows.size();i++)
		{
			List<WebElement> col=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td"));
			
			for(int j=1;j<=col.size();j++)
			{
				WebElement cell=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td[" + j + "]"));
				
				if(cell.getText().equalsIgnoreCase(date))
				{
					cell.click();
					break;
				}
				
			}
			
		}
		
		
		
	}

}
