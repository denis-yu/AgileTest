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

WebUI.callTestCase(findTestCase('AHI/_include/name'), [:], FailureHandling.CONTINUE_ON_FAILURE)

leadform_exist = CustomKeywords.'test.MobileKeywords.isElementPresent_Web'(findTestObject('mobileSanity/quote lead form/lead_form'), 20)

if (leadform_exist) {
    WebUI.setText(findTestObject('mobileSanity/quote lead form/first'), GlobalVariable.FirstName)

    WebUI.setText(findTestObject('mobileSanity/quote lead form/last'), GlobalVariable.LastName)

    WebUI.setText(findTestObject('mobileSanity/quote lead form/email'), GlobalVariable.AutoEmail)

    WebUI.setText(findTestObject('mobileSanity/quote lead form/phone'), GlobalVariable.Tel)

    WebUI.click(findTestObject('mobileSanity/quote lead form/submit'))

    Thread.sleep(3000)
}

