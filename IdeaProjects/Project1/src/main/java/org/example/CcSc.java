package org.example;

public class CcSc {
    public CcSc(){
        System.out.println("Constructor 1");
    }
    public CcSc(String  s){
      this();//This constructor call constructor 1. so we can call 1 cons from another cons with in a class
        System.out.println("Constructor 2" + s);

    }

    public static void main(String[] args) {
        CcSc a= new CcSc();
        CcSc b= new CcSc("one");
    }
}
