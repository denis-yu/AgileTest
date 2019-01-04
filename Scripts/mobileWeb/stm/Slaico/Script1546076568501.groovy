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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://praetemptatus.agilehealthinsurance.com/')

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_Find Health Insurance for 2018/a_Quote  Save Today'))

WebUI.setText(findTestObject('Object Repository/mobileSanity/STM/Page_2018 Health Insurance Get a Sh/input_Location_zip-input'), 
    '60602')

WebUI.setText(findTestObject('Object Repository/mobileSanity/STM/Page_2018 Health Insurance Get a Sh/input_Date of Birth_dob-0'), 
    '03/03/1987')

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_2018 Health Insurance Get a Sh/label_Male'))

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_2018 Health Insurance Get a Sh/label_Compare Plans'))

//WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_Short Term Health Insurance Qu/button_filters'))
Thread.sleep(4000)

//
//WebUI.click(findTestObject('mobileSanity/STM/Page_Short Term Health Insurance Qu/label_National General_c-faux-'))
//
//WebUI.scrollToElement(findTestObject('Object Repository/mobileSanity/STM/Page_Short Term Health Insurance Qu/a_Show Plans'), 
//    100)
//
//WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_Short Term Health Insurance Qu/a_Show Plans'))
//
//Thread.sleep(1000)
WebUI.scrollToElement(findTestObject('mobileSanity/STM/Page_Short Term Health Insurance Qu/a_Standard Life Select STM Pla'), 
    1000)

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_Short Term Health Insurance Qu/a_Standard Life Select STM Pla'))

Thread.sleep(2000)

WebUI.waitForElementVisible(findTestObject('Object Repository/mobileSanity/STM/Page_Standard Life Select STM Plan/a_Apply for This Plan'), 
    0)

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_Standard Life Select STM Plan/a_Apply for This Plan'))

WebUI.waitForElementVisible(findTestObject('Object Repository/mobileSanity/STM/Page_Standard Life Select STM Plan/a_Start Secure Application'), 
    0)

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_Standard Life Select STM Plan/a_Start Secure Application'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_App Page 1 - Standard Life Sel/a_Autofill App Info'))

Thread.sleep(1000)

WebUI.click(findTestObject('Object Repository/Page_App Page 1 - Standard Life Sel/button_No'))

WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1 - Standard Life Sel/button_No'), 0)

WebUI.click(findTestObject('Object Repository/Page_App Page 1 - Standard Life Sel/button_No'))
WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1 - Standard Life Sel/button_No'), 0)


WebUI.click(findTestObject('Object Repository/Page_App Page 1 - Standard Life Sel/button_No'))
WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1 - Standard Life Sel/button_No'), 0)


WebUI.click(findTestObject('Object Repository/Page_App Page 1 - Standard Life Sel/button_No'))
WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1 - Standard Life Sel/button_No'), 0)


WebUI.click(findTestObject('Object Repository/Page_App Page 1 - Standard Life Sel/button_No'))
WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1 - Standard Life Sel/button_No'), 0)


WebUI.click(findTestObject('Object Repository/Page_App Page 1 - Standard Life Sel/button_No'))
WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1 - Standard Life Sel/button_No'), 0)


WebUI.click(findTestObject('Object Repository/Page_App Page 1 - Standard Life Sel/button_No'))

WebUI.waitForElementVisible(findTestObject('Object Repository/mobileSanity/STM/Page_App Page 1 - Standard Life Sel/a_Continue'), 
    0)

//WebUI.scrollToElement(findTestObject('Object Repository/mobileSanity/STM/Page_App Page 1 - Standard Life Sel/a_Continue'))
WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_App Page 1 - Standard Life Sel/a_Continue'))

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_App Page 1 - Standard Life Sel/a_Autofill App Info'))

Thread.sleep(1000)

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_App Page 2 - Standard Life Sel/a_Continue to Step 3 - Payment'))

Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_App Page 3 - Standard Life Sel/div_Credit Card Number (no das'))

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_App Page 3 - Standard Life Sel/label_I Accept Authorization f'))

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_App Page 3 - Standard Life Sel/a_Continue to Step 4 - Review'))

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_App Page 4 - Standard Life Sel/label'))

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_App Page 4 - Standard Life Sel/div_CLICK TO SIGN'))

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_App Page 4 - Standard Life Sel/a_Submit Your Application'))

Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_App Page 6 - Standard Life Sel/span_Standard Life Select STM'))

WebUI.click(findTestObject('Object Repository/mobileSanity/STM/Page_App Page 6 - Standard Life Sel/span_approved'))

