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
public class Tablet extends Laptop {
    private String gps;
    public Tablet(String cpu, String battery, String gps)
    {
        super(cpu, battery);
        this.gps = gps;
    }
    public void Display()
    {
        super.Display();
        System.out.print(gps);
    }
    
    
}
