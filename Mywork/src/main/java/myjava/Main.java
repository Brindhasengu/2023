package myjava;

public class Main {
	public static void main(String[] args) {
		System.out.println("This is main");
		InheriParent parent = new InheriParent("Parent name");
		parent.work();
		
		Inheri child = new Inheri();
		child.work();
		
		Inheri child2 = new Inheri("child 2");
		child2.work();
	}

}
