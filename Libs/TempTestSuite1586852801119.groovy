import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/StoreData/medicare_AK')

suiteProperties.put('name', 'medicare_AK')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\Test\\AgileTest\\AgileTest\\Reports\\StoreData\\medicare_AK\\20200414_162641\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/StoreData/medicare_AK', suiteProperties, [new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 1', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99553' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 2', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99546' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 3', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99501' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 4', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99545' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 5', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99613' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 6', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99704' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 7', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99555' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 8', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99701' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 9', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99827' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 10', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99820' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 11', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99801' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 12', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99556' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 13', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99901' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 14', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99550' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 15', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99554' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 16', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99548' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 17', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99623' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 18', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99659' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 19', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99721' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 20', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99727' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 21', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99830' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 22', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99918' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 23', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99835' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 24', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99840' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 25', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99731' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 26', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99566' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 27', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99903' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 28', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99689' ,  ]), new TestCaseBinding('Test Cases/Web/Store Data/medicare/AK - Iteration 29', 'Test Cases/Web/Store Data/medicare/AK',  [ 'zip' : '99558' ,  ])])
