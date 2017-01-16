/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testcircle;

/**
 *
 * @author PLANET
 */
public class TestCircle {
    private static String numberofobjects;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Circle1 c1 = new Circle1();
        System.out.println("The area of the circle of radious "
        + c1.radius + " is " + c1.getArea() + "and num of circle objects: " + c1.numberofobjects);
        
        //create a circle with radius 25
        Circle1 c2 = new Circle1(25);
        System.out.println("The area of the circle of radius "
        + c2.radius + " is " + c2.getArea()+ "and num of circle objects: " + c2.numberofobjects);
        
        //create a circle with radius 125
        Circle1 c3 = new Circle1(125);
        System.out.println("The area of the circle of radius "
        + c3.radius + " is " + c3.getArea() + "and num of circle objects: " + c2.numberofobjects);
        
        //Modify circle radius
        c2.radius = 100;
        System.out.println("The area of the circle of radius "
        + c2.radius + " is " + c2.getArea() + "and num of circle objects: " + c2.numberofobjects);
        
        System.out.println("\nThe total number of circle objects created is: " + c3.numberofobjects);
    }
    
}

   