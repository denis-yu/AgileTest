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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

String fastQuoteUrl = (((((ENV + '/term-health-insurance/quote?partners=1&redirect=1&utm_source=mediaalpha&utm_medium=ppc&utm_campaign=stm_quote&census[location][zip]=') + 
zipcode) + '&census[effective]=') + effectiveDate) + '&census[member][0][role]=P&census[member][0][gender]=F&census[member][0][dob]=') + 
dob

println(fastQuoteUrl)

WebUI.openBrowser(fastQuoteUrl)

def driver = DriverFactory.getWebDriver()

selenium = new WebDriverBackedSelenium(driver, fastQuoteUrl)

Thread.sleep(6000)
//Thread.sleep(6000)
////WebUI.click(findTestObject('Regression/STM/STMQuotePage/div_LifeShield Flex 5K209K750K'))
//
////WebUI.click(findTestObject('STMQuotePage/a_LifeShield Flex 5K209K750K'))
//
//selenium.click("//ul[2]/li/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/a")
////selenium.click('link=LifeShield Flex 5K/20/9K/750K Extended')
//selenium.click('id=plan-details-primary-apply')
//
//selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Coverage Option\'])[1]/following::span[1]')
//
//selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Dental Option\'])[1]/following::span[1]')
//
//selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Monthly Total\'])[1]/following::span[4]')
//
//selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Glossary\'])[2]/following::label[1]')
//
//selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'By checking this box I understand and agree to the statement above.\'])[1]/following::button[1]')
//
//Thread.sleep(3000)
//
//selenium.click('id=fillApp')
//
//Thread.sleep(3000)
//
//selenium.click('id=js-app-continue-link')
//
//Thread.sleep(4000)
//
//selenium.click('id=js-app-continue-link')
//
//Thread.sleep(4000)
//
//selenium.type('id=credit-card-cvv', '102')
//
//selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Email Address\'])[1]/following::label[1]')
//
//selenium.click('id=js-app-continue-link')
//
//Thread.sleep(4000)
//
//selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Terms and Agreements\'])[1]/preceding::label[1]')
//
//selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'*\'])[2]/following::p[1]')
//
//selenium.click('id=js-app-continue-link')
//
//Thread.sleep(6000)
//
//Thread.sleep(3000)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://praetemptatus.agilehealthinsurance.com/')

WebUI.click(findTestObject('Object Repository/Regression/STM/Page_Find Health Insurance for 2018/a_Quote  Save Today'))

WebUI.setText(findTestObject('Object Repository/Regression/STM/Page_2018 Health Insurance Get a Sh/input_Location_zip-input'), 
    '60602')

WebUI.click(findTestObject('Object Repository/Regression/STM/Page_2018 Health Insurance Get a Sh/label_Male'))

WebUI.setText(findTestObject('Object Repository/Regression/STM/Page_2018 Health Insurance Get a Sh/input_Date of Birth_dob-0'), 
    '03/03/1987')

WebUI.click(findTestObject('Object Repository/Regression/STM/Page_2018 Health Insurance Get a Sh/label_Compare Plans'))

WebUI.click(findTestObject('Object Repository/Regression/STM/Page_Short Term Health Insurance Qu/button_filters'))

WebUI.click(findTestObject('Regression/STM/STMQuotePage/a_Show Plans'))

WebUI.click(findTestObject('Regression/STM/STMQuotePage/ul_1 applicant6 monthsfilters'))

WebUI.click(findTestObject('Object Repository/Regression/STM/Page_Short Term Health Insurance Qu/div_1 applicant6 monthsfilters'))

WebUI.click(findTestObject('Object Repository/Regression/STM/Page_Short Term Health Insurance Qu/td_101.36  feesper monthno app'))

WebUI.click(findTestObject('Object Repository/Regression/STM/Page_Short Term Health Insurance Qu/li_5000 Deductible'))

WebUI.click(findTestObject('Object Repository/Regression/STM/Page_Short Term Health Insurance Qu/a_LifeShield Flex 5K209K750K'))

WebUI.click(findTestObject('Regression/STM/STMQuotePage/div_LifeShield Flex 5K209K750K'))

WebUI.click(findTestObject('Object Repository/Regression/STM/Page_Short Term Health Insurance Qu/div_featuredEverest Prime 5K05_1'))

WebUI.click(findTestObject('Object Repository/Regression/STM/Page_Short Term Health Insurance Qu/li_0 Coinsurance'))

WebUI.click(findTestObject('Regression/STM/STMQuotePage/div_LifeShield Flex 5K209K750K'))

