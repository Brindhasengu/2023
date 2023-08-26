package org.example;

public class Child1 extends Parent1{
    String  name;
    public Child1(String name){
        this.name= name;
        System.out.println("Child1 Constructor");
    }

    public static void main(String[] args) {
       Child1 c1 =new Child1("Sengu");
       c1.study();
       c1.work();
    }
    public  void study()
    {

    }
}
