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

WebUI.click(findTestObject('mobileSanity/Dental/side_nav/menu'))

WebUI.click(findTestObject('mobileSanity/Dental/side_nav/nav_dental'))

WebUI.setText(findTestObject('Object Repository/mobileSanity/Dental/input_Location_zip-input'), '35215')

WebUI.setText(findTestObject('Object Repository/mobileSanity/Dental/input_Date of Birth_dob-0'), '12/12/1985')

WebUI.click(findTestObject('Object Repository/mobileSanity/Dental/label_Male'))

WebUI.click(findTestObject('Object Repository/mobileSanity/Dental/label_Compare Dental Insurance'))

WebUI.click(findTestObject('Object Repository/mobileSanity/Dental/span_Nationwide'))

WebUI.click(findTestObject('Object Repository/mobileSanity/Dental/a_Select This Plan'))

WebUI.click(findTestObject('Object Repository/mobileSanity/Dental/span_Start Secure Application'))

WebUI.setText(findTestObject('Object Repository/mobileSanity/Dental/input__member-P-1-firstName'), 'Test-123')

WebUI.setText(findTestObject('Object Repository/mobileSanity/Dental/input__member-P-1-lastName'), 'ZZ11-qwerty')

WebUI.setText(findTestObject('Object Repository/mobileSanity/Dental/input__address'), 'test test')

WebUI.setText(findTestObject('Object Repository/mobileSanity/Dental/input__city'), 'test test')

WebUI.setText(findTestObject('Object Repository/mobileSanity/Dental/input__email'), 'test.test123@suryani.cn')

WebUI.click(findTestObject('Object Repository/mobileSanity/Dental/a_Continue to Step 2 - Payment'))

WebUI.setText(findTestObject('Object Repository/mobileSanity/Dental/input__credit-card-first'), 'test')

WebUI.setText(findTestObject('Object Repository/mobileSanity/Dental/input__credit-card-last'), 'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/mobileSanity/Dental/select_MM010203040506070809101'), '12', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/mobileSanity/Dental/select_YYYY2019202020212022202'), '2026', 
    true)

WebUI.click(findTestObject('Object Repository/mobileSanity/Dental/label_My billing address is th'))

WebUI.click(findTestObject('Object Repository/mobileSanity/Dental/label_I Accept Authorization f'))

WebUI.click(findTestObject('Object Repository/mobileSanity/Dental/a_Continue to Step 3 - Review'))

WebUI.click(findTestObject('Object Repository/mobileSanity/Dental/label'))

WebUI.click(findTestObject('Object Repository/mobileSanity/Dental/p_CLICK TO SIGN'))

WebUI.click(findTestObject('Object Repository/mobileSanity/Dental/a_Submit Your Application'))

WebUI.rightClick(findTestObject('Object Repository/mobileSanity/Dental/span_Congratulations'))

WebUI.click(findTestObject('Object Repository/mobileSanity/Dental/span_Congratulations'))

WebUI.rightClick(findTestObject('Object Repository/mobileSanity/Dental/span_Congratulations'))

WebUI.click(findTestObject('Object Repository/mobileSanity/Dental/span_Congratulations'))

