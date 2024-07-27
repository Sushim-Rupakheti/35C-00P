public class AbstractClass {
    public static void main(String[] args) {
        Samsung ss= new Samsung();
        ss.sms();
        System.out.println(ss.call(999 ));
        Iphone ii= new Iphone();
        System.out.println(ii.call(99 ));
        ii.sms();
        ii.call(99999999);
        ii.imei();


        // Circle cc= new Circle();
        // System.out.println("area of circle is "+cc.CalculateArea());
        // System.out.println("perimeter of circle is "+cc.CalculatePerimeter());

        // Rectangle rr= new Rectangle();
        // System.out.println("area of rectangle is "+rr.CalculateArea());
        // System.out.println("perimeter of rectangle is "+rr.CalculatePerimeter());







    }
}
// to make abstract class "abstract" keyword used before "class"
//abstract class cannot be made object of 
abstract class SmartPhone{
    //abstract class may or may not contain abstract function
    //abstract funtion do not have body( function hiding)
    abstract void sms();
    abstract String call(int number);
    //can contain normal function
    //normal function should contain body
    void imei(){
        System.out.println("IMEI");
    }
}
//abstract class need to be extended in child class
class Samsung extends SmartPhone{
    //all the abstract function of abstract class needs to be implemented/overriden
    @Override
    void sms(){
        System.out.println("Samsung way of sms");
    }
    @Override 
    String call(int number){
        return number+"is calling";
    }
}

class Iphone extends SmartPhone{
    @Override
    void sms(){
        System.out.println("Iphone way of sms");
    }
    @Override 
    String call(int number){
        return number+"is calling";
    }
    
}

/* task
 * make a class Iphone that extends Smartphone\
 * override abstract function 
 * make object of samsung and iphone 
 * call the function sms() and call()
 */

 /*You are building a shape hierarchy for a drawing application. 
 Design an abstract class named "Shape" with the following abstract methods:
calculateArea(): This method should calculate and return the area of the shape.
calculatePerimeter(): This method should calculate and return the perimeter of the shape.
Implement the abstract class and provide concrete implementations for the abstract methods.
Create subclasses for different shapes such as "Circle," "Rectangle," and "Triangle."
Each subclass should provide specific implementations for calculating the area and perimeter of that shape. 
Create instances of each shape class and demonstrate how you can calculate their respective areas and perimeters. */


 abstract class Shape{
    abstract double CalculateArea();
    abstract double CalculatePerimeter();
 }

class Circle extends Shape{
    int radius=10;
    @Override
    double CalculateArea(){
        return radius*(22/7);  
    }
    @Override
    double CalculatePerimeter(){
        return 2*(22/7)*radius;  
    }

 }

 
class Rectangle extends Shape{
    int length=10;
    int breadth=20;
    @Override
    double CalculateArea(){
        return length*breadth;  
    }
    @Override
    double CalculatePerimeter(){
        return 2*(length+breadth);  
    }
 }
 



