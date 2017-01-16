/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericandcollectionbydinesh;

/**
 *
 * @author dinesh
 */
public class GenericSortDinesh {
    public static void main(String[] args){
        Integer [] intArray = {new Integer(2), new  Integer(4), new Integer(6)};
        
        Character[] charArray = {new Character('z'), new Character('h'), new Character('c')};
        
        Double [] doubleArray = {3.4, 4.5, 6.7};
        
        String [] stringArray = {new String("peter"), new String("Lily"), new String("john")};
        
        sort (intArray);
        sort(charArray);
        sort(doubleArray);
        sort(stringArray);
        
        System.out.println("Sorted Integer Array is");
        printList(intArray);
        System.out.print("Sorted Double objects: ");
        printList(doubleArray);
        System.out.print("Sorted Character objects: ");
        printList(charArray);
        System.out.print("Sorted String objects: ");
        printList(stringArray);
    }
        
        
        public static <E extends Comparable<E>>void sort(E[] list){
            
            E currentMin;
            int currentMinIndex;
            for(int i = 0; i<list.length-1; i++){
                currentMin = list[i];
                currentMinIndex = i;
                for(int j = i+ 1; j < list.length; j++)
                {
                    if(currentMin.compareTo(list[j]) > 0){
                        currentMin = list[j];
                        currentMinIndex = j;
                    }
                }
                
                //swap
                if(currentMinIndex != i){
                    list[currentMinIndex] = list[i];
                    list[i] = currentMin;
                }
            }
        }
        
        public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
            
   
    

