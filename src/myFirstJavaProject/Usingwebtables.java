package myFirstJavaProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingwebtables {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		
		//identify all the rows collection
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		
		
	//iterate between each row
		for(int i=2;i<=rows.size();i++)
		{
			//identify all the coloumn collection in every row
			List<WebElement> cols=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td"));
			
			//iterate between each coloumn
			for(int j=1;j<=cols.size();j++)
			{
				WebElement cell=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[" + j +"]"));
				
			System.out.println(cell.getText() + " || ");
			
			}
			System.out.println();
		}
		driver.close();
		
		
		
		
		

	}

}
