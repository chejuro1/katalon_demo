import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.airbnb.ca/?locale=en&_set_bev_on_new_domain=1657288456_NmU1NzQ3MDAzZjY1')

WebUI.click(findTestObject('Object Repository/Airbnb pages/Page_Vacation Homes  Condo Rentals - Airbnb_f5c50c/div_Anywhere'))

WebUI.setText(findTestObject('Object Repository/Airbnb pages/Page_Vacation Homes  Condo Rentals - Airbnb_f5c50c/input_Where_query'), 
    'Montreal')

WebUI.click(findTestObject('Object Repository/Airbnb pages/Page_Vacation Homes  Condo Rentals - Airbnb_f5c50c/div_Toronto, ON'))

WebUI.click(findTestObject('Object Repository/Airbnb pages/Page_Vacation Homes  Condo Rentals - Airbnb_f5c50c/div_22'))

WebUI.click(findTestObject('Object Repository/Airbnb pages/Page_Vacation Homes  Condo Rentals - Airbnb_f5c50c/div_23'))

WebUI.click(findTestObject('Object Repository/Airbnb pages/Page_Vacation Homes  Condo Rentals - Airbnb_f5c50c/span_Add guests__kaq6tx'))

WebUI.click(findTestObject('Object Repository/Airbnb pages/Page_Jul. 8, 2022 - Toronto Sublets, Short _3890d7/img_Rare find_FMP-target'))

