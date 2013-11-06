package anoop_assignment_1;
/**
 * This class takes input from the user and then displays a multiplication table modulus n where n is the 
 * number entered the user.
 */
import java.util.Scanner;
/**
 *
 * @author anoop
 */
public class problem_3 
{
    public static void main(String abc[])
    {
        int table;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int n = s.nextInt();
        /**
         * This is a nested loop which is used to calculate the table and then produce the modulus and print.
         */
        for(int i=1; i<=12; i++)
        {
            for(int j=1;j<=12;j++)
            {
               table= i*j;
               System.out.print(table%n+ "   ");
            }
            System.out.println();
        }
    }
    
}
