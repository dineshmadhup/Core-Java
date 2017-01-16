/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testenum;

/**
 *
 * @author PLANET
 */
public class TestEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShippingType secondDay = ShippingType.UPS_SECOND_DAY;
        System.out.println(secondDay);
        
        double charges = getShippingCharges(secondDay);
        System.out.println(charges);
    
        
}

public static double getShippingCharges(ShippingType st)
{
    double charges = 2.99;
    if(st == ShippingType.UPS_NEXT_DAY)
        charges = 10.99;
    else if(st == ShippingType.UPS_SECOND_DAY)
        charges = 5.99;
    return charges;
    
    
}
    

}
