
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject


def static "WriteExcel.writeToOneExcel"(
    	int mapdN	
     , 	String mapdP	
     , 	int pdN	
     , 	String pdP	
     , 	String file	
     , 	int i	) {
    (new WriteExcel()).writeToOneExcel(
        	mapdN
         , 	mapdP
         , 	pdN
         , 	pdP
         , 	file
         , 	i)
}

def static "WriteExcel.writeToExcel"(
    	String stmNumber	
     , 	int i	) {
    (new WriteExcel()).writeToExcel(
        	stmNumber
         , 	i)
}

def static "WriteExcel.writeToExcelByCol"(
    	String str	
     , 	int col	
     , 	int ro	) {
    (new WriteExcel()).writeToExcelByCol(
        	str
         , 	col
         , 	ro)
}

def static "WriteExcel.writeContext"(
    	String context	) {
    (new WriteExcel()).writeContext(
        	context)
}

def static "MobileKeywords.refreshBrowser"() {
    (new MobileKeywords()).refreshBrowser()
}

def static "MobileKeywords.clickElement"(
    	TestObject to	) {
    (new MobileKeywords()).clickElement(
        	to)
}

def static "MobileKeywords.clickJS"(
    	TestObject to	) {
    (new MobileKeywords()).clickJS(
        	to)
}

def static "MobileKeywords.clickJS_ByXpath"(
    	String xpath	) {
    (new MobileKeywords()).clickJS_ByXpath(
        	xpath)
}

def static "MobileKeywords.clickActionByXpath"(
    	String xpath	) {
    (new MobileKeywords()).clickActionByXpath(
        	xpath)
}

def static "MobileKeywords.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new MobileKeywords()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "MobileKeywords.isElementPresent_Mobile"(
    	TestObject to	
     , 	int timeout	) {
    (new MobileKeywords()).isElementPresent_Mobile(
        	to
         , 	timeout)
}

def static "MobileKeywords.isElementPresent_Web"(
    	TestObject to	
     , 	int timeout	) {
    (new MobileKeywords()).isElementPresent_Web(
        	to
         , 	timeout)
}

def static "MobileKeywords.getCurrentSessionMobileDriver"() {
    (new MobileKeywords()).getCurrentSessionMobileDriver()
}
