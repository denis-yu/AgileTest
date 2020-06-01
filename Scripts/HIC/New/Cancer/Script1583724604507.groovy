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

//now = new Date()
//
//mydate = now.format('yyyyMMdd_HHmmss')
//GlobalVariable.screenPath = (((GlobalVariable.stmPath + 'AdvantHealth/') + mydate) + '/')
WebUI.callTestCase(findTestCase('HIC/_include/get_hicScreenPath'), [('project') : 'HIC', ('productLine') : 'Cancer', ('carrierName') : 'Cancer'], 
    FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.i = 0

WebUI.callTestCase(findTestCase('AHI/_include/openWebSite'), [('env') : env], FailureHandling.CONTINUE_ON_FAILURE)

def driver = DriverFactory.getWebDriver()

String baseUrl = env

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('//span[@class=\'navbar-toggler-icon\']')

selenium.click('//a[@class=\'dropdown-toggle nav-link\']')

selenium.click('//a[contains(text(),\'Cancer Insurance\')]')

for (second = 0; second < 10; second++) {
    try {
        if (selenium.isElementPresent('//a[@class=\'front-door-quote-button\']')) {
            break
        }
    }
    catch (Exception e) {
    } 
    
    Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('//a[@class=\'front-door-quote-button\']')

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

WebUI.sendKeys(findTestObject('mobileSanity/Cancer Insurance/dob-0'), '01/01/1990')

//selenium.type('id=zip-input', '35216')
//
//selenium.type('id=dob-0', '01/01/1990')
//
//selenium.fireEvent('id=dob-0', 'blur')

Thread.sleep(2000)

selenium.click('//label[@for=\'gender-m-0\']')

Thread.sleep(3000)

selenium.click('id=js-see-plans')

for (second = 0; second < 20; second++) {
	try {
		if (selenium.isElementPresent('xpath=//h1[contains(text(),\'3 Cancer Insurance Policies Found\')]')) {
			break
		}
	}
	catch (Exception e) {
	}
	
	Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('xpath=(//a[contains(text(),\'Option 1\')])[1]')

for (second = 0; second < 20; second++) {
	try {
		if (selenium.isElementPresent('id=plan-details-primary-apply')) {
			break
		}
	}
	catch (Exception e) {
	}
	
	Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('id=plan-details-primary-apply')

for (second = 0; second < 20; second++) {
	try {
		if (selenium.isElementPresent('id=applyButton')) {
			break
		}
	}
	catch (Exception e) {
	}
	
	Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium.click('id=applyButton')

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

selenium.click('id=js-app-continue-link')

for (second = 0; second < 20; second++) {
	try {
		if (selenium.isElementPresent('xpath=(//*[@class=\'js-question js-app-page-medical-question-wrapper\'])[1]/div/button[1]')) {
			break
		}
	}
	catch (Exception e) {
	}
	
	Thread.sleep(1000)
}

WebUI.callTestCase(findTestCase('AHI/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

for (i = 1; i < 12; i++) {
	selenium.click(('xpath=(//*[@class=\'js-question js-app-page-medical-question-wrapper\'])[' + i) + ']/div/button[1]')
}

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

selenium.type('id=credit-card-number', '4111123123123123')

selenium.type('id=credit-card-first', 'test')

selenium.type('id=credit-card-last', 'test')

selenium.select('id=expiration-month', '12')

selenium.select('id=expiration-year', '2026')

selenium.type('id=credit-card-cvv', '123')

selenium.type('id=credit-card-number', '4111123123123123')

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


