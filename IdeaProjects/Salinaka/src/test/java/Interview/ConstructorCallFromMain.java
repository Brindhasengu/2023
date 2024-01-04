package Interview;

public class ConstructorCallFromMain {
    String carName;
    int carYear;
    public ConstructorCallFromMain(int year,String name){
    carName = name;
    carYear = year;
    }

    public static void main(String[] args) {
        ConstructorCallFromMain   myCar=new ConstructorCallFromMain(2000,"Ford");
        System.out.println(myCar.carName + " "+myCar.carYear);
    }
}
