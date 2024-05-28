package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import groovy.swing.impl.DefaultAction



class Login {
	@Given("user open the app mstqa")
	def openApp() {
		Mobile.startExistingApplication('com.mstqa')
	}

	@Then ("user fill in text field username with registered (.*)")
	def enterUsername(String username) {
		println("Username : "+username)

		Mobile.callTestCase(findTestCase('Pages/Login/Input Username'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@And ("user fill in text field password with registered (.*)")
	def enterPassword(String password) {
		println("Password : "+password)

		Mobile.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@And ("user tap on login button at Login Screen Page")
	def tapButtonLoginAtLoginPage() {
		Mobile.callTestCase(findTestCase('Pages/Login/Button Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then ("user tap on logout button at page")
	def pageAfterLogin() {
		Mobile.callTestCase(findTestCase('Pages/Logout/Button Logout'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.closeApplication()
	}
}