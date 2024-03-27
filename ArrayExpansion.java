/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayexpansion;

/**
 *
 * @author diana
 */
public class ArrayExpansion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array  = {2, 3, 4, 5, 6, 9, 8, 7, 1, 8};
        int[] newArray = array;
        
        
        //Original array(a)
        System.out.println("After (a) new array of ten integers");
        printArray(array);
        System.out.println();
        
        //Step 1(b)
        System.out.println("After (b) step 1 of expansion");
        printArray(array);
        printnewArray(newArray);
        
        //Step 2(c)
        array = new int[12];
        System.out.println("\nAfter (c) step 2 of expansion");
        printArray(array);
        printnewArray(newArray);
        
        //Step 3(c) copy original integers
        System.arraycopy(newArray, 0, array, 0, 10);
        System.out.println("\nAfter (c) step 3 of expansion (copy original integers)");
        printArray(array);
        printnewArray(newArray);
        
        //(d)
        System.out.println("\nAfter (d)");
        newArray = null;
        printArray(array);
        printnewArray(newArray);

    }//end main
    
    public static void printArray(int[] array){
        System.out.print("array ==>  ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            
            if (i != array.length - 1)
                    System.out.print(", ");
        
        }//end for loop
        System.out.println();
    }//end printArray method
    
    public static void printnewArray(int[] newArray){
        System.out.print("original ==>  ");
        
        if(newArray != null){
        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i]);
            
            if (i != newArray.length - 1){
                    System.out.print(", ");
            }//end inner if statement
        }//end for loop
        System.out.println();
        }//end if outer statement
        else
            System.out.println("null");
    }//end printnewArray
}//end class
