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

WebUI.callTestCase(findTestCase('HIC/_include/get_hicScreenPath'), [('project') : 'HIC', ('productLine') : 'Teladoc', ('carrierName') : 'Teladoc'], 
    FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i = 0

WebUI.callTestCase(findTestCase('AHI/_include/openWebSite'), [('env') : 'https://qa.healthinsurance.com/'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('hic/nav/navButton'))

Thread.sleep(2000)

WebUI.click(findTestObject('hic/nav/teladocLink'))

Thread.sleep(5000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

WebUI.setText(findTestObject('hic/stm/census/zip'), zipcode)

Thread.sleep(500)

WebUI.setText(findTestObject('hic/stm/census/primaryDOB'), '03031987')

WebUI.click(findTestObject('hic/stm/census/female'))

Thread.sleep(3000)

WebUI.click(findTestObject('hic/teladoc/seePlans'))

Thread.sleep(6000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(1000)

'click button'
WebUI.click(findTestObject('mobileSanity/Teladoc/census/get_a_quote'))

WebUI.waitForPageLoad(20)

WebUI.waitForElementVisible(findTestObject('mobileSanity/Teladoc/apply_button'), 20)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/Teladoc/apply_button'))

WebUI.waitForPageLoad(20)

WebUI.waitForElementPresent(findTestObject('mobileSanity/Teladoc/Page_App Page 1/input__member-P-1-firstName'), 20)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

'get name'
WebUI.callTestCase(findTestCase('AHI/_include/name'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('mobileSanity/Teladoc/Page_App Page 1/input__member-P-1-firstName'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('mobileSanity/Teladoc/Page_App Page 1/input__member-P-1-lastName'), GlobalVariable.LastName)

WebUI.selectOptionByValue(findTestObject('mobileSanity/Teladoc/Page_App Page 1/select_01020304050607'), '05', true)

WebUI.selectOptionByValue(findTestObject('mobileSanity/Teladoc/Page_App Page 1/select_00102030405060708091011'), '06', true)

WebUI.setText(findTestObject('mobileSanity/Teladoc/Page_App Page 1/input_lbs'), '180')

WebUI.setText(findTestObject('mobileSanity/Teladoc/Page_App Page 1/input__address'), GlobalVariable.Address)

WebUI.setText(findTestObject('mobileSanity/Teladoc/Page_App Page 1/input__city'), GlobalVariable.City)

WebUI.setText(findTestObject('mobileSanity/Teladoc/Page_App Page 1/input__email'), GlobalVariable.AutoEmail)

WebUI.setText(findTestObject('mobileSanity/Teladoc/Page_App Page 1/input_phone number'), GlobalVariable.Tel)

Thread.sleep(2000)

WebUI.scrollToElement(findTestObject('mobileSanity/Teladoc/Page_App Page 1/a_Continue to Step 2 - Payment'), 10)

WebUI.click(findTestObject('mobileSanity/Teladoc/Page_App Page 1/a_Continue to Step 2 - Payment'))

WebUI.waitForPageLoad(20)

WebUI.waitForElementVisible(findTestObject('mobileSanity/Teladoc/Page_App Page 2/input__credit-card-first'), 20)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('mobileSanity/Teladoc/Page_App Page 2/input__credit-card-first'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('mobileSanity/Teladoc/Page_App Page 2/input__credit-card-last'), GlobalVariable.LastName)

WebUI.selectOptionByValue(findTestObject('mobileSanity/Teladoc/Page_App Page 2/select_MM010203040506070809101'), '12', true)

WebUI.selectOptionByValue(findTestObject('mobileSanity/Teladoc/Page_App Page 2/select_YYYY2019202020212022202'), '2026', 
    true)

WebUI.setText(findTestObject('mobileSanity/Teladoc/Page_App Page 2/input__credit-card-number'), '4111111111111111')

WebUI.setText(findTestObject('mobileSanity/Teladoc/Page_App Page 2/input__credit-card-cvv'), '122')

WebUI.click(findTestObject('mobileSanity/Teladoc/Page_App Page 2/label_My billing address is th'))

WebUI.click(findTestObject('mobileSanity/Teladoc/Page_App Page 2/label_I Accept Authorization f'))

WebUI.click(findTestObject('mobileSanity/Teladoc/Page_App Page 2/a_Continue to Step 3 - Review'))

WebUI.waitForPageLoad(20)

WebUI.waitForElementPresent(findTestObject('mobileSanity/Teladoc/Page_App Page 3/label'), 20)

Thread.sleep(5000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('mobileSanity/Teladoc/Page_App Page 3/label'), 10)

WebUI.waitForElementClickable(findTestObject('mobileSanity/Teladoc/Page_App Page 3/label'), 10)

WebUI.click(findTestObject('mobileSanity/Teladoc/Page_App Page 3/label'))

WebUI.click(findTestObject('mobileSanity/Teladoc/Page_App Page 3/p_'))

WebUI.click(findTestObject('mobileSanity/Teladoc/Page_App Page 3/a_Submit Your Application'))

Thread.sleep(50000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Congratulations', false)
