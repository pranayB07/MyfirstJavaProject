package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement resizable=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Actions action=new Actions(driver);
		
		try {
		action.dragAndDropBy(resizable, 50, 70).perform();
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		driver.close();
	}

}
