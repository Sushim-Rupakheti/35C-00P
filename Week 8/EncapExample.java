public class EncapExample {
    public static void main(String[] args) {

        BankAccount nishan = new BankAccount(10001, "Nishan Giri", 10000);
        nishan.withdraw(100);
        
    }
    
}
// You are building a banking application that has a BankAccount class. 
// Implement the BankAccount class with encapsulation principles in mind. 
// Include private instance variables for the
// account number, account holder name, and account balance. 
// Provide public methods to allow clients to deposit and withdraw funds, 
// as well as access the account balance. 
// Ensure that the account balance cannot be accessed or modified directly.
// Ensure that user cannot withdraw balance if it can go to negative
// Note make contructor to fill the attribute on account opening
// Make getter for account number and account holder name 
class BankAccount{
    private int accountNo;
    private String name;
    private double currentBalance;


    BankAccount(int accountNo, String name, double currentBalance){
        this.accountNo=accountNo;
        this.currentBalance=currentBalance;
        this.name=name;
                }
                public int getAccountNo() {
                    return accountNo;
                }
                public double getCurrentBalance() {
                    return currentBalance;
                }
                public String getName() {
                    return name;
                }
    public void  deposit(double deposit){
        this.currentBalance=this.currentBalance+deposit;
    }
    public void  withdraw(double withdraw){
        if( withdraw<this.currentBalance){
    currentBalance=this.currentBalance-withdraw;
        }
        else{
            System.out.println("invalid amount entered");
        }
        
        

            
    
    }






}

