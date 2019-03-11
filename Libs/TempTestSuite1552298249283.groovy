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


suiteProperties.put('id', 'Test Suites/mobileWeb/hbi')

suiteProperties.put('name', 'hbi')

suiteProperties.put('description', 'hbi flow')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/denisyu/workplace/test/AgileTest/Reports/mobileWeb/hbi/20190311_175719/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/mobileWeb/hbi', suiteProperties, [new TestCaseBinding('Test Cases/mobileWeb/HBI/Agile One', 'Test Cases/mobileWeb/HBI/Agile One',  null), new TestCaseBinding('Test Cases/mobileWeb/HBI/Legion Limited Medical', 'Test Cases/mobileWeb/HBI/Legion Limited Medical',  null), new TestCaseBinding('Test Cases/mobileWeb/HBI/Cardinal Choice', 'Test Cases/mobileWeb/HBI/Cardinal Choice',  null), new TestCaseBinding('Test Cases/mobileWeb/HBI/Core Shield', 'Test Cases/mobileWeb/HBI/Core Shield',  null), new TestCaseBinding('Test Cases/mobileWeb/HBI/Agile Secure', 'Test Cases/mobileWeb/HBI/Agile Secure',  null), new TestCaseBinding('Test Cases/mobileWeb/HBI/Fixed Cash Benefit', 'Test Cases/mobileWeb/HBI/Fixed Cash Benefit',  null)])
