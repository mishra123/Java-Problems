/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2012
 */
public class Animal 
{
    int number=1000;
    public void behave()
    {
        System.out.println("All Animals eat");
    }
    public void sound()
    {
        System.out.println("All produce some specific sounds");
    } 
}
class mammal extends Animal
{
    public void unique()
    {
        System.out.println("They give birth to live young mammals instead of laying eggs");
    }
}
class cat extends mammal
{
    int legs=4;
    public void sound()
    {
        System.out.println("Produce miaaaooooo");
    }
}
class dog extends mammal
{
    public void bite()
    {
        System.out.println("Dog's bite hurts");
    }
    public void sound()
    {
        System.out.println("Dogs bark");
    }
}

 class main
 {
     public static void main(String args[])
     {
         Animal a=new cat();// Upcasting
         a.sound();// Produce sound of cat because of cat constructor calling
        //But you can't access the things of cat class e.g leg
         //upcasting is implicit but downcasting is always explicit
         System.out.println(a.number);
         cat c=(cat)a;// Downcasting
         System.out.println(c.number);
         System.out.println(c.legs);
         mammal m=new dog();
         System.out.println(m.number);
        
     }
 }
