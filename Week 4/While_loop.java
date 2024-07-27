import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        /* while loop takes condition/boolean experssion inside() */
        int count=0;
        while(count<=5){
            System.out.println("while count "+count);
            count++;
        }

        /*Real use of while is used when no. of iteration is not fixed 
         * for eg, if you want to keep asking a user for input until desired condition
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the no.");
        int intValue=scan.nextInt();
        while(intValue<0 || intValue >100){
            System.out.println("Please enter no. (0-100)");
            intValue=scan.nextInt();
        }
        System.out.println("correct condition"+ intValue);
        scan.close();
    }
}
