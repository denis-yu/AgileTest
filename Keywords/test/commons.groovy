package test

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import internal.GlobalVariable
import org.openqa.selenium.NoSuchElementException
import java.io.IOException
import org.frontendtest.components.ImageComparison
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By

public class commons {
	WebDriver driver = DriverFactory.getWebDriver()

	@Keyword
	def isElementPresent(TestObject to, int timeout){
		//Use Katalon built-in function to find elements with time out 1 seconds
		List<WebElement> elements = WebUI.findWebElements(to, timeout)
		if (elements.size() > 0)
		{
			//Mark Passed status after this step
			//KeywordUtil.markPassed("Element is Present")
			return true
		}
		else
		{
			//Mark Failed status after this step
			//KeywordUtil.markFailed("Element is not presebt")
			return false
		}
	}

	@Keyword
	def selectNav(TestObject object){
		WebUI.click(findTestObject('mobileSanity/Common/side_nav/menu'))
		Thread.sleep(3000)
		WebUI.click(object)
		WebUI.waitForPageLoad(10)
	}

	@Keyword
	def click_JS(TestObject object){
		WebElement element = WebUiCommonHelper.findWebElement(object, 10)
		WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(element))
	}

	@Keyword
	def click_JS_ByXpath(String str){
		WebElement element = driver.findElement(By.xpath(str))
		WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(element))
	}

	@Keyword
	def compareImage() throws IOException{
		String imageOriginal="D:\\Test\\AgileTest\\AgileTest\\Reports\\mobileWeb\\mobileSanity\\20190123_165358\\1548233704151.png";
		String toCompareImage="D:\\Test\\AgileTest\\AgileTest\\Reports\\mobileWeb\\mobileSanity\\20190123_165358\\1548233704151.png";
		String resultImage="D:\\Test\\AgileTest\\AgileTest\\Reports\\mobileWeb\\mobileSanity\\20190123_165358\\results.png";
		ImageComparison imagecomparison = new ImageComparison(10,10,0.05);
		if(imagecomparison.fuzzyEqual(imageOriginal,toCompareImage,resultImage))
			System.out.println("Images are fuzzy-equal.");
		else
			System.out.println("Images are not fuzzy-equal.");
	}
}
