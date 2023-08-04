package org.example;

import java.util.Scanner;
public class ScaClass
{
    public static void main (String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter name,Age,Salary:");

        //String Input
        String name=obj.nextLine();
        //Number ip
        int age= obj.nextInt();
        double salary= obj.nextDouble();
        //input by user
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);


    }

}
