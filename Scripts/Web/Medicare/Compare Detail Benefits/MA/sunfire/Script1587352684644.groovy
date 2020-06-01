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

now = new Date()
mydate = now.format('yyyyMMdd_HHmmss')

//sunmaker
WebUI.openBrowser('https://qa-healthinsurance.sunfirematrix.com/app/consumer/healthinsurance/?affiliate=hicom&zip=89701&county=&utm_medium=redirect&utm_source=hic&utm_campaign=hi_medicare_census&tfn=555-867-5309#/plandetails/benefits/89701/32510/MAPD/151172')

def driver = DriverFactory.getWebDriver()

baseUrl = 'https://qa.healthinsurance.com'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

Thread.sleep(5000)

//create file
String excelFile = 'Data Files\\medicare\\MA\\89701_sunfire_'+mydate+'.xlsx'

ExcelKeywords.createExcelFile(excelFile)

//create sheet
workbook = ExcelKeywords.getWorkbook(excelFile)
ExcelKeywords.createExcelSheet(workbook,'H4711-005-000')
ExcelKeywords.saveWorkbook(excelFile,workbook)

//write head data to excel
workbook01=ExcelKeywords.getWorkbook(excelFile)
sheet01=ExcelKeywords.getExcelSheet(workbook01,'H4711-005-000')

ExcelKeywords.setValueToCellByIndex(sheet01,0,0,'Section')
ExcelKeywords.setValueToCellByIndex(sheet01,0,1,'Key')
ExcelKeywords.setValueToCellByIndex(sheet01,0,2,'Value')
row = 1

//summary
summaryCount = selenium.getXpathCount('(//div[@class="row plan-details-section-section"])[1]/following::div[1]/descendant::div[@class="row plan-details-row"]')
for(suCount = 1; suCount<=summaryCount;suCount++){
	keyName = selenium.getText('xpath=((//div[@class="row plan-details-section-section"])[1]/following::div[1]/descendant::div[@class="row plan-details-row"])['+suCount+']/div[1]')
	value = selenium.getText('xpath=((//div[@class="row plan-details-section-section"])[1]/following::div[1]/descendant::div[@class="row plan-details-row"])['+suCount+']/div[2]')
	ExcelKeywords.setValueToCellByIndex(sheet01, row, 0, 'Summary')
	ExcelKeywords.setValueToCellByIndex(sheet01, row, 1, keyName)
	ExcelKeywords.setValueToCellByIndex(sheet01, row, 2, value)
	row++
}


//other sections
sectionCount = selenium.getXpathCount('//div[@class="card-header"]')
for (seCount = 1; seCount<=sectionCount; seCount++){
	
	sectionName = selenium.getText('xpath=(//div[@class="card-header"])['+seCount+']')
	println sectionName
	//ExcelKeywords.setValueToCellByIndex(sheet01,seCount,0,sectionName)
	
	keyCount = selenium.getXpathCount('(//div[@class="card-header"])['+seCount+']/following::div[1]/descendant::div[contains(@class,"row plan-details-row")]')
	for(kCount = 1; kCount <=keyCount; kCount++){
		keyName = selenium.getText('xpath=((//div[@class="card-header"])['+seCount+']/following::div[1]/descendant::div[contains(@class,"row plan-details-row")])['+kCount+']/div[1]')
		value = selenium.getText('xpath=((//div[@class="card-header"])['+seCount+']/following::div[1]/descendant::div[contains(@class,"row plan-details-row")])['+kCount+']/div[2]')
		ExcelKeywords.setValueToCellByIndex(sheet01, row, 0, sectionName)
		ExcelKeywords.setValueToCellByIndex(sheet01, row, 1, keyName)
		ExcelKeywords.setValueToCellByIndex(sheet01, row, 2, value)
		row++
	}
}

/*
for (i = 1; i <= benefitCount; i++) {
	benefitname = selenium.getText(('xpath=(//div[@class="row plan-details-row"])[' + i) + ']/div[1]')

	benefitvalue = selenium.getText(('xpath=(//div[@class="row plan-details-row"])[' + i) + ']/div[2]')

	println benefitname,benefitvalue
	
	//write data to excel
	ExcelKeywords.setValueToCellByIndex(sheet01,i,0,benefitname)

	ExcelKeywords.setValueToCellByIndex(sheet01, i, 1, benefitvalue)

} */

//save data

ExcelKeywords.saveWorkbook(excelFile, workbook01)

