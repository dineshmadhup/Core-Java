/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package desktablap;

/**
 *
 * @author PLANET
 */
public class DeskTabLap {
    static public class Desktop
    {
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

static class Laptop extends Desktop 
{
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

static class Tablet extends Laptop
{
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



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Tablet T = new Tablet("cerelon", "Lithium", "3D");
        T.Display();
    }
}

   
    

