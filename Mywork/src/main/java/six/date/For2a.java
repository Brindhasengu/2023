package six.date;


public class For2a {

	public For2a() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Outer
	    for(int a=1;a<=2;a++)
		{
			System.out.println("outer:" +a);
			//Inner
			for(int b=1;b<=3;b++)
			{
				System.out.println("Inner:"+b);
			}
		}

	}

}
