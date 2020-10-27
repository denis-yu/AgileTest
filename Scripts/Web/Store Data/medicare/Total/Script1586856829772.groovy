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

(GlobalVariable.i)++

WebUI.openBrowser('https://sunmaker.medicare.healthinsurance.com/census')

def driver = DriverFactory.getWebDriver()

baseUrl = 'https://sunmaker.medicare.healthinsurance.com/census'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.setText(findTestObject('hic/medicare/census.location.zip'), zip)

WebUI.click(findTestObject('hic/medicare/see medicare plans'))

WebUI.waitForElementPresent(findTestObject('hic/medicare/mapd'), 20)

mapd = selenium.getText('//h1')

mapdN = mapd.replaceAll('\\s[a-zA-Z]*', '')

int mapdNum = Integer.parseInt(mapdN)

println(mapd)

println(mapdNum)

mapdPlansString = ''

for (n = 1; n <= mapdNum; n++) {
    mapdPlansString = ((mapdPlansString + ' / ') + selenium.getText(('xpath=(//h3)[' + n) + ']'))
}

selenium.click('link=View Part D Plans.')

WebUI.waitForElementPresent(findTestObject('hic/medicare/pd'), 20)

pd = selenium.getText('//h1')

pdN = pd.replaceAll('\\s[a-zA-Z]*', '')

int pdNum = Integer.parseInt(pdN)

println(pd)

println(pdNum)

pdPlansString = ''

for (n = 1; n <= pdNum; n++) {
    pdPlansString = ((pdPlansString + ' / ') + selenium.getText(('xpath=(//h3)[' + n) + ']'))
}

println(mapdPlansString)

println(pdPlansString)

CustomKeywords.'test.WriteExcel.writeToOneExcel'(mapdNum, mapdPlansString, pdNum, pdPlansString, 'Total', GlobalVariable.i)

