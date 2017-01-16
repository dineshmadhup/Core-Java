/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package headtailcount;

/**
 *
 * @author PLANET
 */
public class HeadTailCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int headCount = 0;
    int tailCount = 0;

    for (int i = 0; i < 100000; i++) {
      int number = (int)(Math.random() * 100000) % 2;

      if (number == 0)
        headCount++;
      else
        tailCount++;
    }

    System.out.println("head count: " + headCount);
    System.out.println("tail count: " + tailCount);
  }
}
