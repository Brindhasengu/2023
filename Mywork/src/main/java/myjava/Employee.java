package myjava;

public abstract class Employee {
	private String name;
	private String address;
	private int number;

	public Employee(String name,String address,int number) {
		// TODO Auto-generated constructor stub
		System.out.println("constructing an employee");
		this.name=name;
		this.address=address;
		this.number=number;
	}
public void mailCheck()
{
	System.out.println("mail inside Employee class");
}
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
