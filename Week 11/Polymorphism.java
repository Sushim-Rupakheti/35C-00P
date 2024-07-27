public class Polymorphism {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(1,2));
        System.out.println(mo.add(2,3,9));
        mo.add();


        //Method overridng 
        //Polymorphism allows child to be held on parent variable 
        Document d1= new Document();
        d1.print("white");
        Document d2=new Msword();
        d2.print("black");
        //when doing so, although the variable is Document it will run the overridden method
        Document d3 = new Office365();
        d3.print("Yellow");
        // Note: When string child object on parent variable, only the attribute and function of parent can be used
        // EG: d3.online -> cannot be used
        
        // Homework
        Spreadsheet spreadsheet = new Spreadsheet();
        spreadsheet.addRow(17);
        spreadsheet.addColumn(19);
        
        // Make an object of Spreadsheet as MsExcel
        Spreadsheet msExcel = new MsExcel();
        msExcel.addRow(13);
        msExcel.addColumn(12);
    }
}

class Spreadsheet {
    public void addRow(int row) {
        System.out.println(row + " row added");
    }
    
    public void addColumn(int column) {
        System.out.println(column + " column added");
    }
}

class MsExcel extends Spreadsheet {
    String fileType = "Microsoft Excel";
    
    @Override
    public void addRow(int row) {
        System.out.println(row + " row added in Excel");
    }
    
    @Override
    public void addColumn(int column) {
        System.out.println(column + " column added in Excel");
    }
}

//MEthod oberloading -compiletime polymorphism
//in aclass, have same function multiple time with difference 
// in parameters
class MathOperation{
    int add(int num1,int num2){
        return num1+num2;
    }

//1. CHanging the no. of parameters
int add(int num1,int num2,int num3){
    return num1+num2+num3;
}

//2.Changing the data type
double add(double num1,double num2){
    return num1+num2;
}
//NOte: MethodOverloading is only possible with unique parameter/argument data type
//Cannot make Function changing variable type
//Eg :int add(int a,int b) --> cannt be made as function with 2 int is already made
//cannot overload just by changign return type 
//eg:double add(int num1,int num2)---> Cannot be made as funtion with 2 int is already made
void add(){
    System.out.println("Invalid Operation");
}
}

/*method overriding-runtime Polymorphism
 * when a child class has the same function as parent class
 */
class Document{
    public void print (String paper){
        System.out.println("basic Document printing "+paper);
    }
}
//Method overriding is only possible in child class
class Msword extends Document{
    //when overriding,should be the same function as parent 
    @Override
    public void print(String paper){
        System.out.println("Ms word prints "+paper);  
    } 
}

//Method overriding in multi layer inheritance
class Office365 extends Msword{
    boolean online =false;
    @Override
    public void print (String paper){
        System.out.println("online printing");
    }
}
