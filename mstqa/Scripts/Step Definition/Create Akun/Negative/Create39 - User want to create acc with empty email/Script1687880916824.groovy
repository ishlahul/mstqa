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

Mobile.callTestCase(findTestCase('Pages/Create Akun/Tap Icon Akun'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/Create Akun/Tap Button Masuk Akun Saya'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/Create Akun/Tap Daftar Text View'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/Create Akun/Input Nama'), [('nama_user') : 'Jeno'], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/Create Akun/Input Email Neg TC'), [('email_user') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/Create Akun/Input Password'), [('password') : 'jeno1234'], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/Create Akun/Input Nomor Hp'), [('nomor_hp') : '089823042304'], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/Create Akun/Input Kota'), [('kota') : 'Semarang'], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/Create Akun/Input Alamat'), [('alamat') : 'Banyumanik'], FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Sudah punya akun?', FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/Create Akun/Tap Button Daftar'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/Create Akun/Verify email empty'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

