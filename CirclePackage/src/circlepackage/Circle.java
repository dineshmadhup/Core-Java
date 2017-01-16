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
public class Circle {
    double radius;
    
    //Construct a circle with radius 1
    Circle()
    {
        radius = 1;
    }
    Circle(double newRadius)
    {
        radius = newRadius;
    }
    //Methods
    double getArea()
    {
        return radius * radius * Math.PI;
    }
    
}

    
