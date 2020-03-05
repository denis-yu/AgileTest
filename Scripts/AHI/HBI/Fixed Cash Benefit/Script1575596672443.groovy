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

WebUI.callTestCase(findTestCase('AHI/_include/get_screenPath'), [('productLine') : 'hbi', ('carrierName') : 'Fixed Cash Benefit'], 
    FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i = 0

WebUI.callTestCase(findTestCase('AHI/_include/openWebSite'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('AHI/_include/census_hbi'), [('zipcode') : '85364'], FailureHandling.CONTINUE_ON_FAILURE)

Thread.sleep(5000)

WebUI.scrollToPosition(200, 2300)

WebUI.click(findTestObject('mobileSanity/HBI/quote/a_Fixed Cash Benefit'))

WebUI.waitForPageLoad(20)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/HBI/detail/a_Apply for This Plan'))

WebUI.waitForPageLoad(20)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/HBI/Page_Apply/span_Start Secure Application'))

WebUI.waitForPageLoad(20)

Thread.sleep(5000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('AHI/_include/goToEnd_hbi'), [('carrier') : 'FixedCashBenefit'], FailureHandling.CONTINUE_ON_FAILURE)
