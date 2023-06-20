package eleven.array;
import java.util.*;  
public class TestJavaCollection {

	public TestJavaCollection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("kavi");//Adding object in arraylist  
		list.add("Muthu");  
		list.add("kavi");  
		list.add("sudar");  
		list.add("Sri");
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
	}
	}}

