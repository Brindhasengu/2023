package AutomationPractice;

public class MystaticVariable {
  static int a=m1();
  //static block
    static{
      System.out.println("Static block");
  }
 static int m1(){
     System.out.println("print m1");
     return 10;
 }

    public static void main(String[] args) {
        System.out.println("a value : "+ a);
        System.out.println("from main");
    }


}

