/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistofstudentstest;
import java.util.*;

/**
 *
 * @author PLANET
 */


public class ArrayListOfStudentsTest {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Student> al = new ArrayList<>();
        al.add(new Student(1000, "ken", 4.0));
        al.add(new Student(2000, "jim", 3.0));
        al.add(new Student(3000, "ken", 2.0));
        
        //print out all the entire list
        for(Student stu : al) {
            stu.display();
        }
        
        //insert "pat" after "ken"
        al.add(1, new Student(4000, "pat", 3.5));
        
        //printout entire list
        System.out.println("al after adding another student 'pat':");
        for(Student stu : al) {
            stu.display();
        }
        
        //Now remove 'pat' from collection
        al.remove(1);
        
        //show the resulting collection
        System.out.println("Contents of al after removing 'pat': ");
        for(Student stu : al) { //for all student stu in al
            stu.display();
        }
        
        //Lets find where is jim whose id is 2000
        System.out.println("jim is at: " + al.indexOf(new Student(2000, "", 0.0)));
       
    }
    
}
