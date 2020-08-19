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

WebUI.callTestCase(findTestCase('Medicare/_include/get_screenPath'), [('project') : 'Medicare', ('module') : 'Save progress'], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.i = 0

//census
WebUI.openBrowser(GlobalVariable.ENV+'/saved-progress/ngvw7322')

WebUI.delay(5)

def driver = DriverFactory.getWebDriver()

String baseUrl = GlobalVariable.ENV

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('//a[text()=\'Save Progress\']')

WebUI.delay(2)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('//*[@id=\'progress-saved-popup\']/*[name()=\'svg\']')

Thread.sleep(1)

selenium.click('//a[text()=\'Estimated Annual Costs\']/following::p/a')

Thread.sleep(2)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)


