package AutomationPractice;

public class ConsVverloading {

        //instance variables of the class
        int id;
        String name;

    ConsVverloading (){
            System.out.println("this a default constructor");
        }

    ConsVverloading (int i, String n){
            id = i;
            name = n;
        }

        public static void main(String[] args) {
//object creation
            ConsVverloading  s = new ConsVverloading ();
            System.out.println("\nDefault Constructor values: \n");
            System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);

            System.out.println("\nParameterized Constructor values: \n");
            Student student = new Student(10, "David");
            System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);
        }
    }

