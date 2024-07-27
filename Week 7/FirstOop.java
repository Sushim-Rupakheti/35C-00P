// package Week 7;

import javax.xml.transform.sax.SAXSource;

public class FirstOop {
    public static void main(String[] args) {
        // Person p1 =new Person();
        // p1.name="ram";
        // p1.age=18;
        // p1.gender='M';
        // p1.introduction();


        // Person p2 =new Person();
        // p2.name="shyam";
        // p2.age=19;
        // p2.gender='M';
        // p2.introduction();

        // Person p3 =new Person();
        // p3.name="Sushim";
        // p3.age=18;
        // p3.gender='M';
        // p3.introduction();

        // Square s1 = new Square();
        // s1.sides=3;
        // int s1area=s1.area();
        // System.out.println(s1area);
        // System.out.println(s1.area());
        // s1.increaseSidex(2);
        // System.out.println(s1.area());

    // Rectangle r1= new Rectangle();
    //   r1.length=2;
    //   r1.breadth=3;
    //   System.out.println("area = "+r1.area());
    //   System.out.println("perimeter= "+r1.perimeter());
    //   r1.info();
    
    Car c1=new Car();
    c1.name="basanti";
    c1.brand="bmw";
    c1.year=1990;
    System.out.println("expiry year is "+c1.expiry());
    c1.start();
    c1.stop();
    c1.info(); 

    Car c2=new Car();
    c2.name="raja";
    c2.brand="porsche";
    c2.year=2000;
    System.out.println("expiry year is "+c2.expiry());
    c2.start();
    c2.stop();
    c2.info(); 
    }
}
// task create a class rectangle/
//create 2 attribute, length and breadth as double
//make a function that returns area of rectanlge
// male a function that return permieter of ractangle
//make a funtion info, that prints the length and breadth
//make an object of rectablge
//fill both the atrribute/feilds
//call the area and perimeter and print them
//call the function info


// class Person{
//     String name;
//     int age;
//     char gender;

//     void introduction(){
//         System.out.println("my name is "+ name);
//     }

// }

// class Rectangle{
//     double length;
//     double breadth;
//     double area(){
//         return length*breadth;
//     }
//     double perimeter(){
//         return 2*(length+breadth);
//     }
//     void info(){
//         System.out.println("length= "+length);
//         System.out.println("breadth = "+breadth );
//     }

//     }


// class Square{
//     int sides;
//     int area(){
//         return sides*sides;
//     }
//     void increaseSidex(int val){
//         sides=sides+val;
//     }
// }

class Car{
    String name;
    String brand;
    int year;
    int expiry(){
        return year+100;
    }
    void start(){
        System.out.println(name+" is starting");
    }
    void stop(){
        System.out.println(name+" "+brand +" is stoppping");
    }
    void info(){
        System.out.println(name+" "+brand+" "+year);
    }
}
