package practice;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xldatadriven {

	public static void main(String[] args) throws Exception {
		
		XSSFWorkbook wb=new XSSFWorkbook("C:\\Users\\Aruna\\eclipse-workspace\\AutomationPractice\\AutomationPractice.xlsx");
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rows=ws.getPhysicalNumberOfRows();
		System.out.println("The total number of rows in xl file is " + rows);
		
		for(int i=1; i<rows ;i++)
		{
			String value1=ws.getRow(i).getCell(0).getStringCellValue();
			String value2=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.print(value1);
			System.out.print("   ");
			System.out.print(value2);
			System.out.println();
		}

	}

}
