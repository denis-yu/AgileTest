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
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://praetemptatus.agilehealthinsurance.com/')

WebUI.waitForPageLoad(10)

Mobile.takeScreenshot()

WebUI.click(findTestObject('mobileSanity/Dental/side_nav/menu'))

Thread.sleep(3000)

Mobile.takeScreenshot()

WebUI.click(findTestObject('mobileSanity/Dental/side_nav/nav_dental'))

WebDriver driver = DriverFactory.getWebDriver()

WebUI.waitForPageLoad(10)

Mobile.takeScreenshot()

WebUI.sendKeys(findTestObject('mobileSanity/Dental/census/input_Location_zip-input'), '35215')

WebUI.setText(findTestObject('mobileSanity/Dental/census/input_Date of Birth_dob-0'), '12/12/1985')

WebUI.click(findTestObject('mobileSanity/Dental/census/label_Male'))

WebUI.click(findTestObject('mobileSanity/Dental/census/label_Compare Dental Insurance'))

WebUI.waitForPageLoad(10)

Mobile.takeScreenshot()

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_filter'))

WebUI.waitForElementVisible(findTestObject('mobileSanity/Dental/filter/btn_company'), 10)

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_company'))

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_nationwide'))

WebUI.waitForJQueryLoad(20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_filter'))

WebUI.click(findTestObject('mobileSanity/Dental/quote/a_Select This Plan'))

WebUI.waitForPageLoad(10)

Mobile.takeScreenshot()

WebUI.click(findTestObject('mobileSanity/Dental/apply/span_Start Secure Application'))

WebUI.waitForPageLoad(10)

Thread.sleep(3000)

Mobile.takeScreenshot()

WebUI.setText(findTestObject('mobileSanity/Dental/app_page1/input__member-P-1-firstName'), 'Test-123')

WebUI.setText(findTestObject('mobileSanity/Dental/app_page1/input__member-P-1-lastName'), 'ZZ11-qwerty')

WebUI.setText(findTestObject('mobileSanity/Dental/app_page1/input__address'), 'test test')

WebUI.setText(findTestObject('mobileSanity/Dental/app_page1/input__city'), 'test test')

WebUI.setText(findTestObject('mobileSanity/Dental/app_page1/input__email'), 'test.test123@suryani.cn')

WebUI.setText(findTestObject('mobileSanity/Dental/app_page1/input_phone'), '5214566589')

WebUI.click(findTestObject('mobileSanity/Dental/app_page1/a_Continue to Step 2 - Payment'))

WebUI.waitForPageLoad(10)

Mobile.takeScreenshot()

WebUI.setText(findTestObject('mobileSanity/Dental/app_page2/input__credit-card-first'), 'test')

WebUI.setText(findTestObject('mobileSanity/Dental/app_page2/input__credit-card-last'), 'test')

WebUI.selectOptionByValue(findTestObject('mobileSanity/Dental/app_page2/select_MM010203040506070809101'), '12', true)

WebUI.selectOptionByValue(findTestObject('mobileSanity/Dental/app_page2/select_YYYY2019202020212022202'), '2026', true)

WebUI.setText(findTestObject('mobileSanity/Dental/app_page2/input__credit-card-number'), '4111111111111111')

WebUI.setText(findTestObject('mobileSanity/Dental/app_page2/input__cvv'), '123')

WebUI.click(findTestObject('mobileSanity/Dental/app_page2/label_My billing address is th'))

WebUI.click(findTestObject('mobileSanity/Dental/app_page2/label_I Accept Authorization f'))

WebUI.click(findTestObject('mobileSanity/Dental/app_page2/a_Continue to Step 3 - Review'))

WebUI.waitForPageLoad(10)

Mobile.takeScreenshot()

WebUI.click(findTestObject('mobileSanity/Dental/app_page3/label'))

WebUI.click(findTestObject('mobileSanity/Dental/app_page3/p_CLICK TO SIGN'))

WebUI.click(findTestObject('mobileSanity/Dental/app_page3/a_Submit Your Application'))

Thread.sleep(20000)

Mobile.takeScreenshot()

WebUI.verifyTextPresent('Congratulations', false)

