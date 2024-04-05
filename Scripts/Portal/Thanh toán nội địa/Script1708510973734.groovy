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

WebUI.navigateToUrl('https://dev-payment.9pay.mobi/transaction')

WebUI.click(findTestObject('Portal_droplist_MC'))

WebUI.selectOptionByLabel(findTestObject('Portal_droplist_MC'), 'PLinh.*', true)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Portal_text_sotien'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Portal_text_sotien'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Portal_text_sotien'), '200')

WebUI.delay(3)

WebUI.click(findTestObject('Portal_droplist_loaitien'))

WebUI.selectOptionByLabel(findTestObject('Portal_droplist_loaitien'), 'USD', true)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Portal_btn_thanhtoan'), 20)

WebUI.click(findTestObject('Portal_droplist_method'))

WebUI.selectOptionByLabel(findTestObject('Portal_droplist_method'), 'Thẻ nội địa', true)

WebUI.delay(3)

WebUI.click(findTestObject('Portal_droplist_lang'))

WebUI.selectOptionByLabel(findTestObject('Portal_droplist_lang'), 'Tiếng Anh', true)

WebUI.delay(3)

WebUI.click(findTestObject('Portal_droplist_phi'))

WebUI.selectOptionByLabel(findTestObject('Portal_droplist_phi'), 'Người.*', true)

WebUI.delay(3)

WebUI.click(findTestObject('Portal_btn_thanhtoan'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Scroll_listbanklocal'), 30)

WebUI.click(findTestObject('Choose_banklocal'))

WebUI.click(findTestObject('btn_tieptuclocal'))

WebUI.click(findTestObject('cachthucthanhtoan_stk'))

WebUI.sendKeys(findTestObject('local_text_ten'), 'NGUYEN VAN A')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('local_text_stk'), '01040001')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('local_text_cccd'), '010400013333')

WebUI.delay(3)

WebUI.click(findTestObject('local_btn_Tieptuc'))

WebUI.sendKeys(findTestObject('local_text_otp'), 'otp')

WebUI.delay(2)

WebUI.click(findTestObject('local_otp_btn_Tieptuc'))

WebUI.delay(12)

WebUI.click(findTestObject('btn_bhome'))

