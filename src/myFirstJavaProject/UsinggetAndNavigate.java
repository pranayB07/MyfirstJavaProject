package myFirstJavaProject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsinggetAndNavigate {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com");
		
		//String title=driver.getTitle();
		//String url=driver.getCurrentUrl();
		
	//	System.out.println(url + "===>" + title);
		
	//	String winID=driver.getWindowHandle();
		//System.out.println(title + "===>" + winID);
		
		Set<String> WinId=driver.getWindowHandles();
		
		for(String id : WinId)
			
		{
			driver.switchTo().window(id);
			System.out.println(id + "==>" + driver.getTitle()+"---->"+driver.getCurrentUrl());
			driver.close();
			
		}
		
		

	}

}
