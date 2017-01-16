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
public class Laptop extends Desktop {
    private String battery;
    public Laptop(String cpu, String battery)
    {
        super(cpu);
        this.battery = battery;
    }
    public void Display()
    {
        super.Display();
        System.out.print(battery);
        
    }
    
}
