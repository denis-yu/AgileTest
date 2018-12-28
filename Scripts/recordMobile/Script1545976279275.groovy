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

WebUI.acceptAlert()

Mobile.startApplication('/Users/denisyu/Downloads/com.android.chrome_71.0.3578.99-357809900.apk', true)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View94 - LifeShield Flex 5K209K750K'), 2000)

Mobile.tap(findTestObject('Regression/STM/mobile/android.widget.Button2 - Apply for This Plan'), 2000)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View92 -  Start Secure Application'), 2000)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View17 - Autofill App Info'), 23000)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View77 - Continue'), 2000)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View150 - Continue to Step 3 - Payment  Billing '), 2000)

Mobile.setText(findTestObject('Regression/STM/mobile/android.widget.EditText3'), '123', 1000)

Mobile.tap(findTestObject('Regression/STM/mobile/android.widget.CheckBox1 - I Accept Authorization for Automatic Credit Card Payment'), 
    2000)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View131 - Continue to Step 4 - Review  Submit Your Application '), 
    2000)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View123 - CLICK TO SIGN  Full Name '), 2000)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View108'), 2000)

Mobile.tap(findTestObject('Regression/STM/mobile/android.view.View132 -  Submit Your Application'), 3000)

Mobile.closeApplication()

