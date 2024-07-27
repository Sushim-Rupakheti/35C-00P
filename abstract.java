public class abstract{


    public static void main(String[ ]args){
        
        Circle cc= new Circle();
        
        System.out.println("area of circle is "+cc.CalculateArea());
        
        System.out.println("perimeter of circle is "+cc.ClaculatePerimeter());
        
        Rectangle rr= new Rectangle():
        
        System.out.println("area of rectangle is "+rr.CalculateArea()):
        
        System.out.println("perimeter of retangle is "+rr.CalculatePerimeter());
        
        Square ss=new Square();
        
        System.out.println("area of square is "+ss.CalculateArea()):
        
        System.out.println("perimeter of square is "+ss.CalculatePerimeter());
        
        }
}

abstract class shape {

    abstract double CalculateArea();

    abstract double CalculatePerimeter();

}

class Circle extends Shape {

    int radius = 10;

    @Override

    double CalculateArea() {

        return radius * radius * (22 / 7);

    }

    @Override

    double CalculatePerimeter() {
        return 2 * (22 / 7) * radius;

    }

}

class Rectangle extends Shape {

    int length = 10;

    int breadth = 20;

    @Override

    double CalculateArea() {
        return length * breadth;

    }

    @Override

    double CalculatePerimeter() {

        return 2 * (length + breadth);

    }

}

class Sqaure extends Shape {

    int length = 10;

    @Override 
        
        double CalculateArea(){
        
        return length*length;

    @Override

    double CalculatePerimeter() {

        return 2 * length;

    }
}

}


