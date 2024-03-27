/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twodarray;

/**
 *
 * @author diana
 */
public class TwoDArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] array1 = { {1,2,3},{4,5,6} };
        int[][] array2 = { {1,2}, {3}, {4,5,6} };
        
        System.out.println("Values in array1 by row are:");
        outputArray(array1);
        System.out.printf("The average value of array1 is: %.1f", getAverage(array1));
        
        System.out.println("\n\nValues in array2 by row are:");
        outputArray(array2);
        System.out.printf("The average value of array2 is: %.1f\n", getAverage(array2));
    
    }//end main
    
    public static void outputArray(int[][] array){
        for ( int row = 0; row < array.length; row++ ) {
            for (int column = 0; column < array[ row ].length; column++)
                System.out.printf("%d ", array[ row ][ column ]);
            System.out.println();

        } //end outer loop
    }//end outputArray method
    
    public static double getAverage(int[][] array){
        int total = 0;
        int counter = 0;
        
        for(int[] row : array){
           for(int num : row){
               total += num;
               counter++;
           }//end inner loop
        }//end out for loop
        return (double) total / counter;
    }//end getAverage method

}//end class
