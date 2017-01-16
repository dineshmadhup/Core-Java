/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testgrademethod;

public class TestGradeMethod {

    public static void main(String[] args) {
        System.out.println("The grade is: " + getGrade(78.7));
        System.out.println("The grade is: " + getGrade(59.5));
        nprintln("Hello", 3);
    }
    
    static char getGrade(double score)
    {
        if(score >= 90.0)
            return 'A';
        else if(score >= 80.0)
            return 'B';
        else if(score >= 70.0)
            return 'C';
        else if(score >= 60.0)
            return 'D';
        else
            return 'F';
    }
    static void nprintln(String message, int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.println(message);
        }
    }
}
