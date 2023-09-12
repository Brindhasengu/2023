package org.example;

public class Lcm {
    public static void main(String[] args) {

        int no1= 5;
        int no2= 12;
        int result= no1*no2;

        if(result %no1 == 0  && result %no2 == 0)
        {
            System.out.println(result);
        }
    }
}
