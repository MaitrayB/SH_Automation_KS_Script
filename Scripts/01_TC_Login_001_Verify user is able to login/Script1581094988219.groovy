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

'Open browser\r\n'
WebUI.openBrowser('')

'Maximize browser window'
WebUI.maximizeWindow()

'Enter URL of application'
WebUI.navigateToUrl(GlobalVariable.URL)

'Click on Login link from top right'
WebUI.click(findTestObject('Object Repository/Page_Studio Helper  Studio Helper is web-ba_131cd8/a_LOGIN'))

'Enter username'
WebUI.setText(findTestObject('Object Repository/Page_Studio Helper  Users/input_Login to Studio Helper_dataUserusername'), 
    GlobalVariable.username)

'Enter Password'
WebUI.setText(findTestObject('Object Repository/Page_Studio Helper  Users/input_Login to Studio Helper_dataUserpassword'), 
    GlobalVariable.password)

'Click on Login button\r\n'
WebUI.click(findTestObject('Object Repository/Page_Studio Helper  Users/input_Remember Me_large button'))

'Check welcome message after login'
WebUI.check(findTestObject('Page_Studio Helper  Users/p_Welcome Harsh C (Studio Admin)           _e94020'))

'Close browser'
not_run: WebUI.closeBrowser()

