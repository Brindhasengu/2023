package org.example;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add();
        var result = calc.multi();
        System.out.println(result);
    }
        public void add () {
            int a = 33, b = 75;
            int total = a + b;
            System.out.println(total);
        }
        public int multi(){
        int x=10,  y=20;
        int total = x*y ;
            //System.out.println(total);
            return total;
        }
    }






