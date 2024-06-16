import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://stg-account-mcv.9pay.mobi/login')

WebUI.waitForElementVisible(findTestObject('MCV_login_member_inputname'), 15)

println(user)

WebUI.setText(findTestObject('MCV_login_member_inputname'), user)

println(password)

WebUI.setText(findTestObject('MCV_login_member_inputpassword'), password)

WebUI.click(findTestObject('MCV_login_member_btn_login'))

WebUI.waitForElementVisible(findTestObject('MCV_login_dieuhuong'), 15)

WebUI.click(findTestObject('MCV_login_dieuhuong'))

WebUI.click(findTestObject('Object Repository/MCV_menu'))

WebUI.delay(1)

WebUI.click(findTestObject('MCV_menu1'))

WebUI.delay(1)

String textValidate = validate

textValidate = textValidate.trim()

println(textValidate)

WebUI.verifyTextPresent(textValidate, false)

WebUI.navigateToUrl(url)

WebUI.delay(3)

WebUI.closeBrowser()

