

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	@Keyword
	public static void writeToOneExcel(int mapdN, String mapdP, int pdN, String pdP, String file, int i) throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\sofee.yu\\Desktop\\medicare\\"+file+".xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(file);
		int rowCount = i;

		Row row1 = sheet.getRow(rowCount);
		Cell cell1 = row1.createCell(3,0);
		cell1.setCellType(cell1.CELL_TYPE_STRING);
		cell1.setCellValue(mapdN);

		Row row2 = sheet.getRow(rowCount);
		Cell cell2 = row2.createCell(4,0);
		cell2.setCellType(cell2.CELL_TYPE_STRING);
		cell2.setCellValue(mapdP);

		Row row3 = sheet.getRow(rowCount);
		Cell cell3 = row3.createCell(5,0);
		cell3.setCellType(cell3.CELL_TYPE_STRING);
		cell3.setCellValue(pdN);

		Row row4 = sheet.getRow(rowCount);
		Cell cell4 = row4.createCell(6,0);
		cell4.setCellType(cell4.CELL_TYPE_STRING);
		cell4.setCellValue(pdP);

		FileOutputStream fos = new FileOutputStream("C:\\Users\\sofee.yu\\Desktop\\medicare\\"+file+".xlsx");
		workbook.write(fos);
		fos.close();
	}

	@Keyword
	public static void writeToExcel(String stmNumber, int i) throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\sofee.yu\\Desktop\\test.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = i;

		Row row = sheet.getRow(rowCount+1);
		Cell cell = row.createCell(3,0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(stmNumber);

		//		Row row2 = sheet.getRow(rowCount+1);
		//		Cell cell2 = row2.createCell(12,0);
		//		cell2.setCellType(cell2.CELL_TYPE_STRING);
		//		cell2.setCellValue(context);

		i=rowCount+1;

		FileOutputStream fos = new FileOutputStream("C:\\Users\\sofee.yu\\Desktop\\test.xlsx");
		workbook.write(fos);
		fos.close();
	}

	@Keyword
	public static void writeToExcelByCol(String str, int col, int ro) throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\sofee.yu\\Desktop\\bestseller.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		Row row = sheet.getRow(ro);
		Cell cell = row.createCell(col,0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(str);

		FileOutputStream fos = new FileOutputStream("C:\\Users\\sofee.yu\\Desktop\\bestseller.xlsx");
		workbook.write(fos);
		fos.close();
	}

	@Keyword
	public static void writeContext(String context){
		FileInputStream file = new FileInputStream (new File("C:\\Users\\sofee.yu\\Desktop\\test.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);

		'Read data from excel'
		//String Data_fromCell=sheet.getRow(1).getCell(1).getStringCellValue();
		'Write data to excel'
		sheet.getRow(1).createCell(1).setCellValue(context);

		file.close();
		FileOutputStream outFile =new FileOutputStream(new File("C:\\Users\\sofee.yu\\Desktop\\test.xlsx"));
		workbook.write(outFile);
		outFile.close();
	}
}
