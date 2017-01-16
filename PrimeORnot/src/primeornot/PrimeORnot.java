/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primeornot;

import java.util.Scanner;

/**
 *
 * @author PLANET
 */
public class PrimeORnot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count=0;
        Scanner input = new Scanner(System.in);
		System.out.print("ENTER NUMBER TO CHECK IT IS PRIME OR NOT: ");
		int number = input.nextInt();
           for(int a=1;a<=number;a++)
               {
                if(number%a==0)
                   {
                  count++;
                   }
               }
       if(count==2)
         {
          System.out.println(" YES, Your entered numer is PRIME");
         }
       else
         {
            System.out.println(" OOPS!!!NOT A PRIME NUMBER");
         }
       
       }
    }
    

