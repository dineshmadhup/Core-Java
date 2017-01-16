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
abstract class Computer {       //abstract class
    protected int id;
    protected String type;
    protected double price;
    
    public Computer(int id, String type, double price)
    {
        this.id = id;
        this.type = type;
        this.price = price;
    }
    abstract String getDescription();   //abstract method of computer class
}
    
    class Laptop extends Computer {
        private String battery;
        public Laptop(int id, String type, double price, String battery) {
            super(id, type, price);
            this.battery = battery;
        }
        @Override
        public String getDescription() {
            return id + "," + type + "," + price + "," + battery;
        }
    }

        
  