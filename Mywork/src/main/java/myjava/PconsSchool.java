package myjava;

public class PconsSchool 
{

	public PconsSchool()
	{
		// TODO Auto-generated constructor stub
	System.out.println("I,m private constructor");	
	}
private int profit=100;
private String name="Abc";
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PconsSchool owner=new PconsSchool();
		System.out.println(owner.profit);
		owner.promote();
	}
private void promote()
{
	System.out.println("Students list");
}
}
