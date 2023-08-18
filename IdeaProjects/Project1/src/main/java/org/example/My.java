package org.example;

public class My {
    public static void main(String[] args) {
        My calc = new My();
        calc.add();
        calc.multi();
    }
            public void add(){
            int a=21, b=70;
            int total= a + b;
            System.out.println(total);
        }
        public void multi(){
        int x=10, y=20;
        int total= x*y;
            System.out.println(total);
        }
    }

