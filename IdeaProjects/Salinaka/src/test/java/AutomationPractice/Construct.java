package AutomationPractice;

public class Construct {

    int dob;
    String name;
int id;
    public Construct(String studentName, int dob) {


    name=studentName;

    id=dob;
System.out.println ("Cons calling"+ id + name);


}
public  Construct(int studentid){
    id= studentid;
    System.out.println ("Cons calling"+ id);
}

    public static void main(String[] args) {
        Construct sree= new Construct("sree",1234);
        Construct ammu=new Construct(9999);
    }




}