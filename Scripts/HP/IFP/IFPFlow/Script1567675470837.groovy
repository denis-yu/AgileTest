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

int second;

WebUI.openBrowser('https://www.healthpocket.com/individual-health-insurance')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.healthpocket.com/individual-health-insurance/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

for (second = 0;second<60;second++) {
	try { if (selenium.isElementPresent("//a[contains(text(),'No Thanks. I want to see ACA plans.')]")) 
			selenium.click("//a[contains(text(),'No Thanks. I want to see ACA plans.')]");
			break; } 
		catch (Exception e) {}
	Thread.sleep(1000);
}

for (second = 0;second<60;second++) {
	try { if (selenium.isElementPresent("id=location")) break; } catch (Exception e) {}
	Thread.sleep(1000);
}

selenium.click("id=location")

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.type("id=location", "32209")

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click("id=findPlans")

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

for (second = 0;second<60; second++) {
			try { if (selenium.isElementPresent("//a[contains(text(),'Select')]")) break; } catch (Exception e) {}
			Thread.sleep(1000);
}

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click("//a[contains(text(),'Select')]")

for (second = 0;second<60; second++) {
			try { if (selenium.isElementPresent("xpath=(//a[contains(text(),'Apply Now')])[2]")) break; } catch (Exception e) {}
			Thread.sleep(1000);
}

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click("xpath=(//a[contains(text(),'Apply Now')])[2]")

for (second = 0;second<60;second++) {
	try { if (selenium.isElementPresent("//a[contains(text(),'Select')]")) break; } catch (Exception e) {}
	Thread.sleep(1000);
}


WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click("//a[contains(text(),'Select')]")

WebUI.callTestCase(findTestCase('mobileWeb/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)