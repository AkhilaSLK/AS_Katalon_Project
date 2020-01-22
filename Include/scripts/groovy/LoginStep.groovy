import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class LoginStep {



	@Given("user is on the login page")
	def navigateToLoginPage(){

		println 'I am inside navigateToLoginPage'

		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
	}

	@When("user enters username and password")
	def entercredentials() {

		println 'I am inside entercredentials'

		WebUI.setText(findTestObject('Web/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')
		WebUI.setText(findTestObject('Web/Page_OrangeHRM/input_Username_txtPassword'), 'admin123')
	}

	@And("clicks on login button")

	def clicklogin() {
		println 'I am inside clicklogin'

		WebUI.click(findTestObject('Web/Page_OrangeHRM/input_Password_Submit'))
	}


	@Then("user is navigated to home page")

	def homepage(){

		WebUI.verifyTextPresent("Welcome Admin", false)

		println 'I am inside homepage'
	}
}
