/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistofchars;
import java.util.*;
/**
 *
 * @author PLANET
 */
public class ArrayListOfChars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Creating an ArrayList called al");
        ArrayList <Character> al = new ArrayList<Character>();
        //Add elements
        al.add('A');
        al.add('B');
        al.add('D');
        System.out.println("al in index order: ");
        for(int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        //Print with enhanced for loop
        System.out.println("Result of Enhanced for loop");
        for(char x : al) { 
            System.out.print(x + " ");
        }
        System.out.println();
        //set value of the last element
        al.set(al.size() - 1, 'X');
        System.out.println("al after setting last element: ");
        for(int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println("\n");
        //Add another C
        System.out.println("al after adding another C: ");
        al.add('C');
        for(int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println("\n");
        
     
    }
    
}
