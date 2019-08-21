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

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenPath'), [('productLine') : 'Plan Detail', ('carrierName') : 'stm_everest prime'],
	FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i = 0

WebUI.openBrowser('https://praetemptatus.agilehealthinsurance.com/term-health-insurance/plan/everest-al-5000-30-10000-1500000-extended?census[location][zip]=35215&census[member][0][dob]=1/1/1980&census[member][0][gender]=F&census[member][0][role]=P')

WebUI.waitForPageLoad(20)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)

