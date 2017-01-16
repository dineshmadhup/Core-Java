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
public class GenericAndCollectionbyDINESH <E>{
    private java.util. ArrayList<E> list = new java.util.ArrayList<>();
    public int getSize(){
        return list.size();
    }
    public E peek(){
        return list.get(getSize()- 1);
    }
    public void push(E o){
        list.add(o);
    }
    public E pop(){
        E o = list.get(getSize() - 1);
        list.remove(o);
        return o;
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + list.toString(); 
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        GenericAndCollectionbyDINESH<Integer> st = new GenericAndCollectionbyDINESH();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.print(st.toString());
        st.pop();
        System.out.println(st.toString());
    }
    
}
