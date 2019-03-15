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

GlobalVariable.screenPath = (((GlobalVariable.stmPath + 'AdvantHealth/') + mydate) + '/')

GlobalVariable.i = 0

WebUI.callTestCase(findTestCase('mobileWeb/_include/openWebSite'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/census_stm'), [('zipcode') : '35215'], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/button_filters'))

Thread.sleep(500)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/i_Insurance company'))

Thread.sleep(300)

CustomKeywords.'test.MobileKeywords.clickJS'(findTestObject('mobileSanity/STM/STM Quote Page/label_AdvantHealth'))

Thread.sleep(300)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/a_Show Plans'))

Thread.sleep(2000)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/a_AdvantHealth Plan 2 2.5K206.'))

Thread.sleep(2000)

WebUI.click(findTestObject('mobileSanity/STM/STM PlanDetail Page/a_Apply for This Plan'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('mobileSanity/STM/STM Apply Page/span_ Add'))

WebUI.click(findTestObject('mobileSanity/STM/STM Apply Page/button_ AddRemove'))

WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/STM Apply Page/a_Start Secure Application'), 0)

WebUI.click(findTestObject('mobileSanity/STM/STM Apply Page/a_Start Secure Application'))

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/label_By checking this box I u'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/button_Continue to Application'))

WebUI.callTestCase(findTestCase('mobileWeb/_include/goToEnd_stm_autofill'), [:], FailureHandling.STOP_ON_FAILURE)

