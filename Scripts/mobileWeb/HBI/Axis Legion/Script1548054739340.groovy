import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('mobileWeb/_include/openWebSite'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/census_hbi'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/HBI/quote/a_Legion Limited Medical 500'))

WebUI.click(findTestObject('mobileSanity/HBI/detail/a_Apply for This Plan'))

WebUI.click(findTestObject('mobileSanity/HBI/Page_Apply/span_Start Secure Application'))

WebUI.callTestCase(findTestCase('mobileWeb/_include/goToEnd_hbi'), [('carrier') : 'axislegion'], FailureHandling.CONTINUE_ON_FAILURE)

