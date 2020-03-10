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
    public static Object i
     
    /**
     * <p></p>
     */
    public static Object screenPath
     
    /**
     * <p></p>
     */
    public static Object stmPath
     
    /**
     * <p></p>
     */
    public static Object hbiPath
     
    /**
     * <p></p>
     */
    public static Object dentalPath
     
    /**
     * <p></p>
     */
    public static Object teladocPath
     
    /**
     * <p></p>
     */
    public static Object HPPath
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['ENV' : 'https://praetemptatus.agilehealthinsurance.com', 'FirstName' : '', 'LastName' : '', 'Address' : '', 'Tel' : '', 'City' : '', 'AutoEmail' : '', 'i' : 0, 'screenPath' : '../Screenshots/', 'stmPath' : '../Screenshots/mobileWeb/stm/', 'hbiPath' : '../Screenshots/mobileWeb/hbi/', 'dentalPath' : '../Screenshots/mobileWeb/dental/', 'teladocPath' : '../Screenshots/mobileWeb/teladoc/', 'HPPath' : '../Screenshots/HP/'])
        allVariables.put('bondsmith', allVariables['default'] + ['ENV' : 'https://bondsmith.healthpocket.com', 'FirstName' : '', 'LastName' : '', 'Address' : '', 'Tel' : '', 'City' : '', 'AutoEmail' : '', 'i' : 0, 'screenPath' : '../Screenshots/', 'stmPath' : '../Screenshots/mobileWeb/stm/', 'hbiPath' : '../Screenshots/mobileWeb/hbi/', 'dentalPath' : '../Screenshots/mobileWeb/dental/', 'teladocPath' : '../Screenshots/mobileWeb/teladoc/', 'HPPath' : '../Screenshots/HP/'])
        allVariables.put('staging', allVariables['default'] + ['ENV' : 'https://staging.agilehealthinsurance.com'])
        allVariables.put('windrunner', allVariables['default'] + ['ENV' : 'https://windrunner.agilehealthinsurance.com', 'FirstName' : '', 'LastName' : '', 'Address' : '', 'City' : '', 'Tel' : '', 'AutoEmail' : ''])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        ENV = selectedVariables["ENV"]
        FirstName = selectedVariables["FirstName"]
        LastName = selectedVariables["LastName"]
        Address = selectedVariables["Address"]
        Tel = selectedVariables["Tel"]
        City = selectedVariables["City"]
        AutoEmail = selectedVariables["AutoEmail"]
        i = selectedVariables["i"]
        screenPath = selectedVariables["screenPath"]
        stmPath = selectedVariables["stmPath"]
        hbiPath = selectedVariables["hbiPath"]
        dentalPath = selectedVariables["dentalPath"]
        teladocPath = selectedVariables["teladocPath"]
        HPPath = selectedVariables["HPPath"]
        
    }
}
