package com.DataRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {
	

	private void alldataread() throws IOException {
		File f = new File(".\\Excel\\Data.xlsx");	
		FileInputStream fis = new FileInputStream(f);
	    Workbook wb = new XSSFWorkbook(fis);
	    Sheet sheetAt =  wb.getSheetAt(0);
	    
	    
	    
	    
	    
		

	}

}
