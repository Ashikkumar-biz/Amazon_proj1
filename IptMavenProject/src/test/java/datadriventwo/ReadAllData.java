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

public class ReadAllData {
	private static void readAllData() throws IOException
	{
		File f = new File("C:\\Users\\Ashik kumar\\eclipse-workspace\\IptMavenProject\\Excel file\\User_Detail Sample.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int noOfRows = sheetAt.getPhysicalNumberOfRows();
		
		
		for (int i=0; i < noOfRows; i++)
		{
			Row row = sheetAt.getRow(i);
			int noOfCol = row.getPhysicalNumberOfCells();
			for (int j=0; j<noOfCol; j++) 
			{
				Cell cell = row.getCell(j);
				CellType ctype = cell.getCellType();
				if(ctype.equals(CellType.STRING)) 
				{
					String cellstr = cell.getStringCellValue();
					System.out.println(cellstr);
					//System.out.println(cell.getStringCellValue());
				}
					else if(ctype.equals(CellType.NUMERIC)) 
					{
						double num = cell.getNumericCellValue();
						int data = (int) num;
						System.out.println(data);
					}
				}
			}
		wb.close();
		
		
		}
	public static void main(String[] args) throws IOException 
	{
		readAllData();
	}
	}


