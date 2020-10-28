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


suiteProperties.put('id', 'Test Suites/HIC/aetna')

suiteProperties.put('name', 'aetna')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\Test\\AgileTest\\Reports\\HIC\\aetna\\20201027_051559\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/HIC/aetna', suiteProperties, [new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 1', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '35215' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 2', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '99504' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 3', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '72209' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 4', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '85364' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 5', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '90011' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 6', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '80219' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 7', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '06606' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 8', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '19805' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 9', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '20015' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 10', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '33186' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 11', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '30044' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 12', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '96818' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 13', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '50317' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 14', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '83709' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 15', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '60629' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 16', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '46227' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 17', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '66062' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 18', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '40214' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 19', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '70816' ,  ]), new TestCaseBinding('Test Cases/HIC/Plan enrollment/Aetna - Iteration 20', 'Test Cases/HIC/Plan enrollment/Aetna',  [ 'zip' : '02128' ,  ])])
