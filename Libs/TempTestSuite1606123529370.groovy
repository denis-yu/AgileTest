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


suiteProperties.put('id', 'Test Suites/PrivateLabel/PremierSMI')

suiteProperties.put('name', 'PremierSMI')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\Test\\AgileTest\\Reports\\PrivateLabel\\PremierSMI\\20201123_042529\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/PrivateLabel/PremierSMI', suiteProperties, [new TestCaseBinding('Test Cases/PL Site/PremierSMI/AdvantHealth', 'Test Cases/PL Site/PremierSMI/AdvantHealth',  null), new TestCaseBinding('Test Cases/PL Site/PremierSMI/Aspen', 'Test Cases/PL Site/PremierSMI/Aspen',  null), new TestCaseBinding('Test Cases/PL Site/PremierSMI/Health Choice', 'Test Cases/PL Site/PremierSMI/Health Choice',  null), new TestCaseBinding('Test Cases/PL Site/PremierSMI/Legion', 'Test Cases/PL Site/PremierSMI/Legion',  null)])
