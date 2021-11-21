package testNg_apache;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingExcel_datadriven2 {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		
		XSSFWorkbook wb=new XSSFWorkbook("C:\\Selenium\\Amazon.xlsx");
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int rows=ws.getPhysicalNumberOfRows();
		
		for(int i=1;i<rows;i++)
		{
			String searchtext=ws.getRow(i).getCell(1).getStringCellValue();
			String ddelement=ws.getRow(i).getCell(0).getStringCellValue();
			
		WebElement srch=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		srch.clear();
		srch.sendKeys(searchtext);
		
		WebElement drop=driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		Select s=new Select(drop);
		s.selectByVisibleText(ddelement);
		
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		
		System.out.println("'" + searchtext + " product search in " + ddelement + " category is successful..");
		
			
		}
				

	}

}
