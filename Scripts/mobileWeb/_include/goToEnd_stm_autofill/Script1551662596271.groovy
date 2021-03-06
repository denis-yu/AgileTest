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

WebUI.waitForPageLoad(0)

Thread.sleep(1000)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('mobileWeb/_include/page_1_stm'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1/a_Autofill App Info'), 0)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/a_Autofill App Info'))

Thread.sleep(1000)

WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1/a_Continue'), 0)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/a_Continue'))

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 2/a_Continue to Step 3 - Payment'))

Thread.sleep(2000)

WebUI.clearText(findTestObject('mobileSanity/STM/Page_App Page 3/input__credit-card-cvv'))

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 3/input__credit-card-cvv'), '123')

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 3/label_I Accept Authorization f'))

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 3/a_Continue to Step 4 - Review'))

WebUI.waitForElementClickable(findTestObject('mobileSanity/STM/Page_App Page 4/label'), 10)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 4/label'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 4/div_CLICK TO SIGN'))

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 4/a_Submit Your Application'))

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('mobileSanity/STM/Page_App Page 6/span_planName'), 30)

WebUI.verifyElementPresent(findTestObject('mobileSanity/STM/Page_App Page 6/span_planName'), 0)

WebUI.verifyElementPresent(findTestObject('mobileSanity/STM/Page_App Page 6/span_approved'), 0)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

