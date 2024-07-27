import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        // char value = 'a';
        // int numVal = 10;
        // switch (value) {
        // case 'a':
        // // nested Switch
        // switch (numVal) {
        // case 10:
        // System.out.println("10");
        // break;
        // default:
        // break;
        // }
        // System.out.println("apple");
        // break;
        // case 'b':
        // System.out.println("ball");
        // break;
        // case 'c':
        // System.out.println("cat");
        // break;
        // case 'd':
        // System.out.println("don");
        // break;
        // default:
        // System.out.println("no word found");
        // break;
        // }

        /*
         * task
         * consider the variable week in int
         * if the value is
         * 0-print sunday
         * 1-monday
         * 2-tuesday
         * 3-wednesday
         * 4-thursday
         * 5-friday
         * 6-saturday
         * if the value is unmentioned then print invalid week
         * 
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("enter");
        String weekday = scan.nextLine();
        System.out.println("enter");
        int time=scan.nextInt();
        /* Check the weekday in switch */
        switch (weekday) {
            case "0":
                System.out.println("sunday");
                switch(time){
                    case 1:
                    System.out.println("hi");
                    break;
                    case 9:
                    System.out.println("hello");
                    break;
                }
                break;
            case "1":
                System.out.println("monday");
                break;
            case "2":
                System.out.println("tuesday");
                break;
            case "3":
                System.out.println("wednesday");
                break;
            case "4":
                System.out.println("thursday");
                break;
            case "5":
                System.out.println("friday");
                break;
            case "6":
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid");
                break;
        }

    }
}