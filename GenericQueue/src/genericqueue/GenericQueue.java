/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package genericqueue;

import java.util.LinkedList;

/**
 *
 * @author PLANET
 */
public class GenericQueue <E> {
    private LinkedList <E> l;
    public GenericQueue()
    {
        l = new LinkedList <>();
    }
    public void Enqueue(E item)
    {
        l.addLast(item);
    }
    public void Dequeue()
    {
        l.removeFirst();
    }
    //Get the first item without removing it
    public E front()
    {
        return l.peek();
    }
    //check to see queue is empty
    public boolean isEmpty()
    {
        return l.size() == 0;
    }

    
    public static void main(String[] args) {
        GenericQueue <Integer> q = new GenericQueue <> ();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        
        //Print
        while(!q.isEmpty()) {
            System.out.print(q.front() + " ");
            q.Dequeue();
        }
        System.out.print("\n");
        
        
    }

    
}
