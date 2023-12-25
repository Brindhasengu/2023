package AutomationPractice;

public class MyStatic {
   //Static method
    static  void myStaticMethod(){
        System.out.println("This is static method");

    }
    public  void myPublicMethod(){
        System.out.println("NON STATIC METHOD");
    }

    public static void main(String[] args) {
        //call static method
        myStaticMethod();
        MyStatic obj = new MyStatic();//create obj
        obj.myPublicMethod();//call public method
    }

}
