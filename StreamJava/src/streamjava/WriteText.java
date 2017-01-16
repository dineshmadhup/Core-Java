/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package streamjava;

import java.io.*;

public class WriteText {
    public static void main(String [] args) {

        String fileName = "temp.txt";

        try {
            
            FileWriter fileWriter =
                new FileWriter(fileName);
            BufferedWriter outputStream =
                new BufferedWriter(fileWriter);
            
            /**Using character stream method **/
            //FileWriter outputStream = null;
            //outputStream = new FileWriter("temp.txt");
            
            /**Using Line oriented I/O method **/
            //PrintWriter outputStream = null;
            //outputStream = new PrintWriter(new FileWriter("temp.txt"));
            

            outputStream .write("Hi, All");
            outputStream .write(" This is 13th week.");
            outputStream .newLine();
            outputStream .write("of our Java lab");
            outputStream .write(" so, Be ready for Final Exam");

            outputStream .close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}

