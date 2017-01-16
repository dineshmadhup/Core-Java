/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perfect;

public class Perfect
{
  public static void main(String[] args)
  {
    int number, total = 0;
    final int LIMIT = 1000;
    for(number = 1; number <= LIMIT; number++)
    {
      if((number != 1) && (total == (number - 1)))//1 is subtracted from number to account for increment before comparison
    System.out.println((number - 1) + " is a perfect number");
      total = 0;//reset total
      for(int divider = 1; divider < number; divider++)
      {
        if((number % divider) == 0)
      total += divider;
      }
    }
  }
}
