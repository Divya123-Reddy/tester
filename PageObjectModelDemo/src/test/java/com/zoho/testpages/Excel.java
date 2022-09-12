package com.zoho.testpages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {
	public ArrayList<String> getdata() throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\Excelsheetdata\\TestData2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		ArrayList<String> arr=new ArrayList();
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetAt(i).getSheetName().equalsIgnoreCase("sheet1")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> rows=sheet.rowIterator();
			Row row=rows.next();
			Iterator<Cell> cells=row.cellIterator();
			int k=0;
			int column=0;
			while(cells.hasNext()) {
			if(cells.next().getStringCellValue().equalsIgnoreCase("Testcases")) {
			
			column=k;
			}
			k++;
		
			System.out.println(column);
			}
			while(rows.hasNext()) {
				Row r=rows.next();
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Loginpage")) {
					Iterator<Cell> ce=r.cellIterator();
					while(ce.hasNext()) {
						arr.add(ce.next().getStringCellValue());
//						System.out.println(ce.next().getStringCellValue());
					}
				}
	
			}
		
	}

}
		return arr;
}
	}
