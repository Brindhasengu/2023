package org.example;

public class MyPrac {

    static String name = "amazon";
    int price, discount;

    public MyPrac(int p, int d, String name) {
        price = p;
        discount = d;
        name = name;
        sell();
    }


    public static void main(String[] args) {
        MyPrac item1 = new MyPrac(1, 10, "CAR");
        MyPrac item2 = new MyPrac(2, 20, "vAN");
        item1.price = 100;
        item1.discount = 10;
        item1.sell();
        item2.sell();
    }

    public void sell() {
        System.out.println(price);
    }
}
