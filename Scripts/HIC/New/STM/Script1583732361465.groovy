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
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

//now = new Date()
//
//mydate = now.format('yyyyMMdd_HHmmss')
//GlobalVariable.screenPath = (((GlobalVariable.stmPath + 'AdvantHealth/') + mydate) + '/')
WebUI.callTestCase(findTestCase('HIC/_include/get_hicScreenPath'), [('project') : 'HIC', ('productLine') : 'STM', ('carrierName') : 'STM'], 
    FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i = 0

WebUI.callTestCase(findTestCase('AHI/_include/openWebSite'), [('env') : env], FailureHandling.CONTINUE_ON_FAILURE)

def driver = DriverFactory.getWebDriver()

String baseUrl = env

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('//span[@class=\'navbar-toggler-icon\']')

selenium.click('//a[@class=\'dropdown-toggle nav-link\']')

selenium.click('//a[contains(text(),\'Short Term Insurance\')]')

for (second = 0; second < 10; second++) {
    try {
        if (selenium.isElementPresent('xpath=//button[contains(text(),\'GET QUOTES\')]')) {
            break
        }
    }
    catch (Exception e) {
    } 
    
    Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('xpath=//button[contains(text(),\'GET QUOTES\')]')

Thread.sleep(3000)

selenium.selectWindow('HealthInsurance.net | Get a Quote')

Thread.sleep(3000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)
