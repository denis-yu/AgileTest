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

WebUI.openBrowser(('https://' + ShortName) + '.healthinsurance.com')

WebUI.verifyEqual('https://affiliate.healthinsurance.com/?affiliate=' + ShortName, WebUI.getUrl())

WebUI.verifyEqual(PhoneNumber, WebUI.getText(findTestObject('hic/home page/phone')))

WebUI.verifyElementVisible(findTestObject('hic/home page/a_home'))

if (Health == '1') {
    WebUI.verifyElementVisible(findTestObject('hic/home page/a_obamacare'))

    WebUI.click(findTestObject('hic/home page/a_obamacare'))

    WebUI.takeScreenshot()
} else {
    WebUI.verifyElementNotVisible(findTestObject('hic/home page/a_obamacare'))
}

if (ShortTerm == '1') {
    WebUI.verifyElementVisible(findTestObject('hic/home page/a_shortterm'))

    WebUI.click(findTestObject('hic/home page/a_shortterm'))

    WebUI.takeScreenshot()

    WebUI.sendKeys(findTestObject('hic/stm census page/zip'), '35215')

    WebUI.click(findTestObject('hic/stm census page/male'))

    WebUI.sendKeys(findTestObject('hic/stm census page/month'), '01')

    WebUI.sendKeys(findTestObject('hic/stm census page/day'), '01')

    WebUI.sendKeys(findTestObject('hic/stm census page/year'), '1990')

    WebUI.sendKeys(findTestObject('hic/stm census page/name'), 'test')

    WebUI.sendKeys(findTestObject('hic/stm census page/email'), 'test.test123@suryani.cn')

    WebUI.click(findTestObject('hic/stm census page/button_compare'))

	String stmNumber = WebUI.getText(findTestObject('hic/stm quote page/quote_number'))
	
    WebUI.click(findTestObject('hic/stm quote page/apply_button'))

    WebUI.navigateToUrl('https://www.agilehealthinsurance.com/api/context/show')

    String context = WebUI.getText(findTestObject('hic/stm apply page/context'))

//    String trafficSource = WebUI.getText(findTestObject('hic/stm apply page/trafficSource'))
//
//    String affiliateId = WebUI.getText(findTestObject('hic/stm apply page/affiliateId'))

	CustomKeywords.'test.WriteExcel.writeToExcel'(stmNumber, context)

    WebUI.navigateToUrl(('https://' + ShortName) + '.healthinsurance.com')
} else {
    WebUI.verifyElementNotVisible(findTestObject('hic/home page/a_shortterm'))
}

if (Dental == '1') {
    WebUI.verifyElementVisible(findTestObject('hic/home page/a_dental'))

    WebUI.click(findTestObject('hic/home page/a_dental'))

    WebUI.takeScreenshot()
} else {
    WebUI.verifyElementNotVisible(findTestObject('hic/home page/a_dental'))
}

