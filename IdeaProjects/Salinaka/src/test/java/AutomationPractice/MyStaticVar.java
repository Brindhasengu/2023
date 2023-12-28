package AutomationPractice;

public class MyStaticVar {

        int rollno;//instance variable
        String name;
        static String college ="IIT";//static variable
        //constructor
        MyStaticVar(int r, String n)
        {
            rollno = r;
            name = n;
        }
        //method to display the values
        void display (){System.out.println(rollno+" "+name+" "+college);
        }
    public static void main(String args[]){
        MyStaticVar s1 = new MyStaticVar(111,"Anbu");
        MyStaticVar s2= new MyStaticVar(222,"Ram");
        //we can change the college of all objects by the single line of code
        //Student.college="BBDIT";
       s1.display();
        s2.display();
    }
}



