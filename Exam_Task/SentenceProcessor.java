// public class Student {
//     public static void main(String[] args) {
//         Student student1 = new Student("S12345", "RAM KUMAR", 3.5);
//         student1.printProfile();
        
//         student1.updateGPA(3.8);
//         student1.printProfile();
//     }
//     private String studentID;
//     private String name;
//     private double gpa;

//     public Student(String studentID, String name, double gpa) {
//         this.studentID = studentID;
//         this.name = name;
//         this.gpa = gpa;
//     }

//     public void updateGPA(double newGPA) {
//         this.gpa = newGPA;
//         System.out.println("GPA for " + this.name + " (ID: " + this.studentID + ") has been updated to " + this.gpa);
//     }

//     public void printProfile() {
//         System.out.println("Student ID: " + this.studentID);
//         System.out.println("Name: " + this.name);
//         System.out.println("GPA: " + this.gpa);
//     }
// }


// public class BankAccount {
//     public static void main(String[] args) {
//         BankAccount account = createNewAccount("123456789", "John Doe", 1000.0);
//         account.checkBalance();
//         account.deposit(500.0);
//         account.checkBalance();
//         account.withdraw(200.0);
//         account.checkBalance();        
//         account.withdraw(2000.0);
//     }
//     private String accountNumber;
//     private String accountHolderName;
//     private double balance;

//     public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         this.balance = initialBalance;
//     }
//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposited: $" + amount);
//         } else {
//             System.out.println("Invalid deposit amount");
//         }
//     }
//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrew: $" + amount);
//         } else {
//             System.out.println("Invalid withdrawal amount or insufficient funds");
//         }
//     }
//     public void checkBalance() {
//         System.out.println("Current balance: $" + balance);
//     }
//     public static BankAccount createNewAccount(String accountNumber, String accountHolderName, double initialBalance) {
//         return new BankAccount(accountNumber, accountHolderName, initialBalance);
//     }

// }

// import java.util.ArrayList;
// import java.util.List;
// class Product {
//     private String name;
//     private double price;
//     public Product(String name, double price) {
//         this.name = name;
//         this.price = price;
//     }
//     public String getName() {
//         return name;
//     }
//     public double getPrice() {
//         return price;
//     }
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) return true;
//         if (obj == null || getClass() != obj.getClass()) return false;
//         Product product = (Product) obj;
//         return Double.compare(product.price, price) == 0 &&
//                 name.equals(product.name);
//     }
//     @Override
//     public int hashCode() {
//         return name.hashCode();
//     }}
// public class ShoppingCart {
//     private String cartID;
//     private String customerName;
//     private List<Product> items;
//     public ShoppingCart(String cartID, String customerName) {
//         this.cartID = cartID;
//         this.customerName = customerName;
//         this.items = new ArrayList<>();
//     }
//     public void addItem(Product product) {
//         items.add(product);
//     }
//     public void removeItem(Product product) {
//         items.remove(product);
//     }
//     public double calculateTotal() {
//         return items.stream().mapToDouble(Product::getPrice).sum();
//     }
//     public void printCartDetails() {
//         System.out.println("Cart ID: " + cartID);
//         System.out.println("Customer Name: " + customerName);
//         System.out.println("Items in cart:");
//         for (Product item : items) {
//             System.out.println(" - " + item.getName() + ": $" + item.getPrice());
//         }
//         System.out.println("Total Cost: $" + calculateTotal());
//     }
//     public static void main(String[] args) {
//         ShoppingCart cart = new ShoppingCart("CART1234", "Jane Doe");
//         Product product1 = new Product("Laptop", 999.99);
//         Product product2 = new Product("Smartphone", 699.99);
//         Product product3 = new Product("Headphones", 199.99);
//         cart.addItem(product1);
//         cart.addItem(product2);
//         cart.addItem(product3);
//         cart.printCartDetails();
//         cart.removeItem(product2);
//         cart.printCartDetails();
//     }}

// import java.util.ArrayList;
// import java.util.List;
// interface Transaction {
//     double getAmount();
//     boolean isValid();
// }
// class Deposit implements Transaction {
//     private double amount;

//     public Deposit(double amount) {
//         this.amount = amount;
//     }
//     @Override
//     public double getAmount() {
//         return amount;
//     }
//     @Override
//     public boolean isValid() {
//         return amount > 0;
//     }}
// class Withdrawal implements Transaction {
//     private double amount;
//     private double accountBalance;

//     public Withdrawal(double amount, double accountBalance) {
//         this.amount = amount;
//         this.accountBalance = accountBalance;
//     }
//     @Override
//     public double getAmount() {
//         return amount;
//     }
//     @Override
//     public boolean isValid() {
//         return amount > 0 && amount <= accountBalance;
//     }}

// class TransactionProcessor {
//     private List<Transaction> transactions = new ArrayList<>();
//     private double alertLimit;

//     public TransactionProcessor(double alertLimit) {
//         this.alertLimit = alertLimit;
//     }
//     public void addTransaction(Transaction transaction) {
//         if (transaction.isValid()) {
//             transactions.add(transaction);
//             System.out.println("Transaction added: " + transaction.getAmount());
//             if (transaction.getAmount() > alertLimit) {
//                 System.out.println("Alert: Transaction amount exceeds the limit!");
//             }
//         } else {
//             System.out.println("Invalid transaction: " + transaction.getAmount());
//         }}

//     public double getTotalAmount() {
//         return transactions.stream().mapToDouble(Transaction::getAmount).sum();
//     }}

// public class Main {
//     public static void main(String[] args) {
//         TransactionProcessor processor = new TransactionProcessor(5000.0);

//         processor.addTransaction(new Deposit(3000.0));
//         processor.addTransaction(new Deposit(6000.0));
//         processor.addTransaction(new Withdrawal(2000.0, 10000.0));
//         processor.addTransaction(new Withdrawal(7000.0, 5000.0));
//         System.out.println("Total amount processed: " + processor.getTotalAmount());
//     }}


    

// import java.util.ArrayList;
// import java.util.List;

// interface NetworkDevice {
//     String getStatus();
//     boolean isAvailable();
// }
// class Router implements NetworkDevice {
//     private String status;
//     private boolean available;

//     public Router(String status, boolean available) {
//         this.status = status;
//         this.available = available;
//     }
//     @Override
//     public String getStatus() {
//         return status;
//     }
//     @Override
//     public boolean isAvailable() {
//         return available;
//     }}

// class Switch implements NetworkDevice {
//     private String status;
//     private boolean available;

//     public Switch(String status, boolean available) {
//         this.status = status;
//         this.available = available;
//     }
//     @Override
//     public String getStatus() {
//         return status;
//     }
//     @Override
//     public boolean isAvailable() {
//         return available;
//     }}

// class NetworkMonitor {
//     private List<NetworkDevice> devices = new ArrayList<>();
//     private String alertStatus;

//     public NetworkMonitor(String alertStatus) {
//         this.alertStatus = alertStatus;
//     }
//     public void addDevice(NetworkDevice device) {
//         devices.add(device);
//     }
//     public void checkDevices() {
//         for (NetworkDevice device : devices) {
//             if (device.getStatus().equals(alertStatus) || !device.isAvailable()) {
//                 System.out.println("Alert: Device with status " + device.getStatus() + " is not available or in error state.");
//             } else {
//                 System.out.println("Device is functioning correctly: " + device.getStatus());
//             }}}}

// public class Main {
//     public static void main(String[] args) {
//         NetworkMonitor monitor = new NetworkMonitor("ERROR");
//         NetworkDevice router1 = new Router("OK", true);
//         NetworkDevice router2 = new Router("ERROR", false);
//         NetworkDevice switch1 = new Switch("OK", true);
//         NetworkDevice switch2 = new Switch("ERROR", true);

//         monitor.addDevice(router1);
//         monitor.addDevice(router2);
//         monitor.addDevice(switch1);
//         monitor.addDevice(switch2);
//         monitor.checkDevices();
//     }}


// import java.util.Stack;
// class TextEditor {
//     private Stack<String> textStack = new Stack<>();
//     private String currentText = "";

//     public void addText(String text) {
//         textStack.push(currentText);
//         currentText += text;
//     }

//     public void undo() {
//         if (!textStack.isEmpty()) {
//             currentText = textStack.pop();
//         }
//     }

//     public String getCurrentText() {
//         return currentText;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         TextEditor editor = new TextEditor();
        
//         editor.addText("Hello");
//         System.out.println("Current text: " + editor.getCurrentText()); // Should print "Hello"
        
//         editor.addText(", World");
//         System.out.println("Current text: " + editor.getCurrentText()); // Should print "Hello, World"
        
//         editor.undo();
//         System.out.println("Current text after undo: " + editor.getCurrentText()); // Should print "Hello"
        
//         editor.undo();
//         System.out.println("Current text after another undo: " + editor.getCurrentText()); // Should print an empty string
//     }
// }

// import java.util.Scanner;
// class InvalidStringLengthException extends Exception {
//     public InvalidStringLengthException(String message) {
//         super(message);
//     }
// }
// public class StringLengthValidator {

//     private static final int MIN_LENGTH = 5;
//     private static final int MAX_LENGTH = 20;

//     public static void validateStringLength(String input) throws InvalidStringLengthException {
//         if (input.length() < MIN_LENGTH || input.length() > MAX_LENGTH) {
//             throw new InvalidStringLengthException("The string length must be between " + MIN_LENGTH + " and " + MAX_LENGTH + " characters.");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a string between " + MIN_LENGTH + " and " + MAX_LENGTH + " characters: ");
//         String input = scanner.nextLine();

//         try {
//             validateStringLength(input);
//             System.out.println("Valid string: " + input);
//         } catch (InvalidStringLengthException e) {
//             System.err.println(e.getMessage());
//         }

//         scanner.close();
//     }
// }


// import java.util.Scanner;
// import java.util.regex.Pattern;

// class InvalidEmailException extends Exception {
//     public InvalidEmailException(String message) {
//         super(message);
//     }
// }
// public class EmailValidator {

//     private static final Pattern EMAIL_PATTERN = Pattern.compile(
//         "^[A-Za-z0-9+_.-]+@+[A-Za-z0-9.-]+$"
//     );
//     public static void validateEmail(String email) throws InvalidEmailException {
//         if (!EMAIL_PATTERN.matcher(email).matches()) {
//             throw new InvalidEmailException("Invalid email address: " + email);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a valid email address: ");
//         String email = scanner.nextLine();

//         try {
//             validateEmail(email);
//             System.out.println("Valid email address: " + email);
//         } catch (InvalidEmailException e) {
//             System.err.println(e.getMessage());
//         }
//         scanner.close();
//     }
// }


// import java.util.Scanner;
// public class ArrayProcessor {

//     public static int max(int[] array) {
//         int maxValue = array[0];
//         for (int num : array) {
//             if (num > maxValue) {
//                 maxValue = num;
//             }}
//         return maxValue;
//     }
//     public static int indexOfHighest(int[] array) {
//         int maxValue = array[0];
//         int maxIndex = 0;
//         for (int i = 1; i < array.length; i++) {
//             if (array[i] > maxValue) {
//                 maxValue = array[i];
//                 maxIndex = i;
//             } }
//         return maxIndex;
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] numbers = new int[5];

//         System.out.println("Enter five integer values:");
//         for (int i = 0; i < 5; i++) {
//             System.out.print("Value " + (i + 1) + ": ");
//             numbers[i] = scanner.nextInt();
//         }
//         int maxValue = max(numbers);
//         int maxIndex = indexOfHighest(numbers);
//         System.out.println("The maximum value in the array is: " + maxValue);
//         System.out.println("The index of the highest element is: " + maxIndex);
//         scanner.close();
//     }}



import java.util.Scanner;
public class SentenceProcessor {
    public static int countVowels(String sentence) {
        int count = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            } }
        return count;
    }
    public static int countConsonants(String sentence) {
        int count = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if ((c >= 'a' && c <= 'z') && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                count++;
            } }
        return count;
 }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowelCount = countVowels(sentence);
        int consonantCount = countConsonants(sentence);

        System.out.println("The number of vowels in the sentence is: " + vowelCount);
        System.out.println("The number of consonants in the sentence is: " + consonantCount);

        scanner.close();
    }
}


