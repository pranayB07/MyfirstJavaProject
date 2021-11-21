package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Keys {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver95\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		WebElement google=driver.findElement(By.name("q"));
		google.sendKeys("Selenium", org.openqa.selenium.Keys.ENTER);
		
	}

}
