/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scores;

import java.io.*;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author PLANET
 */
public class Scores {

    String name;
    int [] marks;
    private float[] Scores;
    public Scores(String name, int [] m)
    {
        this.name  = name;
        marks = new int[3];
        for(int i = 0; i < m.length; i++)
        {
            marks[i] = m[i];
        }
    }
    
    public static void main(String[] args) throws IOException {
       
        
        ArrayList <Scores> d = new ArrayList<>();
        String line;
        String [] fields;
        int [] Scores = new int[3];
        
        BufferedReader in  = new BufferedReader(new FileReader("scores.txt"));
        line = in.readLine();
        while(line != null)
        {
            fields = line.split("");
            Scores[0] = Integer.parseInt(fields[1]);
            Scores[1] = Integer.parseInt(fields[2]);
            Scores[2] = Integer.parseInt(fields[3]);
            d.add(new Scores(fields[0], Scores));
            line = in.readLine();
        }
        in.close();
        
        PrintWriter out = new PrintWriter(new FileWriter("average.txt"));
        float average;
        for(Scores x : d)
        {
            average = (x.Scores[0] + x.Scores[1] + x.Scores[2])/3f;
            out.println(x.name + " " + average);
        }
        out.close();
    }
    
        
        
}
