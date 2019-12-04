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


suiteProperties.put('id', 'Test Suites/Private Label/Spark')

suiteProperties.put('name', 'Spark')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\Test\\AgileTest\\Reports\\Private Label\\Spark\\20191202_050956\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Private Label/Spark', suiteProperties, [new TestCaseBinding('Test Cases/PL Site/Spark/hbi/Health Choice', 'Test Cases/PL Site/Spark/hbi/Health Choice',  null), new TestCaseBinding('Test Cases/PL Site/Spark/hbi/Vitala Care', 'Test Cases/PL Site/Spark/hbi/Vitala Care',  null), new TestCaseBinding('Test Cases/PL Site/Spark/stm/AdvantHealth', 'Test Cases/PL Site/Spark/stm/AdvantHealth',  null), new TestCaseBinding('Test Cases/PL Site/Spark/stm/Everest Prime', 'Test Cases/PL Site/Spark/stm/Everest Prime',  null), new TestCaseBinding('Test Cases/PL Site/Spark/stm/LifeShield', 'Test Cases/PL Site/Spark/stm/LifeShield',  null)])
