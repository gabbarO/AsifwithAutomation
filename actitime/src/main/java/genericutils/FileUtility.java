package genericutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public  class FileUtility {
	
	public String toFetchToFetcheDataFromPropertyFile(String key) throws IOException   {
		
		FileInputStream fis=new FileInputStream(
				"D:\\java practice\\actitime\\src\\main\\resources\\Propertyata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		
		
		return prop.getProperty(key);
		
		
		
	}
	
	public String fetchStringDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("D:\\java practice\\Asifwithautomation\\Testdata\\workbook.xlsx");
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
				
				}
	
	public long fetchNumericDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws IOException  {
		FileInputStream fis = new FileInputStream("D:\\java practice\\actitime\\src\\test\\resources\\workbook.xlsx");
		
		return (long)WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();

	}
	public  boolean fetchBooleanDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws IOException  {
		FileInputStream fis = new FileInputStream("D:\\java practice\\actitime\\src\\test\\resources\\workbook.xlsx");
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getBooleanCellValue();
		
		
	}

}