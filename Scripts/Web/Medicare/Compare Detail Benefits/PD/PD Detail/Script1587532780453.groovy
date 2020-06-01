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

//hic home page to medicare quote page
WebUI.openBrowser(env)

def driver = DriverFactory.getWebDriver()

String baseUrl = env

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('//button[contains(text(),\'COMPARE HEALTH PLANS\')]')

for (second = 0; second < 10; second++) {
    try {
        if (selenium.isElementPresent('id=zip')) {
            break
        }
    }
    catch (Exception e) {
    } 
    
    Thread.sleep(1000)
}

WebUI.setText(findTestObject('hic/medicare/zip'), zip)

Thread.sleep(3000)

selenium.click('//button[contains(text(),\'Compare Plans\')]')

for (second = 0; second < 20; second++) {
    try {
        if (selenium.isElementPresent('id=planTypeSelect')) {
            break
        }
    }
    catch (Exception e) {
    } 
    
    Thread.sleep(1000)
}

//create file
String excelFile = 'Data Files\\medicare\\detail benefits\\'+state+'_'+zip+'_'+mydate+'.xlsx'

ExcelKeywords.createExcelFile(excelFile)

//get all the MAPD plans
planCount = selenium.getXpathCount('//span[@class="plan-name"]')
println planCount

//get the plan name and plan id
planname = []
planid = []
//planname1=selenium.getText('xpath=(//span[@class="plan-name"])[1]')
//planid1=selenium.getText('xpath=(//*[@class="plan-identifier"])[1]')
for(i=1;i<=3;i++){
	planname[i-1]=selenium.getText('xpath=(//span[@class="plan-name"])['+i+']')
	planid[i-1]=selenium.getText('xpath=(//*[@class="plan-identifier"])['+i+']')
}

for(planNum = 1;planNum <=3; planNum++){
	//create sheet
	workbook = ExcelKeywords.getWorkbook(excelFile)
	ExcelKeywords.createExcelSheet(workbook,'plan'+planNum)
	ExcelKeywords.saveWorkbook(excelFile,workbook)
	
	//write head to excel
	workbook01=ExcelKeywords.getWorkbook(excelFile)
	sheet01=ExcelKeywords.getExcelSheet(workbook01,'plan'+planNum)
	
	ExcelKeywords.setValueToCellByIndex(sheet01,0,0,'State')
	ExcelKeywords.setValueToCellByIndex(sheet01,0,1,'Zip')
	ExcelKeywords.setValueToCellByIndex(sheet01,0,2,'Plan Name')
	ExcelKeywords.setValueToCellByIndex(sheet01,0,3,'Section')
	ExcelKeywords.setValueToCellByIndex(sheet01,0,4,'SunFire Benefit Name')
	ExcelKeywords.setValueToCellByIndex(sheet01,0,5,'SunFire Value')
	ExcelKeywords.setValueToCellByIndex(sheet01,0,6,'sunmaker Benefit Name')
	ExcelKeywords.setValueToCellByIndex(sheet01,0,7,'sunmaker Value')
	row1 = 1
	row2 = 1
	
	
	//hic home page to medicare quote page
	WebUI.navigateToUrl(env)
	
	selenium.click('//button[contains(text(),\'COMPARE HEALTH PLANS\')]')
	
	for (second = 0; second < 10; second++) {
		try {
			if (selenium.isElementPresent('id=zip')) {
				break
			}
		}
		catch (Exception e) {
		}
		
		Thread.sleep(1000)
	}
	
	WebUI.setText(findTestObject('hic/medicare/zip'), zip)
	
	Thread.sleep(3000)
	
	selenium.click('//button[contains(text(),\'Compare Plans\')]')
	
	for (second = 0; second < 20; second++) {
		try {
			if (selenium.isElementPresent('//*[@class="breadcrumb"]')) {
				break
			}
		}
		catch (Exception e) {
		}
		
		Thread.sleep(1000)
	}
	
	//go to detail
	selenium.click('xpath=//span[@class="plan-name" and text()="'+planname[planNum-1]+'"]/following::button[@class="btn-details btn btn-link"][1]')
	
	for (second = 0; second < 20; second++) {
		try {
			if (selenium.isElementPresent('xpath=(//div[@class="row plan-details-section-section"])[1]/following::div[1]/descendant::div[@class="row plan-details-row"]')) {
				break
			}
		}
		catch (Exception e) {
		}
		
		Thread.sleep(1000)
	}
	
	//summary
	Count = selenium.getXpathCount('(//div[@class="row plan-details-section-section"])[1]/following::div[1]/descendant::div[contains(@class,"row plan-details-row")]')
	for(i = 1; i<=Count;i++){
		name = selenium.getText('xpath=((//div[@class="row plan-details-section-section"])[1]/following::div[1]/descendant::div[contains(@class,"row plan-details-row")])['+i+']/div[1]')
		value = selenium.getText('xpath=((//div[@class="row plan-details-section-section"])[1]/following::div[1]/descendant::div[contains(@class,"row plan-details-row")])['+i+']/div[2]')
		ExcelKeywords.setValueToCellByIndex(sheet01, row1, 0, state)
		ExcelKeywords.setValueToCellByIndex(sheet01, row1, 1, zip)
		ExcelKeywords.setValueToCellByIndex(sheet01, row1, 2, planname[planNum-1])
		ExcelKeywords.setValueToCellByIndex(sheet01, row1, 3, 'Summary')
		ExcelKeywords.setValueToCellByIndex(sheet01, row1, 4, name)
		ExcelKeywords.setValueToCellByIndex(sheet01, row1, 5, value)
		row1++
	}
	
	//Outpatient care and services
	if(selenium.isElementPresent('//div[@class="card-header"]/span[contains(text(),"Outpatient care and services")]')){
		Count = selenium.getXpathCount('//div[@class="card-header"]/span[contains(text(),"Outpatient care and services")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")]')
		for (i=1;i<=Count;i++){
			name=selenium.getText('xpath=(//div[@class="card-header"]/span[contains(text(),"Outpatient care and services")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")])['+i+']/div[1]')
			value =selenium.getText('xpath=(//div[@class="card-header"]/span[contains(text(),"Outpatient care and services")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")])['+i+']/div[2]')
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 0, state)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 1, zip)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 2, planname[planNum-1])
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 3, 'Outpatient care and services')
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 4, name)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 5, value)
			row1++
		}
	}
	
	//Inpatient care
	if(selenium.isElementPresent('//div[@class="card-header"]/span[contains(text(),"Inpatient care")]')){
		Count = selenium.getXpathCount('//div[@class="card-header"]/span[contains(text(),"Inpatient care")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")]')
		for (i=1;i<=Count;i++){
			name=selenium.getText('xpath=(//div[@class="card-header"]/span[contains(text(),"Inpatient care")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")])['+i+']/div[1]')
			value = selenium.getText('xpath=(//div[@class="card-header"]/span[contains(text(),"Inpatient care")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")])['+i+']/div[2]')
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 0, state)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 1, zip)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 2, planname[planNum-1])
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 3, 'Inpatient care')
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 4, name)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 5, value)
			row1++
		}
	}
	
	//Deductible coverage level
	if(selenium.isElementPresent('//div[@class="card-header"]/span[contains(text(),"Deductible coverage level")]')){
		Count = selenium.getXpathCount('//div[@class="card-header"]/span[contains(text(),"Deductible coverage level")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")]')
		for (i=1;i<=Count;i++){
			name=selenium.getText('xpath=(//div[@class="card-header"]/span[contains(text(),"Deductible coverage level")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")])['+i+']/div[1]')
			value = selenium.getText('xpath=(//div[@class="card-header"]/span[contains(text(),"Deductible coverage level")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")])['+i+']/div[2]')
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 0, state)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 1, zip)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 2, planname[planNum-1])
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 3, 'Deductible coverage level')
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 4, name)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 5, value)
			row1++
		}
	}
	
	//Initial coverage level
	if(selenium.isElementPresent('//div[@class="card-header"]/span[contains(text(),"Initial coverage level")]')){
		Count = selenium.getXpathCount('//div[@class="card-header"]/span[contains(text(),"Initial coverage level")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")]')
		for (i=1;i<=Count;i++){
			name=selenium.getText('xpath=(//div[@class="card-header"]/span[contains(text(),"Initial coverage level")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")])['+i+']/div[1]')
			value = selenium.getText('xpath=(//div[@class="card-header"]/span[contains(text(),"Initial coverage level")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")])['+i+']/div[2]')
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 0, state)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 1, zip)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 2, planname[planNum-1])
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 3, 'Initial coverage level')
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 4, name)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 5, value)
			row1++
		}
	}
	
	//Gap coverage level
	if(selenium.isElementPresent('//div[@class="card-header"]/span[contains(text(),"Gap coverage level")]')){
		Count = selenium.getXpathCount('//div[@class="card-header"]/span[contains(text(),"Gap coverage level")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")]')
		for (i=1;i<=Count;i++){
			name=selenium.getText('xpath=(//div[@class="card-header"]/span[contains(text(),"Gap coverage level")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")])['+i+']/div[1]')
			value = selenium.getText('xpath=(//div[@class="card-header"]/span[contains(text(),"Gap coverage level")]/parent::div/following::div[1]/descendant::div[contains(@class,"row plan-details-row")])['+i+']/div[2]')
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 0, state)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 1, zip)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 2, planname[planNum-1])
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 3, 'Gap coverage level')
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 4, name)
			ExcelKeywords.setValueToCellByIndex(sheet01, row1, 5, value)
			row1++
		}
	}
	
	//
	
	//sunmaker, go to detail
	WebUI.navigateToUrl('https://sunmaker.medicare.healthinsurance.com/census')
	WebUI.setText(findTestObject('hic/medicare/census.location.zip'), zip)
	
	WebUI.click(findTestObject('hic/medicare/see medicare plans'))
	
	WebUI.waitForElementPresent(findTestObject('hic/medicare/mapd'), 20)
	
	selenium.click('xpath=//h3[text()="'+planname[planNum-1]+'"]/following::a[text()="See Plan Details"]')
	
	Thread.sleep(5000)
	
	//sunmaker - summary
	sumCount = selenium.getXpathCount('(//div[@class="sc-caSCKo ipmUAp row"])[1]/parent::div/following::div[1]/descendant::div[@class="sc-caSCKo bz5mrc-9 coiEhx row"]')
	for(i = 1; i <=sumCount; i++){
		name = selenium.getText('xpath=((//div[@class="sc-caSCKo ipmUAp row"])[1]/parent::div/following::div[1]/descendant::div[@class="sc-caSCKo bz5mrc-9 coiEhx row"])['+i+']/div[1]')
		value = selenium.getText('xpath=((//div[@class="sc-caSCKo ipmUAp row"])[1]/parent::div/following::div[1]/descendant::div[@class="sc-caSCKo bz5mrc-9 coiEhx row"])['+i+']/div[2]')
		ExcelKeywords.setValueToCellByIndex(sheet01, row2, 6, name)
		ExcelKeywords.setValueToCellByIndex(sheet01, row2, 7, value)
		row2++
	}
	sum2Count = selenium.getXpathCount('(//div[@class="sc-jTzLTM jFvmMm align-self-center col" and text()="Summary"])[2]/following::div[@class="sc-fjdhpX cWEpbC collapse"][1]/div/div')
	for (i=1; i<=sum2Count;i++){
		name = selenium.getText('xpath=((//div[@class="sc-jTzLTM jFvmMm align-self-center col" and text()="Summary"])[2]/following::div[@class="sc-fjdhpX cWEpbC collapse"][1]/div/div)['+i+']/div/div[1]')
		value = selenium.getText('xpath=((//div[@class="sc-jTzLTM jFvmMm align-self-center col" and text()="Summary"])[2]/following::div[@class="sc-fjdhpX cWEpbC collapse"][1]/div/div)['+i+']/div/div[2]')
		ExcelKeywords.setValueToCellByIndex(sheet01, row2, 6, name)
		ExcelKeywords.setValueToCellByIndex(sheet01, row2, 7, value)
		row2++
	}
	
	//sunmaker - Outpatient care and services
	if(selenium.isElementPresent('//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Outpatient care and services")]')){
		Count = selenium.getXpathCount('//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Outpatient care and services")]/parent::div/parent::div/following::div[1]/div/div')
		for (i=1;i<=Count;i++){
			name=selenium.getText('xpath=(//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Outpatient care and services")]/parent::div/parent::div/following::div[1]/div/div)['+i+']/div/div[1]')
			value =selenium.getText('xpath=(//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Outpatient care and services")]/parent::div/parent::div/following::div[1]/div/div)['+i+']/div/div[2]')
			ExcelKeywords.setValueToCellByIndex(sheet01, row2, 6, name)
			ExcelKeywords.setValueToCellByIndex(sheet01, row2, 7, value)
			row2++
		}
	}
	
	//sunmaker - Inpatient care
	if(selenium.isElementPresent('//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Inpatient care")]')){
		Count = selenium.getXpathCount('//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Inpatient care")]/parent::div/parent::div/following::div[1]/div/div')
		for (i=1;i<=Count;i++){
			name=selenium.getText('xpath=(//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Inpatient care")]/parent::div/parent::div/following::div[1]/div/div)['+i+']/div/div[1]')
			value = selenium.getText('xpath=(//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Inpatient care")]/parent::div/parent::div/following::div[1]/div/div)['+i+']/div/div[2]')
			ExcelKeywords.setValueToCellByIndex(sheet01, row2, 6, name)
			ExcelKeywords.setValueToCellByIndex(sheet01, row2, 7, value)
			row2++
		}
	}
	
	//sunmaker - Deductible coverage level
	if(selenium.isElementPresent('//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Deductible coverage level")]')){
		Count = selenium.getXpathCount('//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Deductible coverage level")]/parent::div/parent::div/following::div[1]/div/div[2]/div')
		for (i=1;i<=Count;i++){
			name=selenium.getText('xpath=(//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Deductible coverage level")]/parent::div/parent::div/following::div[1]/div/div[2]/div)['+i+']/div/div[1]')
			value =selenium.getText('xpath=(//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Deductible coverage level")]/parent::div/parent::div/following::div[1]/div/div[2]/div)['+i+']/div/div[2]')
			ExcelKeywords.setValueToCellByIndex(sheet01, row2, 6, name)
			ExcelKeywords.setValueToCellByIndex(sheet01, row2, 7, value)
			row2++
		}
	}
	
	//sunmaker - Initial coverage level
	if(selenium.isElementPresent('//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Initial coverage level")]')){
		Count = selenium.getXpathCount('//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Initial coverage level")]/parent::div/parent::div/following::div[1]/div/div[2]/div')
		for (i=1;i<=Count;i++){
			name=selenium.getText('xpath=(//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Initial coverage level")]/parent::div/parent::div/following::div[1]/div/div[2]/div)['+i+']/div/div[1]')
			value=selenium.getText('xpath=(//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Initial coverage level")]/parent::div/parent::div/following::div[1]/div/div[2]/div)['+i+']/div/div[2]')
			ExcelKeywords.setValueToCellByIndex(sheet01, row2, 6, name)
			ExcelKeywords.setValueToCellByIndex(sheet01, row2, 7, value)
			row2++
		}
	}
	
	//sunmaker - Gap coverage level
	if(selenium.isElementPresent('//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Gap coverage level")]')){
		Count = selenium.getXpathCount('//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Gap coverage level")]/parent::div/parent::div/following::div[1]/div/div[2]/div')
		for (i=1;i<=Count;i++){
			name=selenium.getText('xpath=(//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Gap coverage level")]/parent::div/parent::div/following::div[1]/div/div[2]/div)['+i+']/div/div[1]')
			value =selenium.getText('xpath=(//div[@class="sc-jTzLTM jFvmMm align-self-center col" and contains(text(),"Gap coverage level")]/parent::div/parent::div/following::div[1]/div/div[2]/div)['+i+']/div/div[2]')
			ExcelKeywords.setValueToCellByIndex(sheet01, row2, 6, name)
			ExcelKeywords.setValueToCellByIndex(sheet01, row2, 7, value)
			row2++
		}
	}
	
	//save data
	
	ExcelKeywords.saveWorkbook(excelFile, workbook01)
}


