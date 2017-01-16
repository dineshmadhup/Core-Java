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
public class TestIterator {
    public static void main(String [] args){
        
        Collection<String> c1 = new ArrayList<>();
        c1.add("New York");
        c1.add("Atlanta");
        c1.add("Dallas");
        c1.add("Madison");
        
//        Iterator<String> iterator = c1.iterator();
//        while(iterator.hasNext()){
//            
//            System.out.print(iterator.next().toUpperCase() + " ");
//        }
//        System.out.println();
        
        for(String element: c1)
            System.out.println(element.toUpperCase() + " ");
        
    }
    
}
