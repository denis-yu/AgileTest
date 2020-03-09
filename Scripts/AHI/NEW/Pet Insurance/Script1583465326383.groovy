import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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
WebUI.callTestCase(findTestCase('AHI/_include/get_screenPath'), [('productLine') : 'AHI', ('carrierName') : 'Pet Insurance'], 
    FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i = 0

WebUI.callTestCase(findTestCase('AHI/_include/openWebSite'), [:], FailureHandling.CONTINUE_ON_FAILURE)

def driver = DriverFactory.getWebDriver()

String baseUrl = GlobalVariable.ENV

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('//*[@class=\'filter-option-inner-inner\']')

selenium.click('id=bs-select-1-5')

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

WebUI.sendKeys(findTestObject('mobileSanity/Cancer Insurance/zip'), '35216')

Thread.sleep(3000)

selenium.click('id=js-see-plans')

for (second = 0; second < 20; second++) {
    try {
        if (selenium.isElementPresent('id=name-input')) {
            break
        }
    }
    catch (Exception e) {
    } 
    
    Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('mobileSanity/Pet Insurance/name-input'), 'Test cat')

selenium.click('id=js-continue')

for (second = 0; second < 20; second++) {
	try {
		if (selenium.isElementPresent('xpath=//label[@for=\'p-cat\']')) {
			break
		}
	}
	catch (Exception e) {
	}
	
	Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('//label[@for=\'p-cat\']')

for (second = 0; second < 20; second++) {
	try {
		if (selenium.isElementPresent('id=dob-mm-input')) {
			break
		}
	}
	catch (Exception e) {
	}
	
	Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('mobileSanity/Pet Insurance/dob-mm-input'), '01')

WebUI.setText(findTestObject('mobileSanity/Pet Insurance/dob-dd-input'), '01')

WebUI.setText(findTestObject('mobileSanity/Pet Insurance/dob-yyyy-input'), '2016')

for (second = 0; second < 20; second++) {
	try {
		if (selenium.isElementPresent('xpath=//label[@for=\'p-no\']')) {
			break
		}
	}
	catch (Exception e) {
	}
	
	Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('//label[@for=\'p-no\']')

for (second = 0; second < 20; second++) {
	try {
		if (selenium.isElementPresent('id=applyCta')) {
			break
		}
	}
	catch (Exception e) {
	}
	
	Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('id=applyCta')

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

WebUI.callTestCase(findTestCase('AHI/_include/name'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.type('id=member-P-1-firstName', GlobalVariable.FirstName)

selenium.type('id=member-P-1-lastName', GlobalVariable.LastName)

selenium.type('id=address', GlobalVariable.Address)

selenium.type('id=city', GlobalVariable.City)

selenium.type('id=email', GlobalVariable.AutoEmail)

selenium.type('id=primaryPhone', GlobalVariable.Tel)

selenium.click('id=pet-veterinary-clinic-flag')

Thread.sleep(2000)

selenium.click('id=js-app-continue-link')

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

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.type('id=credit-card-number', '4111111111111111')

selenium.type('id=credit-card-first', 'test')

selenium.type('id=credit-card-last', 'test')

selenium.select('id=expiration-month', '12')

selenium.select('id=expiration-year', '2026')

selenium.type('id=credit-card-cvv', '123')

selenium.type('id=credit-card-number', '4111111111111111')

selenium.click('id=js-same-billing')

selenium.click('id=credit-payment-authorization')

selenium.click('id=js-app-continue-link')

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

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('id=consent-checkbox-0')

selenium.click('id=consent-checkbox-1')

selenium.click('id=consent-checkbox-2')

selenium.click('id=consent-checkbox-3')

selenium.click('id=js-signature-tab')

selenium.click('id=js-app-continue-link')

for (second = 0; second < 30; second++) {
    try {
        if (selenium.isElementPresent('xpath=//h2[contains(text(),\'Thank You\')]')) {
            break
        }
    }
    catch (Exception e) {
    } 
    
    Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

