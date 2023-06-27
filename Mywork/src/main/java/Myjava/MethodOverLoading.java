package Myjava;

public class MethodOverLoading 
{
public int MethodOveLoading(int X,int y)
{
	return(X+y);
	}
public int MethodOverLoading(int X,int Y,int Z)
{
	return(X+Y+Z);
}
	public MethodOverLoading()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
MethodOverLoading mol= new MethodOverLoading();
System.out.println(mol.MethodOverLoading(10, 20, 30));
	}

}
