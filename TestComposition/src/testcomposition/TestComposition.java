/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testcomposition;



public class TestComposition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person;
        person = new Person(2001, 11, 29, "Thilina");
        System.out.println("Name : " + person.getName());
        System.out.println("Birthday : " + person.getBday());

        //The below object cannot be created. A bithday cannot exixts without a Person 
        //Birthday bday=new Birthday(1988,11,10);

    }
    
    public static class Birthday{
        int year, month, day;

        public Birthday(int y,int m,int d){
            year=y;
            month=m;
            day=d;
        }

        @Override
        public String toString(){
           return String.format("%s-%s-%s", year,month,day);

        }
    }
    public static class Person {
    private double salary;
    private String name;
    private Birthday bday; //composition

    public Person(int y,int m,int d,String name){
        bday=new Birthday(y, m, d); //create a object
        this.name=name;
    }


//    public double getSalary() {
//        return salary;
//    }

    public String getName() {
        return name;
    }

    public Birthday getBday() {
        return bday;
    }

    
    

  }
}
        

