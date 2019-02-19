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

WebUI.click(findTestObject('mobileSanity/STM/Home Page/a_Quote  Save Today'))

WebUI.setText(findTestObject('mobileSanity/STM/STM Census Page/input_Location_zip-input'), '60602')

WebUI.setText(findTestObject('mobileSanity/STM/STM Census Page/input_Date of Birth_dob-0'), '03/03/1987')

WebUI.click(findTestObject('mobileSanity/STM/STM Census Page/label_Male'))

WebUI.click(findTestObject('mobileSanity/STM/STM Census Page/label_Compare Plans'))

Thread.sleep(2000)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/button_filters'))

Thread.sleep(500)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/i_Insurance company'))

Thread.sleep(300)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/label_LifeShield'))

Thread.sleep(300)


WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/a_Show Plans'))

Thread.sleep(2000)

//WebUI.scrollToElement(findTestObject('mobileSanity/STM/STM Quote Page/a_National General 5K5010K250K'), 1000)
WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/a_LifeShield Flex 5K208K750K'))

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('mobileWeb/_include/apply_stm'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/goToEnd_stm'), [:], FailureHandling.STOP_ON_FAILURE)

