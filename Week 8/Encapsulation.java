public class Encapsulation {

    public static void main(String[] args) {
        //1. encapsulation bundels the similar 
        //attribute and function inside a class
        /*task
         * make setter and getter for price
         * create 2 objext of laptop
         * output the folloeing using the object
         * output;
         * Name: apple air m2
         * brand: apple
         * price: 150000
         * year: 2022
         */


         laptop l1=new laptop();
         l1.setName("apple air m2");
         System.out.println("Name: "+l1.getName());
         l1.brand="apple";
         System.out.println("Brand: "+l1.brand);
         l1.setPrice(150000.02);
         System.out.println("Price: "+l1.getPrice());
         l1.year=2022;
         System.out.println("Year: "+l1.year);
         l1.inflation(5000);
         System.out.println("new price: "+l1.getPrice());

    }
    
}
class laptop{
    //2. Ecapsulation can have data hiding using 
    //private properties
    private String name;
    public String brand;
    private double price;
    int year;
    //3.Encapsulation can have read only or write only
    //using getter and setter
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }

    public void getInfo(){
        System.out.println(name+" "+brand);
    }
    public void  inflation(double money){
        this.price=this.price+money;
    }
}

