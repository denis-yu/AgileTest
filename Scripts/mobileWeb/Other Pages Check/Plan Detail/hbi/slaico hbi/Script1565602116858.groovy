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

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenPath'), [('productLine') : 'Plan Detail', ('carrierName') : 'hbi slaico hbi'],
	FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i = 0

WebUI.openBrowser('https://praetemptatus.agilehealthinsurance.com/health-benefit-insurance/plan/slaicohbi-az-500-30-50-5?census[location][zip]=85364&census[member][0][dob]=1/1/1980&census[member][0][gender]=F&census[member][0][role]=P')

WebUI.waitForPageLoad(20)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)

