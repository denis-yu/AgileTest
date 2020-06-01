import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords


workbook01=ExcelKeywords.getWorkbook('Data Files\\medicare\\detail benefits\\89701_20200420_100614.xlsx')
workbook02=ExcelKeywords.getWorkbook('Data Files\\medicare\\detail benefits\\89701_sunfire_20200420_111826.xlsx')
sheet01=ExcelKeywords.getExcelSheet(workbook01,' H5521 - 055 - 000')
sheet02=ExcelKeywords.getExcelSheet(workbook02,'H4711-005-000')

// Compare sheets
CompareSheet = ExcelKeywords.compareTwoSheets(sheet01,sheet02)
println("Compare result is: " + CompareSheet)