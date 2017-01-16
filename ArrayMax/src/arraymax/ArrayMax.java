/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraymax;

/**
 *
 * @author PLANET
 */
public class ArrayMax {

    
    public static void main(String[] args) {
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[] {1, 2, 3});
    }
    
    //Function or Method
    public static void printMax(double... numbers)
    {
        if(numbers.length == 0)
        {
            System.out.println("No argument is passed");
            return;
        }
        double result = numbers[0];
        
        for(int i = 1; i < numbers.length; i++)
        {
            if(numbers[i] > result)
            {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
    
    
}
