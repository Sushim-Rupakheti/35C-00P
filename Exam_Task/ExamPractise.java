import java.util.Scanner;

// public class ExamPractise {
//     public static void main(String[] args) {
//         // Scanner scan = new Scanner(System.in);
//         // System.out.print("Enter 1st num ; ");
//         // int num1 = scan.nextInt();
//         // System.out.print("Enter 2nd num ; ");
//         // int num2 = scan.nextInt();
//         // int sum=num1+num2;
//         // System.out.println("sum is "+sum);
//         // scan.close(); // Closing the Scanner object

//         // Scanner scan1 = new Scanner(System.in);
//         // System.out.println("enter your name");
//         // String name1=scan1.nextLine();
//         // System.out.println("enter your roll");
//         // int roll1=scan1.nextInt();
//         // scan1.nextLine();
//         // System.out.println("enter your field of interest");
//         // String field=scan1.nextLine();
//         // System.out.println("Hey, my name is "+name1+"and my roll number is "+roll1+". My field of interest are "+field+".");
//         // scan1.close();
        

//     //     Scanner scan1 = new Scanner(System.in);
//     //     System.out.println("enter the alphabet");
//     //     char ch=scan1.next().charAt(0);
//     //     if(Character.isLetter(ch)){
//     //         ch=Character.toLowerCase(ch);
//     //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {        
//     //         System.out.println("vowel");
//     //     }else{
//     //         System.out.println("consonent");
//     //     }
//     //     scan1.close();
//     // }else{
//     //     System.out.println("invalid input");
//     // }



//     // for(int i=1;i<=5;i++){
//     //     for(int j=1;j<=i;j++){
//     //     System.out.print(j);
//     //     System.out.print(" ");
//     // }
//     //     System.out.println("");}




//             // int i = 1;
//             // while (i <= 5) {
//             //     int j = 1; // Reset j for each iteration of the outer loop
//             //     while (j <= i) {
//             //         System.out.print(j);
//             //         j++; // Increment j
//             //     }
//             //     System.out.println("");
//             //     i++; // Increment i
//             // }


//     //     Scanner scan1 = new Scanner(System.in);
//     //     int width=scan1.nextInt();
//     //     for(int i=1;i<=width;i++){
//     //         for(int j=1;j<=width;j++){
//     //         System.out.print("i");
//     //     }
//     // System.out.println("");
//     // }
//     //     scan1.close();

    
//     // Scanner scan = new Scanner(System.in);

//     //    char choice='y';
//     //     do {
//     //         int n, sum = 0;

//     //         System.out.print("Enter a positive non-zero integer: ");
//     //         n = scan.nextInt();

//     //         if (n <= 0) {
//     //             System.out.println("Please enter a positive non-zero integer.");
//     //             continue;
//     //         }

//     //         for (int i = 1; i <= n; ++i) {
//     //             sum += i;
//     //         }

//     //         System.out.println("Sum of 1 to " + n + " is " + sum);

//     //         System.out.print("Do you want to continue? Enter 'y' for yes or any other character for no: ");
//     //         choice = scan.next().charAt(0);

//     //     } while (choice == 'y' || choice == 'Y');
//     //     scan.close();


//         Scanner scan1 = new Scanner(System.in);
//         int num=scan1.nextInt();
//         String rev;
        
//         for(int i=1;i<=a;i++){
//             rev
//         }
    
//         }
//     }

// import java.util.Scanner;

// public class ExamPractise{
// public static void printMyName(String name){
//     System.out.println("My name is "+name);
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     String name=sc.next();
//     printMyName(name);
// }
// }



// public class ExamPractise{
// public static int printSum(int n1,int n2){
//     int sum=n1+n2;
//     return sum;
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter 1st num");
//     int n1=sc.nextInt();
//     System.out.println("enter 2nd num");
//     int n2=sc.nextInt();
//     int sum =printSum(n1,n2);
//     System.out.println("Sum is "+sum);
//     sc.close();
// }
// }


//public class ExamPractise{
    // public static void  calculateProduct(int a,int b){
    //     int product=a*b;
    //     System.out.println("Product is "+product);
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the two numbers");
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     calculateProduct(a, b);
    //     sc.close();

 //   }
//}
// import java.util.Scanner;
// public class ExamPractise{
//     public static void checkOddEven(int a){
//         if(a%2==0){
//             System.out.println(a+" is even");
//         }else{
//             System.out.println(a+" is odd");       
//     }

//         }
    
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int a=sc.nextInt();
//         checkOddEven(a);
//         sc.close();
//     }
// }


// public class ExamPractise{
//     public static void main(String[] args) {
//     int arr[];
//     arr = new int[3];
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the legth of array");
//     int length=sc.nextInt();
//     for(int i=0;i<length;i++){
//         System.out.println("enter the num "+i);
//         arr[i]=sc.nextInt();
//     }
//     for(int i=0;i<length;i++){
//         System.out.println("Value in index "+i+" is "+arr[i]);
//     }
//     }
// }


// public class ExamPractise{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int arr[][]=new int[2][2];
//         for(int i=0;i<2;i++){
//             for(int j=0;j<2;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<2;i++){
//             for(int j=0;j<2;j++){
//         System.out.print(arr[i][j]);
//         System.out.print(" ");
        
//     }
// System.out.println("");
// }}}

// import java.util.ArrayList;
// public class ExamPractise{
//     public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter the length of array: ");
    //     int length=sc.nextInt();
    //     int[] myArray=new int[length];
    //     for(int i=0;i<length;i++){
    //         System.out.print("Enter the value of array"+i+": ");
    //         myArray[i]=sc.nextInt();
    //     }
    //     for(int i=0;i<length;i++){
    //         if (myArray[i]==3){
    //             System.out.println("the no. 3 is in index "+i);
    //         }
    //     }
    //     System.out.println("");
    // ArrayList<String> animal=new ArrayList<>();
    // animal.add("cow");
    // animal.add("dog");
    // animal.add("cow");
    // System.out.println(animal);
    // animal.remove(0);
    // System.out.println(animal);
    // animal.add(0,"frog");
    // System.out.println(animal);
    // System.out.println("at index 0 is "+animal.get(0));

    
        /*make an arrayList of int 
         * with values [100,200,300,400,500]
         * remove the value 500
         * add -100 at the first
         * update 300 to 350
         * update 400 to 420
         * Print the araaylist
        */

    // ArrayList<Integer> numbers=new ArrayList<>();
    // numbers.add(100);
    // numbers.add(200);
    // numbers.add(300);
    // numbers.add(400);
    // numbers.add(500);
    // numbers.remove( 4);
    // System.out.println(numbers);
    // numbers.add(0,-100);
    // System.out.println(numbers);
    // numbers.set(2, 350);
    // System.out.println(numbers);
    // numbers.set(3,450);
    // System.out.println(numbers);

    // ArrayList<Integer> numbers = new ArrayList<>();
    // numbers.add(1);
    // numbers.add(2);
    // System.out.println(numbers);

    


// public class ExamPractise{
// public static void main(String[] args) {
//     myCar c1 =new myCar();
//     c1.carID=23455;
//     c1.brand="BMW";
//     c1.price=23.45f;
//     c1.displayID();
//     c1.displayBrand();
//     c1.Showprice();

// }
// }

// class myCar{
//     int carID;
//     String brand;
//     float price;
    

//     int displayID(){
//         System.out.println(carID+" is the car ID");
//         return 1;
//     }
//     void displayBrand(){
//         System.out.println(brand+" is popular.");
//     }
//     void Showprice(){
//         System.out.println("It's price is "+price);
//     }
// } 


// public class ExamPractise{
//     public static void main(String[] args) {
//         CalulationRectangle c1 =new CalulationRectangle();
//         c1.length=34.6;
//         c1.breadth=54.9;
//         c1.CalcArea();
//         c1.CalcPerimeter();
//     }
// }

// class CalulationRectangle{
//     double length;
//     double breadth; 

//     double CalcPerimeter(){
//         double peri=2*(length+breadth);
//         System.out.println(peri+" is the perimeter");
//         return peri;
//     }
//     double CalcArea(){
//         double are=length*breadth;
//         System.out.println(are+" is the area");
//         return are;
//     }
// }





// public class ExamPractise{
//     public static void main(String[] args) {
//         MyEmployee m1=new MyEmployee();
//         m1.setId(23);
//         m1.setName("ram");
//         System.out.println("ID is: "+m1.getId());
//         System.out.println("Name is: "+m1.getName());
        
//     }}

// class MyEmployee{
//     private int id;
//     private String name;

//     public int getId(){
//         return id;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setId(int i){
//         this.id=i;
//     }
//     public void setName(String n){
//         this.name=n;
//     }
// }



// public class ExamPractise{
//     public static void main(String[] args) {

//         Mycar c1= new Mycar();
//         c1.setId(23);
//         c1.setName("BMW");
//         System.out.println(c1.getId()+" is "+c1.getName());
//     }}





// class Mycar{
//     private int Id;
//     private String name;

//     public void setId(int i){
//         Id=i;
//     }
//     public int getId(){
//         return Id;
//     }

//     public void setName(String n){
//         name= n;
//     }
//     public String getName(){
//         return name;
//     }
// }


// public class ExamPractise{
//     public static void main(String[] args) {
//     Student s1= new Student();
//     s1.name="ram";
//     s1.ID=23;
//     s1.gpa=8.9;
//     s1.printProfile();
//     s1.updateGpa(23);
//     }
// }

// class Student{
//     int ID;
//     String name;
//     double gpa;

//     public void updateGpa(double newGpa){
//         this.gpa=newGpa;
//         System.out.println("Updated GPA= "+newGpa);
//     }

//     public void printProfile(){
//         System.out.println("Id= "+ID);
//         System.out.println("Name= "+name);
//         System.out.println("Previous GPA= "+gpa);
//     }
// }


// public class ExamPractise{
//     public static void main(String[] args) {
//     BankAccount b1= new BankAccount();
//     b1.acName="ram";
//     b1.acNumber=123445;
//     b1.balance=10500;
//     b1.deposit(5000);
//     b1.withdraw(3000);
//     b1.CheckBalance1();
//     }
// }

// class BankAccount{
//     int acNumber;
//     String acName;
//     double balance;

//     public BankAccount(){}

//     public void deposit(double DepositAmnt){
//         balance=balance+DepositAmnt;
//         System.out.println("deposited amount: "+DepositAmnt);
//         System.out.println("your new balance is: "+balance);
//     }

//     public void withdraw(double WithdrawAmnt){
//         balance=balance-WithdrawAmnt;
//         System.out.println("Withdraw amount: "+WithdrawAmnt);
//         System.out.println("your new balance is: "+balance);
//     }
//     public void CheckBalance1(){
//         System.out.println("Current balance is: "+balance);
//     }
    
// }


// public class ExamPractise {
//     public static void main(String[] args) {
//         BankAccount b1 = new BankAccount();
//         b1.acName = "ram";
//         b1.acNumber = 123445;
//         b1.balance = 10500;
//         b1.deposit(5000);
//         b1.withdraw(3000);
//         b1.CheckBalance1();
//     }
// }

// class BankAccount {
//     int acNumber;
//     String acName;
//     double balance;

//     // No-argument constructor
//     public BankAccount() {
//     }

//     public void deposit(double DepositAmnt) {
//         balance = balance + DepositAmnt;
//         System.out.println("Deposited amount: " + DepositAmnt);
//         System.out.println("Your new balance is: " + balance);
//     }

//     public void withdraw(double WithdrawAmnt) {
//         balance = balance - WithdrawAmnt;
//         System.out.println("Withdraw amount: " + WithdrawAmnt);
//         System.out.println("Your new balance is: " + balance);
//     }

//     public void CheckBalance1() {
//         System.out.println("Current balance is: " + balance);
//     }
// }


// public class ExamPractise {
//     public static void main(String[] args) {
//         BankAccount b1 = new BankAccount();
//         b1.acName = "ram";
//         b1.acNumber = 123445;
//         b1.balance = 10500;
//         b1.deposit(5000);
//         b1.withdraw(3000);
//         b1.CheckBalance1();
//     }
// }

// class BankAccount {
//     int acNumber;
//     String acName;
//     double balance;

//     // No-argument constructor
//     public BankAccount() {
//     }

//     public void deposit(double DepositAmnt) {
//         balance = balance + DepositAmnt;
//         System.out.println("Deposited amount: " + DepositAmnt);
//         System.out.println("Your new balance is: " + balance);
//     }

//     public void withdraw(double WithdrawAmnt) {
//         balance = balance - WithdrawAmnt;
//         System.out.println("Withdraw amount: " + WithdrawAmnt);
//         System.out.println("Your new balance is: " + balance);
//     }

//     public void CheckBalance1() {
//         System.out.println("Current balance is: " + balance);
//     }
// }



// public class ExamPractise{
//     public static void main(String[] args) {
//         boxer b1=new boxer();
//         b1.type="4-legged";
//         b1.name="boxx";
//         b1.animaltype();
//         b1.animalSpeak();
        
//     }
// }

// class Animal{
//     String type;
//     void animaltype(){
//         System.out.println("it is "+type);
//     }
// }
// class boxer extends Animal{
//     String name;
//     void animalSpeak(){
//         System.out.println("this animal's name is  "+name);
//     }
// }



//public class ExamPractise{
//     public static void main(String[] args) {
//         child x= new child();
//         x.hello();
//     }
// }

// class base{
//     base(){
//         System.out.println("i am base class");
//     }
// }

// class child extends base{
//     child(){
//         System.out.println("i am inside child class");
//     }
//     void hello(){
//         System.out.println("i am inside hello");
//     }
//}


// public class ExamPractise{
//     public static void main(String[] args) {
//         dog d1= new dog();
//         d1.eat();
//         System.out.println(d1.speak("barking"));
//     }
// }

// abstract class Animal{
//     abstract void eat();
//     abstract String speak(String bark);
// }

// class dog extends Animal{
//     @Override
//     void eat(){
//         System.out.println("dog eats meat");
//     }
//     @Override
//     String speak(String bark){
//         return bark+" is done by dog";
//     }
// }

// public class ExamPractise{
//     public static void main(String[] args) {
//         Dog d1=new Dog();
//         d1.eat();
//         System.out.println(d1.speak("Bow Bow"));
//     }
// }
// class Animal {
//     void eat() {
//         System.out.println("Animal eats food");
//     }
    
//     String speak(String sound) {
//         return "Animal makes a sound: " + sound;
//     }
// }

// class Dog extends Animal {
//     @Override
//     void eat() {
//         System.out.println("Dog eats meat");
//     }
    
//     @Override
//     String speak(String sound) {
//         return sound + " is done by dog";
//     }
// }


// public class ExamPractise{
//     public static void main(String[] args) {
//         calculatePerimeter p1= new calculatePerimeter();
//         System.out.println(p1.infoShape(2, 3));
//     }
// }

// class calculatePerimeter{
//     double infoShape(double length,double breadth){
//         return 2*(length+breadth);
//     }
// }


public class ExamPractise{
    public static void main(String[] args) {
        Rectangle1 r1= new Rectangle1();
        r1.length1=2;
        r1.breadth1=3;
        System.out.println(r1.area1());
        System.out.println(r1.perimeter1());
        
    }
}
abstract class shapess{
    abstract double area1();
    abstract double perimeter1();

}

class Rectangle1 extends shapess{
    double length1;
    double breadth1;
    @Override
    double area1(){
        return length1*breadth1;
    }
    @Override
    double perimeter1(){
        return 2*(length1+breadth1);
    }
}


/**
 * public class ExamPractise {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        r1.length1 = 2;
        r1.breadth1 = 3;
        System.out.println(r1.area1());
        System.out.println(r1.perimeter1());
    }
}

abstract class Shapes {
    abstract double area1();
    abstract double perimeter1();
}

class Rectangle1 extends Shapes {
    double length1;
    double breadth1;

    @Override
    public double area1() {
        return length1 * breadth1;
    }

    @Override
    public double perimeter1() {
        return 2 * (length1 + breadth1);
    }
}

 */