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

WebUI.callTestCase(findTestCase('Pages/Add_Product/Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Page_Add_Product/btn_icon_jual'), 0)

Mobile.setText(findTestObject('Page_Add_Product/text_nama_produk'), '123', 0)

Mobile.setText(findTestObject('Page_Add_Product/text_harga_produk'), '123', 0)

Mobile.tap(findTestObject('Page_Add_Product/spn_cat_produk'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Page_Add_Product/cat_1tap_kompdanacc'), 0)

Mobile.setText(findTestObject('Page_Add_Product/text_lokasi_produk'), '123', 0)

Mobile.setText(findTestObject('Page_Add_Product/text_desc_produk'), '123', 0)

Mobile.tap(findTestObject('Page_Add_Product/icon_upload'), 0)

Mobile.tap(findTestObject('Page_Add_Product/btn_gallery'), 0)

Mobile.tap(findTestObject('Page_Add_Product/upload_1st_order'), 0)

Mobile.tap(findTestObject('Page_Add_Product/btn_terbitkan'), 0)

WebUI.callTestCase(findTestCase('Pages/Add_Product/Verify'), [:], FailureHandling.STOP_ON_FAILURE)

