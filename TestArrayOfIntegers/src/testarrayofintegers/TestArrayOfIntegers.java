/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testarrayofintegers;
import java.util.*;
/**
 *
 * @author PLANET
 */
public class TestArrayOfIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a collection
        ArrayList <Integer> col = new ArrayList<Integer>();
        
        //Show initial size
        System.out.println("Initial size: " + col.size());
        //store some objects in the collection
        for(int i = 0; i < 10; i++) {
            col.add(i + 10);
        }
        //show after addition
        System.out.println("Size after adddition: " + col.size());
        
        //use a for-each loop to show the collection
        System.out.println("Contents of col:");
        for(int x : col) {
            System.out.print(x + " ");
        }
        //see if the collection contains the value
        if(col.contains(12)) {
            System.out.println("\ncol contains the value 12");
        }
        if(col.contains(-9)) {
            System.out.println("\ncol contains the value -9");
        }
        System.out.println();
        //Create a another collection and then add it to the first
        
        ArrayList<Integer>col2 = new ArrayList<Integer>();
        col2.add(100);
        col2.add(200);
        col2.add(8);
        col2.add(-10);
        
        //show col2"
        System.out.println("Contents of col2");
        for(int x : col2) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
        
        //add col2 to col
        col.addAll(col2);
        //show the resulting collection
        System.out.println("Contents of col2");
        for(int x : col) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
        //use containsAll() to confirm that col now contains all of col2
        if(col.containsAll(col2))
            System.out.println("col cow contains all of col2");
        System.out.println("\n");
        
        //Now remove objects from collection
        col.remove((Integer) 10);
        col.remove((Integer) 200);
        //show the resulting collection
        System.out.println("Contents of col after removing elements 10 and 200: ");
        for(int x : col) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
        
        //Now removing entire col2 collection
        col.removeAll(col2);
        //show the resulting collection
        System.out.println("Contents of col after removing col2");
        for(int x : col) {
            System.out.print(x + " ");
        }
        
        //Add col2 to col again, and call retainAll().
        col.addAll(col2);
        //Remove all elements except those in col2
        col.retainAll(col2);
        
        //show the resulting collection
        System.out.println("\nContents of col after removing col2");
        for(int x : col) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        //Obtain an array from a collection
        Integer[] iarray = new Integer[col.size()]; //create an empty array of size same as col
        iarray = col.toArray(iarray);   
        //Display the contents of the array
        System.out.println("Contents of iarray: ");
        for(int i = 0; i < iarray.length; i++) {
            System.out.println(iarray[i] + " ");
        }
        System.out.println();
        
        //Remove all elements form the collection
        System.out.println("Removing all elements from col.");
        col.clear();
        if(col.isEmpty()) {
            System.out.println("col is now empty.");
        }
    }
    
}
