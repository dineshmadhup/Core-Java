/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tradeapp;
import java.util.Scanner;

/**
 *
 * @author PLANET
 */
public class Tradeapp
{
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic
        System.out.println("Welcome to the trade center");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while(choice.equalsIgnoreCase("y"))
        {
            System.out.print("Enter trading price: ");
            double price = sc.nextDouble();
            double commissionPercent = 0.0;
            if(price >= 200)
                commissionPercent = .2;
            else if(price >= 1000)
                commissionPercent = .1;
            else
                commissionPercent = 0.0;
            double commisionAmount = price * commissionPercent;
            double total = price + commisionAmount;
            
            String message = "Commision Percent:" + commissionPercent + "\n"
                    + "Commision amount: " + commisionAmount + "\n"
                    + "Total amount: " + total + "\n";
            System.out.print(message);
            
            System.out.print("Continue?(y/n): ");
            choice = sc.next();
            System.out.println(choice);
            
           
        }
    }
    
}
