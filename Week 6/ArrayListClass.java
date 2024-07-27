import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        /*To use arrayList import from java.util just like Scanner  */
        // ArrayList<String> animal= new ArrayList<>();
         
        /*Instead of array animal[0] ="xyz", we use add functu=ion */
        // animal.add("dog");
        // animal.add("cat");
        // animal.add("cow");
        // System.out.println(animal);

        // /*we can add element directly on index, it will shift current index to +1 */
        // animal.add(2,"donkey");
        // System.out.println("after adding donkey to 2 index");
        // System.out.println(animal);

        // /*to remove value at index 1 */
        // animal.remove(1);
        // System.out.println(animal);

        // /*updating  */
        // animal.set(0,"ankit");

        // //Access one element from arrayList
        // String oneElement =animal.get(0);
        // System.out.println("THe animal in index 0 is "+ oneElement);

        // animal.set(0,"donkey");
        // System.out.println(animal);


        /*make an arrayList of int 
         * with values [100,200,300,400,500]
         * remove the value 500
         * add -100 at the first
         * update 300 to 350
         * update 400 to 420
         * Print the araaylist
        */

        // ArrayList<Integer> task= new ArrayList<>();
        // task.add(100);
        // task.add(200);
        // task.add(300);
        // task.add(400);
        // task.add(500);
        // task.remove(4);
        // task.add(0,-100);
        // task.set(3,350);
        // task.set(4,420);
        // System.out.println(task);


        // ArrayList<String> names= new ArrayList<>();
        // names.add("ram");
        // names.add("shyam");
        // names.add("haru");
        // names.add("bro");
        // //to get length of arraylist we use .size() function
        // int nameLength= names.size();
        // // it will return how many element is in the arraylist
        // //use for loop
        // for (int i= 0; i<nameLength;i++){
        //     System.out.println("names in index "+ i +" "+names.get(i));
        // }
        // System.out.println("using for each each loop in java");
        // // use collection for each 
        // for(String element : names){
        //     System.out.println(element);
        // }

        /* task
         *make an array list called animals
         [dog,cat, tiger, elephant]
         make two additional arraylsit wild and domestic
         loop the animals
         if the element is dog,cat add to domestic arraylist else in wild
         print domestic and wild 
         */

         ArrayList<String> animals= new ArrayList<>();
         animals.add("dog");
         animals.add("cat");
         animals.add("tiger");
         animals.add("elephant");
         ArrayList<String> domestic= new ArrayList<>();
         ArrayList<String> wild= new ArrayList<>();

         for (int i= 0; i<animals.size();i++){
         System.out.println("names in index "+ i +" "+animals.get(i));
            }

        for (int i= 0; i<animals.size();i++){
            if((animals.get(i)=="dog")||(animals.get(i)=="cat")){
                domestic.add(animals.get(i));
            }
            else{
                wild.add(animals.get(i));
            }
                }
            System.out.println("wild animals are : "+ wild);
            System.out.println("DOmestic animals are : "+ domestic);




    
    }}
