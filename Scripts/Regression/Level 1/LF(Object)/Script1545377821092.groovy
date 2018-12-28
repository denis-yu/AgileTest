import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://praetemptatus.agilehealthinsurance.com/')
Thread.sleep(2000)

WebUI.click(findTestObject('Regression/STM/HomePage/a_Quote  Save Today'))
Thread.sleep(2000)
WebUI.setText(findTestObject('Regression/STM/GeneralCensusPage/input_Location_zip-input'), 
    '60602')

WebUI.setText(findTestObject('Regression/STM/GeneralCensusPage/input_Date of Birth_dob-0'), 
    '03/03/1987')

WebUI.click(findTestObject('Regression/STM/GeneralCensusPage/label_Male'))

WebUI.click(findTestObject('Regression/STM/GeneralCensusPage/label_Compare Plans'))
Thread.sleep(6000)
WebUI.click(findTestObject('Regression/STM/STMQuotePage/a_LifeShield Flex 5K209K750K'))

WebUI.click(findTestObject('Regression/STM/PlanDetailPage/a_Apply for This Plan'))

WebUI.click(findTestObject('Regression/STM/PlanDetailPage/span_Start Secure Application'))

WebUI.click(findTestObject('Regression/STM/AppPage1 - UW/a_Autofill App Info'))

WebUI.click(findTestObject('Regression/STM/AppPage1 - UW/a_Continue'))

WebUI.click(findTestObject('Regression/STM/AppPage2 - AppInfo/a_Continue to Step 3 - Payment'))

WebUI.setText(findTestObject('Regression/STM/AppPage3 - Payment/input__credit-card-cvv'), 
    '231')

WebUI.click(findTestObject('Regression/STM/AppPage3 - Payment/div_My billing address is the'))

WebUI.click(findTestObject('Regression/STM/AppPage3 - Payment/label_I Accept Authorization f'))

WebUI.click(findTestObject('Regression/STM/AppPage3 - Payment/a_Continue to Step 4 - Review'))

WebUI.click(findTestObject('Regression/STM/AppPage4 - Review/label'))

WebUI.click(findTestObject('Regression/STM/AppPage4 - Review/a_Submit Your Application'))

WebUI.click(findTestObject('Regression/STM/AppPage6 - Confirmation/p_Congratulations your applica'))

