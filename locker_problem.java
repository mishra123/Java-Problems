/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anoop_assignment_2;

/**
 *
 * @author anoop
 */
public class Anoop_assignment_2 
{
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    String[] lock= new String[101];
    /**
     * This for loop will set all the lockers closed before any student enters into the building.
     */
    for(int i=1;i<=100;i++)
    
        lock[i]="closed";
    /**
     * This nested for loop will toggle the value of lockers when students will enter into the building to operate lockers.
     * 
     */
    
    for(int i=1;i<=100;i++)
    {
        for(int n=i;n<=100;n++)
        {
            if(n%i==0)
            {
                if(lock[n].equals("closed"))
                
                lock[n]="opened";           
            else
                
                lock[n]="closed";
                
        }
    
    }
    }
    /**
     * This for loop will print the the value of lockers. If the locker will close then it will print closed
     * otherwise it will print open.
     */
        for(int k=1;k<=100;k++)   
        {
            if(lock[k].equals("opened"))
            {
            System.out.println("Lock " + k + " is open");
            }
            
        }
    } 
}