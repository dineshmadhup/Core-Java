/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circlepackage;

/**
 *
 * @author PLANET
 */
public class CirclePackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Circle circle1 = new Circle();
        System.out.println("The area of the circle of radious"
        + circle1.radius + "is" + circle1.getArea());
        
        //create a circle with radius 25
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius"
        + circle2.radius + "is" + circle2.getArea());
        
        //create a circle with radius 125
        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius"
        + circle3.radius + "is" + circle3.getArea());
        //Modify circle radius
        circle2.radius = 100;
        System.out.println("The area of the circle of radius"
        + circle2.radius + "is" + circle2.getArea());
    }
}
    
   