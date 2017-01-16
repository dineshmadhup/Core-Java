/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistofstudentstest;

/**
 *
 * @author PLANET
 */
class Student {
    private int id;
    private String name;
    private double gpa;
    
    public Student(int id, String name, double gpa)
    {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    //Display
    public void display() {
        System.out.println(id + "," + name + "," + gpa);
    }
//    @Override
//    public boolean equals(Object t) {
//        if(t instanceof Student)
//        {
//            Student s = (Student) t;
//            return (id == s.id);
//        }
//        return false;
//        
//    }
    
    
}
