package myFirstJavaProject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wdmethods1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com");
		
		//driver.navigate().to("http://amazon.com");
		//driver.navigate().back();
		//driver.close();
		//driver.quit();
		//String mainTitle=driver.getTitle();
		String Url=driver.getCurrentUrl();
		String winId=driver.getWindowHandle();
		Set<String> allID=driver.getWindowHandles();
		
		//System.out.println(Url + "====>" + mainTitle);
		//System.out.println("The ID of current window is :" + winId);
		
		for(String id : allID)
		{
			driver.switchTo().window(id);
			System.out.println(driver.getTitle() + " ==>" + id);
			//System.out.println(" The title is : " + mainTitle);
			
		}
		driver.quit();
			
		
		

	}

}
