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
public class CircleStaticMember {
    double radius;
    static int numberOfObjects = 0;
    CircleStaticMember()
    {
        radius = 1;
        numberOfObjects++;
    }
    CircleStaticMember(double newRadius)
    {
        radius = newRadius;
        numberOfObjects++;
    }
    int getNumberOfObjects()
    {
        return numberOfObjects;
    }
    
    double getArea()
    {
        return radius * radius * Math.PI;
    }
    
}

    
