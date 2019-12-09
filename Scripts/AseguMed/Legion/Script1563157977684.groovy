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

WebUI.callTestCase(findTestCase('AHI/_include/get_screenPath'), [('productLine') : 'AseguMed', ('carrierName') : 'Legion'], 
    FailureHandling.STOP_ON_FAILURE)

GlobalVariable.i = 0

WebUI.openBrowser('https://pruebas.asegumed.com/')

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AseguMed/homepage/cta-button'))

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('AseguMed/census_page/input_zip'), '35215')

WebUI.sendKeys(findTestObject('AseguMed/census_page/input_dob'), '12121988')

WebUI.click(findTestObject('AseguMed/census_page/label_gender_male'))

WebUI.click(findTestObject('AseguMed/census_page/census_submit_button'))

WebUI.waitForPageLoad(10)

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AseguMed/quote_page/detail_link_plan_2'))

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AseguMed/detail_page/detail_apply_button'))

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AseguMed/apply_page/apply_button'))

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('AseguMed/_include/name'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('AseguMed/app page 1/input_firstname'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('AseguMed/app page 1/input_lastname'), GlobalVariable.LastName)

WebUI.setText(findTestObject('AseguMed/app page 1/input_address'), GlobalVariable.Address)

WebUI.setText(findTestObject('AseguMed/app page 1/input_city'), GlobalVariable.City)

WebUI.setText(findTestObject('AseguMed/app page 1/input_email'), GlobalVariable.AutoEmail)

WebUI.setText(findTestObject('AseguMed/app page 1/input_primaryPhone'), GlobalVariable.Tel)

WebUI.click(findTestObject('AseguMed/app page 1/continue_to_page_2_button'))

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('AseguMed/app page 2/input_credit-card-number'), '4111111111111111')

WebUI.setText(findTestObject('AseguMed/app page 2/input_credit-card-first'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('AseguMed/app page 2/input_credit-card-last'), GlobalVariable.LastName)

WebUI.selectOptionByValue(findTestObject('AseguMed/app page 2/select_expiration-month'), '12', true)

WebUI.selectOptionByValue(findTestObject('AseguMed/app page 2/select_expiration-year'), '2026', true)

WebUI.setText(findTestObject('AseguMed/app page 2/input_credit-card-cvv'), '123')

WebUI.click(findTestObject('AseguMed/app page 2/input_js-same-billing'))

WebUI.click(findTestObject('AseguMed/app page 2/input_credit-payment-authorization'))

WebUI.click(findTestObject('AseguMed/app page 2/continue_to_page_3_button'))

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AseguMed/app page 3/input_consent-checkbox-0'))

WebUI.click(findTestObject('AseguMed/app page 3/link_js-signature-autoFill'))

WebUI.click(findTestObject('AseguMed/app page 3/continue_to_page_4_button'))

WebUI.waitForPageLoad(10)

Thread.sleep(30000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

