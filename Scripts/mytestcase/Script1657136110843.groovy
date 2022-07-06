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

WebUI.navigateToUrl('https://demo-store.katalon.com/')

WebUI.click(findTestObject('Object Repository/Page_Zack Market/label_Ascending'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/div_Men_checkbox_design__sArRO'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/div_Men_checkbox_design__sArRO'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/div_Men_checkbox_design__sArRO'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/label_Greater Than 89'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/span_Clear All'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/img_Clear All_card-img-top'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/a_Women'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/a_Blazer'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/label_49 - 89'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/div_All Products'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/img_25.99 CAD_card-img-top'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/div_All Products_search_icon__1puna'))

WebUI.setText(findTestObject('Object Repository/Page_Zack Market/input_All Products_auto_input__2ud9e'), 'pant')

WebUI.sendKeys(findTestObject('Object Repository/Page_Zack Market/input_All Products_auto_input__2ud9e'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/img_25.99 CAD_card-img-top'))

