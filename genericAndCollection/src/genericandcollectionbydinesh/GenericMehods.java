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
public class GenericMehods {
    public static void main(String[] args)
    {
        Integer[] integers = {1,2,3,4,5};
        String[] strings = {"London", "Paris", "New York", "Austin"};
        
//        GenericMehods.<Integer>print(integers);
//        GenericMehods.<String>print(strings);
        print(integers);
        print(strings);
    }
    
    public static <E>void print(E[] list){
        for(int i = 0; i < list.length; i++)
        {
            System.out.println(list[i] + "");
        }
    }
}
