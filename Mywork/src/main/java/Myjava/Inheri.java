package Myjava;

public class Inheri extends InheriParent
{
String name;

	public Inheri()  
	{
		super("from child");
		
		// TODO Auto-generated constructor stub
		//this.name=name;
		System.out.println("Child Constructor");
	}
	
	public Inheri(String name)
	{
		super(name);
		//this.name=name;
		System.out.println("Inheri constructor");
	}
}
