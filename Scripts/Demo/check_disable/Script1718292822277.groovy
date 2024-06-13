import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://shop.9pay.vn/dich-vu-dien-thoai?code=topup_phone')

// Lay css cua nut chua trang thai bi vo hieu hoa. Nut dau tien khong co 2 trang thai thi thoi.
// Chi di lay nut nao co vo hieu hoa.
// class la thuoc tinh

String currentCss = WebUI.getAttribute(findTestObject('Object Repository/Demo/button_disable'), "class")

// Ham check co chu iloveyou trong bien currentCss, neu co tu khoa do la true
// Nguoc lai false, tuc nut khong bi vo hieu hoa.
Boolean isDisabled = currentCss.contains("iloveyou")

println("isDisabled: "+ isDisabled)

if (isDisabled) {
	// Thuc hien lenh gi do.
} else {
	// Nguoc lai ben tren
}

WebUI.closeBrowser()
