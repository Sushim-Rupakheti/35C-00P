import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        // int num1 = 0;
        // /* while checks the condition first */
        // while (num1 < 0) {
        //     System.out.println("this will not print since condition is false");
        // }

        // /*
        //  * do while checks the condition after the loop
        //  * meaning so while loop runs at least once even if condition is false
        //  */
        // do {
        //     System.out.println("do while will check condiotion after the statement");
        // } while (num1 < 0);

        /* use while loop to ask a user for a integer 
         * keep asking user for number unless the integer is negative
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the no.");
        int input=scan.nextInt();
        while(input>=0){
            System.out.println("enter negative number");
            input= scan.nextInt();
        }
        scan.close();
         
    }
}
