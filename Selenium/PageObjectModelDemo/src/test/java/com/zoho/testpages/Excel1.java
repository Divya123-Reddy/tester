package com.zoho.testpages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("D:\\Excelsheetdata\\TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fi);
		
		int sheets=workbook.getNumberOfSheets();	
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetAt(i).getSheetName().equalsIgnoreCase("sheet1")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> rows=sheet.rowIterator();
				Row row=rows.next();
			Iterator<Cell> cells=row.cellIterator();
			int k=0;
			int column=0;
			while(cells.hasNext())
			{
				
				if(cells.next().getStringCellValue().equalsIgnoreCase("Testcases")) {
					column=k;
				}
				k++;
				System.out.println(column);
				while(rows.hasNext()) {
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Loginpage"));
					Iterator<Cell> cell=row.cellIterator();
					while(cell.hasNext())
					{
					System.out.println(cell.next().getStringCellValue());	
					}
				}
			}
			
				
			}
			
			
		}
	}

}
