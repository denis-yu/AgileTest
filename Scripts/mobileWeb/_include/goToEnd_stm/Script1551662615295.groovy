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

WebUI.callTestCase(findTestCase('mobileWeb/_include/page_1_stm'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/name'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 2/input__member-P-1-firstName'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 2/input__member-P-1-lastName'), GlobalVariable.LastName)

WebUI.selectOptionByLabel(findTestObject('mobileSanity/STM/Page_App Page 2/member-P-1-ft'), '05', false)

WebUI.selectOptionByLabel(findTestObject('mobileSanity/STM/Page_App Page 2/member-P-1-in'), '06', false)

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 2/member-P-1-lbs'), '180')

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 2/input__address'), GlobalVariable.Address)

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 2/input__city'), GlobalVariable.City)

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 2/input__email'), GlobalVariable.AutoEmail)

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 2/input_tel'), GlobalVariable.Tel)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 2/a_Continue to Step 3 - Payment'))

WebUI.waitForPageLoad(10)

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 3/input__credit-card-first'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 3/input__credit-card-last'), GlobalVariable.LastName)

WebUI.selectOptionByValue(findTestObject('mobileSanity/STM/Page_App Page 3/select_MM010203040506070809101'), '12', true)

WebUI.selectOptionByValue(findTestObject('mobileSanity/STM/Page_App Page 3/select_YYYY2019202020212022202'), '2026', true)

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 3/input__credit-card-number'), '4111111111111111')

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 3/input__cvv'), '123')

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 3/label_My billing address is th'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 3/label_I Accept Authorization f'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 3/a_Continue to Step 4 - Review'))

WebUI.waitForPageLoad(10)

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

/*
if (WebUI.verifyElementPresent(findTestObject('mobileSanity/HBI/Page_App Page 2/a_No Thanks'), 10)) {
    WebUI.click(findTestObject('mobileSanity/HBI/Page_App Page 2/a_No Thanks'))
}
*/
WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 4/label'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 4/div_CLICK TO SIGN'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 4/a_Submit Your Application'))

Thread.sleep(30000)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('mobileSanity/STM/Page_App Page 6/span_planName'), 30)

WebUI.verifyElementPresent(findTestObject('mobileSanity/STM/Page_App Page 6/span_planName'), 20)

WebUI.verifyElementPresent(findTestObject('mobileSanity/STM/Page_App Page 6/span_approved'), 20)

