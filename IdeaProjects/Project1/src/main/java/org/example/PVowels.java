package org.example;

public class PVowels {
    public static void main(String[] args) {
        String word="education";
        for(int i=0;i<word.length();i++)
            {
                char ch = word.charAt(i);
                switch (ch) {
                    case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch);
                }
                }
        }
    }

