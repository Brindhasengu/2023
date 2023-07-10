package myjava;

public class Calc {

	public Calc() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
Calc cc = new Calc();
int result =cc.add();
cc.subtract(result);
cc.subtract(50,5);
cc.subtract(50,6.6f);
	}
public void subtract(int num1,float num2)
{
System.out.println(num1-num2);	
}
public void subtract(int num)
{
	
}
public void subtrat(int value,int value2)
{
	
}
public int add()
{
	int no1=10,no2=20;
	return no1+no2;
	
}
}
