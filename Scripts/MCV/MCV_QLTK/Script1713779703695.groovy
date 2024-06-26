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

//Vào module quản lý thành viên để xem danh sách thành viên 

WebUI.click(findTestObject('MCV_QLTK_module'))

WebUI.delay(3)

WebUI.click(findTestObject('MCV_QLTK_option_ifTK'))

WebUI.delay(3)

WebUI.click(findTestObject('MCV_QLTK_option_memTK'))

WebUI.delay(3)

//Verify danh sách tài khoản thành viên 

WebUI.verifyElementText(findTestObject('MCV_QLTK_option_memTK'), 'Tài khoản thành viên ')

//Phân quyền member8 quyền QR code

WebUI.click(findTestObject('MCV_QLTK_pq_member8'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('MCV_QLTK_pq_btn_save8'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('MCV_QLTK_pq_QR8'))

WebUI.delay(3)

WebUI.click(findTestObject('MCV_QLTK_pq_btn_save8'))

//Phân quyền member9 quyền tra cứu giao dịch 

WebUI.click(findTestObject('MCV_QLTK_pq_member9'))

WebUI.delay(3)

WebUI.click(findTestObject('MCV_QLTK_pq_GD9'))

WebUI.scrollToElement(findTestObject('MCV_QLTK_pq_btn_save9'), 0)

WebUI.click(findTestObject('MCV_QLTK_pq_btn_save9'))

//Phân quyền member7 quyền chi hộ 

WebUI.click(findTestObject('MCV_QLTK_pq_member7'))

WebUI.delay(3)

WebUI.click(findTestObject('MCV_QLTK_pq_Chiho7'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('MCV_QLTK_pq_btn_save7'), 0)

WebUI.click(findTestObject('MCV_QLTK_pq_btn_save7'))

