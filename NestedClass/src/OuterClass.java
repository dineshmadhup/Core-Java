/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PLANET
 */
public class OuterClass
{
    int a;
    void Funx() { a++; }
    class InnerClassName
    {
        int b;
        void Funb() { b++; }
        void Funa() { a++; }
    }
    static class StaticInnerClassname
    {
        int c;
    
    }
    
}

