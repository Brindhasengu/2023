package myjava;

public class ConsOverLoading {

	public ConsOverLoading() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("Constructor one");
	}
public  ConsOverLoading(String S)
{
	System.out.println("Constructor 2");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsOverLoading a = new ConsOverLoading();
		ConsOverLoading b =new ConsOverLoading("");
				
				
	}}