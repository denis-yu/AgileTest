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

//WebUI.callTestCase(findTestCase('mobileWeb/_include/openWebSite'), [:], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.openBrowser('')
WebUI.navigateToUrl('https://stormlight.agilehealthinsurance.com/')
WebUI.callTestCase(findTestCase('mobileWeb/_include/census_stm'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeScreenshot()

Thread.sleep(2000)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/button_filters'))
Thread.sleep(300)
WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/i_Insurance company'))
Thread.sleep(300)
WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/label_companion'))
Thread.sleep(300)
WebUI.scrollToElement(findTestObject('mobileSanity/STM/STM Quote Page/a_Show Plans'), 1000)
WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/a_Show Plans'))
Thread.sleep(1000)
WebUI.scrollToElement(findTestObject('mobileSanity/STM/STM Quote Page/a_Pivot Health Choice 5K  20'), 1000)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/a_Pivot Health Choice 5K  20'))

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('mobileWeb/_include/apply_stm'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('mobileWeb/_include/goToEnd_stm'), [:], FailureHandling.STOP_ON_FAILURE)

