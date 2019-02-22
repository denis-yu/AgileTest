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
     
    /**
     * <p></p>
     */
    public static Object FirstName
     
    /**
     * <p></p>
     */
    public static Object LastName
     
    /**
     * <p></p>
     */
    public static Object Address
     
    /**
     * <p></p>
     */
    public static Object Tel
     
    /**
     * <p></p>
     */
    public static Object City
     
    /**
     * <p></p>
     */
    public static Object AutoEmail
     
    /**
     * <p></p>
     */
    public static Object path
     
    /**
     * <p></p>
     */
    public static Object i
     
    /**
     * <p></p>
     */
    public static Object screenPath
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['ENV' : 'https://praetemptatus.agilehealthinsurance.com', 'FirstName' : '', 'LastName' : '', 'Address' : '', 'Tel' : '', 'City' : '', 'AutoEmail' : '', 'path' : './Screenshots', 'i' : 0, 'screenPath' : './Screenshots'])
        allVariables.put('staging', allVariables['default'] + ['ENV' : 'https://staging.agilehealthinsurance.com'])
        allVariables.put('windrunner', allVariables['default'] + ['ENV' : 'https://windrunner.agilehealthinsurance.com', 'FirstName' : '', 'LastName' : '', 'Address' : '', 'City' : '', 'Tel' : '', 'AutoEmail' : ''])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        ENV = selectedVariables['ENV']
        FirstName = selectedVariables['FirstName']
        LastName = selectedVariables['LastName']
        Address = selectedVariables['Address']
        Tel = selectedVariables['Tel']
        City = selectedVariables['City']
        AutoEmail = selectedVariables['AutoEmail']
        path = selectedVariables['path']
        i = selectedVariables['i']
        screenPath = selectedVariables['screenPath']
        
    }
}
