package datadriventwo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	private static void readData() throws IOException 
	{
		File f = new File("C:\\Users\\Ashik kumar\\eclipse-workspace\\IptMavenProject\\Excel file\\User_Detail Sample.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(1);
		CellType ctype = cell.getCellType();
		
		if(ctype.equals(CellType.STRING)) 
			{
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
			}
		else if(ctype.equals(CellType.NUMERIC)) 
		{
			double numericCellValue = cell.getNumericCellValue();
			int data = (int) numericCellValue;
			System.out.println(data);
		}
		wb.close();
	}
	public static void main(String[] args) throws IOException {
		readData();
	}

}
