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

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenPath'), [('productLine') : 'stm', ('carrierName') : 'Aspen'], 
    FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i = 0

WebUI.callTestCase(findTestCase('mobileWeb/_include/openWebSite'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/census_stm'), [('zipcode') : '60602'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/filter_stm'), [('carrier') : 'aspen'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/goToDetail_stm'), [('carrier') : 'aspen'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/apply_stm'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/goToEnd_stm_autofill'), [:], FailureHandling.STOP_ON_FAILURE)
