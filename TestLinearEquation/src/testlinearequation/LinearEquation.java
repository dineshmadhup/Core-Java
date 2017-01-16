/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testlinearequation;

/**
 * * @author PLANET

 */
public class LinearEquation {
        //cofficient as a private data field
	private static int a;
	private static int b;
	private static int c;
	private static int d;
	private static int e;
	private static int f;
	
	//constructor
	LinearEquation(int a1, int b1, int c1, int d1, int e1, int f1){
		a = a1;
		b = b1;
		c = c1;
		d = d1;
		e = e1;
		f = f1;
	}
	//Methods
	static int isSolvable()
        {
		if(((a*d) - (b*c)) == 0)
			return 0;
		else
			return 1;
	}
	
	static double getX(){
		return (((e*d) - (b*f))/((a*d) - (b*c)));
	}
	
	static double getY(){
		return (((a*f) - (e*c))/((a*d) - (b*c)));
	}
	
}

    

