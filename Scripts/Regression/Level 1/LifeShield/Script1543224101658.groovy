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

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://praetemptatus.agilehealthinsurance.com/")
selenium.click("id=primaryCTA")
selenium.click("id=zip-input")
selenium.type("id=zip-input", "60602")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Gender'])[1]/following::label[1]")
selenium.click("id=dob-0")
selenium.type("id=dob-0", "04/04/1980")
selenium.fireEvent("id=dob-0", "blur")
selenium.click("id=census-buttons-section")
Thread.sleep(1000);
selenium.click("id=js-see-plans")
selenium.click("link=LifeShield Flex 5K/20/9K/750K Extended")
selenium.click("id=plan-details-primary-apply")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Coverage Option'])[1]/following::span[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Dental Option'])[1]/following::span[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Monthly Total'])[1]/following::span[4]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Glossary'])[2]/following::label[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='By checking this box I understand and agree to the statement above.'])[1]/following::button[1]")
selenium.click("id=fillApp")
selenium.click("id=js-app-page-eligibile")
selenium.click("id=js-app-continue-link")
selenium.click("id=js-app-continue-link")
selenium.click("id=credit-card-cvv")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Email Address'])[1]/following::label[1]")
selenium.click("id=js-app-continue-link")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Terms and Agreements'])[1]/preceding::label[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='*'])[2]/following::p[1]")
selenium.click("id=js-app-continue-link")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Thank You Test-123! You have successfully submitted the following application:'])[1]/following::span[1]")
verifyTrue(selenium.getText("xpath=(.//*[normalize-space(text()) and normalize-space(.)='approved'])[1]/following::p[1]").contains("^Congratulations, your application has been approved "))
verifyTrue(selenium.getText("xpath=(.//*[normalize-space(text()) and normalize-space(.)='approved'])[1]/following::p[1]").matches("^Congratulations, your application has been approved "));FailureHandling.CONTINUE_ON_FAILURE
'Take screenshot after logging in'
WebUI.takeScreenshot()
'Close browser'
WebUI.closeBrowser()

