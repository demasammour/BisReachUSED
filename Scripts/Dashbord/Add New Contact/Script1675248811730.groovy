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

WebUI.callTestCase(findTestCase('Login/Test Case 01 - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard Elements/Add Contact Elements/Add Contact button'))

WebUI.sendKeys(findTestObject('Dashboard Elements/Add Contact Elements/Given Name field'), 'testing')

WebUI.sendKeys(findTestObject('Dashboard Elements/Add Contact Elements/Family name button'), 'testing')

dynamicemail = CustomKeywords.'defaultpackage.custome.randomString'('letters', 9)

WebUI.setText(findTestObject('Dashboard Elements/Add Contact Elements/Email field'), dynamicemail + '@ccn.com')

WebUI.click(findTestObject('Dashboard Elements/Add Contact Elements/Company field'))

WebUI.sendKeys(findTestObject('Dashboard Elements/Add Contact Elements/Company field'), 'dema')

'Here i send value for any company ex.dema\nthen i selected the first option in the shown list '
WebUI.click(findTestObject('Dashboard Elements/Add Contact Elements/Select the first option after filling in the company field'))

WebUI.click(findTestObject('Dashboard Elements/Add Contact Elements/Create Contact button'))

