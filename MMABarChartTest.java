/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmabarchart;
/**
 *
 * @author diana
 */
public class MMABarChartTest {
    //BarChart
    public static void Barchart(int[] array){
        int[] BCarray = new int[11];
        
        for(int grades : array){
              ++BCarray[grades / 10];
             
        }//end outer for
        
        //printArray(BCarray);
        
        
        for(int counter = 0; counter < BCarray.length; counter++){
            
            if ( counter == 10 )
                System.out.printf( "%5d: ", 100 );
            else
                System.out.printf( "%02d-%02d: ",
                counter * 10, counter * 10 + 9 );
           
        // print bar of asterisks
            for ( int stars = 0; stars < BCarray[counter]; stars++ ){
                System.out.print( "*" );
            }//end inner for loop
            System.out.println();
        }//end out for loop
    }//end barchart
    
    //Maximum Number method
    public static int maxNumber(int[] array){
        int maxNum = array[0];
      
      for(int i = 0; i < array.length; i++){
         if(array[i] > maxNum)
             maxNum = array[i]; 
      }//end for loop
      return maxNum;
}//end max method
    
    //Minimum NUmber method
    public static int minNumber(int[] array){
        int minNum = array[0];
      
      for(int i = 0; i < array.length; i++){
         if(array[i] < minNum)
             minNum = array[i]; 
      }//end for loop
      return minNum;
    }//end min method
    
    //Average Grade
    public static double averageGrade(int[] array){
        int total = 0;
      
      for(int i = 0; i < array.length; i++){
         total += array[i];
         
      }//end for loop
      return total / array.length;
    }//end average grade

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
            
        }
         System.out.println();   
    }//end print array method

}//end class

