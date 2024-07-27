public class ArrayClass {
    public static void main(String[] args) {
        // /*Array declaration */
        // int[] myFirstArray;
        // /*Array initialization */
        // myFirstArray=new int[5]; //5 is the size
        // int arraySize= myFirstArray.length;
        // System.out.println("Total element in array is: "+arraySize);

        // int [] myFirstArray;
        // myFirstArray=new int[5];
        // myFirstArray[0]=10;
        // myFirstArray[1]=20;
        // System.out.println("array value is " +myFirstArray[0]+" and "+myFirstArray[1]);
        
        
        // /*Array Declaration and initialization */
        // int[] mySecondaryArray = new int[20];
        // /*array declaration, initializing and value */
        // int[] mythirdArray={10,20,30,40};
        // /* or */
        // int[]myFourthArray= new int[]{1,2,3,4};


        /*task 
         * make an array myFirstArray with the size of 10
         * values should be 10,20, 30, 40,50 ,60 ,70,80,90,100 
         * print each index ,from 0-9//loop is optinal
         * with each print also print value multiplied by 2 
         * */
         int [] myFirstArray={10,20,30,40,50,60,70,80,90,100};
         for(int i=0;i<=9;i++){
            System.out.println(myFirstArray[i]+" at index "+i+" "+myFirstArray[i]*2);
         }






    }
}
