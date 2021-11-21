package myFirstJavaProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshotdemo2 {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		driver.manage().window().maximize();
		
		File fsource=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File fdest=new File("C:\\Selenium\\ebay.Screenshot.png");
		
		FileHandler.copy(fsource, fdest);
		driver.close();

	}

}
