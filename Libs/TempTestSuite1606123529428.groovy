import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/AHI/ahi')

suiteProperties.put('name', 'ahi')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\Test\\AgileTest\\Reports\\AHI\\ahi\\20201123_042529\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/AHI/ahi', suiteProperties, [new TestCaseBinding('Test Cases/AHI/NEW/ACA Health Insurance', 'Test Cases/AHI/NEW/ACA Health Insurance',  null), new TestCaseBinding('Test Cases/AHI/NEW/Cancer Insurance', 'Test Cases/AHI/NEW/Cancer Insurance',  null), new TestCaseBinding('Test Cases/AHI/NEW/Dental/National General', 'Test Cases/AHI/NEW/Dental/National General',  null), new TestCaseBinding('Test Cases/AHI/NEW/Dental/USA Access', 'Test Cases/AHI/NEW/Dental/USA Access',  null), new TestCaseBinding('Test Cases/AHI/NEW/Dental/Delta Dental', 'Test Cases/AHI/NEW/Dental/Delta Dental',  null), new TestCaseBinding('Test Cases/AHI/NEW/HBI', 'Test Cases/AHI/NEW/HBI',  null), new TestCaseBinding('Test Cases/AHI/NEW/Medicare', 'Test Cases/AHI/NEW/Medicare',  null), new TestCaseBinding('Test Cases/AHI/NEW/Pet Insurance', 'Test Cases/AHI/NEW/Pet Insurance',  null), new TestCaseBinding('Test Cases/AHI/NEW/STM', 'Test Cases/AHI/NEW/STM',  null), new TestCaseBinding('Test Cases/AHI/NEW/Teladoc', 'Test Cases/AHI/NEW/Teladoc',  null)])
