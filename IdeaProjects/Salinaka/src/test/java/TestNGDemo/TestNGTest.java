package TestNGDemo;
import org.testng.annotations.Test;

public class TestNGTest {
@Test(priority=1)
    public void a()
{
    System.out.println("1");
}
@Test (priority=2)
    public void c()
{
    System.out.println("0");
}
@Test (priority=0)
    public void b()
{
    System.out.println("10");
}
}
