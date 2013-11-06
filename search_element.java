/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anoop_assignment_2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author 2012
 */
public class third {
   // Random rnd=new Random();
     //double use = rnd.nextInt();
     double key=(double)(Math.random());
     
     // double ran_key=(double)(Math.random());    
        double[] random_array= new double[100000];
        // Linear Search Algorithm
    public static String linearSearch(double [] random_array, double ran_key)
    {
         System.out.print("Key: " + ran_key);
       
        for(int i=0; i<random_array.length;i++)
        {
            if(ran_key==random_array[i])
                return "Linear Search has found the number matched with the key " + ran_key;
        }
        return "Linear search didn't find the key "+ ran_key;
    }

    //Binary Search Algorithm
    
    public static String binarySearch(double[] random_array, double ran_key)
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
            return "Binary Search did not find the key " + ran_key;
        }
    
    
    public static void main(String args[])
    {
       
      third obj=new third(); 
       
        for(int i=0;i<100000;i++)
        {
            Random rr=new Random();
            obj.random_array[i]= rr.nextDouble();
       
            
        }
        /*for(int i=0;i<100000;i++)
        {
            System.out.println(obj.random_array[i]);     
        }*/
        Arrays.sort(obj.random_array);

       long startTime= System.currentTimeMillis();
        
               System.out.println(obj.linearSearch(obj.random_array, obj.key));
      
               long endTime= System.currentTimeMillis();
        System.out.println("Start time for linear search: " + startTime); 
         System.out.println("End time for linear search: " + endTime);
          long executionTime=endTime-startTime;
       System.out.println("The execution time for linear search is: " + executionTime + " milliseconds");
       System.out.println();
   
         
        for(int i=0;i<100000;i++)
        {
            Random rr=new Random();
            obj.random_array[i]= rr.nextDouble();    
        }
        Arrays.sort(obj.random_array);

        long startTimeForBinary= System.currentTimeMillis();
        
        
         System.out.println(obj.binarySearch(obj.random_array, obj.key));
        
         long endTimeForBinary= System.currentTimeMillis();
        
       System.out.println("Start time for binary search: " + startTimeForBinary); 
         System.out.println("End time for binary search: " + endTimeForBinary);
         long executionTimeForBinary=endTimeForBinary-startTimeForBinary;
        
         System.out.println("The execution time for binary search is: " + executionTimeForBinary + " milliseconds");
       
    }
    
}

   
