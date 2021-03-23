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

'Browser opened'
WebUI.openBrowser('')

'Window maximized'
WebUI.maximizeWindow()

'Navigated to URL'
WebUI.navigateToUrl(GlobalVariable.URL)

'Clicked on Login link'
WebUI.click(findTestObject('Page_Studio Helper  Studio Helper is web-ba_131cd8/a_LOGIN'))

'Set username value'
WebUI.setText(findTestObject('Page_Studio Helper  Users/input_Login to Studio Helper_dataUserusername'), GlobalVariable.username)

'Set password'
WebUI.setText(findTestObject('Page_Studio Helper  Users/input_Login to Studio Helper_dataUserpassword'), GlobalVariable.password)

'Clicked on button'
WebUI.click(findTestObject('Page_Studio Helper  Users/input_Remember Me_large button'))

'Mouse overed on People tab'
WebUI.mouseOver(findTestObject('Page_Studio Helper  Users/a_People'))

'Mouse overed on Add Person option'
WebUI.mouseOver(findTestObject('Page_Studio Helper  Users/a_Add Person'))

'Clicked on Add Parent button.'
WebUI.click(findTestObject('Page_Studio Helper  Users/a_Add Parent'))

'Set value for first name'
WebUI.setText(findTestObject('Page_Studio Helper  Users/input_First Name_dataUserfirst_name'), 'Parent')

'Set value for Last Name'
WebUI.setText(findTestObject('Page_Studio Helper  Users/input_Last Name_dataUserlast_name'), 'automation test')

'Selected category'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Studio Helper  Users/select_Select OneOther'), '0', true)

WebUI.setText(findTestObject('Object Repository/Page_Studio Helper  Users/input_Referred By_dataUserreferred_by_other'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Page_Studio Helper  Users/div_New Referral Method            New Refe_3bf8d8'))

'Clicked on submit button'
WebUI.click(findTestObject('Page_Studio Helper  Users/input_or_submit'))

'Parent automation test\'s profile has been saved" observed'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Studio Helper  Users/li_Teacher automation tests profile has been saved'), 
    0)

