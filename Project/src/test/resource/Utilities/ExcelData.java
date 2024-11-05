package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	String excelpath="C:\\Users\\narsi\\OneDrive\\Desktop";
	
	public String[]readExcel() throws IOException {
		
		String []data= new String[5];
		
		//path of excel file
		FileInputStream fis= new FileInputStream(excelpath);
		
		//read the workbook
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheetAt(0);
		
		Row row= sheet.getRow(1);
		
		Cell cell1=row.getCell(0);
		String username=cell1.getStringCellValue();
		
		Cell cell2=row.getCell(1);
		String password=cell1.getStringCellValue();
		
		data[0]=username;
		data[1]=password;
		
		return data;
		
		
	}

}


