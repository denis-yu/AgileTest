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
import org.openqa.selenium.By as By
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium

WebUI.callTestCase(findTestCase('AHI/_include/get_screenPath'), [('productLine') : 'Help Center', ('carrierName') : 'help members_slaicohbi'],
	FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i = 0

WebUI.openBrowser(GlobalVariable.ENV)

WebUI.waitForPageLoad(20)

WebDriver driver = DriverFactory.getWebDriver()

selenium = new WebDriverBackedSelenium(driver, GlobalVariable.ENV)

helpcenter_xpath = '//ul[@class=\'footer-list footer-about\']/li[3]/a'

WebElement element = driver.findElement(By.xpath(helpcenter_xpath))
	
WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(element))

WebUI.waitForPageLoad(20)

WebElement el1 = driver.findElement(By.xpath("(//ul[@class='row reset amp-box-list'])[2]/li[6]/a"))

WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(el1))

WebUI.waitForPageLoad(20)

WebUI.callTestCase(findTestCase('AHI/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)

int num = selenium.getXpathCount('//li[@class=\'col-sm-4\']')

println(num)

for (def index : (1..num)) {
	
	xpath = (('(//li[@class=\'col-sm-4\'])[' + index) + ']/a')

	WebElement el = driver.findElement(By.xpath(xpath))

	WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(el))

	WebUI.waitForPageLoad(20)

	WebUI.callTestCase(findTestCase('AHI/_include/get_scrollScreenshot'), [:], FailureHandling.STOP_ON_FAILURE)

	WebUI.back()
}
