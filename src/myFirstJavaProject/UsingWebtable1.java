package myFirstJavaProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebtable1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// 1. Identify all the rows collection
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));

		// 2. Iterate b/w each row
		for (int i = 2; i <= rows.size(); i++) {
			// 3. Identity all the columns collection in every row
			List<WebElement> cols = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td"));

			/*
			 * // 4. Iterate b/w each column for (int j = 1; j <= cols.size(); j++) { // 5.
			 * Fetch the cell data at the intersection of row and column
			 * 
			 * WebElement cell = driver
			 * .findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[" + j +
			 * "]")); System.out.print(cell.getText() + " || "); } System.out.println();
			 */

			for (WebElement webElement : cols) {
				System.out.print(webElement.getText() + " || ");
			}
			System.out.println();

		}

		driver.close();
	}

}
