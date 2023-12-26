package AutomationPractice;
import java.io.*;
public class MyStaticM {
    // Java program to demonstrate that
// The static method does not have
// access to the instance variable




        // static variable
        static int a = 10;

        // instance variable
        int b = 20;

        void simpleDisplay()
        {
            System.out.println(a);
            System.out.println(b);
        }

        // Declaration of a static method.
        static void staticDisplay()
        {
            System.out.println(a);
        }

        // main method
        public static void main(String[] args)
        {
            MyStaticM obj = new MyStaticM();
            obj.simpleDisplay();

            // Calling static method.
            staticDisplay();
        }
    }

