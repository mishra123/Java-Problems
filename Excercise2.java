/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise.pkg2;
import java.util.Scanner;
/**
 *
 * @author 2012
 */
public class Excercise2 
{

    public static void main(String[] args) 
    {
        int i;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter First Number: ");
       int i1=sc.nextInt();
       System.out.println("Enter Second Number: ");
       int i2=sc.nextInt();
       System.out.println("Enter third Number: ");
       int i3=sc.nextInt();
       int sum=i1+i2+i3;
       System.out.println("The Sum of three integers" + sum);
       double average=sum/3;
       System.out.println("Average of three numbers " + average);
       int product=i1*i2*i3;
       System.out.println("The product of three numbers are:" + product);
       
       if((i1>i2)&&(i1>i3))
       {
           System.out.println("i1 is greatest");
       }
       else if((i2>i1)&&(i2>i3))
       {
           System.out.println("i2 is greatest");
       }
       else
       {
           System.out.println("i3 is greatest");
    }
    
    if((i1<i2)&&(i1<i3))
       {
           System.out.println("i1 is smallest");
       }
       else if((i2<i1)&&(i2<i3))
       {
           System.out.println("i2 is smallest");
       }
       else
       {
           System.out.println("i3 is smallest");
    }
    if(i1%2==0)
    {
        System.out.println("Number i1 is even");
    }
    else
    {
        System.out.println("Number i1 is odd");
    
}
    if(i2%2==0)
    {
        System.out.println("Number i2 is even");
    }
    else
    {
        System.out.println("Number i2 is odd");
    
}
 if(i3%2==0)
    {
        System.out.println("Number i3 is even");
    }
    else
 {
        System.out.println("Number i3 is odd");
    
}
    }
}