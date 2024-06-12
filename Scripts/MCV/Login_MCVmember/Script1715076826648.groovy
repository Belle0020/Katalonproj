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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://stg-account-mcv.9pay.mobi/login')

WebUI.delay(3)

WebUI.setText(findTestObject('MCV_login_member_inputname'), User)

WebUI.setText(findTestObject('MCV_login_member_inputpassword'), Password)

WebUI.click(findTestObject('MCV_login_member_btn_login'))

WebUI.click(findTestObject('MCV_login_dieuhuong'))

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('MCV_iframe_home'), 5)

WebUI.verifyTextPresent(Validate, false)

WebUI.delay(5)

// Tài khoản thành viên đại lý - Quyền quản lý giao dịch
WebUI.navigateToUrl('https://stg-mcv2.9pay.mobi/transactions')

// Tài khoản thành viên đại lý - Quyền quản lý giao dịch chi nhánh
WebUI.navigateToUrl('https://stg-mcv2.9pay.mobi/disbursement/request')

// Tài khoản thành viên đại lý - Quyền quản lý QR code
WebUI.navigateToUrl('https://stg-mcv2.9pay.mobi/QR/list')

WebUI.closeBrowser()

