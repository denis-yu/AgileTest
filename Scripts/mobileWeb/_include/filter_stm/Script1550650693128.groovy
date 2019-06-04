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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.Keys as Keys

WebDriver driver = DriverFactory.getWebDriver()

selenium = new WebDriverBackedSelenium(driver, GlobalVariable.ENV)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/button_6 months'))

CustomKeywords.'test.MobileKeywords.clickJS'(findTestObject('mobileSanity/STM/STM Quote Page/radio_6 months'))

Thread.sleep(1000)

CustomKeywords.'test.MobileKeywords.clickJS'(findTestObject('mobileSanity/STM/STM Quote Page/duration_show_plans'))

WebUI.waitForJQueryLoad(10, FailureHandling.STOP_ON_FAILURE)

Thread.sleep(1000)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/button_filters'))

Thread.sleep(1000)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/i_Insurance company'))

Thread.sleep(1000)

String filter_carrier = ('//input[@name=\'filter[carrier]\' and @value=\'' + carrier) + '\']/following::label'

println(filter_carrier)

CustomKeywords.'test.MobileKeywords.clickJS_ByXpath'(filter_carrier)

Thread.sleep(1000)

WebUI.scrollToElement(findTestObject('mobileSanity/STM/STM Quote Page/a_Show Plans'), 1000)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/a_Show Plans'))

WebUI.waitForJQueryLoad(10, FailureHandling.STOP_ON_FAILURE)

Thread.sleep(1000)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

