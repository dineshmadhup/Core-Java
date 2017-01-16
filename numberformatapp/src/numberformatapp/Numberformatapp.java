/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numberformatapp;
import java.text.NumberFormat;

/**
 *
 * @author PLANET
 */
public class Numberformatapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                double price = 72.95;
        
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        String s = cf.format(price);
        System.out.println(s);
        
        NumberFormat pf = NumberFormat.getPercentInstance();
        s = pf.format(price);
        System.out.println(s);
        
        NumberFormat nf = NumberFormat.getNumberInstance();
        s = nf.format(price);
        System.out.println(s);
        
    }
    
}

   