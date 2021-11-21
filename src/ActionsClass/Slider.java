package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement mainSlider=driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		int width=mainSlider.getSize().width/2;
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider']/span"));
		
		Actions action=new Actions(driver);
		action.dragAndDropBy(slider, width, 0).perform();
		
		driver.close();
		
		
		
	}

}
