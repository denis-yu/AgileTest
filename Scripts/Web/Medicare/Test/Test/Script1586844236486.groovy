import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser("https://qa.healthinsurance.com")

WebDriver driver = DriverFactory.getWebDriver()

driver.findElement(By.id("product-lines")).click()

driver.findElement(By.xpath("//button[text()='Dental']")).click()

driver.findElement(By.xpath("//button[text()='COMPARE HEALTH PLANS']")).click()

WebDriverWait wait = new WebDriverWait(driver, 20)

wait.until(ExpectedConditions.textToBe(By.xpath("//h1"), "Find an affordable dental insurance plan"))

driver.close()