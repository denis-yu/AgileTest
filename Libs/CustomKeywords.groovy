
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


def static "test.MobileKeywords.refreshBrowser"() {
    (new test.MobileKeywords()).refreshBrowser()
}

def static "test.MobileKeywords.clickElement"(
    	TestObject to	) {
    (new test.MobileKeywords()).clickElement(
        	to)
}

def static "test.MobileKeywords.clickJS"(
    	TestObject to	) {
    (new test.MobileKeywords()).clickJS(
        	to)
}

def static "test.MobileKeywords.clickJS_ByXpath"(
    	String xpath	) {
    (new test.MobileKeywords()).clickJS_ByXpath(
        	xpath)
}

def static "test.MobileKeywords.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new test.MobileKeywords()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "test.MobileKeywords.isElementPresent_Mobile"(
    	TestObject to	
     , 	int timeout	) {
    (new test.MobileKeywords()).isElementPresent_Mobile(
        	to
         , 	timeout)
}

def static "test.MobileKeywords.isElementPresent_Web"(
    	TestObject to	
     , 	int timeout	) {
    (new test.MobileKeywords()).isElementPresent_Web(
        	to
         , 	timeout)
}

def static "test.MobileKeywords.getCurrentSessionMobileDriver"() {
    (new test.MobileKeywords()).getCurrentSessionMobileDriver()
}

def static "test.WriteExcel.writeToExcel"(
    	String stmNumber	) {
    (new test.WriteExcel()).writeToExcel(
        	stmNumber)
}

def static "test.WriteExcel.writeToExcelByCol"(
    	String str	
     , 	int col	
     , 	int ro	) {
    (new test.WriteExcel()).writeToExcelByCol(
        	str
         , 	col
         , 	ro)
}

def static "test.WriteExcel.writeContext"(
    	String context	) {
    (new test.WriteExcel()).writeContext(
        	context)
}
