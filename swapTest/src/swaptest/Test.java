/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swaptest;

/**
 *
 * @author PLANET
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        T t = new T();
        swap(t);
        System.out.println("e1 = " + t.e1 + "e2 = " + t.e2);
    }
    public static void swap(T t)
    {
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;
    }
}
class T
{
    int e1 = 1;
    int e2 = 2;
}
