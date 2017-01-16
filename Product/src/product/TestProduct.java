/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package product;
import java.lang.Class;

/**
 *
 * @author PLANET
 */
public class TestProduct {
    public static void main(String args[])
    {
        Product p = new Product();
        Class c = p.getClass();
        System.out.println("Class name: " + c.getName());
        
        p = new Book();
        if(p instanceof Book)
        {
            System.out.println("This is a Book Object.");
        }
    }
    
}
