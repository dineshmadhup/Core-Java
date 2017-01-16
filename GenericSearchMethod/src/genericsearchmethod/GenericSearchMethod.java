/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package genericsearchmethod;

class GenericSearchMethod {
    
    public static <E> boolean Search(E[] ary, E target)
    {
        boolean found = false;
        for( int i = 0; i < ary.length; i++)
        {
            if(ary[i].equals(target))
            {
                found = true;
                break; //goes out of for loop
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int [] ary = {10, 20, 30, 40};
        if(GenericSearchMethod.Search(ary, 30))
        {
            System.out.println("found");
        }
        
    }

    
}
