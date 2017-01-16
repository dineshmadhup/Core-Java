/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sum;

import java.util.Scanner;

/**
 *
 * @author PLANET
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        double num1 = input.nextDouble();
        System.out.println("Enter num2: ");
        double num2 = input.nextDouble();
        System.out.println("Enter num3: ");
        double num3 = input.nextDouble();
        //int num1, num2, num3;
        if(num1>num2&&num1>num3)
        {
          System.out.println(" First number is greatest:" + "whick is= " + num1);
        }
        else if(num2>num1&&num2>num3)
        {
          System.out.println(" Second number is greatest:" + "whick is= " + num2);
        }
        else
        {
        System.out.println(" Third number is greatest:" + "whick is= " + num3);
        }
       }
    
     }
