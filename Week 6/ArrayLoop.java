public class ArrayLoop {
    public static void main(String[] args) {
        // int[] array1 ={20,40,60,80,100,120};
        // int araylength=array1.length;
        // /*either loop from 0 and index<arraylength 
        //  * or loop from 0 and length -1
        // */
        // for (int i=0; i<araylength;i++){
        //     System.out.println("Value in index "+ i +" ."+array1[i]);
        // }
        // /*desending order */
        // for (int i=araylength-1;i>=0;i--){
        //     System.out.println("descendin= " + array1[i]);
        // }

        // int i=0;
        // while(i<araylength){
        //     System.out.println("Value in index "+ i +" ."+array1[i]);
        //     i++;
        // }

        // int j=araylength-1;
        // while(j>=0){
        //     System.out.println("Value in index "+ j +" ."+array1[j]);
        //     j--;
        // }

        int[] array1 ={50,40,30,20,10};
        int araylength=array1.length;
        int[]array2= new int[5];
        int j=0;
        for(int i=araylength-1;i>=0;i--){
            array2[j]=array1[i];
            System.out.println(array2[i]);
            j++;
        }
        for (int ii=0;ii<array2.length-1;)





        }
    }

