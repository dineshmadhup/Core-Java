/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testlinearequation;
import java.util.Scanner;

/**
 *
 * @author PLANET
 */
public class TestLinearEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
		
		// input the coefficient
		System.out.println("\nEnter the coefficients" + 
                        " a, b, c, d, e, and f: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		
		// new a LinearEquation object, and initial with constructor
		LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
                int Choice;
		//boolean Flag = false;
		//while(Flag == false)
                //{
                System.out.println("1) isSolvable() 2) getX() and getY() 3) Exit");
		System.out.print("choose option: ");
		Choice = input.nextInt();
                switch(Choice)
                {
                    case 1:
                        if(LinearEquation.isSolvable() == 0)
                            System.out.println("The equation has no solution");
                        else
                            System.out.println("There is a solution in the equations");
                        break;
                                                			
                    case 2:
                        if(LinearEquation.isSolvable() == 0)
                            System.out.println("The equation has no solution.");
                        else
                            System.out.println("The solution of equation is x = " 
                                    + LinearEquation.getX() + "and y = " + 
                                    LinearEquation.getY());
			break;
				
                    case 3:
                        //Flag = true;
                        break;
                    default:
                        break;
                        
			}
                
		}
	}
//}

    