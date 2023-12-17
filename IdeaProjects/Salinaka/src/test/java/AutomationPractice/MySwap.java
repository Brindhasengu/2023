package AutomationPractice;

public class MySwap {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before Swap");
        System.out.println("x ="+ x);
        System.out.println("y =" + y);
        //Swap
        /*
        int temp = x;
        x = y;
      y = temp;

         */
        y = x + y - (x = y);
        System.out.println("After swap");
        System.out.println("x ="+x );
        System.out.println("y ="+y);

    }
}
