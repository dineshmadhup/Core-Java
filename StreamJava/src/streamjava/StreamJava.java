/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package streamjava;

import java.io.*;

public class StreamJava {
    public static void main(String [] args) {

        String fName = "java.txt";

        try {
            FileReader fileReader = 
                new FileReader(fName);

            BufferedReader inputStream = 
                new BufferedReader(fileReader);
            
//            BufferedReader inputStream  = null;
//            inputStream  = new BufferedReader(new FileReader("java.txt"));
            
            String a;
            while((a = inputStream.readLine()) != null) {
                System.out.println(a);
            }	

            inputStream.close();			
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "can't open file " + fName);				
        }
        catch(IOException ex) {
            
            ex.printStackTrace();
        }
    }
}
