package interface1;

public class IndianFood implements InterfaceFood{

	public IndianFood() {

		// TODO Auto-generated constructor stub
		 
		
	}

	public void southindian() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InterfaceFood food = new IndianFood();
food.iddly();
	}

	@Override
	public void foodmenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iddly() {
		// TODO Auto-generated method stub
		System.out.println ("I love iddly");	
	}

}
