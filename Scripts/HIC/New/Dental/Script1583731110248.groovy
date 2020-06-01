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

WebUI.callTestCase(findTestCase('HIC/_include/get_hicScreenPath'), [('project') : 'HIC', ('productLine') : 'Dental', ('carrierName') : 'USA Access'], 
    FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i = 0

WebUI.callTestCase(findTestCase('AHI/_include/openWebSite'), [('env') : env], FailureHandling.CONTINUE_ON_FAILURE)

def driver = DriverFactory.getWebDriver()

String baseUrl = env

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('//span[@class=\'navbar-toggler-icon\']')

selenium.click('//a[@class=\'dropdown-toggle nav-link\']')

selenium.click('//a[contains(text(),\'Dental\')]')

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

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('HIC/_include/stm_census'), [('zipcode') : '35215'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_filter'))

WebUI.waitForElementVisible(findTestObject('mobileSanity/Dental/filter/btn_company'), 10)

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_company'))

Thread.sleep(2000)

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_usa'))

WebUI.waitForJQueryLoad(20, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_filter'))

Thread.sleep(2000)

WebUI.scrollToPosition(0, 600)

Thread.sleep(2000)

WebUI.click(findTestObject('mobileSanity/Dental/quote/a_Select This Plan'))

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

WebUI.click(findTestObject('mobileSanity/Dental/apply/span_Start Secure Application'))

WebUI.waitForPageLoad(10)

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('AHI/_include/goToEnd_dental'), [('carrier') : 'usa'], FailureHandling.CONTINUE_ON_FAILURE)

