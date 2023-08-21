package org.example;

public class MoL {
    public static void main(String[] args) {
        MoL mol= new MoL();
        //mol.subtract(result);
        mol.subtract();
        mol.subtract(100, 50);
        mol.subtract(100, 50, 25);

    }

    private void subtract() {
        }

   public void subtract(int num1, int num2)
   {
   // int num1=20,num2=5 ;
    int total= num1-num2 ;
       System.out.println(total);
   }

    public void subtract(int num1, int num2, int num3)
    {
        // int num1=20,num2=5 ;
        int total= num1-num2-num3 ;
        System.out.println(total);
    }
}
