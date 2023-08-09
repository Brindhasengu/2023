package org.example;

import java.util.Scanner;

public class IfGrade {
    public static void main(String[] args) {
        int marks;

        System.out.println("Enter your Marks :");

        Scanner scanner = new Scanner(System.in);
        marks = scanner.nextInt();

        if (marks >= 70) {
            System.out.println("your grade is distinction");
        } else if (marks >= 60) {
            System.out.println("your grade is First Class");
        } else if (marks >= 50) {
            System.out.println("your grade is pass");


    }
      }
   }


