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
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

now = new Date()

mydate = now.format('yyyyMMdd_HHmmss')

GlobalVariable.screenPath = (('./Screenshots/mobileWeb/dental/USA Plus/' + mydate) + '/')
GlobalVariable.i=0
WebUI.callTestCase(findTestCase('mobileWeb/_include/openWebSite'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/census_dental'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('-------------quote page--------------------')

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_filter'))

WebUI.waitForElementVisible(findTestObject('mobileSanity/Dental/filter/btn_company'), 10)

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_company'))

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_usa'))

WebUI.waitForJQueryLoad(20, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_filter'))

WebUI.click(findTestObject('mobileSanity/Dental/quote/a_Select This Plan'))

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/Dental/apply/span_Start Secure Application'))

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/goToEnd_dental'), [('carrier') : 'usa'], FailureHandling.STOP_ON_FAILURE)

