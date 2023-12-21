package AutomationPractice;

public class MyCons {
    int num;
    MyCons(){
        num=10;


    }

    public static void main(String[] args) {
        MyCons  obj1 = new MyCons();
        MyCons obj2 = new MyCons();
        System.out.println(obj1.num+" "+ obj2.num);

    }
}
