/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comparisionutfchars;

import java.io.*;
import java.util.*;
public class ComparisionUTFchars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            String test = "You love NPU";
            
            DataOutputStream out = new DataOutputStream(
                                    new BufferedOutputStream(
                                    new FileOutputStream("computers.bin")));
            //Use writeUTF method
            out.writeUTF(test);
            int size1 = out.size();
            
            //Use the writeChars method
            out.writeChars(test);
            int size2 = out.size() - size1;
            
            //Compare sizes
            System.out.println("WriteUTF method size is: " + size1
            + ", writeChars method size is: " + size2);
            
            //close the output stream
            out.close();
            
            
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        
        try
        {
            DataInputStream in = new DataInputStream(
                                    new BufferedInputStream(
                                    new FileInputStream("computers.bin")));
            
            //get total bytes
            
            int total = in.available();
            //use readUTF method
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        
        
    }
    
}
