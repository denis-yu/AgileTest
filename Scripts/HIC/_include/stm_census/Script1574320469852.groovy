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

Thread.sleep(2000)

WebUI.setText(findTestObject('hic/stm/census/zip'), zipcode)

Thread.sleep(500)

WebUI.setText(findTestObject('hic/stm/census/primaryDOB'), '03031987')

WebUI.click(findTestObject('hic/stm/census/female'))

Thread.sleep(3000)

WebUI.waitForElementClickable(findTestObject('hic/stm/census/submitButton'), 20)

WebUI.click(findTestObject('hic/stm/census/submitButton'))

Thread.sleep(6000)

WebUI.callTestCase(findTestCase('AHI/_include/check_quoteleadform'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(1000)

