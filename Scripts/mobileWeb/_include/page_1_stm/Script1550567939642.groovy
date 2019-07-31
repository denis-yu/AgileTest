import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebDriver driver = DriverFactory.getWebDriver()

try {
    if (WebUI.verifyTextPresent('Month Duration Acknowledgement', false)) {
        WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/label_By checking this box I u'))

        WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/button_Continue to Application'))

        Thread.sleep(2000)

        WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)
    }
}
catch (Exception e) {
    println('no consecutive')
} 

WebUI.waitForPageLoad(20)

WebUI.waitForElementPresent(findTestObject('mobileSanity/Common/disclaimer-container'), 20)

selenium = new WebDriverBackedSelenium(driver, GlobalVariable.ENV)

int qnum = selenium.getXpathCount('//button[@data-answer=\'No\']')

for (def index : (1..qnum)) {
    selenium.click(('xpath=(//button[@data-answer=\'No\'])[' + index) + ']')
}

WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1/a_Continue'), 20)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/a_Continue'))

WebUI.waitForPageLoad(10)

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

