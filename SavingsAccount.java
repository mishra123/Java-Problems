/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise.pkg4;

/**
 *
 * @author 2012
 */
public class SavingsAccount 
{
    static double annualInterestRate=4;
    private double savingsBalance;
    public double calculateMonthlyInterest(double balance, double int_rate)
    {
        this.savingsBalance=balance;
        this.annualInterestRate=int_rate;
        double month_interest=((savingsBalance*annualInterestRate)/12/100);
        savingsBalance= month_interest + savingsBalance;
        return savingsBalance;
        
        
    }
    
    /*public static double modifyInterestRate(double savingsBalance)
    {
       double new_savingBalance=savingsBalance;
       return new_savingBalance;
    }*/
    public static void main(String args[])
    {
        SavingsAccount saver1= new SavingsAccount();
        SavingsAccount saver2= new SavingsAccount();
        saver1.savingsBalance=2000.00;
        saver2.savingsBalance=3000.00;
        System.out.println("Balance before adding interest in saving account 1 is: " + saver1.savingsBalance);
        System.out.println("Balance before adding interest in saving account 2 is: " + saver2.savingsBalance);
        
        System.out.println("Balance in saving account 1 after adding one year interest is : " + saver1.calculateMonthlyInterest(saver1.savingsBalance, annualInterestRate));
        System.out.println("Balance in saving account 2 after adding one year interest is : " + saver2.calculateMonthlyInterest(saver2.savingsBalance, annualInterestRate));
       annualInterestRate++;
        System.out.println("Balance in saving account 1 after adding two years interest is : " + saver1.calculateMonthlyInterest(saver1.savingsBalance, annualInterestRate));
        System.out.println("Balance in saving account 2 after adding two years interest is : " + saver2.calculateMonthlyInterest(saver2.savingsBalance, annualInterestRate));
            
    }
}
