import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('kobiton-store:21961', true)

Mobile.tap(findTestObject('android.widget.Button0 - get started (2)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 (6)'), '1111', 0)

Mobile.tap(findTestObject('android.widget.Button0 - confirm pin (2)'), 0)

Mobile.switchToPortrait()

Mobile.switchToPortrait()

Mobile.setText(findTestObject('android.widget.EditText0 (7)'), 'test@test.com', 0)

Mobile.setText(findTestObject('android.widget.EditText1 (2)'), 'Test1234', 0)

Mobile.tap(findTestObject('android.widget.Button0 - SIGN IN (2)'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('android.widget.Button0 - AUTHORIZE (2)'), 0)

Mobile.switchToPortrait()

Mobile.switchToPortrait()

Mobile.setText(findTestObject('android.widget.EditText0 (8)'), '1111', 0)

Mobile.tap(findTestObject('android.widget.Button0 - unlock with pin (2)'), 0)

Mobile.switchToPortrait()

Mobile.switchToPortrait()

Mobile.closeApplication()

