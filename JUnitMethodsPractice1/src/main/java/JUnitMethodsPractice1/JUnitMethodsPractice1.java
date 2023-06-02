package JUnitMethodsPractice1;

import org.junit.*;

public class JUnitMethodsPractice1 {

//    public static void main(String[] args) {
//        JUnitMethodsPractice1 ju = new JUnitMethodsPractice1();
//
//        ju.openBrowser();
//        ju.loginAs();
//        ju.testcase1();
//        ju.closeBrowser();
//
//        ju.openBrowser();
//        ju.loginAs();
//        ju.testcase2();
//        ju.closeBrowser();
//
//        ju.openBrowser();
//        ju.loginAs();
//        ju.testcase3();
//        ju.closeBrowser();
//
//        ju.openBrowser();
//        ju.loginAs();
//        ju.testcase4();
//        ju.closeBrowser();
//
//        ju.openBrowser();
//        ju.loginAs();
//        ju.testcase5();
//        ju.closeBrowser();
//    }


    @BeforeClass
    public static void openBrowser() {
        System.out.println("browser is opening");
    }

    @AfterClass
    public static void closeBrowser() {
        System.out.println("browser is closing");
    }

    @Before
    public void loginAs() {
        System.out.println("Admin Login");
    }

    @Before
    public void setCookie() {
        System.out.println("set Cookie");
    }

    @After
    public void logout() {
        System.out.println("Admin Logout");
    }

    @After
    public void deleteCookie() {
        System.out.println("delete Cookie");
    }

    @Test
    public void testcase1() {
        System.out.println("Testcase1");
    }

    @Test
    public void testcase2() {
        System.out.println("Testcase2");
    }

    @Test
    public void testcase3() {
        System.out.println("Testcase3");
    }

    @Test @Ignore
    public void testcase4() {

        System.out.println("Testcase4");

    }

    @Test @Ignore
    public void testcase5() {

        System.out.println("Testcase5");

    }
}
