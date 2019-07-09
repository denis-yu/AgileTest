package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


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
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            ENV = selectedVariables['ENV']
            FirstName = selectedVariables['FirstName']
            LastName = selectedVariables['LastName']
            Address = selectedVariables['Address']
            Tel = selectedVariables['Tel']
            City = selectedVariables['City']
            AutoEmail = selectedVariables['AutoEmail']
            i = selectedVariables['i']
            screenPath = selectedVariables['screenPath']
            stmPath = selectedVariables['stmPath']
            hbiPath = selectedVariables['hbiPath']
            dentalPath = selectedVariables['dentalPath']
            teladocPath = selectedVariables['teladocPath']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
