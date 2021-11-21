package myFirstJavaProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Usingdropdown {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		
		WebElement dd=driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		Select s=new Select(dd);
		
		
		List<WebElement> options=s.getOptions();
		
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		
		
		s.selectByIndex(5);
		//s.selectByVisibleText("Deals");
		//s.selectByValue();
		
		//then search related products 
		
		WebElement search=driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"));
		search.sendKeys("sneakers");
		
		driver.findElement(By.xpath("//*[@id=\'nav-search-submit-button\']")).click();
		
		driver.close();

	}

}
