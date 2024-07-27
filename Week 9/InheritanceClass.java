public class InheritanceClass {
    public static void main(String[] args) {
        // ChildClass cc= new ChildClass();
        // cc.lastname="xyz";
        // cc.firstname="abc";
        // cc.expenses=1000.2;
        // cc.info();
        // cc.detail();
        // // cc.salary=10000;

        // GrandChildClass gg= new GrandChildClass();
        // gg.middlename="nm";

        // gg.description();

        LabradorClass ll= new LabradorClass();


        ll.name="bruno";
        ll.Speices="dog";
        ll.Breed="Labro";
        ll.color="golden";
        ll.speak();
        ll.fur();
        ll.bark();
        ll.play();



        
        
    }
    
}

// class ParentClass{
//     public String lastname;
//     private int salary;
//     protected double expenses;
//     void info(){
//         System.out.println("Parent function "+lastname);

//     }

// } 

// //single level inheritance -ONe [parent and one child
// //use "extends " to inherit a Class
// class ChildClass extends ParentClass{
//     String firstname;
//     void detail(){
//         System.out.println("Child Function "+firstname+" "+lastname);
//     }
// }

// //multi level inheritance - NEsted class
// class GrandChildClass extends ChildClass{
//     String middlename;
//     void description(){
//         System.out.println(firstname+" "+middlename+ " "+ lastname);
//     }
// }
// //tree/heiearchial inheritance
// class BrotherClass extends ParentClass{
//     String adress;
//     void living(){
//         System.out.println("Adress= "+adress);
//     }

// }

class AnimalClass{
    String name;
    void speak(){
        System.out.println("name= "+name);
    }
}

class MammalClass extends AnimalClass{
    String Speices;
    void fur(){
        System.out.println("species= "+Speices);
    }
}

class ReptileClass extends AnimalClass{
    String egg;
    void shed(){
        System.out.println("egg= "+egg);
    }
}

class DogClass extends MammalClass{
    String Breed;
    void bark(){
        System.out.println("Breed= "+Breed);
    }
}

class CatClass extends MammalClass{
    String origin;
    void meaow(){
        System.out.println("origin= "+origin);
    }
}

class Amphibian extends ReptileClass{
    String Scale;
    void swim(){
        System.out.println("Scale= "+Scale);
    }
}

class LabradorClass extends DogClass{
    String color;
    void play(){
        System.out.println("color= "+color);
    }
}

class Germanshepherd extends DogClass{
    String spots;
    void guard(){
        System.out.println("spots= "+spots);
    }
}



