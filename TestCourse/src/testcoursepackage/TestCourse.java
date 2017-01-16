/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testcoursepackage;

/**
 *
 * @author PLANET
 */
public class TestCourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Course course1 = new Course("Data Structure");
        Course course2 = new Course("DataBase System");
        
        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");
        
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        
        System.out.println("Number of Students in Course1: "
        + course1.getNumberOfStudents());
        String[] students = course1.getStudent();
        
        for(int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ",");
        
        System.out.println();
        
        System.out.print("Number of students in course 2: "
        + course2.getNumberOfStudents());
       
    }
    
}
