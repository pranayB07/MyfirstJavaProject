package myFirstJavaProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshotDemo {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		File fsource=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//here the screenshot is stored in variable, so we cant directly send the variable to the developer,
		//so we need to store it in a destination
		
		File fdest=new File("C:\\Selenium\\amazonScreenShot.png");
		//we created a empty file and gave the destination
		
		FileHandler.copy(fsource, fdest); //file handler class copies the ss from fsource to fdest
		driver.close();
	}

}
