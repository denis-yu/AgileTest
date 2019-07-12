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

WebUI.callTestCase(findTestCase('mobileWeb/_include/name'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 1/input__member-P-1-firstName'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 1/input__member-P-1-lastName'), GlobalVariable.LastName)

'when carrier is \'agileone\', fill more areas'
if ((carrier == 'agileone') || (carrier == 'agilesecure')) {
    WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 1/input__primary-beneficiary-fir'), 'test1')

    WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 1/input__primary-beneficiary-las'), 'test2')

    WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 1/input__primary-beneficiary-rel'), 'test3')

    WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 1/input__contingent-beneficiary-'), 'test4')

    WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 1/input__contingent-beneficiary-_lastname'), 'test5')

    WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 1/input__contingent-beneficiary-relationship'), 'test6')
}

WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 1/input__address'), GlobalVariable.Address)

WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 1/input__city'), GlobalVariable.City)

WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 1/input__email'), GlobalVariable.AutoEmail)

WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 1/input_tel'), GlobalVariable.Tel)

WebUI.click(findTestObject('mobileSanity/HBI/Page_App Page 1/a_Continue to Step 2 - Payment'))

WebUI.waitForPageLoad(10)
Thread.sleep(2000)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 2/input__credit-card-first'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 2/input__credit-card-last'), GlobalVariable.LastName)

WebUI.selectOptionByValue(findTestObject('mobileSanity/HBI/Page_App Page 2/select_MM010203040506070809101'), '12', true)

WebUI.selectOptionByValue(findTestObject('mobileSanity/HBI/Page_App Page 2/select_YYYY2019202020212022202'), '2026', true)

WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 2/input__credit-card-number'), '4111111111111111')

WebUI.setText(findTestObject('mobileSanity/HBI/Page_App Page 2/input__cvv'), '123')

WebUI.click(findTestObject('mobileSanity/HBI/Page_App Page 2/label_My billing address is th'))

WebUI.click(findTestObject('mobileSanity/HBI/Page_App Page 2/label_I Accept Authorization f'))

WebUI.click(findTestObject('mobileSanity/HBI/Page_App Page 2/a_Continue to Step 3 - Review'))

WebUI.waitForPageLoad(10)
Thread.sleep(2000)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

'when \'addon\' popup present, click \'no thanks\''
if (CustomKeywords.'test.MobileKeywords.isElementPresent_Web'(findTestObject('mobileSanity/HBI/Page_App Page 2/a_No Thanks'), 10)) {
    WebUI.click(findTestObject('mobileSanity/HBI/Page_App Page 2/a_No Thanks'))
}

WebUI.waitForPageLoad(10)

/*
if (WebUI.verifyElementPresent(findTestObject('mobileSanity/HBI/Page_App Page 2/a_No Thanks'), 10)) {
    WebUI.click(findTestObject('mobileSanity/HBI/Page_App Page 2/a_No Thanks'))
}
*/
WebUI.click(findTestObject('mobileSanity/HBI/Page_App Page 3/label'))

WebUI.click(findTestObject('mobileSanity/HBI/Page_App Page 3/p_CLICK TO SIGN'))

WebUI.click(findTestObject('mobileSanity/HBI/Page_App Page 3/a_Submit Your Application'))

Thread.sleep(30000)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Congratulations', false)

