/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minindexofarray;

import java.util.Scanner;

/**
 *
 * @author PLANET
 */
public class MinIndexOfArray {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        double[] numbers = new double[10];
//    
//    java.util.Scanner input = new java.util.Scanner(System.in);
//    System.out.print("Enter ten numbers: ");
//
//    for (int i = 0; i < numbers.length; i++) 
//      numbers[i] = input.nextDouble();
//
//    System.out.println("The index of the min is " + 
//        indexOfSmallestElement(numbers));
//  }
//  
//  public static int indexOfSmallestElement(double[] list) {
//    double min = list[0];
//    int minIndex = 0;
//
//    for (int i = 1; i < list.length; i++)
//      if (min > list[i]) {
//        min = list[i];
//        minIndex = i;
//      }
//
//    return minIndex;
//  }
//}



public static void main(String[] args) {
        double[] numbers = new double[1  ];
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    //System.out.print("Enter ten numbers: ");

    for (int i = 0; i < numbers.length; i++) 
      //numbers[i] = input.nextDouble();
        
        numbers[i] = getNumber(sc,  "Enter Number: " );

    System.out.println("The index of the min is " + 
        indexOfSmallestElement(numbers));
  }
  
  public static int indexOfSmallestElement(double[] list) {
    double min = list[0];
    int minIndex = 0;

    for (int i = 1; i < list.length; i++)
      if (min > list[i]) {
        min = list[i];
        minIndex = i;
      }

    return minIndex;
  }
  
  public static int getNumber(Scanner sc, String prompt)
  {
      int d = 0;
      boolean isValid = false;
      while(isValid == false)
      {
          System.out.print(prompt);
          if(sc.hasNextInt()){
              d = sc.nextInt();
              isValid = true;
          }
          else { System.out.println("Invalid decimal! Enter again"); }
          
          sc.nextLine();
      }
      return d;
  }
}