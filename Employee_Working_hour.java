/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;
import java.util.*;
/**
 *
 * @author anoop
 */
public class Assignment3 
{
    /**
     * 
     * @param ar is the employee array 
     * @return sorted array in descending order
     */
    public static Integer[][] mysort(Integer[][] ar) {
        Arrays.sort(ar, new Comparator<Integer[]>() 
        {
            @Override
            public int compare(Integer[] int1, Integer[] int2) 
            {
                Integer n1 = int1[8];
                Integer n2 = int2[8];
                return -n1.compareTo(n2);
            }
        });
        return ar;
    }
    
    public static void main(String args[])
    {
        Integer [][] emp_array={{0,2, 4, 6,2,9,5,8}, {1,6,3,8,2,9,6,9},{2,4,6,1,2,9,4,1},{3,9,4,6,3,3,6,8},{4,3,9,3,6,2,8,2},
            {5,4,6,7,3,2,4,9},{6,3,7,7,9,5,4,5},{7,3,5,7,4,3,1,4}};
       
    int[] total_hours=new int[emp_array.length];
    
    {
    for(int i = 0; i<8; i++)  
        {  
    for(int j = 1;j<=7; j++)  
    {  
    total_hours[i] = total_hours[i] + emp_array[i][j];  
        }  
    }
    }
    Integer[][] emp_array1=new Integer[8][9];
     for(int i=0;i<emp_array.length;i++)
        {
     
            for(int j=0;j<emp_array[i].length;j++)
            {
              emp_array1[i][j]=emp_array[i][j];
            }
            //System.out.println();
        }
     
 for(int i=0;i<=7;i++)
   {
       emp_array1[i][8]=total_hours[i];
   }
    System.out.println("The array after sorting is as follows:");
    String days1="            Sun   Mon  Tues  Wed  Thr  Fri  Sat  Total";
        System.out.println(days1);
        emp_array1 = mysort(emp_array1);
        for (Integer[] k : emp_array1) 
            {
        System.out.println("Employee" +k[0]  + "    " + k[1] + "    " + k[2] + "    " +k[3] + "     " + k[4] + "     " + k[5]+ "    " + k[6] + "     " + k[7]+ "      " + k[8]);
            
        
    
    }
    
   }
}  
