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
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.support.ui.Select

WebUI.openBrowser(env)

WebDriver driver = DriverFactory.getWebDriver()

driver.findElement(By.xpath('//button[text()=\'COMPARE HEALTH PLANS\']')).click()

WebDriverWait wait = new WebDriverWait(driver, 20)

wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("profile.census.location.zip")))

driver.findElement(By.name('profile.census.location.zip')).sendKeys(zip)

driver.findElement(By.xpath('//button[text()=\'Compare Plans\']')).click()

wait.until(ExpectedConditions.elementToBeClickable(By.xpath('//h3[contains(text(),\'Humana\')]/preceding::button[text()=\'Enroll\'][1]')))

driver.findElement(By.xpath('//h3[contains(text(),\'Humana\')]/preceding::button[text()=\'Enroll\'][1]')).click()

wait.until(ExpectedConditions.elementToBeClickable(By.xpath('//div[text()=\'Continue\']')))

driver.findElement(By.xpath('//div[text()=\'Continue\']')).click()

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id('root_firstName')))

WebUI.callTestCase(findTestCase('HIC/_include/name'), [:], FailureHandling.STOP_ON_FAILURE)

driver.findElement(By.id("root_firstName")).sendKeys(GlobalVariable.FirstName)

driver.findElement(By.id("root_lastName")).sendKeys(GlobalVariable.LastName)

driver.findElement(By.name("dobmm")).sendKeys("11")

driver.findElement(By.name("dobdd")).sendKeys("11")

driver.findElement(By.name("dobyy")).sendKeys("1950")

driver.findElement(By.xpath("//input[contains(@id,'M-uniq')]/following-sibling::label")).click()

driver.findElement(By.id("root_home_line1")).sendKeys(GlobalVariable.Address)

driver.findElement(By.id("root_home_city")).sendKeys(GlobalVariable.City)

driver.findElement(By.xpath("//span[text()='Continue']")).click()

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("root_medicareNumber")))

driver.findElement(By.id("root_medicareNumber")).sendKeys("1CC1CC2CC22")

driver.findElement(By.name("partADatemm")).sendKeys("08")

driver.findElement(By.name("partADateyy")).sendKeys("2019")

driver.findElement(By.name("partBDatemm")).sendKeys("08")

driver.findElement(By.name("partBDateyy")).sendKeys("2019")

driver.findElement(By.xpath("//span[text()='Continue']")).click()

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root_otherDrugCoverage__title']/following::label[contains(@for, 'N-uniq')][1]")))

driver.findElement(By.xpath("//*[@id='root_otherDrugCoverage__title']/following::label[contains(@for, 'N-uniq')][1]")).click()

driver.findElement(By.xpath("//*[@id='root_otherGroupCoverage__title']/following::label[contains(@for, 'N-uniq')][1]")).click()

Select paymentsl = new Select(driver.findElement(By.id("root_paymentType_has")))

paymentsl.selectByVisibleText("Social Security benefit check deduction")

driver.findElement(By.xpath("//span[text()='Continue']")).click()

driver.findElement(By.xpath("//input[@id='root_appAnswers_acknowledged']/following-sibling::label")).click()

driver.findElement(By.xpath("//input[contains(@id, 'enrollee-uniq')]/following-sibling::label")).click()

driver.findElement(By.id("root_signedFirstName")).sendKeys(GlobalVariable.FirstName)

driver.findElement(By.id("root_signedLastName")).sendKeys(GlobalVariable.LastName)

driver.findElement(By.xpath("//span[text()='Submit']")).click()

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Thank-you')]")))

driver.close()
































