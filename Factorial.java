 
package anoop_assignment_1;

/**
 * This class takes input from the user and print the factorial of the number.
 */
import java.util.Scanner;

/**
 *
 * @author anoop
 */
public class problem_2 
{
    public static void main(String args[])
    {
          Scanner s=new Scanner(System.in);
          System.out.println("Enter any integer:");
          int n= s.nextInt();
          int fact=1;
          /**
         * This loop produce the factorial of  number n using a variable called fact.
         */
          for(int i=1;i<=n;i++)
          {
              fact=fact*i;
          }
          System.out.println("The factorial of " + n + " is " + fact);
    }
    
    
}
