import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        /*
         * 1. Write a program that asks your name and prints “Hello your name” five
         * times. Use a loop.
         */

        // System.out.println("Enter your name please.. ");
        // String name=scan.nextLine();
        // int i;
        // for (i=0;i<5;i++){
        // System.out.println("Hello "+name);
        // }

        /*
         * 2. Write a program that displays the following table (note that 1 mile is
         * 1.609 kilometers):
         * 
         * Miles Kilometers
         * 
         * 1 1.609
         * 
         * 2 3.218
         * 
         * … ….
         * 
         * 9 14.481
         * 
         * 10 16.090
         */

        // float length=1.609f;
        // int i;
        // for(i=1;i<=10;i++){
        // System.out.println(i+"."+i*length);
        // }

        /*
         * . Write a program that generates the following table:
         * 
         * Number Square
         * 
         * 10 100
         * 
         * 9 81
         * 
         * .. ….2 4
         * 
         * 1 1
         */
        // int i;
        // for(i=10;i>=1;i--){
        // System.out.println(i+"   "+  i*i);
        // }

        /*Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:

          *****

          *****

          *****

          *****

          *****

 */

        // int i,j,k;

        // System.out.println("inter the width");
        // i=scan.nextInt();
        // for (k=1;k<=i;k++){
        //     for(j=1;j<=i;j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println("\n");          
        // }



        /*Modify the above program by using a do..while loop so that it provides the user with the option to continue running the program and enter more inputs. For example:

        Sample Run:
        Enter a positive non-zero integer 4
        Sum of 1 to 4 is 10
        Do you want to continue? Enter ‘y’ for yes or any other character for no.y
        Enter a positive non-zero integer 3
        Sum of 1 to 3 is 6
        Do you want to continue? Enter ‘y’ for yes and any other character for no.n. */

        // char choice='y';
        // do {
        //     int n, sum = 0;

        //     System.out.print("Enter a positive non-zero integer: ");
        //     n = scan.nextInt();

        //     if (n <= 0) {
        //         System.out.println("Please enter a positive non-zero integer.");
        //         continue;
        //     }

        //     for (int i = 1; i <= n; ++i) {
        //         sum += i;
        //     }

        //     System.out.println("Sum of 1 to " + n + " is " + sum);

        //     System.out.print("Do you want to continue? Enter 'y' for yes or any other character for no: ");
        //     choice = scan.next().charAt(0);

        // } while (choice == 'y' || choice == 'Y');


        /*6. Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is:

        *

        **

        ***

        ****

        ***** */

        System.out.println("enter the width: ");
        int i,j,k;
        i= scan.nextInt();
        for(j=1;j<=i;j++){
            for(k=1;k<=j;k++){
                System.out.print("*");
            }
            System.out.println("\n");
        }


        /*7. Write a program to calculate the HCF of Two given numbers. */

        // int i =scan.nextInt();
        // int j= scan.nextInt();
        



scan.close();
    }
}
