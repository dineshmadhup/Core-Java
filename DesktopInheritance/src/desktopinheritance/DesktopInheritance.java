/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package desktopinheritance;

/**
 *
 * @author PLANET
 */
public class DesktopInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Desktop d  = new Desktop("celeron");
//        d.Display();
//        Laptop L = new Laptop("cerelon", "lithium");
//        L.Display();
        Tablet T = new Tablet("cerelon", "Lithium", "3D");
        T.Display();
    }
    
}
