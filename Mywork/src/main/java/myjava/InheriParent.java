package myjava;

public class InheriParent 
{
String name;
	public InheriParent(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		System.out.println("Parent constructor");
	}
	
public void work()
{
	System.out.println(this.name + " parent work");
}
}
