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
public class Desktop {
    private String cpu;
    public Desktop(String cpu)
    {
        this.cpu = cpu;
    }
    public void Display()
    {
        System.out.print(cpu);
        
    }
    
}
