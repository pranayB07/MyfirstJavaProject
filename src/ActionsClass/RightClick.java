package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClick {
	
	public static Actions action=null;
	static WebElement img;
	static WebDriverWait wait=null;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		
		
		try {
			img=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		} catch (Exception e) {
			System.out.println("element not found");
		}
		wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(img));
		
		action=new Actions(driver);
		action.contextClick(img).build().perform();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
