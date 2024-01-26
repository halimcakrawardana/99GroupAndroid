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

Mobile.startApplication(GlobalVariable.AppPath, true)

Mobile.tap(findTestObject('Menu/Login_btn'), 0)

Mobile.waitForElementPresent(findTestObject('Header/SignUp_btn'), 0)

Mobile.tap(findTestObject('Header/SignUp_btn'), 0)

int randomInt = new Random().nextInt((9999 - 10) + 1) + 10

def email = ('halimcakraw' + randomInt) + '@yahoo.com'

Mobile.waitForElementPresent(findTestObject('Sign Up Page/Email_field'), 0)

Mobile.setText(findTestObject('Sign Up Page/Email_field'), email, 0)

def password = 'Testing123'

Mobile.setText(findTestObject('Sign Up Page/Password_field'), password, 0)

Mobile.setText(findTestObject('Sign Up Page/RepeatPass_field'), password, 0)

Mobile.tap(findTestObject('Sign Up Page/SignUpRegist_btn'), 0)

Mobile.waitForElementPresent(findTestObject('Sign Up Page/Confirm_btn'), 0)

Mobile.tap(findTestObject('Sign Up Page/Confirm_btn'), 0)

Mobile.tap(findTestObject('Header/RedirectLogin_btn'), 0)

Mobile.waitForElementPresent(findTestObject('Login Page/Email_field'), 0)

Mobile.setText(findTestObject('Login Page/Email_field'), email, 0)

Mobile.setText(findTestObject('Login Page/Password_field'), password, 0)

Mobile.tap(findTestObject('Login Page/Login_btn'), 0)

Mobile.waitForElementPresent(findTestObject('Login Page/Confirm_btn'), 0)

Mobile.tap(findTestObject('Login Page/Confirm_btn'), 0)