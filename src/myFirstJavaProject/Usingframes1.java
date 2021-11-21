package myFirstJavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingframes1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://qhmit.com/html/html_editors/scratchpad/?example=/javascript/examples/javascript_alert_box_onclick");

		// driverobject.swithto().frame(framename/index/element)

		driver.switchTo().frame("preview");
		driver.findElement(By.xpath("/html/body/input")).click();
		
		//reading the alert text 

		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();;
	}

}
