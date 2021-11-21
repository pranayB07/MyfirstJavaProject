package myFirstJavaProject;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDropdownPractie {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the category");
		String cat=sc.nextLine();
		
		System.out.println("Enter the product name");
		String prod=sc.nextLine();
		
		boolean isExist=false;
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		
		WebElement dd=driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
		
		Select s=new Select(dd);
		
		List<WebElement> options=s.getOptions();
		
		for (WebElement webElement : options) {
			String Element=webElement.getText();
			
			if(Element.equalsIgnoreCase(cat))
			{
				isExist=true;
				s.selectByVisibleText(cat);
			}
		driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys(prod);
		driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
		
		if(isExist==true)
		{
			System.out.println(prod+" search in " +cat+ " Category is successful" );
		}
		else if (isExist==false)
		{
			System.out.println("The search is not successful");
		}
	}

	}
}
