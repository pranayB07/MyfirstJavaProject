package myFirstJavaProject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closingpopups2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();

		String mainTitle = driver.getTitle();
		String mainId = driver.getWindowHandle();

		Set<String> allWindowIds = driver.getWindowHandles();
		
		for (String string : allWindowIds) {
			
			driver.switchTo().window(string);
			if(driver.getTitle().equals(mainTitle))
			{
				System.out.println("The title of the page is :" + driver.getTitle());
				System.out.println("The windowId is :" + string);
			}
			else
				driver.close();
			
		}
		driver.quit();

	}

}
