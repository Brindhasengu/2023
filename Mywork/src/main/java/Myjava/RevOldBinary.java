package Myjava;

public class RevOldBinary {

	public RevOldBinary() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no= 9;
String bin ="";
while(no>=1)
{
	int rem =no%2;
	bin = rem +bin;
	no = no/2;
}
System.out.println("Binary value is" +bin);
	}

}
