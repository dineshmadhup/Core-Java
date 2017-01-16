/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package streamjava;

import java.io.*;

public class ReadBianryFiles {
    public static void main(String [] args) {

        String fName = "strings.bin";

        try {
           byte[] buff = new byte[100000];

//            FileInputStream inputStream = 
//                new FileInputStream(fName);
            
              DataInputStream inputStream = new DataInputStream(new
                BufferedInputStream(new FileInputStream(fName)));
              
            
            int totalBytes = 0;
            int n = 0;
            while((n = inputStream.read(buff)) != -1) {
                System.out.println(new String(buff));
                System.out.println(buff);
                totalBytes += n;
            }	

           inputStream.close();		

            System.out.println("Read " + totalBytes + " bytes");
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fName + "'");				
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
