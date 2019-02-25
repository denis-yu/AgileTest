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


suiteProperties.put('id', 'Test Suites/mobileWeb/stm')

suiteProperties.put('name', 'stm')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/denisyu/workplace/test/AgileTest/Reports/mobileWeb/stm/20190225_164544/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/mobileWeb/stm', suiteProperties, [new TestCaseBinding('Test Cases/mobileWeb/stm/Slaico', 'Test Cases/mobileWeb/stm/Slaico',  null), new TestCaseBinding('Test Cases/mobileWeb/stm/AdvantHealth', 'Test Cases/mobileWeb/stm/AdvantHealth',  null), new TestCaseBinding('Test Cases/mobileWeb/stm/Companion', 'Test Cases/mobileWeb/stm/Companion',  null), new TestCaseBinding('Test Cases/mobileWeb/stm/Everest Prime', 'Test Cases/mobileWeb/stm/Everest Prime',  null), new TestCaseBinding('Test Cases/mobileWeb/stm/LifeShield', 'Test Cases/mobileWeb/stm/LifeShield',  null), new TestCaseBinding('Test Cases/mobileWeb/stm/NationalGeneral', 'Test Cases/mobileWeb/stm/NationalGeneral',  null)])
