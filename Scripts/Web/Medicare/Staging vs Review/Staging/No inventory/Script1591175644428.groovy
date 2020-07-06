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

WebUI.callTestCase(findTestCase('Web/_include/get_screenPath'), [('project') : 'Medicare', ('module') : 'No inventory'], 
    FailureHandling.STOP_ON_FAILURE)

GlobalVariable.i = 0

//census
WebUI.openBrowser(GlobalVariable.ENV)

def driver = DriverFactory.getWebDriver()

String baseUrl = GlobalVariable.ENV

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('hic/medicare/census.location.zip'), '72057')

Thread.sleep(2)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('//button[contains(text(),\'Cleveland\')]')

Thread.sleep(1)

WebUI.click(findTestObject('hic/medicare/see medicare plans'))

WebUI.waitForElementPresent(findTestObject('medicare/quote/no_inventory_back'), 20)

//quote
WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

