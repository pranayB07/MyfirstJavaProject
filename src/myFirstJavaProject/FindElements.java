package myFirstJavaProject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (WebElement webElement : links) {
			System.out.println(webElement.getText());
		}

	}

}
