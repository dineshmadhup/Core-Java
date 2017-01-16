/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringcompare;
import java.util.Scanner;
/**
 *
 * @author PLANET
 */
public class StringCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String str1;
        System.out.print("Enter a string: ");
        str1 = sc.next();
        
        
        String str2;
        System.out.print("Enter another string: ");
        str2 = sc.next();
        
        if(str1 == str2)
            System.out.println("They are equal");
        else
             System.out.println("They are not equal");
        
        if(str1.equals(str2))
            System.out.println("They are equal");
        else
             System.out.println("They are not equal");
            
                
            
        
    }
    
}
