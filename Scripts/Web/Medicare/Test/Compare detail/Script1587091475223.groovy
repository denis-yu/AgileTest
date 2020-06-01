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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords


baseUrl = 'https://qa.healthinsurance.com'

WebUI.openBrowser(baseUrl)

def driver = DriverFactory.getWebDriver()

selenium = new WebDriverBackedSelenium(driver, baseUrl)

//store SunFire Medicare detail page info
WebUI.navigateToUrl('https://qa-healthinsurance.sunfirematrix.com/app/consumer/healthinsurance/?affiliate=hicom&zip=35215&county=&utm_medium=redirect&utm_source=hic&utm_campaign=hi_medicare_census&tfn=555-867-5309#/plandetails/benefits/75763/48001/MAPD/151053')

Thread.sleep(3000)

benefitCount = selenium.getXpathCount('//div[@class="row plan-details-row"]')
print benefitCount

//create file
String excelFile = 'Data Files\\SunFireMedicare01.xlsx'
ExcelKeywords.createExcelFile(excelFile)

//create sheet
workbook = ExcelKeywords.getWorkbook(excelFile)
ExcelKeywords.createExcelSheet(workbook,'sunfire medicare')
ExcelKeywords.saveWorkbook(excelFile,workbook)

//write head data to excel
workbook01=ExcelKeywords.getWorkbook(excelFile)
sheet01=ExcelKeywords.getExcelSheet(workbook01,'sunfire medicare')
ExcelKeywords.setValueToCellByIndex(sheet01,0,0,'Benefit Name')
ExcelKeywords.setValueToCellByIndex(sheet01,0,1,'Benefit Value')

for (i = 1; i <= benefitCount; i++) {
    benefitname = selenium.getText(('xpath=(//div[@class="row plan-details-row"])[' + i) + ']/div[1]')

    benefitvalue = selenium.getText(('xpath=(//div[@class="row plan-details-row"])[' + i) + ']/div[2]')

    println benefitname,benefitvalue
	
	//write data to excel
	ExcelKeywords.setValueToCellByIndex(sheet01,i,0,benefitname)

	ExcelKeywords.setValueToCellByIndex(sheet01, i, 1, benefitvalue)

}

//save data

ExcelKeywords.saveWorkbook(excelFile, workbook01)

