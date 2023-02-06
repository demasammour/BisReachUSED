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

WebUI.callTestCase(findTestCase('Dashbord/Add New Company'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Reasearch Company profile elements/Update Name Button on company profile'))

dynamicname = CustomKeywords.'defaultpackage.custome.randomString'('letters', 9)

WebUI.setText(findTestObject('Reasearch Company profile elements/Name field'), 'TestingAuto' + dynamicname)

Updatedname = WebUI.getText(findTestObject('Reasearch Company profile elements/Name field'))

WebUI.click(findTestObject('Reasearch Company profile elements/Update Name button on udapte name modal'))

WebUI.verifyElementText(findTestObject('Reasearch Company profile elements/Company Name on company profile'), Updatedname)

