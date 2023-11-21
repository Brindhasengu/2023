package AutomationPractice;

public class InheritCalculation extends Calculation {

        public void multiplication(int x, int y) {
            z = x * y;
            System.out.println("The product of the given numbers:"+z);
        }

        public static void main(String args[]) {
            int a = 20, b = 10;
            InheritCalculation demo = new InheritCalculation();
            demo.addition(a, b);
            demo.Subtraction(a, b);
            demo.multiplication(a, b);
        }
    }

