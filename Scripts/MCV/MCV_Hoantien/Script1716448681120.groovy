import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

//Vào module Quản lý hoàn tiền trả góp để thực hiện yêu cầu hoàn trả góp
WebUI.click(findTestObject('MCV_droplist_QLHT'))

//Click quản lý hoàn tiền trả góp
WebUI.click(findTestObject('MCV_QLHT_tragop'))

WebUI.delay(3)

//kiểm tra màn yêu cầu hoàn tiền trả góp
WebUI.verifyElementText(findTestObject('MCV_QLHT_tragop'), 'Quản lý yêu cầu hoàn tiền trả góp')

WebUI.verifyElementVisible(findTestObject('MCV_QLHT_tragop_btnThemmoi'))

WebUI.click(findTestObject('MCV_QLHT_tragop_btnThemmoi'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

// I. Yêu cầu hoàn tiền
// Nhập mã giao dịch
WebUI.sendKeys(findTestObject('MCV_QLHT_input_magiaodich'), magiaodich)

WebUI.delay(10)

WebUI.acceptAlert()

WebUI.mouseOver(findTestObject('MCV_QLHT_checkbox_hoantoanphan'))

WebUI.verifyTextPresent(validate, false)

String xpathButtonHoanMotPhan = 'MCV_QLHT_checkbox_hoan1phan'

String classButton2 = WebUI.getAttribute(findTestObject('MCV_QLHT_checkbox_hoan1phan'), 'class')

Boolean isDisabled = classButton2.contains('disabled' // Button hoàn tiền 1 phần đang bị vô hiệu hóa
    )

println(isDisabled)

if (isDisabled) {
    WebUI.verifyElementClickable(findTestObject('MCV_QLHT_checkbox_hoantoanphan'), 10)
} else {
    WebUI.verifyElementClickable(findTestObject('MCV_QLHT_checkbox_hoan1phan'), 10)

    WebUI.setText(findTestObject('MCV_QLHT_input_sotien'), sotien)

    WebUI.scrollToElement(findTestObject('MCV_QLHT_btn_Guiyeucau'), 6)
}

// Nhập lý do 
WebUI.setText(findTestObject('MCV_QLHT_input_lydo'), lydo)

WebUI.click(findTestObject('MCV_QLHT_btn_Guiyeucau'))

WebUI.delay(5)

