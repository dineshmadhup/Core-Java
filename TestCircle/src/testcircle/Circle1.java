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
class Circle1{
    double radius;
    static int numberofobjects = 0;
    
    //Construct a circle with radius 1
    Circle1()
    {
        radius = 1;
        numberofobjects++;
    }
    Circle1(double newRadius)
    {
        radius = newRadius;
        numberofobjects++;
    }
    //Methods
    double getArea()
    {
        return radius * radius * Math.PI;
    }
    static int getnumberofobjects()
    {
        return numberofobjects;
    }
    
    
}

