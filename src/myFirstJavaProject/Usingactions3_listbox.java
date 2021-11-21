package myFirstJavaProject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Usingactions3_listbox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement listBox=driver.findElement(By.xpath("//*[@id=\'selectable\']"));
		
		List<WebElement> listElements=listBox.findElements(By.tagName("li"));
		
		System.out.println("The total number of Elements in the list are :" + listElements.size());
		
		System.out.println("The listBox elements are...");
		
		for (WebElement webElement : listElements) {
			
			System.out.println(webElement.getText());
		}
		
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(listElements.get(0)).click(listElements.get(3)).build().perform();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
