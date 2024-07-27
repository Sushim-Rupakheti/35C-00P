public class ConstructorClass {
    public static void main(String[] args) {
        // ConstructorExample ce = new ConstructorExample();
        // System.out.println("line after object");
        // ConstructorExample2 c2= new ConstructorExample2("Sushim",18,'M');
        // System.out.println(c2.gender);
        // }

        Cat c1 = new Cat("dotty", 3);
        c1.breed="german";
        System.out.println(c1.getAge());
        System.out.println(c1.getName());
        System.out.println("breed= "+c1.breed);



    }
}
// task
// Make a class Cat
// Make private attributes name, age
// Make public attribute breed
// Make a Constructor that sets name and age only
// Make getter for name and age
// Make an object of Cat
// Print the following
// Name : XYZ
// Breed: ABC
// age : 10


// class ConstructorExample2{
// private String name;
// private int age;
// public char gender;
// ConstructorExample2(String n, int a, char g){
// name=n;
// age= a;
// gender= g;

// }
// }
// class ConstructorExample{
// ConstructorExample(){
// System.out.println("I run in object creation");
// continue logic when creating object
// In most case we use constructor to set attribute

class Cat {
    private String name;
    private int age;
    public String breed;

    Cat(String n, int a) {
        name = n;
        age = a;
    }
     String getName() {
        return name;
    }
    int getAge(){
        return age;
    }


}
