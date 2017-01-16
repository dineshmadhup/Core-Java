/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangle;


public class Rectangle 
 { 
 private double width; 
 private double height;
 //default constructor
 public Rectangle() 
{ 
 width = 1; 
 height = 1; 
 } 
//User defined constructor
 public Rectangle(double width, double height) 
 { 
 this.width = width; 
 this.height = height; 
 } 
//getter
 double getArea(){ 
 return width * height; 
 } 
 double getPerimeter() 
 { 
 return 2*(width+height); 
 }
 
 //Main
 public static void main(String []args) 
 { 
 Rectangle A=new Rectangle(4,40); 
 Rectangle B=new Rectangle(3.5, 35.9); 

 System.out.println("Area="+A.getArea() + ", " + "Width = " + A.width + ", " + 
         "Perimeter = " + A.getPerimeter()+ ", " + "Height = " + A.height);
 System.out.println("Area="+B.getArea()); 

 } 
 } 