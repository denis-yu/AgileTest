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

WebUI.waitForElementClickable(findTestObject('mobileSanity/STM/Home Page/a_Quote  Save Today'), 10)

WebUI.click(findTestObject('mobileSanity/STM/Home Page/a_Quote  Save Today'))

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('mobileSanity/STM/STM Census Page/input_Location_zip-input'), zipcode)

Thread.sleep(500)

WebUI.setText(findTestObject('mobileSanity/STM/STM Census Page/input_Date of Birth_dob-0'), '03031987')

WebUI.click(findTestObject('mobileSanity/STM/STM Census Page/label_Male'))

WebUI.click(findTestObject('mobileSanity/STM/STM Census Page/label_Compare Plans'))

WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/STM Quote Page/button_sort'), 20)

Thread.sleep(3000)

WebUI.callTestCase(findTestCase('AHI/_include/check_quoteleadform'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(1000)

