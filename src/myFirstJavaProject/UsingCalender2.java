package myFirstJavaProject;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCalender2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month to select");
		String month=sc.nextLine();
		month=month.substring(0,3); //to take only first 3 char from user given month
		System.out.println("Enter date to be select");
		String date=sc.nextLine();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://redbus.in");
		
		//from
				driver.findElement(By.xpath("//*[@id='src']")).sendKeys("hyderabad");
				//to
				driver.findElement(By.xpath("//*[@id='dest']")).sendKeys("karimnagar");
				
				driver.findElement(By.xpath("//*[@id=\'onward_cal\']")).click();
				
				
				while(!driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText().substring(0,3).equalsIgnoreCase(month))
				{
					driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal\']/table/tbody/tr[1]/td[3]")).click();
			
				}
			
				
				List<WebElement> rows=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
				
				for(int i=3;i<=rows.size();i++)
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
