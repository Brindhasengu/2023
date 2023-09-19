package org.example;

public class PCfor3 {
    public static void main(String[] args) {
        int i= 1;
        for(int row=5; row>=1; row--){

            for(int col=1; col<=row; col++){
                System.out.print(i+ " ");

            }
            System.out.println();
            i++;
        }
    }
}
