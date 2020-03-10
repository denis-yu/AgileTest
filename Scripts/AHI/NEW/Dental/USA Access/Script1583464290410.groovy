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

WebUI.callTestCase(findTestCase('AHI/_include/get_screenPath'), [('productLine') : 'AHI',('carrierName') : 'Dental - USA Access'], FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i=0
WebUI.callTestCase(findTestCase('AHI/_include/openWebSite'), [:], FailureHandling.STOP_ON_FAILURE)

def driver = DriverFactory.getWebDriver()

String baseUrl = GlobalVariable.ENV

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('//*[@class=\'filter-option-inner-inner\']')

selenium.click('id=bs-select-1-2')

selenium.click('id=primaryCTA')

for (second = 0; second < 20; second++) {
	try {
		if (selenium.isElementPresent('id=zip-input')) {
			break
		}
	}
	catch (Exception e) {
	}
	
	Thread.sleep(1000)
}
WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('mobileSanity/Dental/census/input_Location_zip-input'), '35215')

WebUI.setText(findTestObject('mobileSanity/Dental/census/input_Date of Birth_dob-0'), '12121980')

WebUI.click(findTestObject('mobileSanity/Dental/census/label_Male'))

selenium.click('id=js-see-plans')

for (second = 0; second < 20; second++) {
	try {
		if (selenium.isElementPresent('id=js-quote-header')) {
			break
		}
	}
	catch (Exception e) {
	}
	
	Thread.sleep(1000)
}
WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_filter'))

WebUI.waitForElementVisible(findTestObject('mobileSanity/Dental/filter/btn_company'), 10)

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_company'))

Thread.sleep(2000)

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_usa'))

WebUI.waitForJQueryLoad(20, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/Dental/filter/btn_filter'))

WebUI.click(findTestObject('mobileSanity/Dental/quote/a_Select This Plan'))

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(3000)

WebUI.click(findTestObject('mobileSanity/Dental/apply/span_Start Secure Application'))

for (second = 0; second < 20; second++) {
	try {
		if (selenium.isElementPresent('id=member-P-1-firstName')) {
			break
		}
	}
	catch (Exception e) {
	}
	
	Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('AHI/_include/name'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Thread.sleep(3000)

WebUI.setText(findTestObject('mobileSanity/Dental/app_page1/input__member-P-1-firstName'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('mobileSanity/Dental/app_page1/input__member-P-1-lastName'), GlobalVariable.LastName)

WebUI.setText(findTestObject('mobileSanity/Dental/app_page1/input__address'), GlobalVariable.Address)

WebUI.setText(findTestObject('mobileSanity/Dental/app_page1/input__city'), GlobalVariable.City)

WebUI.setText(findTestObject('mobileSanity/Dental/app_page1/input__email'), GlobalVariable.AutoEmail)

WebUI.setText(findTestObject('mobileSanity/Dental/app_page1/input_phone'), GlobalVariable.Tel)

WebUI.click(findTestObject('mobileSanity/Dental/app_page1/a_Continue to Step 2 - Payment'))

for (second = 0; second < 20; second++) {
	try {
		if (selenium.isElementPresent('id=credit-card-number')) {
			break
		}
	}
	catch (Exception e) {
	}
	
	Thread.sleep(1000)
}
Thread.sleep(2000)

WebUI.click(findTestObject('mobileSanity/Dental/app_page2/membership/label_ihaveread'))

WebUI.click(findTestObject('mobileSanity/Dental/app_page2/membership/a_ok'))

Thread.sleep(3000)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('mobileSanity/Dental/app_page2/input__credit-card-first'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('mobileSanity/Dental/app_page2/input__credit-card-last'), GlobalVariable.LastName)

WebUI.selectOptionByValue(findTestObject('mobileSanity/Dental/app_page2/select_MM010203040506070809101'), '12', true)

WebUI.selectOptionByValue(findTestObject('mobileSanity/Dental/app_page2/select_YYYY2019202020212022202'), '2026', true)

WebUI.setText(findTestObject('mobileSanity/Dental/app_page2/input__credit-card-number'), '4111111111111111')

WebUI.setText(findTestObject('mobileSanity/Dental/app_page2/input__cvv'), '123')

WebUI.click(findTestObject('mobileSanity/Dental/app_page2/label_My billing address is th'))

WebUI.click(findTestObject('mobileSanity/Dental/app_page2/label_I Accept Authorization f'))

WebUI.click(findTestObject('mobileSanity/Dental/app_page2/a_Continue to Step 3 - Review'))

for (second = 0; second < 20; second++) {
	try {
		if (selenium.isElementPresent('id=consent-checkbox-0')) {
			break
		}
	}
	catch (Exception e) {
	}
	
	Thread.sleep(1000)
}

WebUI.waitForElementClickable(findTestObject('mobileSanity/Dental/app_page3/label'), 20)

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('mobileSanity/Dental/app_page3/label'))

WebUI.click(findTestObject('mobileSanity/Dental/app_page3/p_CLICK TO SIGN'))

WebUI.click(findTestObject('mobileSanity/Dental/app_page3/a_Submit Your Application'))

for (second = 0; second < 30; second++) {
    try {
        if (selenium.isElementPresent('xpath=//h2[contains(text(),\'Congratulation\')]')) {
            break
        }
    }
    catch (Exception e) {
    } 
    
    Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

