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
public class AnyWildCardDemo {
    public static void main(String[] args)
    {
        GenericStack<Integer>intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-3);
        
        
        print(intStack);
        
    }
    
    public static void print(GenericStack<? extends Number> stack){
        while(!stack.isEmpty()) { 
        System.out.print(stack.pop() + " ");
    }
        
    }
}
