package AutomationPractice;

public class MyConstructorChain {
    MyConstructorChain() {

        this("From default Construct");
        System.out.println("Default cons chain called");
    }
MyConstructorChain(String str)
{
    System.out.println("parameterised cons called");
}

    public static void main(String[] args) {
     MyConstructorChain obj=new MyConstructorChain();
    }

    }
