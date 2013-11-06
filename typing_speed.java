package anoop_assignment_1;
/**
 * This class will ask user to enter a string "I type very quickly" and will print the number 
 * of milliseconds taken by the user to type this string.
 * @author anoop
 */
import java.util.*;
public class problem_6 
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println( "You job is to type the sentence 'I type very quickly' When You are ready, "
                + "press enter, type the sentence, and press enter again...\n "
                + "Now press Enter....");
                s.nextLine();
                System.out.println("Enter String:");
                Date d =new Date();
                long start_time;
                start_time = System.currentTimeMillis();
                String entered_string=s.nextLine();
                long end_time = System.currentTimeMillis();
                long time_taken=end_time-start_time;
               
                 if(entered_string.equals("I type very quickly"))
                {
                   System.out.println("You have taken " + time_taken + " milliseconds." );  
                }
                
                        else
                {
                    System.out.println("You have entered a wrong string");
                }
               
                System.out.println();
                     }
    }

