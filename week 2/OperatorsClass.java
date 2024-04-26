public class OperatorsClass {
    public static void main(String[] args) {
        /* arithematic operatos */
        int a = 10, b = 20;
        int sum = a + b; // here + is an arithematic operatos
        System.out.println("the sum is " + sum);
        System.out.println("the diff is " + (a - b));
        System.out.println("the division is " + (a / b));
        System.out.println("the modulo is " + (a % b));

        /* assignment operatos */
        // assignment and declaration//
        int num1 = 10;
        int num2;
        /* after declaration */
        num2 = 20;
        /* assihn vakue using += */
        System.out.println("num2 after using += is " + (num2 += 10));
        /* assign value using *= */
        num2 *= 100; // this is same as doing num2 =num2 *100//
        System.out.println("num2 after using += is " + num2);


        /*relational operators */
         int rNumber1 = 9, rNumber2 = 20;
         System.out.println("Is rNumber1 equals to rNumber2 ?    " + (rNumber1 == rNumber2));
         System.out.println("Is rNumber1 less then rNumber2 ?    " + (rNumber1 < rNumber2));
         System.out.println("Is rNumber1 greater or equals to rNumber2?    " + (rNumber1 >= rNumber2));
         System.out.println("Is rNUmber1 and rNumber2 not equals to rNumber2?    " + (rNumber1 != rNumber2));
    
         /*  logical operatos */ 
        int lNumber1=20, lNumber2=22;
        boolean expression1 =lNumber1 == lNumber2;
        boolean expression2 =lNumber1 > lNumber2;
        System.out.println("And expression usin &&" + (expression1 && expression2));
        System.out.println("or expression usin ||" + (expression1 || expression2));
        System.out.println("not expression usin !" + (! expression2));

        /*unary operatos */
        int uNumber1=10;
        uNumber1++;//same as uNumber==uNumber+1// 
        System.out.println("unary operatos usin ++" + uNumber1);
        uNumber1--;//same as uNumber==uNumber-1// 
        System.out.println("unary operatos usin --" + uNumber1);


        /* ternary operatos */
        int tNumber1=20, tNumber2=20;
        boolean texpression1= tNumber1==tNumber2;
        /*for ternary , first ypou define expression ,if expression is true, it returns false and vice versa */
        /*syntax
         * expression ? true statement : false statement
         */
        String output= texpression1 ? "True Condition" : "False Condition";
        /*further be seen as
         * string output;
         * if(texpression1){
         * output="true condition";
         * }esle{
         * output="false condition";
         * }
        */
        int numberoutput=tNumber2>tNumber2 ? 10:20;
        System.out.println(output);
        }
}