
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


def static "test.commons.isElementPresent"(
    	TestObject to	
     , 	int timeout	) {
    (new test.commons()).isElementPresent(
        	to
         , 	timeout)
}

def static "test.commons.selectNav"(
    	TestObject object	) {
    (new test.commons()).selectNav(
        	object)
}

def static "test.commons.click_JS"(
    	TestObject object	) {
    (new test.commons()).click_JS(
        	object)
}

def static "test.commons.click_JS_ByXpath"(
    	String str	) {
    (new test.commons()).click_JS_ByXpath(
        	str)
}

def static "test.commons.compareImage"() {
    (new test.commons()).compareImage()
}
