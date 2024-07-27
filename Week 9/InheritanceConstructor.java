public class InheritanceConstructor {
    public static void main(String[] args) {
        HalfPant hp= new HalfPant();
        hp.differentColor("red");
        Pant p1=new Pant();
        System.out.println(p1.color);
        Pant p2 =new Pant("yellow");
        System.out.println(p2.color);
        Pant p3=new Pant(10);


        
    }
    
}

class Pant{
    String color;
    String texture;
    Pant(){
        System.out.println("pant default constructor");
    }
    //overloading -same function?constructor with different logic/parameters
    Pant(String color){
        this.color=color;
        System.out.println("constructor with 2 string param"); 
    }
    Pant(String color,String texture){
        this.color=color; this.texture=texture;
        System.out.println("constructor with 1 int param");
    }
    Pant(int num){
        System.out.println("num= "+num);
        System.out.println("Constructor with 2 String param");
    }
    //Overloading can be done only with difference in param(data type & no. of param)
    //NOt the varaiable name,cannot again make Pant(String c)
}

class HalfPant extends Pant{

    String color="black";//this.color
    HalfPant(){
        //If object of child class is made, it automatically executes
        //super() or Pant() in the first execution
        super("green");
        System.out.println("half pant default constructor");
    }
    void differentColor(String color){
        System.out.println("Parameter color "+color);
        System.out.println("class color "+this.color);
        System.out.println("parent color "+super.color);

    }
}


/*
 * make a class Shirt
 * make 2 atrribute color and thread
 * make a parameterized constructor that color and thread 
 * make a non parameterized constructor that sets default  \
 * color to "white" and texture to "cotton"
 * make a class polo that extends shirt
 * make 1 atrribute color,set default to Green
 * make non parameterized constructor on polo \
 * call the parameterized constructor of parent with "red and "silk"
 * make a function design() in polo that takes String color
 * set the current color of polo to shirt
 * set the parameter color to current color or polo
 * make  a function detail( )that prints parent color and thread
 * also print the color of current Polo
 * Make an object of polo and call function design and detail
 */ 


//  class Shirt{
//     String color;
//     String thread;

//     Shirt(String color,String thread){
//         this.color=color; this.thread=thread;
//     }
//     Shirt(){
//         this.color="white"; this.thread="cotton";
//     }
//  }


//  class polo extends Shirt{
//     String color="green";
//     polo(){
//         super("red","silt");

//     }
//     void design(String color){
//         super.color=this.color;
//         this.color=color;

//     }
//     void detail(){
//         System.out.println(super.color+" " +super.thread);
//         System.out.println(this.color);
//     }
//  }

//  class C1{
//     String name;
//  }
//  class C2 extends C1{
//     String name;
//  }