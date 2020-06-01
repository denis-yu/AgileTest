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

mapd = '34 dmfkejrl'

mapdNum = mapd.replaceAll(/\s[a-zA-Z]*/, '')

println(mapd)

println(mapdNum)

int mapdNum = 34

mapdPlansString = '/ Cigna-HealthSpring Advantage (HMO) / Cigna-HealthSpring Preferred AL (HMO) / VIVA Medicare Me (HMO) / Humana Gold Plus H5619-088 (HMO) / Bright Advantage Flex Choice (PPO) / Cigna-HealthSpring Preferred (HMO) / UnitedHealthcare Dual Complete Plan 2 (HMO D-SNP) / Aetna Medicare Freedom Plan (PPO) / Blue Advantage Complete (PPO) / Cigna-HealthSpring PreferredPlus (HMO) / HumanaChoice H5216-214 (PPO) / Bright Advantage Plus (HMO) / Simpra Advantage (PPO D-SNP) / AARP Medicare Advantage Plan 4 (HMO) / VIVA Medicare Extra Value (HMO D-SNP) / VIVA Medicare Plus (HMO) / Simpra Advantage (PPO I-SNP) / VIVA Medicare Premier (HMO) / Aetna Medicare Basics Plan (PPO) / Cigna-HealthSpring True Choice (PPO) / AARP Medicare Advantage Plan 3 (HMO) / VIVA Medicare Select (HMO) / AARP Medicare Advantage Walgreens Plan 2 (HMO) / Bright Advantage Flex Plus (PPO) / Humana Gold Plus SNP-DE H5619-093 (HMO D-SNP) / Humana Honor R7315-001 (Regional PPO) / UnitedHealthcare Dual Complete Plan 1 (HMO D-SNP) / Bright Advantage Choice (HMO) / AARP Medicare Advantage Walgreens Plan 1 (HMO) / VIVA Medicare Prime (HMO) / Bright Advantage Assist (PPO) / Cigna-HealthSpring TotalCare AL (HMO D-SNP) / HumanaChoice R7315-002 (Regional PPO) / Blue Advantage Premier (PPO)'

int pdNum = 25

pdPlansString = '/ WellCare Medicare Rx Saver (PDP) / Express Scripts Medicare - Value (PDP) / BlueRx Enhanced Plus (PDP) / AARP MedicareRx Preferred (PDP) / BlueRx Essential (PDP) / EnvisionRxPlus (PDP) / WellCare Medicare Rx Value Plus (PDP) / Mutual of Omaha Rx Plus (PDP) / SilverScript Choice (PDP) / Mutual of Omaha Rx Value (PDP) / Express Scripts Medicare - Choice (PDP) / BlueRx Enhanced (PDP) / WellCare Wellness Rx (PDP) / Express Scripts Medicare - Saver (PDP) / Humana Premier Rx Plan (PDP) / WellCare Classic (PDP) / Humana Basic Rx Plan (PDP) / WellCare Medicare Rx Select (PDP) / SilverScript Plus (PDP) / Farm Bureau Essential Rx (PDP) / Humana Walmart Value Rx Plan (PDP) / AARP MedicareRx Walgreens (PDP) / WellCare Value Script (PDP) / AARP MedicareRx Saver Plus (PDP) / Farm Bureau Select Rx (PDP)'

CustomKeywords.'test.WriteExcel.writeToOneExcel'(mapdNum, mapdPlansString, pdNum, pdPlansString, 'AK')