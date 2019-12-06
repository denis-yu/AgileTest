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

WebUI.callTestCase(findTestCase('HIC/_include/get_hicScreenPath'), [('project') : 'HIC', ('productLine') : 'HBI', ('carrierName') : 'Vitala Care'], 
    FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i = 0

WebUI.callTestCase(findTestCase('AHI/_include/openWebSite'), [('env') : 'https://qa.healthinsurance.com/'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('hic/nav/navButton'))

Thread.sleep(2000)

WebUI.click(findTestObject('hic/nav/hbiLink'))

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('HIC/_include/stm_census'), [('zipcode') : '90011'], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(5000)

WebUI.scrollToPosition(200, 2300)

WebUI.click(findTestObject('mobileSanity/HBI/quote/a_Vitala Care'))

WebUI.waitForPageLoad(20)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/HBI/detail/a_Apply for This Plan'))

WebUI.waitForPageLoad(20)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/HBI/Page_Apply/span_Start Secure Application'))

WebUI.waitForPageLoad(20)

Thread.sleep(5000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('AHI/_include/goToEnd_hbi'), [('state') : 'ca', ('carrier') : 'vitalacare'], FailureHandling.CONTINUE_ON_FAILURE)

