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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://praetemptatus.agilehealthinsurance.com/')

WebUI.verifyElementPresent(findTestObject('Page_Find Health Insurance for 2018/div_Many Health Plan Options f'), 0)

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Page_2018 Health Insurance Get a Sh/input_Location_zip-input'), '60602')

WebUI.setText(findTestObject('Page_2018 Health Insurance Get a Sh/input_Date of Birth_dob-0'), '03/03/1987')

WebUI.click(findTestObject('Page_2018 Health Insurance Get a Sh/label_Male'))

WebUI.click(findTestObject('Page_2018 Health Insurance Get a Sh/label_Compare Plans'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1 - Standard Life Sel/button_No'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1 - Standard Life Sel/button_No'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1 - Standard Life Sel/button_No'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1 - Standard Life Sel/button_No'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1 - Standard Life Sel/button_No'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1 - Standard Life Sel/button_No'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1 - Standard Life Sel/button_No'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 2 - Standard Life Sel/Page_App Page 2 - Standard Life Sel/input__member-P-1-firstName'), 'Test-123')

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 2 - Standard Life Sel/Page_App Page 2 - Standard Life Sel/input__member-P-1-lastName'), 'ZZ11-0344ii')

WebUI.selectOptionByValue(findTestObject('mobileSanity/STM/Page_App Page 2 - Standard Life Sel/Page_App Page 2 - Standard Life Sel/select_01020304050607'), 
    '06', true)

WebUI.selectOptionByValue(findTestObject('mobileSanity/STM/Page_App Page 2 - Standard Life Sel/Page_App Page 2 - Standard Life Sel/select_00102030405060708091011'), 
    '06', true)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 2 - Standard Life Sel/Page_App Page 2 - Standard Life Sel/div_First Name MiddleLast Name'))

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 2 - Standard Life Sel/Page_App Page 2 - Standard Life Sel/input__occupation'), 'test occupation')

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 2 - Standard Life Sel/Page_App Page 2 - Standard Life Sel/div_Best Time to Call MorningA'))

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 2 - Standard Life Sel/Page_App Page 2 - Standard Life Sel/input__address'), 'test address 33434#')

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 2 - Standard Life Sel/Page_App Page 2 - Standard Life Sel/input__city'), 'test city')

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 2 - Standard Life Sel/Page_App Page 2 - Standard Life Sel/input__email'), 'test.34434@suryani.cn')

WebUI.setText(findTestObject('Page_App Page 2 - Standard Life Sel/div_Phone Number '), '2342343333')

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 2 - Standard Life Sel/Page_App Page 2 - Standard Life Sel/label_Yes I would like to rece'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 2 - Standard Life Sel/Page_App Page 2 - Standard Life Sel/a_Continue to Step 3 - Payment'))

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 3 - Standard Life Sel/Page_App Page 3 - Standard Life Sel/input__credit-card-first'), 'test first')

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 3 - Standard Life Sel/Page_App Page 3 - Standard Life Sel/input__credit-card-last'), 'test last')

WebUI.selectOptionByValue(findTestObject('mobileSanity/STM/Page_App Page 3 - Standard Life Sel/Page_App Page 3 - Standard Life Sel/select_MM010203040506070809101'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('mobileSanity/STM/Page_App Page 3 - Standard Life Sel/Page_App Page 3 - Standard Life Sel/select_YYYY2019202020212022202'), 
    '2026', true)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 3 - Standard Life Sel/Page_App Page 3 - Standard Life Sel/div_Credit Card Number (no das'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 3 - Standard Life Sel/Page_App Page 3 - Standard Life Sel/label_My billing address is th'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 3 - Standard Life Sel/Page_App Page 3 - Standard Life Sel/label_I Accept Authorization f'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 3 - Standard Life Sel/Page_App Page 3 - Standard Life Sel/a_Continue to Step 4 - Review'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 4 - Standard Life Sel/Page_App Page 4 - Standard Life Sel/label'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 4 - Standard Life Sel/Page_App Page 4 - Standard Life Sel/p_CLICK TO SIGN'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 4 - Standard Life Sel/Page_App Page 4 - Standard Life Sel/a_Submit Your Application'))

