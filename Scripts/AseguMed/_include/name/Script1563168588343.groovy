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
import internal.GlobalVariable as GlobalVariable

WebDriver driver = DriverFactory.getWebDriver()

selenium = new WebDriverBackedSelenium(driver,GlobalVariable.ENV)
String FirstName = "Test-123"
String LastName = selenium.getEval("{var x=\"áéíóúñüABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\"; var tmp=\"ZZ11-\"; for (i=0;i<8;i++) tmp+=x.charAt(Math.ceil(51*Math.random()));tmp;}")
String Address = selenium.getEval("{var x=\"áéíóúñüABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\"; var tmp=\"\"; for (i=0;i<8;i++) tmp+=x.charAt(Math.ceil(51*Math.random()));tmp;}")
String City = selenium.getEval("{var x=\"áéíóúñüABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\"; var tmp=\"\"; for (i=0;i<8;i++) tmp+=x.charAt(Math.ceil(51*Math.random()));tmp;}")
String tel1 = selenium.getEval("{var x=\"123456789\"; var tmp=\"\"; for (i=0;i<3;i++) tmp+=x.charAt(Math.ceil(8*Math.random()));tmp;}")
String tel2 = selenium.getEval("{var x=\"123456789\"; var tmp=\"\"; for (i=0;i<3;i++) tmp+=x.charAt(Math.ceil(8*Math.random()));tmp;}")
String tel3 = selenium.getEval("{var x=\"123456789\"; var tmp=\"\"; for (i=0;i<4;i++) tmp+=x.charAt(Math.ceil(8*Math.random()));tmp;}")
String Tel = selenium.getExpression(tel1+"-"+tel2+"-"+tel3)
String AutoEmail = selenium.getEval("{var x=\"ÁÉÍÓÚÑÜáéíóúñüABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\"; var tmp=\"test.\"; for (i=0;i<8;i++) tmp+=x.charAt(Math.ceil(51*Math.random()));tmp+=\"@suryani.cn\";}")

GlobalVariable.FirstName = FirstName
GlobalVariable.LastName = LastName
GlobalVariable.Address = Address
GlobalVariable.City = City
GlobalVariable.Tel = Tel
GlobalVariable.AutoEmail = AutoEmail

println FirstName
println LastName
println Address
println City
println Tel
println AutoEmail












