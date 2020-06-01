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


WebUI.callTestCase(findTestCase('AHI/_include/get_screenPath'), [('productLine') : 'Life', ('carrierName') : 'Freedom Lite'], 
    FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i = 0

WebUI.callTestCase(findTestCase('AHI/_include/openWebSite'), [('env') : 'https://qa.agilelifeinsurance.com/'], FailureHandling.STOP_ON_FAILURE)

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://qa.agilelifeinsurance.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.click(findTestObject('Life/get_your_free_quote'))

for (second = 0; second < 10; second++) {
    try {
        if (selenium.isElementPresent('id=zip-input')) {
            break
        }
    }
    catch (Exception e) {
    } 
    
    Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Life/zip_input'), '35215')

WebUI.setText(findTestObject('Life/dob_0'), '01/01/1988')

WebUI.click(findTestObject('Life/compare_plan'))

Thread.sleep(5000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Life/a_Elite_10K'))

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Life/apply_for_this_plan'))

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Life/applyButton'))

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Life/fillApp'))

Thread.sleep(2000)

WebUI.click(findTestObject('Life/js-app-continue-link'))

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Life/credit-payment-authorization'))

WebUI.click(findTestObject('Life/js-app-continue-link'))

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Life/consent-checkbox-0'))

WebUI.click(findTestObject('Life/js-signature-autoFill'))

WebUI.click(findTestObject('Life/js-app-continue-link'))

Thread.sleep(20000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

