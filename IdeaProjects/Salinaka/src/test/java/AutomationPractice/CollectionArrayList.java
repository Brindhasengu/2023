package AutomationPractice;

import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList l =new ArrayList();
        l.add("SriRam");
        l.add("Krishna");
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(l);
        ArrayList l1 =new ArrayList();
        l1.addAll(l);
        System.out.println(l1);
    }
}
