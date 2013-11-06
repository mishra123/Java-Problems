package excercise.pkg2;
import java.util.Scanner;
public class problem_2 
{
   
    public static void main(String args[])
    {
       
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number");
      int z= s.nextInt();

      if(z>99999)
      {
          System.out.println("You have to enter 5 digit number");
      }
      int a= z%10;
       int small= z/10;
       int b= small%10;
       small= small/10;
       int c = small%10;
       int d=small/10;
       System.out.println(d + " " + " " + c + " " + b + " "+ a);
       
               }
    
}
