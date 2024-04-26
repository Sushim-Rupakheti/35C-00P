import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        /*Write a program to check whether a person can cast a vote or not. 
        The condition is you must be over 18 years old to vote. */
        // Scanner myObject= new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age= myObject.nextInt();
        // if (age>18){
        //     System.out.println("You can cast vote");
        // }else{
        //     System.out.println("You cannot cast vote");
        // }


        /*Write a program to calculate SI. 
        Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */
        // Scanner scan1 = new Scanner(System.in);
        // System.out.println("What is your principle amount? ");
        // int principle= scan1.nextInt();
        
        // System.out.println("waht is your time");
        // int time= scan1.nextInt();

        // System.out.println("what is your rate");
        // int rate= scan1.nextInt();
        
        // float SI=(principle*time*rate)/100;
        // System.out.println("SI= "+SI);


        /*Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.

            Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */

        Scanner scan1 = new Scanner(System.in);
        // System.out.println("What is the base of triangle");
        // int base= scan1.nextInt();
        
        // System.out.println("waht is the height of triangle");
        // int height= scan1.nextInt();

        // float triangle=(base*height)/2;
        // System.out.println("the area of triangle is "+ triangle);

        // System.out.println("what is length of cube");
        // int length= scan1.nextInt();
        
        // double cube= Math.pow(length, 3);
        // System.out.println("volume is "+cube);

        // System.out.println("what is length of cuboid");
        // int length1=scan1.nextInt();
        // System.out.println("what is breadth of cuboid");
        // int breadth1=scan1.nextInt();
        // System.out.println("what is heigth of cuboid");
        // int height1=scan1.nextInt();
        // int cuboid= length1*breadth1*height1;
        // System.out.println("volume of cuboid is "+ cuboid);

        /*4. Write the ternary operator for question no. 1 */
        // System.out.println("what is your age");
        // int age1=scan1.nextInt();
        // System.out.println(age1>18?"YOU CAN VOTE":"YOU CANNOT VOTE");


       /* Write a program to take two integer inputs from the user and print the sum and product of them*/
    //    System.out.println("enter two numbers");
    //    int num1=scan1.nextInt();
    //    int num2=scan1.nextInt();
    //    int sum=num1+num2;
    //    System.out.println("sum is "+sum);
    //    int product=num1*num2;
    //    System.out.println("product is "+product);

    /*Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally, 
    calculate the division of the thus obtained sum and product and print the result. */
    //    System.out.println("enter two numbers");
    //    int num1=scan1.nextInt();
    //    int num2=scan1.nextInt();
    //    double sum=num1+num2;
    //    System.out.println("sum is "+sum);
    //    double product=num1*num2;
    //    System.out.println("product is "+product);
    //    double division1=sum/product;
    //    System.out.println("division is "+ division1 );

       /*Take the name, roll number, and field of interest from the user and print in the format below:
        Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */

        // System.out.println("enter your name");
        // String name1=scan1.nextLine();
        // System.out.println("enter your roll");
        // int roll1=scan1.nextInt();
        // scan1.nextLine();
        // System.out.println("enter your field of interest");
        // String field=scan1.nextLine();
        // System.out.println("Hey, my name is "+name1+"and my roll number is "+roll1+". My field of interest are "+field+".");


            /*10. Write a program to calculate the total marks of four subjects of a student 
            and the total percentage secured. And use the following conditions to generate the final result;

            a. If equal to or more than 70 -> First Class

            b. If more than 59 -> Upper Second Class

            c. If more than 49 -> Second class

            d. If more than 39 -> Third class and if below than 40 the result is fail. 

            Hint: Use ternary operator */

        int math=78;
        int social=91;
        int eng=81;
        int computer=91;
        int total=math+social+eng+computer;
        float percent=total/4;
        String output = percent > 70 ? "first class" : 
            percent > 60 ? "second class" : 
            percent > 50 ? "third class" :
            percent > 40 ? "fourth class" :
            "fail";
        System.out.println(output);



    }
}
