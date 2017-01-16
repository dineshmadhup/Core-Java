/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binaryfilesdinesh;
import java.io.*;
import java.util.*;
import filesdemo.*;

public class BinaryFilesDinesh {
    
        public static void main(String[] args) {
       
        try
        {
            DataOutputStream out = new DataOutputStream(
                                    new BufferedOutputStream(
                                    new FileOutputStream("computers.txt")));
            
            ArrayList<Computer>al = new ArrayList<>();
            al.add(new Computer("1000", "Desktop", 12500));
            al.add(new Computer("2000", "Laptop", 1500));
            al.add(new Computer("3000", "Tablet", 500));
            
            for(Computer c : al)
            {
                out.writeUTF(c.getpartnumber());
                out.writeUTF(c.getDescription());
                out.writeDouble(c.getPrice());
            }
            out.close();
            
            
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        
        try
        {
            DataInputStream in = new DataInputStream(
                                    new BufferedInputStream(
                                    new FileInputStream("computers.bin")));
            
            ArrayList<Computer>al = new ArrayList<>();
            
            while(in.available() > 0)
            {
                String partnum = in.readUTF();
                String description = in.readUTF();
                double price = in.readDouble();
                
                al.add(new Computer(partnum, description, price));
            }
            in.close();
            
            for(Computer c : al)
            {
                System.out.println(c.getpartnumber() + ","
                + c.getDescription() + ","
                + c.getFormattedPrice());
            }
            
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        }
                 
               
              
                
        
        
    
        
    
}
