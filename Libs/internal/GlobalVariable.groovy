package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object ENV
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['ENV' : 'https://praetemptatus.agilehealthinsurance.com'])
        allVariables.put('staging', allVariables['default'] + ['ENV' : 'https://staging.agilehealthinsurance.com'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        ENV = selectedVariables['ENV']
        
    }
}
