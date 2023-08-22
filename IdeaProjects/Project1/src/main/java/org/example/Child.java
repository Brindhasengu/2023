package org.example;

public class Child extends Parent{
    /*private void m1()
    {
        System.out.println("From child m1()");
    }*/

    // overriding method
    // with more accessibility
    @Override public void m2()
    {
        System.out.println("From child m2()");
    }

}
