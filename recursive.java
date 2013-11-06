package anoop_assignment_1;
/**
 * This class takes input from the user and then call a recursive function F and print value of the 
 * function. 
 * @author anoop
 */
import java.util.Scanner;
public class problem_4 
{
    int value;
    /**
     * 
     * @param n will take value entered by user.
     * @return the value of the recursive function.
     */
   public int F(int n)
   {   
       if(n==0)
       {
           return 3;
       }
       else if(n==1)
       {
           return 5;
       }
       else
           value= (F(n-1)+ 5*F(n-2)+n+3);
           return value;
   }
   /**
    * 
    * @param ar is an array of string type. 
    */
   public static void main(String ar[])
    {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter value of n:");
         int n= s.nextInt();
         problem_4 p=new problem_4();
         System.out.println(p.F(n));
    }
    
}
