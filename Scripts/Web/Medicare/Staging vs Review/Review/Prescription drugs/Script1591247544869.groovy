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

WebUI.callTestCase(findTestCase('Web/_include/get_screenPath_standard'), [('project') : 'Medicare', ('module') : 'Prescription drugs'], 
    FailureHandling.STOP_ON_FAILURE)

GlobalVariable.i = 0

//census
WebUI.openBrowser('https://review.medicare.healthinsurance.com')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://review.medicare.healthinsurance.com'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('hic/medicare/census.location.zip'), '32701')

WebUI.click(findTestObject('hic/medicare/see medicare plans'))

//quote
WebUI.waitForElementPresent(findTestObject('medicare/quote/filter_button'), 20)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('//a[contains(text(),\'Prescription Drugs\')]')

Thread.sleep(2)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('//button[contains(text(),\'Add prescription drugs\')]')

Thread.sleep(2)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('medicare/quote/drug_letter_1'), 'a')

WebUI.setText(findTestObject('medicare/quote/drug_letter_2'), 'm')

WebUI.setText(findTestObject('medicare/quote/drug_letter_3'), 'o')

Thread.sleep(2)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('medicare/quote/drug_li'))

Thread.sleep(2)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.mouseDown('//label[@for=\'i-dose-form\']/following::div/div/div/input')

Thread.sleep(2)

selenium.click('//label[@for=\'i-dose-form\']/following::div/div[2]/div/div')

Thread.sleep(2)

selenium.mouseDown('//label[@for=\'i-dose-id\']/following::div/div/div/input')

Thread.sleep(2)

selenium.click('//label[@for=\'i-dose-id\']/following::div/div[2]/div/div/div')
Thread.sleep(2)

selenium.mouseDown('//label[@for=\'i-frequency\']/following::div/div/div/input')

Thread.sleep(2)

selenium.click('//label[@for=\'i-frequency\']/following::div/div[2]/div/div')
Thread.sleep(2)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('//span[contains(text(),\'Add this prescription\')]')

Thread.sleep(2)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('//button[contains(text(),\'continue to pharmacy\')]')

Thread.sleep(2)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('//a[contains(text(),\'View Available Plans\')]')

WebUI.waitForElementPresent(findTestObject('medicare/quote/filter_button'), 20)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)
