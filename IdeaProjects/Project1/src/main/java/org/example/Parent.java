package org.example;

public class Parent {
    /*
    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.m2();
        Parent obj2 = new Child();
        obj2.m2();
    }

     */
//private method v cann't access from outside
   /* private void m1()
    {
        System.out.println("From parent m1()");
    }
*/
//producted
    protected void m2()
    {
        System.out.println("From parent m2()");
    }

}
