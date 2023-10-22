package Selenium23;
import org.testng.annotations.Test;

public class TestNgSample {
    @Test (priority=2)
    public void Test1()
    {
        System.out.println("1");
    }
    @Test (priority=3)
    public void Test2()
    {
        System.out.println("2");
    }

    @Test (priority=1)
    public void Test3()
    {
        System.out.println("3");
    }
}
