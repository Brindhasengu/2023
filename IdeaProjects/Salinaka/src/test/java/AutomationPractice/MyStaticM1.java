package AutomationPractice;

public class MyStaticM1 {


        static int num = 100;
        static String str = "Static";

        // This is Static method
        static void display()
        {
            System.out.println("static number is " + num);
            System.out.println("static string is " + str);
        }

        // non-static method
        void nonstatic()
        {
            // our static method can accessed
            // in non static method
            display();
        }

        // main method
        public static void main(String args[])
        {
            MyStaticM1 obj = new MyStaticM1();

            // This is object to call non static function
            obj.nonstatic();

            // static method can called
            // directly without an object
            display();
        }
    }

