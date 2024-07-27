public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Program Start");
        int num1=10;
        try{
        int num2=20/0; // Arthimetic exception - should exit here 
        }catch(ArithmeticException ex){
            System.out.println("Cannot divide the no.s");
        }finally{
            System.out.println("Runs no matter what");
        }
        //ArrayIndexOutOfBound
        int[] arrNum= new int[4];
        arrNum[0]=10;
        try{
        arrNum[100]=300;   //ArrayIndexOutOfBound exception -exists here
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array too small");
        }

        // NullPointer Exception
        String data= null;
        try{
        System.out.println(data.length());    //NullPointer exception-exists here
        }catch(NullPointerException ex){
            System.out.println("please enter anything,theere exists null data");
        }

        //Nestded try block
        try{
            int t1= 10/0;
            String d1=null;
            System.out.println(d1.length());
        }catch(ArithmeticException ex){
            System.out.println("number error");
        }catch(NullPointerException ex){
            System.out.println("NUll aayo");
        }finally{
            System.out.println("try block end");
        }
        //Execption 
        try{
            String d2=null;
            System.out.println(d2.length());
            int t2=10/0;
        }catch(Exception ex){
            System.out.println("catches any exception ");
        }

         // Task
        // Find the exception and use try block finally accordingly
        // int number1 = 10;
        // int number2 = number1 - 10;
        // int number3 = number1 / number2;
        // String name;
        // System.out.println(name.length());
        // String[] names = new String[100];
        // names[0] = "Ram";
        // names[110] = "Ankit";
        //
        try{
        int number1 = 10;
        int number2 = number1 - 10;
        int number3 = number1 / number2;
        String name=null;
        System.out.println(name.length());
        String[] names = new String[100];
        names[0] = "Ram";
        names[110] = "Ankit";
        }catch(ArithmeticException ex){
            System.out.println("invalid arthemetic logic");
        }catch(NullPointerException ex){
            System.out.println("null value");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("array out of bound ");
        }finally{
            System.out.println("task sakkyo");
        }

        System.out.println("program end");

    }
}
