package myjava;

public class Shop {
	static String name="SStore";
	static int doorno=101;
	int price,discount;
	
	public Shop() {
		// TODO Auto-generated constructor stub
		
		//prod1.price
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop prod1=new Shop();
		Shop prod2=new Shop();
		prod1.price=10;
		prod1.discount=2;
		prod2.price=20;
		prod2.discount=3;
		
		System.out.println(prod1.price);
		System.out.println(prod1.discount);
		prod1.sell();
		

	}
	public void sell()
	{
	Shop.doorno=101;
	Shop.name="Sudar";
	System.out.println(Shop.name);
	}

}
