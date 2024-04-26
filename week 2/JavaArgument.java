public class JavaArgument {
    public static void main(String[] args){
        /* THe args in the main function can be used
         * to take input from command line 
         * when executing the file we can pass argument
         * Eg:
         * java JavaArgument arg1 arg2
         * the arg1 and arg2 can be accessed from args
         */
        if(args.length<2){
            System.out.println("please provide 2 arguments");
            return;    
        }
        /* use index of args array to access */
        System.out.println("argument1 is : "+ args[0]);
        System.out.println("argument2 is : "+ args[1]);
        
    }
}