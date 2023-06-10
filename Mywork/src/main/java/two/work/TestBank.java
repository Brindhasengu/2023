package two.work;

public class TestBank
{


public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b=new SAN();
		System.out.println("Rate of interest is:"+b.getRateOfInterest()+"%"); 
		b=new RBS();
		System.out.println("Rate of interest is:"+b.getRateOfInterest()+"%");
		}
	 }