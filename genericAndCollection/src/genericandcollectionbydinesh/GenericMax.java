/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericandcollectionbydinesh;

/**
 *
 * @author dinesh
 */
public class GenericMax {
    public static <E extends Comparable<E>> E max(E o1, E o2) {
        if(o1.compareTo(o2) > 0)
        
            return o1;
        
            else
            return o2;
        }
    
    public static void main(String[] args)
    {
        System.out.println(GenericMax.max(2, 3));
        
    }
}

/*****   In short:

this.compareTo(that)
returns

a negative int if this < that
0 if this == that
a positive int if this > that */


    

