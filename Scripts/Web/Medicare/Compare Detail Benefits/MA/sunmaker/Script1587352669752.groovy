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
WebUI.openBrowser('https://sunmaker.medicare.healthinsurance.com/census')

def driver = DriverFactory.getWebDriver()

baseUrl = 'https://sunmaker.medicare.healthinsurance.com/census'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.setText(findTestObject('hic/medicare/census.location.zip'), zip)

WebUI.click(findTestObject('hic/medicare/see medicare plans'))

WebUI.waitForElementPresent(findTestObject('hic/medicare/mapd'), 20)

planid = selenium.getText('xpath=(//p[@class="sc-1f7autd-4 bEYsF"])[1]')

planid = planid.replaceAll('ID :', '')

println planid

selenium.click('xpath=(//a[text()="See Plan Details"])[1]')

Thread.sleep(5000)

//create file
String excelFile = 'Data Files\\medicare\\MA\\'+zip+'_'+mydate+'.xlsx'

ExcelKeywords.createExcelFile(excelFile)

//create sheet
workbook = ExcelKeywords.getWorkbook(excelFile)
ExcelKeywords.createExcelSheet(workbook,planid)
ExcelKeywords.saveWorkbook(excelFile,workbook)

//write head data to excel
workbook01=ExcelKeywords.getWorkbook(excelFile)
sheet01=ExcelKeywords.getExcelSheet(workbook01,planid)

ExcelKeywords.setValueToCellByIndex(sheet01,0,0,'Section')
ExcelKeywords.setValueToCellByIndex(sheet01,0,1,'Key')
ExcelKeywords.setValueToCellByIndex(sheet01,0,2,'Value')

//section count
sectionCount = selenium.getXpathCount('//div[@class="sc-caSCKo ipmUAp row"]')

println sectionCount
row = 1
//section list
for (seCount = 1; seCount<=sectionCount; seCount++){
	
	sectionName = selenium.getText('xpath=(//div[@class="sc-caSCKo ipmUAp row"])['+seCount+']/div')
	println sectionName
	//ExcelKeywords.setValueToCellByIndex(sheet01,seCount,0,sectionName)
	
	keyCount = selenium.getXpathCount('(//div[@class="sc-caSCKo ipmUAp row"])['+seCount+']/parent::div/following::div[1]/descendant::div[@class="sc-caSCKo bz5mrc-9 coiEhx row"]')
	for(kCount = 1; kCount <=keyCount; kCount++){
		keyName = selenium.getText('xpath=((//div[@class="sc-caSCKo ipmUAp row"])['+seCount+']/parent::div/following::div[1]/descendant::div[@class="sc-caSCKo bz5mrc-9 coiEhx row"])['+kCount+']/div[1]')
		value = selenium.getText('xpath=((//div[@class="sc-caSCKo ipmUAp row"])['+seCount+']/parent::div/following::div[1]/descendant::div[@class="sc-caSCKo bz5mrc-9 coiEhx row"])['+kCount+']/div[2]')
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

