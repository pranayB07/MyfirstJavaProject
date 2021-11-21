package testNg_apache;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelPractice {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("C:\\Selenium\\Amazon.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rows = ws.getPhysicalNumberOfRows();
		
		System.out.println("The ddvalues are: ");

		for (int i = 1; i < rows; i++)
			
		{
			String value=ws.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(  value );
		}

	}

}
