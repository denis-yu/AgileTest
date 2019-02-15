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

WebUI.setText(findTestObject('Page_App Page 2 - Standard Life Sel/input__member-P-1-firstName'), 'Test-123')

WebUI.setText(findTestObject('Page_App Page 2 - Standard Life Sel/input__member-P-1-lastName'), 'ZZ11-0344ii')

WebUI.selectOptionByValue(findTestObject('Page_App Page 2 - Standard Life Sel/select_01020304050607'), '06', true)

WebUI.selectOptionByValue(findTestObject('Page_App Page 2 - Standard Life Sel/select_00102030405060708091011'), '06', true)

WebUI.click(findTestObject('Page_App Page 2 - Standard Life Sel/div_First Name MiddleLast Name'))

WebUI.setText(findTestObject('Page_App Page 2 - Standard Life Sel/input__occupation'), 'test occupation')

WebUI.click(findTestObject('Page_App Page 2 - Standard Life Sel/div_Best Time to Call MorningA'))

WebUI.setText(findTestObject('Page_App Page 2 - Standard Life Sel/input__address'), 'test address 33434#')

WebUI.setText(findTestObject('Page_App Page 2 - Standard Life Sel/input__city'), 'test city')

WebUI.setText(findTestObject('Page_App Page 2 - Standard Life Sel/input__email'), 'test.34434@suryani.cn')

WebUI.setText(findTestObject('Page_App Page 2 - Standard Life Sel/div_Phone Number '), '2342343333')

WebUI.click(findTestObject('Page_App Page 2 - Standard Life Sel/label_Yes I would like to rece'))

WebUI.click(findTestObject('Page_App Page 2 - Standard Life Sel/a_Continue to Step 3 - Payment'))

WebUI.setText(findTestObject('Page_App Page 3 - Standard Life Sel/input__credit-card-first'), 'test first')

WebUI.setText(findTestObject('Page_App Page 3 - Standard Life Sel/input__credit-card-last'), 'test last')

WebUI.selectOptionByValue(findTestObject('Page_App Page 3 - Standard Life Sel/select_MM010203040506070809101'), '12', true)

WebUI.selectOptionByValue(findTestObject('Page_App Page 3 - Standard Life Sel/select_YYYY2019202020212022202'), '2026', 
    true)

WebUI.click(findTestObject('Page_App Page 3 - Standard Life Sel/div_Credit Card Number (no das'))

WebUI.click(findTestObject('Page_App Page 3 - Standard Life Sel/label_My billing address is th'))

WebUI.click(findTestObject('Page_App Page 3 - Standard Life Sel/label_I Accept Authorization f'))

WebUI.click(findTestObject('Page_App Page 3 - Standard Life Sel/a_Continue to Step 4 - Review'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://praetemptatus.agilehealthinsurance.com/')

WebUI.click(findTestObject('STM Quote Page/a_LifeShield Flex 5K208K750K (1)'))

WebUI.click(findTestObject('others/STM Apply Page/span_ Add'))

WebUI.click(findTestObject('others/Page_Find Health Insurance for 2019/a_Quote  Save Today'))

WebUI.setText(findTestObject('others/Page_2019 Health Insurance Get a Sh/input_Location_zip-input'), '60602')

WebUI.setText(findTestObject('others/Page_2019 Health Insurance Get a Sh/input_Date of Birth_dob-0'), '03/03/1987')

WebUI.click(findTestObject('others/Page_2019 Health Insurance Get a Sh/label_Male'))

WebUI.click(findTestObject('others/Page_2019 Health Insurance Get a Sh/label_Compare Plans'))

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/a_Everest Prime 5K05K750K'))

WebUI.click(findTestObject('others/Page_Short Term Health Insurance Qu/button_filters'))

WebUI.click(findTestObject('others/Page_Short Term Health Insurance Qu/i_Insurance company_fa fa-chev'))

WebUI.click(findTestObject('others/Page_Short Term Health Insurance Qu/label_Insurance company_c-faux'))

WebUI.click(findTestObject('others/Page_Short Term Health Insurance Qu/a_Show Plans'))

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/a_Pivot Health Choice 5K  20'))

WebUI.click(findTestObject('others/Page_Pivot Health Choice 5000  20 -/a_ Back to Short-Term Health I'))

WebUI.click(findTestObject('others/Page_Short Term Health Insurance Qu/button_filters  1'))

WebUI.click(findTestObject('others/Page_Short Term Health Insurance Qu/i_Insurance company_fa fa-chev'))

WebUI.click(findTestObject('others/Page_Short Term Health Insurance Qu/label_LifeShield_c-faux-check-'))

WebUI.click(findTestObject('others/Page_Short Term Health Insurance Qu/a_Show Plans'))

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/a_National General 5K5010K250K'))

WebUI.click(findTestObject('others/Page_National General 5000501000025/a_ Back to Short-Term Health I'))

WebUI.click(findTestObject('others/Page_Short Term Health Insurance Qu/button_filters  1'))

WebUI.click(findTestObject('others/Page_Short Term Health Insurance Qu/a_Insurance company'))

WebUI.click(findTestObject('others/Page_Short Term Health Insurance Qu/label_Everest Prime_c-faux-che'))

WebUI.click(findTestObject('others/Page_Short Term Health Insurance Qu/a_Show Plans'))

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/a_Short Term Medical Plus Sele'))

WebUI.closeBrowser()

