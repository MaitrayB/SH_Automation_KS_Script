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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger logger = new KeywordLogger()

'Open Browser'
WebUI.openBrowser('')

'Maximize Window'
WebUI.maximizeWindow()

'Navigate to application URL'
WebUI.navigateToUrl(GlobalVariable.URL)

'Click on Login link'
WebUI.click(findTestObject('Page_Studio Helper  Studio Helper is web-ba_131cd8/a_LOGIN'))

'Enter Incorrect Username\r\n'
WebUI.setText(findTestObject('Page_Studio Helper  Users/input_Login to Studio Helper_dataUserusername'), 'harsh.french@gmail.com')

'Enter password'
WebUI.setText(findTestObject('Page_Studio Helper  Users/input_Login to Studio Helper_dataUserpassword'), '123456')

'Click on Login button\r\n'
WebUI.click(findTestObject('Page_Studio Helper  Users/input_Remember Me_large button'))

'Verify that below validation message appears\r\nSorry, either that username or password combination doesn\'t exist in the system, or your account is not active. Remember that usernames and passwords are CaSE sEnsiTIve.'
WebUI.verifyElementText(findTestObject('Object Repository/Page_Studio Helper  Users/li_Sorry either that username or password c_43ade9'), 
    'Sorry, either that username or password combination doesn\'t exist in the system, or your account is not active. Remember that usernames and passwords are CaSE sEnsiTIve.')

logger.logInfo('-----Validation message verification done------')

'Close browser'
not_run: WebUI.closeBrowser()

