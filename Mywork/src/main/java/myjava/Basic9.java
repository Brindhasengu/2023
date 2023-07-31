package myjava;

public class Basic9 {

	public Basic9() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     
		   
		        int x = 10; // x is a local variable
		        String message = "Hello, world!"; // message is also a local variable
		         
		        System.out.println("x = " + x);
		        System.out.println("message = " + message);
		         
		        if (x > 5) {
		            String result = "x is greater than 5"; // result is a local variable
		            System.out.println(result);
		        }
		         
		        // Uncommenting the line below will result in a compile-time error
		        // System.out.println(result);
		         
		        for (int i = 0; i < 3; i++) {
		            String loopMessage = "Iteration " + i; // loopMessage is a local variable
		            System.out.println(loopMessage);
		        }
		         
		        // Uncommenting the line below will result in a compile-time error
		        // System.out.println(loopMessage);
		
	}

}
