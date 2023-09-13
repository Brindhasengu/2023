package org.example;

public class Ifelse {
    public static void main(String[] args) {
        int no1=100, no2=100,no3=100;
        if(no1>no2 && no1>no3){
            System.out.println(no1);
        } else if (no2>no1 && no2>no3) {
            System.out.println(no2);

        } else if (no3>no1 && no3>no2) {
            System.out.println(no3);

        }
        else {
            System.out.println("All r =");
        }
    }
}
