

package genericmethodtest;

public class GenericMethodTest
{
   // generic method printArray                         
   public static < E > void printArray( E[] inputArray )
   {
      // Display array elements              
         for ( E element : inputArray ){        
            System.out.printf( "%s ", element );
         }
         System.out.println();
    }
   //Generic Search Method
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

    public static void main( String args[] )
    {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Array integerArray contains:" );
        printArray( intArray  ); // pass an Integer array

        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // pass a Double array

        System.out.println( "\nArray characterArray contains:" );
        printArray( charArray ); // pass a Character array
        
        
        if(GenericMethodTest.Search(intArray, 3))
        {
            System.out.println("YES found");
        }
    } 
}