package myFirstJavaProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openingchromebrowser 
{
	//Lanching a webdriver 
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Chromebrowser90\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http//:amazon.in");
		
		
		

	}

}
