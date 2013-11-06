/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anoop_assignment_2;

/**
 *
 * @author anoop
 */
import java.util.*;
public class problem_2
{
        double ran_key=(double)(Math.random());    
        int[] random_array= new int[100000];
        /**
         * 
         * @param random_array takes random number generated in an array as an argument.
         * @param ran_key takes random number as a key which would be a double value.
         * @return will return a string which will tell whether it could have found the matched value from 
         * the array or not
         */
        
    public static String linearSearch(int [] random_array, double ran_key)
    {
         System.out.print("Key: " + ran_key);
       
        for(int i=0; i<random_array.length;i++)
        {
            if(ran_key==random_array[i])
                return "Linear Search has found the number matched with the key " + ran_key;
        }
        return "Linear search didn't find the key "+ ran_key;
    }
    /**
     * 
     * @param random_array takes random number generated in an array as an argument.
     * @param ran_key takes random number as a key which would be a double value.
     * @return  will return a string which will tell whether it could have found the matched value from 
       the array or not
     */
        public static String binarySearch(int[] random_array, double ran_key)
        {
            int low=0;
            int high=random_array.length-1;
            while(high>=low)
            {
                int mid=(low+high)/2;
                if(ran_key< random_array[mid])
                high=mid-1;
                else if(ran_key== random_array[mid])
                    return "Binary search has found the key " + ran_key;
                else
                    low=mid+1;
            }
            return "Binary Search could not find the key " + ran_key;
        }
    
    
    public static void main(String args[])
    {
       
      problem_2 pp=new problem_2(); 
        
        for(int i=0;i<100000;i++)
        {
            pp.random_array[i]=(int)(Math.random());
            
        }
            //Arrays.sort(pp.random_array);
         for(int i=0;i<100000;i++)
         {
             System.out.println(pp.random_array[i]);
         }
        long startTime= System.currentTimeMillis();
        System.out.println(pp.linearSearch(pp.random_array, pp.ran_key));
        long endTime= System.currentTimeMillis();
        System.out.println("Start time for linear search: " + startTime); 
         System.out.println("End time for linear search: " + endTime);
          long executionTime=endTime-startTime;
       System.out.println("The execution time for linear search is: " + executionTime + " milliseconds");
        
        long startTimeBinary= System.currentTimeMillis();
        
        long endTimeBinary= System.currentTimeMillis();
        System.out.println("Start time for binary search: " + startTimeBinary); 
         System.out.println("End time for binary search: " + endTimeBinary);
        
         System.out.println(pp.binarySearch(pp.random_array, pp.ran_key));
         long executionTimeBinary=endTimeBinary-startTimeBinary;
       System.out.println("The execution time for linear search is: " + executionTimeBinary + " milliseconds");
       
    }
    
}
