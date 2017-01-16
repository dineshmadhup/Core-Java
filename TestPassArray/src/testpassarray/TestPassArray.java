/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testpassarray;

/**
 *
 * @author PLANET
 */
public class TestPassArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a= {1,2};
        
        //swap elements using the swap method
        System.out.println("Before invoking swap");
        System.out.println("array is {" + a[0]+ "," + a[1] + "}");
        swap(a[0],a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0]+ "," + a[1] + "}");
        
        //swap elements using the swapFirstTwoInArray method
        
        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + "," + a[1] + "}");
        swapFirstTwoInArray(a);
        
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println(" array is {" + a[0] + "," + a[1] + "}");
        
    }
    
    //swap two variables
    public static void swap(int n1, int n2)
    {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
    
    //swap the first two elements in the array
    public static void swapFirstTwoInArray(int[]array)
    {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
    
    }


    
