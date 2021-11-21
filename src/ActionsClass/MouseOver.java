package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {

	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Way2Automation");
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		//driver.findElement(By.xpath
			//	("//div[@class='FPdoLc lJ9FBc']//center//input[@name='btnK' and @type='submit']")).click();
		
		/*
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath
		 * ("//div[@class='FPdoLc lJ9FBc']//center//input[@name='btnK' and @type='submit']"
		 * ))).click();
		 */
		driver.findElement(By.xpath
				("//div[@class='yuRUbf']//*[text()='Way2Automation']")).click();
		
		WebElement resourceMenu=driver.findElement(By.xpath
				("//li[@id='menu-item-25091']//*[text()='Resources']"));
		
		
		action.moveToElement(resourceMenu).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-25092\"]/a/span[2]")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
