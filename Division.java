import java.util.Scanner;
public class problem_3 

{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an Integer");
        int number=s.nextInt();
        if((number%5==0)&&(number%6==0))
        {
            System.out.println("Number " + number + " is divisible by both 5 and 6");
        }
        else if((number%5==0)&&(number%6!=0))
        {
            System.out.println("Number "  + number + " is divisible by 5 but not by 6");
        }
        else if ((number%5!=0)&&(number%6==0))
        {
            System.out.println("Number " + number + " is divisible by 6 but not by 5");
        }
        else
        {
            System.out.println("Number " +number + " is neither divisible by 5 nor by 6");
        }
    }
    
}
