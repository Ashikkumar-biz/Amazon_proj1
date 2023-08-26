package datadriventwo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	private static void writeData() throws IOException 
	{
		File f = new File("C:\\Users\\Ashik kumar\\eclipse-workspace\\IptMavenProject\\Excel file\\User_Detail Sample.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
//		Sheet createSheet = wb.createSheet("IptProject");
//		Row createRow = createSheet.createRow(0);
//		Cell createCell = createRow.createCell(0);
//		createCell.setCellValue("Username");
		
		wb.createSheet("IptProject").createRow(0).createCell(0).setCellValue("Username");
		wb.getSheet("IptProject").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("IptProject").createRow(1).createCell(0).setCellValue("Ashik");
		wb.getSheet("IptProject").getRow(1).createCell(1).setCellValue(123);
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
		//System.exit(0);
		
		System.out.println("Written Successfully");
		wb.close();
		
		

	}
	public static void main(String[] args) throws IOException {
		writeData();
		
	}

}
