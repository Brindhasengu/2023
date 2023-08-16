package org.example;

public class vowelsCo {
    public static void main(String[] args) {
        String mystr= "Krishna";
        int count = 0;
        System.out.println("String=" +mystr);
        for(char ch: mystr.toCharArray())
        {
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ;
            ++count;
        }
        System.out.println ("vowels=" +count);
        }


    }

