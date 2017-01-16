/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionclassnotes;
import java.util.Scanner;
import java.text.NumberFormat;

public class ExceptionClassNotes {

    
    public static void main(String[] args) {
        System.out.println("The Future Value Calculator\n");
        Scanner sc = new Scanner(System.in);
        
        //get input from user
        String choice = "y";
        while(choice.equalsIgnoreCase("y"))
        {
            double monthlyInvestment = 0.0;
            double interestRate = 0.0;
            int years = 0;
            try
            {
                System.out.printf("Enter monthly investment: ");
                monthlyInvestment = sc.nextDouble();
                System.out.printf("Enter yearly interest rate: ");
                interestRate = sc.nextDouble();
                System.out.print("Enter number of years: ");
                years = sc.nextInt();
            }
            catch(Exception e)
            {
                sc.next();
                System.out.println("Error! Invalid number. Try again.\n");
                continue;
            }
            
            //calculate future value
            double monthlyInterestRate = interestRate/12/100;
            int months = years * 12;
            double futureValue  = calculateFutureValue(monthlyInvestment, 
                    monthlyInterestRate, months);
            
            //format and display the result
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            System.out.println("Future value:   " + currency.format(futureValue) + "\n");
            
            //see if the user wants to continue
            System.out.print("Continue?(y/n");
            choice = sc.next();
            System.out.println();
            
            
        }//end of while
       
    }//end of main
    
    private static double calculateFutureValue(double monthlyInvestment, 
                    double monthlyInterestRate, int months){
        
        double futureValue = 0;
        for(int i = 1; i <= months; i++)
        {
            futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
        }
        
        return futureValue;
        
    }
    
}
