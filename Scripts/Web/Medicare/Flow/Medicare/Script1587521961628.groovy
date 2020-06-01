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
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium

//census
WebUI.openBrowser('https://sunmaker.medicare.healthinsurance.com/census')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://sunmaker.medicare.healthinsurance.com/census'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.setText(findTestObject('hic/medicare/census.location.zip'), zip)

WebUI.click(findTestObject('hic/medicare/see medicare plans'))

//quote
WebUI.waitForElementPresent(findTestObject('hic/medicare/mapd'), 20)

selenium.click('xpath=//a[text()="See Plan Details"]')

Thread.sleep(5000)

//detail