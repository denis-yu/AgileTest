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


suiteProperties.put('id', 'Test Suites/HIC/hic')

suiteProperties.put('name', 'hic')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\Test\\AgileTest\\Reports\\HIC\\hic\\20201112_034519\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/HIC/hic', suiteProperties, [new TestCaseBinding('Test Cases/HIC/New/ACA', 'Test Cases/HIC/New/ACA',  null), new TestCaseBinding('Test Cases/HIC/New/Cancer', 'Test Cases/HIC/New/Cancer',  null), new TestCaseBinding('Test Cases/HIC/New/Dental', 'Test Cases/HIC/New/Dental',  null), new TestCaseBinding('Test Cases/HIC/New/HBI', 'Test Cases/HIC/New/HBI',  null), new TestCaseBinding('Test Cases/HIC/New/Medicare', 'Test Cases/HIC/New/Medicare',  null), new TestCaseBinding('Test Cases/HIC/New/Pet', 'Test Cases/HIC/New/Pet',  null), new TestCaseBinding('Test Cases/HIC/New/STM', 'Test Cases/HIC/New/STM',  null), new TestCaseBinding('Test Cases/HIC/New/Teladoc', 'Test Cases/HIC/New/Teladoc',  null), new TestCaseBinding('Test Cases/HIC/New/Landing page/Life Line Screen AEP', 'Test Cases/HIC/New/Landing page/Life Line Screen AEP',  null), new TestCaseBinding('Test Cases/HIC/New/Landing page/Life Line Screen', 'Test Cases/HIC/New/Landing page/Life Line Screen',  null), new TestCaseBinding('Test Cases/HIC/New/Landing page/Pursuant AEP', 'Test Cases/HIC/New/Landing page/Pursuant AEP',  null), new TestCaseBinding('Test Cases/HIC/New/Landing page/Pursuant', 'Test Cases/HIC/New/Landing page/Pursuant',  null)])
