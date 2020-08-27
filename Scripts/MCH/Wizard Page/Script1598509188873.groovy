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
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('AHI/_include/get_screenPath'), [('productLine') : 'MCH', ('carrierName') : 'Wizard Page'], 
    FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i = 0

WebUI.openBrowser('https://qa.medicarecoveragehelpline.com')

WebUI.waitForPageLoad(20)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://qa.medicarecoveragehelpline.com'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('//button[text()=\'Compare Plans Now\']')

for (second = 0; second < 20; second++) {
    try {
        if (selenium.isElementPresent('//p[text()=\'What is your zip code?\']')) {
            break
        }
    }
    catch (Exception e) {
    } 
}

WebUI.setText(findTestObject('MCH/wizard_zip'), '33186')

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('//button[text()=\'Done\']')

for (second = 0; second < 20; second++) {
    try {
        if (selenium.isElementPresent('//p[text()=\'What is your name?\']')) {
            break
        }
    }
    catch (Exception e) {
    } 
}

WebUI.setText(findTestObject('MCH/wizard_firstname'), 'testfir')

WebUI.setText(findTestObject('MCH/wizard_lastname'), 'testlas')

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('//button[text()=\'Done\']')

for (second = 0; second < 20; second++) {
    try {
        if (selenium.isElementPresent('//p[text()=\'What is your email address?\']')) {
            break
        }
    }
    catch (Exception e) {
    } 
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('//a[contains(text(),\'Skip\')]')

for (second = 0; second < 20; second++) {
    try {
        if (selenium.isElementPresent('id=phone')) {
            break
        }
    }
    catch (Exception e) {
    } 
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

