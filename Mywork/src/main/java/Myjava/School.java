package Myjava;

public class School {
String name;
int std,m1,m2,m3;

	public School (String name,int std,int m1,int m2,int m3) 
	{
		// TODO Auto-generated constructor stub
		this.name=name;
		this.std= std;
		this.m1=m1;
		this.m2=m2;

	}
	public School (String name,int std,int m1,int m2) 
	{
		// TODO Auto-generated constructor stub
		this.name=name;
		this.std= std;
		this.m1=m1;
		this.m2=m2;

	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
School stud1 =new School("Ganesh",1,2,3);
System.out.println("stud 1.m2");
	}

}
