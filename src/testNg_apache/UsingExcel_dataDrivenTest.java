package testNg_apache;

import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UsingExcel_dataDrivenTest {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		XSSFWorkbook wb=new XSSFWorkbook("C:\\Selenium\\ebayInput.xlsx");
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int rows=ws.getPhysicalNumberOfRows();
		
		for(int i=1;i<rows;i++)
		{
			String ddvalue=ws.getRow(i).getCell(0).getStringCellValue();
			String txtvalue=ws.getRow(i).getCell(1).getStringCellValue();
			
			
			WebElement txtbox=driver.findElement(By.xpath("//*[@id=\'gh-ac\']"));
			txtbox.clear();//to clear the textbox with previous test data
			txtbox.sendKeys(txtvalue);
			
		WebElement dd=driver.findElement(By.xpath("//*[@id=\'gh-cat\']"));
		Select s=new Select(dd);
		s.selectByVisibleText(ddvalue);
		driver.findElement(By.xpath("//*[@id=\'gh-btn\']")).click();
		
		
		System.out.println("'" + txtvalue + "'" + " product search in " + ddvalue + " category is successful..." );
			
		}
	
	}

}
