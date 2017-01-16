/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package computer;

/**
 *
 * @author PLANET
 */
public class TestAbstractClass {
    public static void main(String[] args) {
        Computer comp = new Laptop(1234, "notebook", 1000, "200kwh");
        System.out.println(comp.getDescription());
    }
    
}
