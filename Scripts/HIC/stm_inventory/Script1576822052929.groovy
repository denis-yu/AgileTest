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

WebUI.openBrowser(('https://valkyrie.healthinsurance.com/short-term/quote?affiliate=hicom&utm_source=hic&utm_medium=redirect&utm_campaign=hic_stm_census&zip=' + 
    zipcode) + '&primary.dob=1985-11-11&primary.gender=F')

stmExist = CustomKeywords.'test.MobileKeywords.isElementPresent_Web'(findTestObject('hic/stm/census/h1'), 20)

if (stmExist) {
    stmNum = WebUI.getText(findTestObject('hic/stm/census/h1'))
} else {
    stmNum = '0'
}

CustomKeywords.'test.WriteExcel.writeToExcel'(stmNum)

