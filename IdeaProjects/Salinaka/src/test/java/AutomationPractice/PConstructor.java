package AutomationPractice;

public class PConstructor {

        int id;
        String name;
        //creating a parameterized constructor
        PConstructor(int i,String n){
            id = i;
            name = n;
        }
        //method to display the values
        void display(){System.out.println(id+" "+name);}

        public static void main(String args[]){
            //creating objects and passing values
            PConstructor s1 = new PConstructor(111,"Ammu");
            PConstructor s2 = new PConstructor(222,"Sree");
            //calling method to display the values of object
            s1.display();
            s2.display();
        }
    }


