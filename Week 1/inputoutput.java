import java.util.Scanner;
public class inputoutput {
    public static void main(String[]args){
        /* print/output a line with line break
         * use "sout" shortcut 
         */
        // System.out.println("This prints and breaks line");
        // /*print the word without break line */
        // System.out.print("this will not break line");
        // System.out.print("this will continue");
        // /* output formatting 
        //  * System.out.printf();
        //  * %s String %d integer %f floating point ,%b boolean
        //  * this will not break line too        */
        // System.out.printf("the next word is %s", "new word");

        // /*you can use multiple formatter */
        // System.out.printf("the next int is", 10);
        // System.out.printf("multiple %f %b", 10.9f,false);

        /* user Input using Scanner
         * first import the Scanner class
         * import java.util.Scanner; //at the top of the file
         */
        // Scanner scan = new Scanner(System.in);// is used as input
        // System.out.println("THE FOLLOWING TAKES ONE WORD FROM SENTENCES");
        // String oneWord = scan.next();
        // System.out.println(oneWord);
        // System.out.println("THe following takes whole sentences");
        // String wholeSentence=scan.nextLine();
        // System.out.println(wholeSentence);
        // System.out.println("the following takes int");
        // int intInput=scan.nextInt();
        // System.out.println(intInput);
        // System.out.println("the following takes boolean");
        // boolean booleanInput=scan.nextBoolean();
        // System.out.println(booleanInput);
        // scan.close();

        /*task 
         * Create a new Scanner obj name scan1
         * Prompt user for the following 
         * WHat is your name? --> save to string  name, use nextLine()
         * Are you over 18 --> Save to boolean status , use nextBoolean()
         * how many siblings do you have? --> Save int sibling, use nextLine()
         * print the output 
         * HEllo ,name
         * Over 18 status      
         * you have no. of sibling  */

         Scanner scan1 = new Scanner(System.in);
         System.out.println("What is your name? ");
         String name1= scan1.nextLine();
         System.out.println("Hello " + name1);
         
         System.out.println("are you over 18? ");
         Boolean age1= scan1.nextBoolean();
         System.out.println("age status: ");
         
         System.out.println("how many sibling? ");
         int sibling1= scan1.nextInt();
         System.out.println("you have "+ sibling1+"no. of sibling");




         
      }
}