package org.example;

public class Binary {
    public static void main(String[] args) {
        int no= 5;
        int binary =0;
        while(no>=1)
        {
            int rem =no%2;
            binary =(binary*10) +rem ;
            no=no/2;

        }
        System.out.println("Binary is " + binary);
    }
}
