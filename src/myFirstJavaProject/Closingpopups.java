package myFirstJavaProject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closingpopups {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		
		String mainTitle=driver.getTitle();
		String mainWid=driver.getWindowHandle();
		
		Set<String> allWid=	driver.getWindowHandles();
		
		for(String id: allWid)
		{
			driver.switchTo().window(id);
			
			if(!driver.getWindowHandle().equals(mainWid))
			{
				System.out.println(id);
				driver.close();
			}
			else
				System.out.println("The main window id is "+mainWid);
		}
		System.out.println("The Title of main window is ---->" + mainTitle);
	}

}
