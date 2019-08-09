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
import org.openqa.selenium.By
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenPath'), [('productLine') : 'frontdoor', ('carrierName') : 'stm'], 
    FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i = 0

WebUI.openBrowser(GlobalVariable.ENV)

WebUI.waitForPageLoad(20)

WebDriver driver = DriverFactory.getWebDriver()

selenium = new WebDriverBackedSelenium(driver,GlobalVariable.ENV)

int num = selenium.getXpathCount("//ul[@class='footer-list footer-short-term']/li")

println(num)

for(def index:(2..num)){
	
	xpath='//ul[@class=\'footer-list footer-short-term\']/li[' + index + ']/a'
	
	WebElement element = driver.findElement(By.xpath(xpath))
		
	WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(element))
	
	WebUI.waitForPageLoad(20)
	
	WebUI.callTestCase(findTestCase('mobileWeb/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)
	
}
//
//WebUI.callTestCase(findTestCase('mobileWeb/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('mobileSanity/Front door/a_advanthealth'))
//
//WebUI.waitForPageLoad(20)
//
//WebUI.callTestCase(findTestCase('mobileWeb/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('mobileSanity/Front door/a_aspen'))
//
//WebUI.waitForPageLoad(20)
//
//WebUI.callTestCase(findTestCase('mobileWeb/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('mobileSanity/Front door/a_companionlife'))
//
//WebUI.waitForPageLoad(20)
//
//WebUI.callTestCase(findTestCase('mobileWeb/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('mobileSanity/Front door/a_everest'))
//
//WebUI.waitForPageLoad(20)
//
//WebUI.callTestCase(findTestCase('mobileWeb/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('mobileSanity/Front door/a_everestprime'))
//
//WebUI.waitForPageLoad(20)
//
//WebUI.callTestCase(findTestCase('mobileWeb/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('mobileSanity/Front door/a_lifeshield'))
//
//WebUI.waitForPageLoad(20)
//
//WebUI.callTestCase(findTestCase('mobileWeb/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('mobileSanity/Front door/a_nationalgeneral'))
//
//WebUI.waitForPageLoad(20)
//
//WebUI.callTestCase(findTestCase('mobileWeb/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('mobileSanity/Front door/a_standardlife'))
//
//WebUI.waitForPageLoad(20)
//
//WebUI.callTestCase(findTestCase('mobileWeb/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('mobileSanity/Front door/a_texas'))
//
//WebUI.waitForPageLoad(20)
//
//WebUI.callTestCase(findTestCase('mobileWeb/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('mobileSanity/Front door/a_florida'))
//
//WebUI.waitForPageLoad(20)
//
//WebUI.callTestCase(findTestCase('mobileWeb/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)

