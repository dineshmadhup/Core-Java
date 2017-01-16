/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayclass;

import java.util.Arrays;


public class ArrayClass {

    
    public static void main(String[] args) {
        int [] quantities = new int[5];
        Arrays.fill(quantities, 2);
        Arrays.fill(quantities, 1, 4, 100);
        
        String [] strings1 = {"NPU", "USF"};
        String [] strings2 = {"NPU", "USF"};
        
        if(strings1 == strings2)
            System.out.println("Strings1 == strings2 is TRUE");
        else
            System.out.println("strings1 == strings2 is FALSE");
        
        if(Arrays.equals(strings1, strings2))
            System.out.println("Arrays.equals(strings1, strings2) is TRUE");
        else
             System.out.println("Arrays.equals(strings1, strings2) is FALSE");
        
        double [] grades = {92, 88, 95, 90};
        Arrays.sort(grades);
       
        for(double num : grades)
        {
            System.out.print(num + "");
        }
        
        String [] animal = {"cat", "dog", "pig", "tiger"};
        Arrays.sort(animal);
        int index = Arrays.binarySearch(animal, "dog");
        System.out.println("dog is at index " + index);
   
    }
    
}
