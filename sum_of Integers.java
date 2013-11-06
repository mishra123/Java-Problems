
package anoop_assignment_1;
/**
 * This class takes input from the user and print the sum of first n numbers.
 */
import java.util.Scanner;
/**
 *
 * @author anoop
 */
public class anoop_assignment_1
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any integer:");
        int n=s.nextInt();
        int sum= 0;
        /**
         * This loop produce the sum of first n numbers by saving them in a variable called sum.
         */
        for(int i=0; i<=n; i++)
        {
            sum=sum+i;
            }
        System.out.println("The sum of " + n + " integers are: "  + sum);
        System.out.println();
    }
}
