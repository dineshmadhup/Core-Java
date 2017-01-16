/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testcirclestaticmember;

/**
 *
 * @author PLANET
 */
public class TestCircleStaticMember {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is: "
        + CircleStaticMember.numberOfObjects);
    }
    
}
