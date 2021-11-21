package myFirstJavaProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Usingxpath2 {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("lg");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		
		String mainid=driver.getWindowHandle();
		System.out.println("The main window id is" + mainid);
		
		
		//to click second result
		driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
		
		
		Set<String> allid=driver.getWindowHandles();
		
		for(String id : allid)
		{
			System.out.println(id);
		if(!id.equals(mainid))
		{
			driver.switchTo().window(id);

			WebElement dd=driver.findElement(By.xpath("(//*[@id=\"quantity\"])[2]"));
			Select s=new Select(dd);
			s.selectByIndex(0);
			
			driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();

		}
				
		}
		
	}

}
