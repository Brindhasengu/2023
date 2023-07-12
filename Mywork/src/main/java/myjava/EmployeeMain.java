package myjava;

public class EmployeeMain {

	public EmployeeMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	      Salary e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
	      System.out.println("Call mailCheck using Salary reference --");
	      s.mailCheck();
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();
	      e.getSalary();
	}

}
