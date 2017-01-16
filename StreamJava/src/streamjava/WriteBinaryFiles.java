/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package streamjava;

import java.io.*;

public class WriteBinaryFiles {
    public static void main(String [] args) {

        // The name of the file to create.
        String fName = "writeBinary.txt";

        try {
            
            String bytes = "Enjoying with Programming in Java.";
            byte[] buff = bytes.getBytes();

            //FileOutputStream outputStream = new FileOutputStream(fName);
            
            DataOutputStream outputStream = new DataOutputStream(new
                BufferedOutputStream(new FileOutputStream(fName)));

            outputStream.write(buff);

            outputStream.close();		

            System.out.println("Wrote " + buff.length + " bytes");
        }
        catch(IOException ex) {
                           
            ex.printStackTrace();
        }
    }
}
