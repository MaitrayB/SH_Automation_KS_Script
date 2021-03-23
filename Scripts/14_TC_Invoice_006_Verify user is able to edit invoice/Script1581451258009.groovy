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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

not_run: WebUI.closeBrowser()

'Browser opened'
WebUI.openBrowser('')

'Window maximized'
WebUI.maximizeWindow()

'Navigated to URL'
WebUI.navigateToUrl(GlobalVariable.URL)

'Clicked on Login link'
WebUI.click(findTestObject('Object Repository/Page_Studio Helper  Studio Helper is web-ba_131cd8/a_LOGIN'))

'Set username value'
WebUI.setText(findTestObject('Object Repository/Page_Studio Helper  Users/input_Login to Studio Helper_dataUserusername'), 
    GlobalVariable.username)

'Set password'
WebUI.setText(findTestObject('Object Repository/Page_Studio Helper  Users/input_Login to Studio Helper_dataUserpassword'), 
    GlobalVariable.password)

'Clicked on button'
WebUI.click(findTestObject('Object Repository/Page_Studio Helper  Users/input_Remember Me_large button'))

'Mouse over on Money Tab'
WebUI.mouseOver(findTestObject('Object Repository/Page_Studio Helper  Users/a_Money'))

'Mouse Over on Invoicing option'
WebUI.mouseOver(findTestObject('Object Repository/Page_Studio Helper  Users/a_Invoicing'))

'Click on Invoice List'
WebUI.click(findTestObject('Page_Studio Helper  Users/a_Invoice List'))

'Click on View link of first invoice'
WebUI.click(findTestObject('Page_Studio Helper  Invoices/a_View'))

'Verified that invoice is opened successfully'
WebUI.verifyElementPresent(findTestObject('Page_Studio Helper  Invoices/h2_Bill To'), 0)

'Clicked on edit invoice link'
WebUI.click(findTestObject('Page_Studio Helper  Invoices/span_Edit Invoice'))

'Edit Invoice label verified'
WebUI.verifyTextPresent('Edit Invoice', false)

