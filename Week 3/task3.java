import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan2 = new Scanner(System.in);
        /* Write a JAVA program to find the maximum between three numbers. */

        // System.out.println("what are the three numbers?");
        // int a = scan2.nextInt();
        // int b = scan2.nextInt();
        // int c = scan2.nextInt();
        // if ((a > b) && (a > c)) {
        //     System.out.printf("%d is greatest", a);
        // } else if ((b > a) && (b > c)) {
        //     System.out.printf("%d is greatest", b);
        // } else {
        //     System.out.printf("%d is greatest", c);
        // }

        /*
         * 2. Write a JAVA program to check whether a number is negative, positive, or
         * zero.
         */
        // System.out.println("what is the number?");
        // int a = scan2.nextInt();
        // if (a > 0) {
        //     System.out.printf("%d is positive",a);
        // }else if (a<0) {
        //     System.out.printf("%d is negative",a);
        // }else{
        //     System.out.printf("%d is neutral",a);
        // }


        /*3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */
        // System.out.println("enter the number");
        // int a =scan2.nextInt();
        // if ((a%5==0)&&(a%11==0)) {
        //     System.out.println("it is divisible by 5 and 11");
        // } else {
        //     System.out.println("it is not divisible by 5 and 11");
        // }


        /*4. Write a JAVA program to check whether a number is even or odd. */
        // System.out.println("enter the number");
        // int a =scan2.nextInt();
        // if (a%2==0) {
        //     System.out.println("it is even");
        // } else {
        //     System.out.println("it is odd");
        // }

        /*5. Write a JAVA program to check whether a year is a leap year or not.  */
        // System.out.println("enter the year");
        // int year =scan2.nextInt();
        // if ((year%4==0)&&(year%100!=0)&&(year%400==0)) {
        //     System.out.println("it is a leap year");
        // } else {
        //     System.out.println("it is not a leap year");
        // }

        /* 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.*/
        // System.out.print("Enter an alphabet: ");
        // char ch = scan2.next().charAt(0); 
        // if (Character.isLetter(ch)) {
        //     ch = Character.toLowerCase(ch);
        //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //         System.out.println(ch + " is a vowel.");
        //     } else {
        //         System.out.println(ch + " is a consonant.");
        //     }
        // } else {
        //     System.out.println("Invalid input. Please enter an alphabet.");
        // }

        /*1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) 
        and converts it to the corresponding GPA value. 
        Use a switch case statement to handle different grades. */

        // System.out.print("Enter the student's grade (A, B, C, D, or F): ");
        // char grade = scan2.next().charAt(0);
        // double gpa;
        // switch (grade) {
        //     case 'A':
        //     case 'a':
        //         gpa = 4.0;
        //         break;
        //     case 'B':
        //     case 'b':
        //         gpa = 3.0;
        //         break;
        //     case 'C':
        //     case 'c':
        //         gpa = 2.0;
        //         break;
        //     case 'D':
        //     case 'd':
        //         gpa = 1.0;
        //         break;
        //     case 'F':
        //     case 'f':
        //         gpa = 0.0;
        //         break;
        //     default:
        //         System.out.println("Invalid grade entered.");
        //         return;
        // }
        // System.out.println("GPA for grade " + grade + " is: " + gpa);
    
        /*2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs 
        and performs the corresponding arithmetic operation using a switch case statement. */
        // System.out.println("Enter the numbers");
        // int a=scan2.nextInt();
        // int b=scan2.nextInt();
        // System.out.println("enter the operator:");
        // char sign = scan2.next().charAt(0);
        // double calculation ;
        // switch(sign){
        //     case '+':
        //     calculation=a+b;
        //     System.out.println("sum is "+calculation);
        //     break;
        //     case '-':
        //     calculation=a-b;
        //     System.out.println("difference is "+calculation);
        //     break;
        //     case '*':
        //     calculation=a*b;
        //     System.out.println("multiplication is "+calculation);
        //     break;
        //     case '/':
        //     calculation=a/b;
        //     System.out.println("division is "+calculation);
        //     break;
        //     default:
        //     System.out.println("invalid operator");
        // }

        /*3. Write a Java program that takes an integer input (1 to 12) representing a month
         and prints the corresponding season  
        (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case.*/
                // System.out.print("Enter the student's grade (A, B, C, D, or F): ");
        // System.out.println("enter the month (1-12)");
        // int month = scan2.nextInt();
        // switch (month) {
        //     case 1:
        //     case 2:
        //     case 3:
        //         System.out.println("Winter");;
        //         break;
        //     case 4:
        //     case 5:
        //     case 6:
        //         System.out.println("Spring");
        //         break;
        //     case 7:
        //     case 8:
        //     case 9:
        //         System.out.println("Summer");
        //         break;
        //     case 10:
        //     case 11:
        //     case 12:
        //         System.out.println("Fall");
        //         break;
        //     default:
        //         System.out.println("Invalid month entered.");
        //         return;
        // }

        /*4. Implement a Java program that calculates the area of different shapes
         (circle, rectangle, square, triangle) based on the user's choice using a switch case.*/

         System.out.println("Enter the numer of shape whose area is to be calculatedas given below");
         System.out.println("1. Circle");
         System.out.println("2. Rectangle");
         System.out.println("3. Square");
         System.out.println("4. Triangle");
         int shape=scan2.nextInt();
         double area;
         switch(shape) {
            case 1:
                System.out.println("you choosed Circle");
                System.out.println("enter  the radius :");
                int r=scan2.nextInt();
                area=r*(22/7);
                break;
            case 2:
                System.out.println("you choosed Rectangle");
                System.out.println("enter the length");
                int l= scan2.nextInt();
                System.out.println("Enter the breadth");
                int b=scan2.nextInt();
                area=l*b;
                break;
            case 3:
                System.out.println("you choosed Rectangle");
                System.out.println("enter the length");
                int L= scan2.nextInt();
                area=L*L;
                break;
            case 4:
                System.out.println("you choosed Triangle");
                System.out.println("enter the base");
                int B= scan2.nextInt();
                System.out.println("enter the height");
                int H=scan2.nextInt();
                area=(B*H)/2;
                break;
            default:
                System.out.println("Invalid shape number entered.");
                return;
         }
         System.out.println("Area is: "+area);


    }
    }

