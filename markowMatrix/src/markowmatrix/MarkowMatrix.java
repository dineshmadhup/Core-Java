/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package markowmatrix;

import java.util.Scanner;

/**
 *
 * @author PLANET
 */
public class MarkowMatrix {
    //private static double[][] m;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
		double[][] matrix = new double[3][3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}

		}
		boolean isMarkovMatrix = false; // You do a method call here
		System.out.println(isMarkovMatrix ? "The matrix is Markov"
				: "The matrix is not Markov");

	}

	public static boolean isMarkovMatrix(double[][] m) {
        
        for (int j = 0; j < m[0].length; j++){
            double sum = 0;
            for (int i = 0; i < m.length; i++) {
                if (m[j][j] < 0) {
                    return false;
                }
                sum += m[i][j];
            }
        
            if (sum != 1) {
                return false;
            }
        
    }

    return true;

	}
}
