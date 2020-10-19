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
import com.kms.katalon.core.webui.util.WebDriverPropertyUtil as property
import com.kms.katalon.core.configuration.RunConfiguration as RS
import org.openqa.selenium.remote.DesiredCapabilities


Map m = RS.getExecutionProperties()

String devicename = m.get("drivers").get("preferences").get("WebUI").get("deviceName")

println devicename

now = new Date()

mydate = now.format('yyyyMMdd_HHmmss')

GlobalVariable.screenPath='../Screenshots/'

GlobalVariable.screenPath = (((GlobalVariable.screenPath +devicename+ '/MCH/Home Page/') + mydate) + '/')

GlobalVariable.i = 0

WebUI.openBrowser('https://qa.medicarecoveragehelpline.com')

WebUI.waitForPageLoad(20)

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://qa.medicarecoveragehelpline.com'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

int pageHeight = WebUI.getPageHeight()

for (int y = 600; y < pageHeight; y = y+600) {
	
	Thread.sleep(1000)

	WebUI.takeScreenshot((GlobalVariable.screenPath + GlobalVariable.i) + '.png')

	(GlobalVariable.i)++
	
	WebUI.scrollToPosition(0, y)
	
	Thread.sleep(3000)
	
}
