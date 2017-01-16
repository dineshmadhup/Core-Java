/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testproduct;

/**
 *
 * @author PLANET
 */
public class TestProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double price = 56.7;
        price = increasePrice(price);
        System.out.println("Price:" + price);
        
        Product product = new Product();
        increasePrice(price);
        System.out.println("Price:" + price);
    }
    static double increasePrice(double price)
    {
        return price*1.2;
    }
    static void increasePrice(Product product)
    {
        double price = product.getPrice();
        product.setPrice(price * 1.2);
        
    }
}
