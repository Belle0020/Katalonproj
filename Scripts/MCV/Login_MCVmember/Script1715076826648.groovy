import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://stg-account-mcv.9pay.mobi/login')

WebUI.waitForElementVisible(findTestObject('MCV_login_member_inputname'), 15)

println(user)

WebUI.setText(findTestObject('MCV_login_member_inputname'), user)

//WebUI.setText(findTestObject('MCV_login_member_inputname'), "plmcv_member_8")

println(password)
WebUI.setText(findTestObject('MCV_login_member_inputpassword'), password)
//WebUI.setText(findTestObject('MCV_login_member_inputpassword'), "Plmcv@12345678")

WebUI.click(findTestObject('MCV_login_member_btn_login'))

WebUI.waitForElementVisible(findTestObject('MCV_login_dieuhuong'), 15)

WebUI.click(findTestObject('MCV_login_dieuhuong'))

WebUI.click(findTestObject('Object Repository/MCV_menu'))
WebUI.delay(1)

String textValidate = validate
textValidate = textValidate.trim()
println(textValidate)
WebUI.verifyTextPresent(textValidate, false)

WebUI.delay(3)

WebUI.navigateToUrl(url)


WebUI.closeBrowser()

