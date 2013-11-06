package anoop_assignment_1;
/**
 * This class takes user input for number of dice rolls and then simulate the dice and print the
 * sum. The class also print the percentage of frequency of each total.  
 * @author anoop
 */
import java.util.Scanner;
import java.util.*;
public class problem_5 
{
    
     int r1,r3,r2,sum;
     /**
      * @function dice_roll generate two random numbers starting from 1 to 6 and then add those numbers 
      * and store in a variable called sum.
      */
    public void dice_roll()
    {
        r1 = (int)((Math.random()*6)+1);
//System.out.println(r1);
        r2= (int)((Math.random()*6)+1); 
        sum=r1+r2;
    }
   
    public static void main(String aa[])
    {
       int[] array1 = new int[ 13 ];         
       int percent,actual_percent;
       problem_5 pp=new problem_5();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rolls: ");
        int roll= s.nextInt();
        /**
         * This loop call the dice_roll method and then will print dice occurence  and their respective sum.
         * Also, this will store the frequency of occuring the number from 2 to 12.
         */
        for(int i=1;i<=roll; i++)
        {
            pp.dice_roll();
            System.out.print(pp.r1+ "   ");
            System.out.print(pp.r2+ "   ");
            System.out.print(pp.sum);
            System.out.println();
            ++array1[pp.sum]; 
        }
        /**
         * This loop will calculate the percentage of the frequency of dice occurences and then will print
         * as many "*" signs as percent will be.
         */
         for ( int face = 2; face <= 12; face++ ) 
         {
            percent= array1[face]*100;
            actual_percent=percent/roll;
            System.out.print( face + " appears "+ actual_percent + " percent times  ");
            for(int i=1;i<=actual_percent;i++)
            {
            System.out.print("*");
            }  
            System.out.println();
         }
    }
}