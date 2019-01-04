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

String fastQuoteUrl = (ENV + '/term-health-insurance/quote?partners=1&redirect=1&utm_source=mediaalpha&utm_medium=ppc&utm_campaign=stm_quote&census[location][zip]=60002&census[member][0][role]=P&census[member][0][gender]=F&census[member][0][dob]=') + 
dob

println(fastQuoteUrl)

Mobile.startApplication('/Users/denisyu/Downloads/com.android.chrome_71.0.3578.99-357809900.apk', true)



Mobile.tap(findTestObject('Regression/STM/openQA/android.widget.EditText0 - '), 0)

Mobile.setText(findTestObject('Regression/STM/openQA/android.widget.EditText0 -  (1)'), 'https://praetemptatus.agilehealthinsurance.com/', 
    100)

Mobile.tap(findTestObject('Regression/STM/openQA/android.widget.TextView12 - httpspraetemptatus.agilehealthinsurance.com'), 
    200)

Mobile.tap(findTestObject('Regression/STM/GeneralCensusPage/android.view.View24 - Quote  Save Today'), 200)

Mobile.setText(findTestObject('Regression/STM/GeneralCensusPage/android.widget.EditText0 - 32099'), '60602', 100)

Mobile.setText(findTestObject('Regression/STM/GeneralCensusPage/android.widget.EditText1 - 01011987'), '60602', 100)

Mobile.tap(findTestObject('Regression/STM/GeneralCensusPage/android.view.View62 - Compare Plans'), 600)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View94 - LifeShield Flex 5K209K750K'), 200)

Mobile.tap(findTestObject('Regression/STM/mobile/android.widget.Button2 - Apply for This Plan'), 200)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View92 -  Start Secure Application'), 2000)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View17 - Autofill App Info'), 200)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View77 - Continue'), 200)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View150 - Continue to Step 3 - Payment  Billing '), 200)

Mobile.setText(findTestObject('Regression/STM/mobile/android.widget.EditText3'), '123', 100)

Mobile.tap(findTestObject('Regression/STM/mobile/android.widget.CheckBox1 - I Accept Authorization for Automatic Credit Card Payment'), 
    200)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View131 - Continue to Step 4 - Review  Submit Your Application '), 
    200)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View123 - CLICK TO SIGN  Full Name '), 200)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View108'), 200)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View132 -  Submit Your Application'), 300)

Mobile.closeApplication()

