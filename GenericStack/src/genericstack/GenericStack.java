/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package genericstack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;

/**
 *
 * @author PLANET
 */
public class GenericStack <E> {
    private LinkedList <E> l;
    //constructor
    public GenericStack() {
    
        l = new LinkedList <>();
    }
    public void push(E item)
    {
        l.addLast(item);
    }
    public void pop()
    {
        l.removeLast();
    }
    //Get the first item without removing it
    public E front()
    {
        return l.peekLast();
    }
    //check to see queue is empty
    public boolean isEmpty()
    {
        return l.size() == 0;
    }

    
    public static void main(String[] args) {
        GenericStack <Integer> q = new GenericStack <> ();
        q.push(10);
        q.push(20);
        q.push(30);
        
        //Print
        while(!q.isEmpty()) {
            System.out.println(q.front());
            q.pop();
        }
        System.out.print("\n");
        
        
    }

    
}
