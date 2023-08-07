package org.example;

import java.util.Scanner;

public class ForExample {
    public void Test(){
        int i=1;
        for (i=1;i<5;i++){

            int marks;
            System.out.println("Enter your Marks :");
            Scanner scanner =new Scanner(System.in);
            marks = scanner.nextInt();

            if (marks >= 70) {
                    System.out.println("your grade is distinction");
            }
            else if (marks >= 60) {
                System.out.println("your grade is First Class");
            }
            else if (marks>=50){
                System.out.println("your grade is pass");
            }
        }
    }
}













