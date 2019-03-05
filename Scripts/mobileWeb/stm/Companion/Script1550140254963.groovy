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

now = new Date()

mydate = now.format('yyyyMMdd_HHmmss')

GlobalVariable.screenPath = (((GlobalVariable.stmPath + 'Companion/') + mydate) + '/')

GlobalVariable.i = 0

WebUI.callTestCase(findTestCase('mobileWeb/_include/openWebSite'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/census_stm'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/filter_stm'), [('carrier') : 'pivotcompanion'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/goToDetail_stm'), [('carrier') : 'pivot-health-choice'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/apply_stm'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/goToEnd_stm_autofill'), [:], FailureHandling.STOP_ON_FAILURE)

