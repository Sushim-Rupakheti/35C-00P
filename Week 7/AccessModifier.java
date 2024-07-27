public class AccessModifier {
    public static void main(String[] args) {
        // AccessExample ae= new AccessExample();
        // ae.name="ram";
        // ae.age=18;
        // // ae.phNo="98989889889";
        // ae.printTHis();
        // ae.printName();
        // // ae.privateFunction();
        // ae.acesssPrivate();
        // ae.setphNo("98089898989");
        // ae.acesssPrivate();
        // System.out.println(ae.getPhno());

        Dog dog= new Dog();
        dog.age=10;
        dog.setBreed("husky");
        dog.setName("tommy");
        // ae.privateFunction();
        System.out.println("name= "+dog.getName());
        System.out.println("breed= "+dog.getBreed());
        System.out.println("age= "+dog.age);


    }
}

// Tsk
// make a class Dog
// make 2 private atteibute,name, and breed
// make 1 public attribute, age
// make setter for name and breed
// make getter for name and breed
// Make 1 object of Dog
// fill all the attribute
// print the following from object
// Name: xyz
// Breed: abc
// Age: 10

// class AccessExample{
// String name; //Automatically default, meaning package/folder access
// public int age; // public can be accesss from anywhere
// private String phNo; //private can be accessed only in class

// void setphNo(String p){
// phNo=p;
// }

// String getPhno(){
// return phNo;
// }
// void printTHis(){
// System.out.println("printing details");
// }
// void printName(){
// System.out.println(("name is ")+name);
// }
// private void privateFunction(){
// System.out.println("this can be run only inside this class");
// }
// void acesssPrivate(){
// System.out.println(phNo);
// privateFunction();
// }
// }

class Dog {
    public int age;
    private String name;
    private String breed;

    void printTHis() {
        System.out.println("printing details");
    }

    void setName(String n) {
       name= n;
    }
    void setBreed(String b) {
        breed= b;
     }

     String getName(){
        return name;
     }
    String getBreed(){
        return breed;
    }





}
