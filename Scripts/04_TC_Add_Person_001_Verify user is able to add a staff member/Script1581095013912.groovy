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

WebUI.openBrowser('')

'Maximize browser window'
WebUI.maximizeWindow()

'Navigated to URL successfully'
WebUI.navigateToUrl(GlobalVariable.URL)

'Clicked on Login link'
WebUI.click(findTestObject('Page_Studio Helper  Studio Helper is web-ba_131cd8/a_LOGIN'))

'Entered username'
WebUI.setText(findTestObject('Page_Studio Helper  Users/input_Login to Studio Helper_dataUserusername'), GlobalVariable.username)

'Enter password'
WebUI.setText(findTestObject('Page_Studio Helper  Users/input_Login to Studio Helper_dataUserpassword'), GlobalVariable.password)

'Click on login/submit button'
WebUI.click(findTestObject('Page_Studio Helper  Users/input_Remember Me_large button'))

'Mouse overed on People menu'
WebUI.mouseOver(findTestObject('Page_Studio Helper  Users/a_People'))

WebUI.waitForElementVisible(findTestObject('Page_Studio Helper  Users/a_Add Person'), 5)

'Mouse overed Add Person'
WebUI.mouseOver(findTestObject('Page_Studio Helper  Users/a_Add Person'))

'Clicked on Add Staff Member link'
WebUI.click(findTestObject('Object Repository/Page_Studio Helper  Users/a_Add Staff Member'))

'Set text for First Name'
WebUI.setText(findTestObject('Object Repository/Page_Studio Helper  Users/input_First Name_dataUserfirst_name'), 'Automaion')

'Set text for Last Name'
WebUI.setText(findTestObject('Object Repository/Page_Studio Helper  Users/input_Last Name_dataUserlast_name'), 'Test 1')

'Clicked on Save button'
WebUI.click(findTestObject('Page_Studio Helper  Users/input_or_submit'))

'Verified "Saved Successfully" message on screen'
WebUI.verifyElementPresent(findTestObject('Page_Studio Helper  Users/li_Automation Test 1s profile has been saved'), 0)

WebUI.closeBrowser()

