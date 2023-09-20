package org.example;

public class PCfor4 {
    public static void main(String[] args) {
        int j=4;
        for(int row=1; row<=5; row++){
            for(int col=1; col<=row;col++){
                System.out.print("*");
            }
           // for(int col=1; col<=row; col++){
               System.out.println();
            j--;
           // }
        }
    }

}
