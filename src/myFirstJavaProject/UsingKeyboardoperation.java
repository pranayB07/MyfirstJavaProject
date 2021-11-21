package myFirstJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingKeyboardoperation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");

		WebElement webElement = driver.findElement(By.name("q"));
		webElement.sendKeys("Selenium webdriver");

		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();

	}

}
