/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package posneg;

import java.util.Scanner;

/**
 *
 * @author Dinesh
 */
public class Posneg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 1 to 999: ");
        int num = input.nextInt();
        if(num>0)
        {          
            System.out.print(num + " is a Positive Number ");
 
         if(num<10)
         {
             System.out.print(num + " is a ONE digit Number ");
         }
           
         else if(num<100)
         {
              System.out.print(num + " is a  TWO digit Number ");
         }
         else if(num<1000)
         {
                 System.out.print(num + " is a Three digit Number ");
         }
        }
    }
}
    
    
    

