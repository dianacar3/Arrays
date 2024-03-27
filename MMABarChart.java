/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mmabarchart;
import java.util.Random;
/**
 *
 * @author diana
 */
public class MMABarChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Random randomNumbers = new Random();
      int[] array;
      array = new int[30];
      
      for(int i = 0; i < array.length; i++){
          array[i] = 1 + randomNumbers.nextInt(100);
          
      }//end for loop
      
        MMABarChartTest.printArray(array);
      
        System.out.print("Grade Distribution: \n");
        
        MMABarChartTest.Barchart(array);
     
        int max = MMABarChartTest.maxNumber(array);
        System.out.println("Maximum Grade: " + max);
        
        int min = MMABarChartTest.minNumber(array);
        System.out.println("Minimum Grade: " + min);
        
        double average = MMABarChartTest.averageGrade(array);
        System.out.println("Average Grade: " + average);
        
      
   }//end main

}//end class
