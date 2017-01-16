/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package printreversearray;

import java.util.Scanner;

/**
 *
 * @author PLANET
 */
public class PrintReverseArray {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        
//    java.util.Scanner input = new java.util.Scanner(System.in);
//    int[] num = new int[19]; //declare array
//
//    for (int i = 0; i < 5; i++) {
//      // Read a number
//      System.out.print("Read a number: ");
//
//      num[i] = input.nextInt();
//    }
//
//    // Display the array
//    for (int i = 4; i >= 0; i--) {
//      System.out.print(num[i]);
//    }
//    }
//    
//}

  public static void main(String[] args) {
      
              
    Scanner sc = new Scanner(System.in);
    int[] num = new int[10]; //declare array
    
    //int number = getNumber(sc, "Read a number: " );
    

    for (int i = 0; i < 5; i++) {
      // Read a number
      //System.out.print("Read a number: ");

      //num[i] = sc.nextInt();
        num[i] = getNumber(sc, "Enter Number: " );
    }

    // Display the array
    for (int i = 4; i >= 0; i--) {
      System.out.print(num[i]);
    }
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
