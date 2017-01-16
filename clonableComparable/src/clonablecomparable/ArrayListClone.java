/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonablecomparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author dinesh
 */
public class ArrayListClone {
    public static void main(String[] args){
     
//        String [] nameListSet1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
//        String [] nameListSet2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
    
    //Create a Array List Set1 
    ArrayList<String> set1 = new ArrayList<String>();
    set1.add("George");
    set1.add("Jim");
    set1.add("John");
    set1.add("Blake");
    set1.add("Kevin");
    set1.add("Michael");
    //Cloning the set1
    ArrayList<String> clone1Set1 = (ArrayList<String>)set1.clone();
    ArrayList<String> clone2Set1 = (ArrayList<String>)set1.clone();
    //Create a Hash Set2 
    ArrayList<String> set2 = new ArrayList<String>();
    set2.add("George");
    set2.add("Katie");
    set2.add("Kevin");
    set2.add("Michelle");
    set2.add("Ryan");
    //Displaying set1 and set2
    System.out.println("Set#1 Items: " + set1);
    System.out.println("Set#2 Items: " + set2);
    //Union
    set1.addAll(set2);
    System.out.println("\n\nUnion of set#1 and Set#2 is: " + set1);
    //Difference
    clone1Set1.removeAll(set2);
    System.out.println("Difference between set#1 and Set#2 is: " + clone1Set1);
    //Intersection
    clone2Set1.retainAll(set2);
    System.out.println("Intersection of set#1 and Set#2 is: " + clone2Set1);  
       
  }
    
}
