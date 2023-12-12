package AutomationPractice;

public class MyStaticClass {
    private static String s= "outer class";
    //Static and nested class
    static class StaticNestedClass
    {
        //non-static method of the nested class
        public void show()
        {
//prints the string defined in base class
            System.out.println(s);
        }
    }
    public static void main(String args[])
    {
        MyStaticClass.StaticNestedClass obj = new MyStaticClass.StaticNestedClass();
//invoking the method of the nested class
        obj.show();
    }
}

