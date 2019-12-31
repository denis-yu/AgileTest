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

WebUI.openBrowser(('https://valkyrie.healthinsurance.com/short-term/quote?affiliate=hicom&utm_source=hic&utm_medium=redirect&utm_campaign=hic_stm_census&zip=' + 
    zipcode) + '&primary.dob=1985-11-11&primary.gender=F')

int pageHeight = WebUI.getPageHeight()

WebUI.scrollToPosition(0, pageHeight)

Thread.sleep(3000)

WebDriver driver = DriverFactory.getWebDriver()

selenium = new WebDriverBackedSelenium(driver, GlobalVariable.ENV)

num = selenium.getXpathCount('//*[text()=\'BEST SELLER\']/ancestor::tr/td[2]/a')

for (int j = 1; j <= num; j++) {
    plan = selenium.getText(('xpath=(//*[text()=\'BEST SELLER\']/ancestor::tr/td[2]/a)[' + j) + ']')

    CustomKeywords.'test.WriteExcel.writeToExcelByCol'(plan, j + 2, GlobalVariable.i + 1)
}

(GlobalVariable.i)++

