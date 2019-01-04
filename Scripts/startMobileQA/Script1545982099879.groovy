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

Mobile.startApplication('/Users/denisyu/Downloads/com.android.chrome_71.0.3578.99-357809900.apk', true)

Mobile.setText(findTestObject('Regression/STM/mobile/android.widget.EditText0 - '), 'https://praetemptatus.agilehealthinsurance.com', 
    0)

Mobile.pressBack()

Mobile.setText(findTestObject('Regression/STM/mobile/android.widget.EditText0 - '), 'https://praetemptatus.agilehealthinsurance.com', 
    0)

Mobile.tap(findTestObject('Regression/STM/mobile/android.widget.TextView12 - httpspraetemptatus.agilehealthinsurance.com'), 
    0)

Mobile.closeApplication()

