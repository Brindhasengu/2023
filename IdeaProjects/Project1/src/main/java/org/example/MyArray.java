package org.example;

import java.util.Scanner;

public class MyArray
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 1;
        int numberOfSubjects = 4;
//int[]marks =new int[5];
        String[][] studentMarks = new String[numberOfStudents][numberOfSubjects + 1];
        for (int i=0;i<numberOfStudents;i++) {
            //int marks;
            System.out.println("Enter student name :");
            studentMarks[i][0] = scanner.next();

            System.out.println("Enter Tamil mark :");
            studentMarks[i][1] = scanner.next();

            System.out.println("Enter English mark :");
            studentMarks[i][2] = scanner.next();

            System.out.println("Enter Maths mark :");
            studentMarks[i][3] = scanner.next();

            System.out.println("Enter Biology mark :");
            studentMarks[i][4] = scanner.next();
        }

       for(int i =0 ; i<numberOfStudents; i++){
             System.out.println("Name : " + studentMarks[i][0]);
             System.out.println("Tamil : " + studentMarks[i][1]);
             System.out.println("English : " + studentMarks[i][2]);
             System.out.println("Maths : " + studentMarks[i][3]);
             System.out.println("Biology : " + studentMarks[i][4]);

             int totalMark = 0;
             for(int j=1;j<=numberOfSubjects;j++){
                 totalMark = totalMark + Integer.parseInt(studentMarks[i][j]);//convert string to int
             }
             System.out.println("Total : " + totalMark);

             if (totalMark > 90 * numberOfSubjects){
                 System.out.println("Grade A");
             }else if (totalMark > 70 * numberOfSubjects){
                 System.out.println("Grade B");
             }else if (totalMark > 60 * numberOfSubjects){
                 System.out.println("Grade C");
             }else{
                 System.out.println("Pass");
             }
         }
    }
}
