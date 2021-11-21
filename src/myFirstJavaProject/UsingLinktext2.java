package myFirstJavaProject;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinktext2 {

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Link to Select");
		String linkToselect=sc.nextLine();
		
		boolean isExist=false;
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.get(1).getText());
		
		System.out.println("The total number of links : " + links.size());
		
		for (WebElement webElement : links) {
			
			if(webElement.getText().equalsIgnoreCase(linkToselect))
			{
				isExist=true;
				webElement.click();
				break;
			}
			
		}
		if(isExist==false)
		{
			System.out.println("The Specified link is not available");
		}
		
		
	}

}
