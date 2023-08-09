package myjava;

public class Basic4 {

	public Basic4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int b=9;
int c= minFunction(a,b);
System.out.println("Minimum=" + c);
	}
public static int minFunction(int n1, int n2)
{
	int min;
	if (n1 > n2)
		min= n2;
	else
		min =n1;
	return min;
}
}
