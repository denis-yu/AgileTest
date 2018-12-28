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


suiteProperties.put('id', 'Test Suites/Regression/Level 1')

suiteProperties.put('name', 'Level 1')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/denisyu/workplace/test/AgileTest/Reports/Regression/Level 1/20181221_091140/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Regression/Level 1', suiteProperties, [new TestCaseBinding('Test Cases/Regression/Level 1/LifeShield - Iteration 1', 'Test Cases/Regression/Level 1/LifeShield',  [ 'zipcode' : '\t60002' , 'dob' : '02/10/1980' , 'effectiveDate' : '2019/1/10' , 'ENV' : GlobalVariable.ENV ,  ]), new TestCaseBinding('Test Cases/Regression/Level 1/LifeShield - Iteration 2', 'Test Cases/Regression/Level 1/LifeShield',  [ 'zipcode' : '\t30301' , 'dob' : '02/10/1980' , 'effectiveDate' : '2019/1/10' , 'ENV' : GlobalVariable.ENV ,  ])])
