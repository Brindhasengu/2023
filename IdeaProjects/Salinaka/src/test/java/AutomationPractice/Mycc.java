package AutomationPractice;

public class Mycc {
    Mycc() {




        this("x");
        System.out.println("Default constructor called");
    }
    Mycc(String str){
        System.out.println("parameterised constructor called");
    }

    public static void main(String[] args) {
        Mycc obj= new Mycc();
    }
}
