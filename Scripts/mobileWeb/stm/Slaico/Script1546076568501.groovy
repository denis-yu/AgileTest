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

WebUI.callTestCase(findTestCase('mobileWeb/_include/openWebSite'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//def now = new Date()
//
//def longType = now.time

//String testCaseUrl = ((path + testCaseUrl) + longType) + '/'
 testCaseUrl = path + testCaseUrl
	

//WebUI.callTestCase(findTestCase('mobileWeb/_include/Screenshot'), [('screenPath'):testCaseUrl], FailureHandling.STOP_ON_FAILURE)
WebUI.takeScreenshot(testCaseUrl + i+'.png')
i++

WebUI.click(findTestObject('mobileSanity/STM/Home Page/a_Quote  Save Today'))

WebUI.setText(findTestObject('mobileSanity/STM/STM Census Page/input_Location_zip-input'), '60602')

WebUI.setText(findTestObject('mobileSanity/STM/STM Census Page/input_Date of Birth_dob-0'), '03/03/1987')

WebUI.click(findTestObject('mobileSanity/STM/STM Census Page/label_Male'))

WebUI.takeScreenshot(testCaseUrl + i+'.png')
i++

WebUI.click(findTestObject('mobileSanity/STM/STM Census Page/label_Compare Plans'))

Thread.sleep(2000)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/button_filters'))

Thread.sleep(500)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/i_Insurance company'))

Thread.sleep(300)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/label_Slaico'))

Thread.sleep(300)
WebUI.takeScreenshot(testCaseUrl + i+'.png')
i++

WebUI.scrollToElement(findTestObject('mobileSanity/STM/STM Quote Page/a_Show Plans'), 1000)

Thread.sleep(1000)

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/a_Show Plans'))


Thread.sleep(1000)

WebUI.scrollToElement(findTestObject('mobileSanity/STM/STM Quote Page/a_Standard Life Select STM Pla'), 1000)

WebUI.takeScreenshot(testCaseUrl + i+'.png')
i++

WebUI.click(findTestObject('mobileSanity/STM/STM Quote Page/a_Standard Life Select STM Pla'))

Thread.sleep(2000)

WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/STM PlanDetail Page/a_Apply for This Plan'), 0)

WebUI.click(findTestObject('mobileSanity/STM/STM PlanDetail Page/a_Apply for This Plan'))

WebUI.takeScreenshot(testCaseUrl + i+'.png')
i++

WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/STM Apply Page/a_Start Secure Application'), 0)

WebUI.takeScreenshot(testCaseUrl + i+'.png')
i++

WebUI.click(findTestObject('mobileSanity/STM/STM Apply Page/a_Start Secure Application'))

WebUI.waitForPageLoad(0)

Thread.sleep(1000)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/button_No'))

WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1/button_No2'), 0)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/button_No2'))

WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1/button_No3'), 0)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/button_No3'))

WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1/button_No4'), 0)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/button_No4'))

WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1/button_No5'), 0)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/button_No5'))

WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1/button_No6'), 0)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/button_No6'))

WebUI.takeScreenshot(testCaseUrl + i+'.png')
i++

//WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1/button_No7'), 0)
//
//WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/button_No7'))
WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1/a_Continue'), 0)

//WebUI.scrollToElement(findTestObject('mobileSanity/STM/Page_App Page 1/a_Continue'))
WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/a_Continue'))

Thread.sleep(1000)

WebUI.waitForElementVisible(findTestObject('mobileSanity/STM/Page_App Page 1/a_Autofill App Info'), 0)

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 1/a_Autofill App Info'))

Thread.sleep(1000)

WebUI.takeScreenshot(testCaseUrl + i+'.png')
i++

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 2/a_Continue to Step 3 - Payment'))

Thread.sleep(2000)

WebUI.setText(findTestObject('mobileSanity/STM/Page_App Page 3/input__credit-card-cvv'), '123')

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 3/label_I Accept Authorization f'))

WebUI.takeScreenshot(testCaseUrl + i+'.png')
i++

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 3/a_Continue to Step 4 - Review'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 4/label'))

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 4/div_CLICK TO SIGN'))

WebUI.takeScreenshot(testCaseUrl + i+'.png')
i++

WebUI.click(findTestObject('mobileSanity/STM/Page_App Page 4/a_Submit Your Application'))

Thread.sleep(2000)

WebUI.verifyElementPresent(findTestObject('mobileSanity/STM/Page_App Page 6/span_planName'), 0)

WebUI.verifyElementPresent(findTestObject('mobileSanity/STM/Page_App Page 6/span_approved'), 0)

WebUI.takeScreenshot(testCaseUrl + i+'.png')
i++

