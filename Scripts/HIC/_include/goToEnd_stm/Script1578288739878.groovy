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
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebDriver driver = DriverFactory.getWebDriver()

try {
    if (WebUI.verifyElementPresent(findTestObject('hic/stm/durationdisclaimer/checkbox'), 10)) {
        WebUI.scrollToElement(findTestObject('hic/stm/durationdisclaimer/checkbox'), 10)

        WebUI.click(findTestObject('hic/stm/durationdisclaimer/checkbox'))

        WebUI.submit(findTestObject('hic/stm/durationdisclaimer/form'))

        Thread.sleep(5000)

        WebUI.callTestCase(findTestCase('HIC/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)
    }
}
catch (Exception e) {
    println('no consecutive')
} 

WebUI.callTestCase(findTestCase('AHI/_include/name'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('hic/stm/application info/firstname'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('hic/stm/application info/lastname'), GlobalVariable.LastName)

WebUI.selectOptionByLabel(findTestObject('hic/stm/application info/height'), '05', false)

WebUI.selectOptionByLabel(findTestObject('hic/stm/application info/root_member_0_height_inches'), '06', false)

WebUI.setText(findTestObject('hic/stm/application info/root_member_0_weight'), '180')

WebUI.setText(findTestObject('hic/stm/application info/root_address_primary_street'), GlobalVariable.Address)

WebUI.setText(findTestObject('hic/stm/application info/root_address_primary_city'), GlobalVariable.City)

WebUI.setText(findTestObject('hic/stm/application info/root_email'), GlobalVariable.AutoEmail)

WebUI.setText(findTestObject('hic/stm/application info/root_phone_day'), GlobalVariable.Tel)

if (carrier == 'slaico') {
    WebUI.setText(findTestObject('hic/stm/application info/root_member_0_occupation'), 'test')

    WebUI.selectOptionByLabel(findTestObject('hic/stm/application info/root_phone_bestTime'), 'Afternoon', false)
}

WebUI.scrollToElement(findTestObject('hic/stm/application info/Continue to Step'), 10)

WebUI.click(findTestObject('hic/stm/application info/Continue to Step'))

WebUI.waitForPageLoad(20)

Thread.sleep(3000)

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('HIC/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

selenium = new WebDriverBackedSelenium(driver, GlobalVariable.ENV)

int qnum = selenium.getXpathCount('//label[contains(@for,\'answer_No\')]')

for (def index : (1..qnum)) {
    WebUI.scrollToElement(findTestObject('hic/stm/eligibility/Continue to Step'), 10)

    selenium.click(('xpath=(//label[contains(@for,\'answer_No\')])[' + index) + ']')

    Thread.sleep(2000)
}

WebUI.scrollToElement(findTestObject('hic/stm/eligibility/Continue to Step'), 10)

WebUI.click(findTestObject('hic/stm/eligibility/Continue to Step'))

Thread.sleep(5000)

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('HIC/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('hic/stm/payment/root_payment_credit_number'), '4111111111111111')

WebUI.setText(findTestObject('hic/stm/payment/root_payment_credit_firstName'), 'test')

WebUI.setText(findTestObject('hic/stm/payment/root_payment_credit_lastName'), 'test')

WebUI.selectOptionByLabel(findTestObject('hic/stm/payment/root_payment_credit_expires_month'), '12', false)

WebUI.selectOptionByLabel(findTestObject('hic/stm/payment/root_payment_credit_expires_year'), '2026', false)

WebUI.setText(findTestObject('hic/stm/payment/root_payment_credit_cvv'), '123')

WebUI.scrollToElement(findTestObject('hic/stm/payment/Continue to Step'), 10)

WebUI.click(findTestObject('hic/stm/payment/root_payment_differentPayor'))

WebUI.click(findTestObject('hic/stm/payment/root_payment_authPayment'))

WebUI.click(findTestObject('hic/stm/payment/Continue to Step'))

Thread.sleep(5000)

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('HIC/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('hic/stm/review/Submit Your Application'), 10)

WebUI.click(findTestObject('hic/stm/review/root_termsAndAgreements_0'))

WebUI.click(findTestObject('hic/stm/review/root_signature_authName_sign-button'))

WebUI.click(findTestObject('hic/stm/review/Submit Your Application'))

Thread.sleep(30000)

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('HIC/_include/get_screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

