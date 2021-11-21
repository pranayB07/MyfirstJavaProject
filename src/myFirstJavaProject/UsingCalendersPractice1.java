package myFirstJavaProject;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCalendersPractice1 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date of travel");
		String date1=sc.nextLine();
		
		System.out.println("Enter date of returning");
		String date2=sc.nextLine();
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.abhibus.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='source']")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//*[@id='destination']")).sendKeys("karimnagar");
		
		driver.findElement(By.xpath("//*[@id='datepicker1']")).click();
		
		List<WebElement> rows1=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr"));
		
		for (int i = 3; i < rows1.size(); i++) 
		{
			List<WebElement> col1=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[" + i + "]/td"));
			
			for(int j=1;j<=col1.size();j++)
			{
				WebElement webelement1=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[" + i + "]/td[" + j + "]"));
				
				if(webelement1.getText().equalsIgnoreCase(date1))
				{
					webelement1.click();
					break;
				}
			}
		}
		driver.findElement(By.xpath("//*[@id=\'datepicker2\']")).click();
		
		List<WebElement> rows2=driver.findElements(By.xpath("//*[@id=\'ui-datepicker-div\']/div[2]/table/tbody/tr"));
		
		for(int i=1;i<=rows2.size();i++)
		{
			List<WebElement> col2=driver.findElements(By.xpath("//*[@id=\'ui-datepicker-div\']/div[2]/table/tbody/tr[" + i + "]/td"));
			
			for(int j=1;j<=col2.size();j++)
			{
				WebElement webelement2=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[2]/table/tbody/tr[" + i + "]/td[" + j + "]"));
				
				if(webelement2.getText().equalsIgnoreCase(date2))
				{
					webelement2.click();
					break;
				}
			}
		}
		
		driver.findElement(By.xpath("//*[@id=\'frmFinal\']/div/div[6]/a")).click();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
