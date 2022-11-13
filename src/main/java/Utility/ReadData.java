package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	
//   FRAMEWoRK ME AISA LENA	
	public static String readPropertyFile(String value) throws Exception
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\ACER\\eclipse-workspace\\xyseleFrameworks\\TestData\\config.property");
		prop.load(file);
		return prop.getProperty(value);
	}
	
	
	
	
//	SELENIUM aisa lena
	/* public String readExcelFile() throws Exception
	{  
		FileInputStream file = new FileInputStream("Excel file ka path lena hai yaha");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excel.getRow(0).getCell(0).getStringCellValue();
		return value;
	}*/




	
	}
	

