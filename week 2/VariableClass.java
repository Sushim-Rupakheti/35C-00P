public class VariableClass{
    /*instance variable 
     * Needs object to acess
     * not shared in multiple object
    */
    int instanceVariable =10;
    /*static variable 
     * no need objects, can be accessed using Class
     * shared in multple
    */
    public static void main(String[] args) {
    /* Non primitive data type/
    /* Declaration */
    byte byteVariable;
    /* Initialization */
    byteVariable= 100;
    /* Declaration and initialization */
    short  shortVariable = 1000;
    /* Multiple Declaration */
    int intVariable1, intVariable2;
    /* Initialization */
    intVariable1=10;
    intVariable2=-10;
    /* Multiple Declaration and Initialization */
    long longVariable1=100000;
    long longVariable2=-199999;
    float floatVariable= 1.89f; //the letter 'f' is required
    double doubleVariable= 189.8932d; //'d' is optional
    char charVariable='c'; //singleletter enclosed in single quotation
    boolean booleanVariable=true;//small case true/false
/*Illegal actions */
// byte byteVariable=20; //cannot redeclare a variable
//byteVariable=30; //instead use ressignment
//boolean boolVar2 ='false'; //should match the exact min or max
/* Non -primitive data type */ 
String stringVariable ="this is a string"; //use doubl quatation
/* Or use the Class */
String stringVariable2=new String(original:"String using class");
/* Class/Object */
VariableClass variableObject = new VariableClass();
/*Use the same class Name as specified in public class<ClassName> */
/* can access static variable with Class /no object needed */
System.out.println(VariableClass.staticVariable);

/* Type casting */
int intVariableConvert=10;
double intVariableConvert=10;
double intVariableConvertToVariable= intVariableConvert;
/*Explict casting */
double doubleVariableConvert=100.20;
int doubleVariableConvertToInt= (int) doubleVariableConvert;

}

