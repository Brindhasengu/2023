package AutomationPractice;

public class Main {
    public static void main(String[] args) {


        MySingleton object1= MySingleton.getInstance();
        object1.demoMethod();

        MySingleton object2= MySingleton.getInstance();
        object2.demoMethod();
        //MySingleton.demoMethod();
    }
}