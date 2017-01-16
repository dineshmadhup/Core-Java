/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomnumber;

/**
 *
 * @author PLANET
 */
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        getRandom(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20);
    }
    //variable length argument function
    public static int getRandom(int... numbers)
    {
        //int randomNumber;
        //random number between 1 and 54
        outer: while(true){
        int randomNumber = 1 + (int) (Math.random() * 54);
        System.out.println("\nInitial Random number: " + randomNumber);
        System.out.print("Numbers to Exclude:");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
            if(numbers[i] == randomNumber)
            {
                //randomNumber = 1 + (int) (Math.random() * 54);
                continue outer;
            }
        }
        System.out.println("\nFinal Rrandom number with excluding numbers: " + randomNumber);
        return 0;
        }
    }
}
        