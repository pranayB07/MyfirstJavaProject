package myFirstJavaProject;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables19_21 {

	static WebDriver driver;
	static boolean isAvail;
	static String country;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the company name");
		String company = scanner.nextLine();

		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));

		for (int i = 2; i < rows.size(); i++) {
			WebElement cell = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[1]"));
			if(cell.getText().equals(company))
			{
			country=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[3]")).getText();
			isAvail=true;
			break;
			}

		}
		if(isAvail==true)
		{
			System.out.println("The company " + company + " is available in the " + country);
		}
		else
			System.out.println("You Entered Invalid country Name");

	}

}
