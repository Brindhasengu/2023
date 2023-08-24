package org.example;

public class StaticDemo {
    int no;
    static int no2;//Static variable
    public static void main(String[] args) {
StaticDemo sobj1 =new StaticDemo();
StaticDemo sobj2 =new StaticDemo();
StaticDemo sobj3 =new StaticDemo();
sobj1.no =10;
sobj2.no =20;
sobj3.no =30;
        System.out.println(sobj3.no);
        System.out.println(sobj2.no2);
    }
}
