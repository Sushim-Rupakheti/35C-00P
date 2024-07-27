
import java.util.Stack;
    //     float mile=1.609f;
    //     for(int i=1;i<=10;i++){
    //         System.out.println(i+"  "+i*mile);
    //     }
    // }



    // int i=1;
    // while(i<=20){
    //     if(i==5 || i==7 || i==9){
    //         i=i+2;
    //         continue;
    //     }else if(i==17){
    //         break;
    //     }else{System.out.println(i);
    //     }
    //     i=i+2;
    // }

// public class mainExam {
//         public static void main(String[] args) {
//             TextEditor editor = new TextEditor();
            
//             editor.addText("Hello");
//             System.out.println("Current text: " + editor.getCurrentText()); // Should print "Hello"
            
//             editor.addText(", World");
//             System.out.println("Current text: " + editor.getCurrentText()); // Should print "Hello, World"
            
//             editor.undo();
//             System.out.println("Current text after undo: " + editor.getCurrentText()); // Should print "Hello"
            
//             editor.undo();
//             System.out.println("Current text after another undo: " + editor.getCurrentText()); // Should print an empty string
//         }
//     }

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


import java.util.Scanner;
public class mainExam {

    public static int max(int[] array) {
        int maxValue = array[0];
        for (int num : array) {
            if (num > maxValue) {
                maxValue = num;
            }}
        return maxValue;
    }
    public static int indexOfHighest(int[] array) {
        int maxValue = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            } }
        return maxIndex;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five integer values:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int maxValue = max(numbers);
        int maxIndex = indexOfHighest(numbers);
        System.out.println("The maximum value in the array is: " + maxValue);
        System.out.println("The index of the highest element is: " + maxIndex);
        scanner.close();
    }}

