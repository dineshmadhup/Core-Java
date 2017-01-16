/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;
import java.util.*;

/**
 *
 * @author dinesh
 */
public class TestCollection {
    public static void main(String[] args)
    {
        ArrayList<String>c1 = new ArrayList<String>();
        c1.add("New York");
        c1.add("Atlanta");
        c1.add("Georgia");
        c1.add("Bankok");
        
        System.out.println(c1);
        System.out.println("New York in collection1?" + c1.contains("Atlanta"));
        
        System.out.println(c1.size() + " " +  "cities in collection1");
        
        ArrayList<String>c2 = new ArrayList<>();
        
        c2.add("Seatle");
        c2.add("Portland");
        c2.add("Los Angles");
        c2.add("Atlanta");
        
        System.out.println(c2);
        
        ArrayList<String>c3 = (ArrayList<String>)(c1.clone());
        
        c3.addAll(c2);
        System.out.println("Cities in collection1 and collection 2 are (UNION");
        System.out.println(c3);
        
        c3 = (ArrayList<String>)(c1.clone());
        c3.retainAll(c2);
        System.out.println("Cities which is common in c1 and c2:");
        System.out.println(c3);
        
         c3 = (ArrayList<String>)(c1.clone());
         c3.removeAll(c2);
         System.out.println("Cities which is is in c1 but not in c2 are:");
         System.out.println(c3);
        
        
        
    }
    
}
