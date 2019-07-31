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
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import com.kms.katalon.core.webui.driver.WebUIDriverType as DriverType
import com.kms.katalon.core.webui.driver.DriverFactory as DF
import com.kms.katalon.core.webui.util.WebDriverPropertyUtil as property
import com.kms.katalon.core.configuration.RunConfiguration as RS


//println(DF.getExecutedBrowser().getPropertyKey()+":"+DF.getExecutedBrowser().getPropertyValue())
//println(property.CHROME_MOBILE_EMULATION_PROPERTY_KEY+":"+property.CHROME_CAPABILITIES)
Map m = RS.getExecutionProperties()
String deviceName = m.get("drivers").get("preferences").get("WebUI").get("mobileEmulation").get("deviceName")
println  deviceName
now = new Date()
mydate = now.format('yyyyMMdd_HHmmss')
GlobalVariable.screenPath='../Screenshots/'
GlobalVariable.screenPath = (((GlobalVariable.screenPath +deviceName+ '/'+productLine+'/'+carrierName+'/') + mydate) + '/')
println GlobalVariable.screenPath 