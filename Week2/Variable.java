package Week2;
/*Task 1 */
public class Variable {
    /*Instance Variable
     * Will need object to access this variable
     * Not shared between the object 
    */

     int instanceVariable = 100;
    /*Static/Class Variable 
     * No need of object, can be called from class
     *Shared between the objects 
    */
    static int staticVariable = 20;
    public static void main(String[] args) {
        /*Non-Primitive data type */
        /*Declaration */
        byte byteValue;
        /*Initialization */
        byteValue=100;
        System.out.println(byteValue);
        /*Declaration and Initialization */
        short shortValue = 200;
        System.out.println(shortValue);
        /*Multiple Declaration */
        int intValue1, intValue2;
        intValue1 = 10000;
        intValue2 = 2000;
        System.out.println(intValue1);
        System.out.println(intValue2);
        /*Multiple Declaration and initialization */
        long longVal1 = -9000, longVal2 = 9000;
        System.out.println(longVal1);
        System.out.println(longVal2);
        float floatValue = 90.90f; //the letter 'f' is needed
        System.out.println(floatValue);
        double doubleValue = 100.807d; //the letter 'd' is optional
        System.out.println(doubleValue);
        char charValue = 'c'; //Must use single quote '
        System.out.println(charValue);
        boolean booleanValue = false;
        System.out.println(booleanValue);
        /*Illegal Actions below */
        // byte byteValue = 100; //We cannot redeclare the variable
        //byteValue =200; //instead use reassignment 
        //boolean boolVal2 = 'false'; //cannot use different type
        //byte byteValue2 = 100000000; //cannot exceed min and max

        /*Non Primitive Data Type */
        String stringValue = "This is a string Value";
        System.out.println(stringValue);
        /*Using Class */
        String stringValue2 = new String("This string uses Class.");
        System.out.println(stringValue2);
        /*Object, for this we can use the same public class made */
        Variable variableObject = new Variable();
        /*Use object from above to access instance variable */
        System.out.println(variableObject.instanceVariable);
        /*Use Class to use static variable */
        System.out.println(Variable.staticVariable);

        /*Type casting */
        int intValueType = 100;
        double intValueConvertedToDouble = intValueType;
        System.out.println(intValueConvertedToDouble);
        /*Automatically castv from low datatype to high datatype */

        /*Explicit Casting  */
        double doubleValueType = 190.8109;
        int doubleValueConvertedToInt = (int) doubleValueType;
        System.out.println(doubleValueConvertedToInt);
        /*Manually specify data type for eg. (int) */
        /*Note this type cast can only be done in primitive data type */
        /*Task
         * Make one double variable called doubleVar1 = 1000.12
         * Explicitly cast the variable into float, floatVar1
         * Explicitly cast the floatVar1 into int, intVar1
         * Make a string Variable with "The integer is"
         * Print the string Variable and print the int variable in another 
         */
        double doubleVar2 = 1000.12;
        float floatVar2 = (float) doubleVar2;
        int intVar2 = (int) floatVar2;
        System.out.print("The integer is ");
        System.err.print(intVar2);
    }
    
}
